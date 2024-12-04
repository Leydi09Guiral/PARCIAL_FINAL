package com.guiral.servicio_curso.service;

import com.guiral.servicio_curso.models.entity.Curso;
import com.guiral.servicio_curso.repository.CursoRepository;
import com.tamara.SpringCommons.service.CommonServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CursoServiceImpl extends CommonServiceImpl<Curso, CursoRepository> implements CursoService {

    @Autowired
    public CursoServiceImpl(CursoRepository cursoRepository){
        super();
    }

}
