package com.example.controle_nouhaila.dao.repositories;

import com.example.controle_nouhaila.dao.entities.Computer;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ComputerRepository extends JpaRepository<Computer,Long> {
    List<Computer> getComputerByProce(String proce);
    List<Computer> getComputersByPrice(Float price);
    boolean existsByMacAddress(String macAddress);
}
