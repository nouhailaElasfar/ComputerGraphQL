package com.example.controle_nouhaila.web;

import com.example.controle_nouhaila.service.ComputerManager;
import com.example.controle_nouhaila.service.dtos.ComputerDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.graphql.data.method.annotation.Argument;
import org.springframework.graphql.data.method.annotation.MutationMapping;
import org.springframework.graphql.data.method.annotation.QueryMapping;
import org.springframework.stereotype.Controller;

import java.util.List;

@Controller
public class ComputerGraphQlController {

    @Autowired
    private ComputerManager computerManager;

    @QueryMapping
    public List<ComputerDto> getComputerByProce(@Argument String proce){
        return computerManager.getComputerByProce(proce);
    }

    @QueryMapping
    public List<ComputerDto> getComputerByPrice(@Argument Float price){
        return computerManager.getComputerByPrice(price);
    }

    @MutationMapping
    public ComputerDto saveComputer(@Argument ComputerDto computerDto){
        return computerManager.saveComputer(computerDto);
    }

    @MutationMapping
    public ComputerDto deleteComputer(@Argument Long id){
        return computerManager.deleteComputer(id);
    }
}
