package com.example.controle_nouhaila.service;

import com.example.controle_nouhaila.dao.entities.Computer;
import com.example.controle_nouhaila.dao.repositories.ComputerRepository;
import com.example.controle_nouhaila.service.dtos.ComputerDto;
import com.example.controle_nouhaila.service.mappers.ComputerMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Service
public class ComputerManagerAction implements ComputerManager{
    @Autowired
    private ComputerRepository computerRepository;
    @Autowired
    private ComputerMapper computerMapper;
    @Override
    public List<ComputerDto> getComputerByProce(String proce) {

        System.out.println("________________________________");
        List<Computer> computers=computerRepository.getComputerByProce(proce);

        System.out.println(computers.size());
        return computers.stream().map(computerMapper::fromComputerToComputerDto).collect(Collectors.toList());
    }

    @Override
    public List<ComputerDto> getComputerByPrice(Float price) {
        List<Computer> computers=computerRepository.getComputersByPrice(price);
        return computers.stream().map(computerMapper::fromComputerToComputerDto).collect(Collectors.toList());
    }

    @Override
    public ComputerDto saveComputer(ComputerDto computerDto) {
        if (computerRepository.existsByMacAddress(computerDto.getMacAddress())){
            return null;
        }
        return computerMapper.fromComputerToComputerDto(computerRepository.save(computerMapper.fromComputerDtoToComputer(computerDto)));
    }

    @Override
    public ComputerDto deleteComputer(Long id) {
//        Computer computer=computerRepository.findById(id).get();
//        computerRepository.delete(computer);
//        return computerMapper.fromComputerToComputerDto(computer);

        Optional<Computer> computer= computerRepository.findById(id);
        if (computer.isPresent()) {
            Computer bookToDelete = computer.get();
            computerRepository.deleteById(id);
            return computerMapper.fromComputerToComputerDto(bookToDelete);
        } else {
            return null;
        }
    }
}
