package com.guiral.servicio_usuario.service;

import com.guiral.servicio_usuario.repository.AlumnoRepository;
import com.tamara.commonsEntity.Alumno;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.Optional;

@Service
public class AlumnoServiceImpl  implements AlumnoService{

    @Autowired
    private AlumnoRepository alumnoRepository;

    @Override
    public Iterable<Alumno> findAll() {
        return alumnoRepository.findAll();
    }

    @Override
    public Optional<Alumno> findById(Long id) {
        return alumnoRepository.findById(id);
    }

    @Override
    @Transactional
    public Alumno save(Alumno alumno) {
        return alumnoRepository.save(alumno);
    }

    @Override
    @Transactional
    public void deleteById(Long id) {
        alumnoRepository.deleteById(id);
    }
}
