package com.example.webappjavaedit2023.service;

import com.example.webappjavaedit2023.model.Duenio;
import com.example.webappjavaedit2023.repository.DuenioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DuenioService {

    @Autowired
    private DuenioRepository duenioRepository;

    public Duenio obtenerDuenioPorId(Long id){
        return duenioRepository.findById(id).orElseThrow(() -> new RuntimeException("No se encontro el Duenio"));
    }
    public List<Duenio> listarDuenios(){
        return duenioRepository.findAll();
    }

    public Duenio guardarDuenio(Duenio duenio){
        return duenioRepository.save(duenio);
    }
}
