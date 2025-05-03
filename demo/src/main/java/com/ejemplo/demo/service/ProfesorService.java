package com.ejemplo.demo.service;

import com.ejemplo.demo.model.Profesor;
import org.springframework.stereotype.Service;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

@Service
public class ProfesorService {

    private final List<Profesor> profesores = Arrays.asList(
            new Profesor(1L, "Juan Pérez"),
            new Profesor(2L, "Ana Gómez")
    );

    public List<Profesor> obtenerTodos() {
        return profesores;
    }

    public Optional<Profesor> obtenerPorId(Long id) {
        return profesores.stream()
                .filter(profesor -> profesor.getId().equals(id))
                .findFirst();
    }

}
