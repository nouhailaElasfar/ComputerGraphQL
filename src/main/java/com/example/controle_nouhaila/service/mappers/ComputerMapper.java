package com.example.controle_nouhaila.service.mappers;

import com.example.controle_nouhaila.dao.entities.Computer;
import com.example.controle_nouhaila.service.dtos.ComputerDto;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Component;

@Component
public class ComputerMapper {
    private final ModelMapper modelMapper=new ModelMapper();

    public Computer fromComputerDtoToComputer(ComputerDto computerDto){
        return this.modelMapper.map(computerDto, Computer.class);
    }

    public ComputerDto fromComputerToComputerDto(Computer computer){
        return this.modelMapper.map(computer, ComputerDto.class);
    }

}
