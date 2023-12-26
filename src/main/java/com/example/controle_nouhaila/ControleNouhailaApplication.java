package com.example.controle_nouhaila;

import com.example.controle_nouhaila.dao.entities.Computer;
import com.example.controle_nouhaila.dao.repositories.ComputerRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class ControleNouhailaApplication {

    public static void main(String[] args) {
        SpringApplication.run(ControleNouhailaApplication.class, args);
    }

    @Bean
    CommandLineRunner start(ComputerRepository computerRepository){
        return args -> {
            computerRepository.save(Computer.builder()
                    .proce("I7")
                    .ram("4")
                    .hardDrive("1 tera")
                    .price(1000.00F)
                    .macAddress("192.168.0.0")
                    .build());

            computerRepository.save(Computer.builder()
                    .proce("I5")
                    .ram("4")
                    .hardDrive("1 tera")
                    .price(2000.00F)
                    .macAddress("192.168.0.1")
                    .build());

            computerRepository.save(Computer.builder()
                    .proce("I7")
                    .ram("4")
                    .hardDrive("2 tera")
                    .price(3000.00F)
                    .macAddress("192.168.0.2")
                    .build());

            computerRepository.save(Computer.builder()
                    .proce("I7")
                    .ram("4")
                    .hardDrive("1 tera")
                    .price(1000.00F)
                    .macAddress("192.168.0.3")
                    .build());

        };
    }

}
