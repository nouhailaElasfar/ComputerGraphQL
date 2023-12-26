package com.example.controle_nouhaila.service;

import com.example.controle_nouhaila.service.dtos.ComputerDto;

import java.util.List;

public interface ComputerManager {
    public List<ComputerDto> getComputerByProce(String proce);
    public List<ComputerDto> getComputerByPrice(Float price);
    public ComputerDto saveComputer(ComputerDto computerDto);
    public ComputerDto deleteComputer(Long id);
}
