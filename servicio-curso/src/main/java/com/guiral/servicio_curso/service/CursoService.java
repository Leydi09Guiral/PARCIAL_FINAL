package com.guiral.servicio_curso.service;

import com.guiral.servicio_curso.models.entity.Curso;
import com.tamara.SpringCommons.service.CommonService;

public interface CursoService extends CommonService<Curso> {

    public Curso save(Curso alumno);
    public void deleteById(Long id);

}
