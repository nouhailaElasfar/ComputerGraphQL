package com.example.controle_nouhaila.service.dtos;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class ComputerDto {
    private String proce;
    private String ram;
    private Float price;
    private String hardDrive;
    private String macAddress;
}
