package com.example.webappjavaedit2023.repository;

import com.example.webappjavaedit2023.model.Duenio;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DuenioRepository extends JpaRepository<Duenio, Long> {
    //TODO: Implementar metodos personalizados
}
