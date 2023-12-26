package com.example.controle_nouhaila.dao.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.*;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
@ToString
public class Computer {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String proce;
    private String ram;
    private String hardDrive;
    private Float price;
    private String macAddress;
}
