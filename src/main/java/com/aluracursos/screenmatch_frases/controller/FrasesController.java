package com.aluracursos.screenmatch_frases.controller;

import com.aluracursos.screenmatch_frases.dto.FraseDTO;
import com.aluracursos.screenmatch_frases.service.FraseServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FrasesController {
    @Autowired
    FraseServices servicio;

    @GetMapping("/series/frases")
    public FraseDTO obtenerFrasesAleatoria(){
        return servicio.obtenerFraseAleatoria();
    }
}
