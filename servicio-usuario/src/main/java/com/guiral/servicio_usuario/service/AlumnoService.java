package com.guiral.servicio_usuario.service;

import com.tamara.SpringCommons.service.CommonService;
import com.tamara.commonsEntity.Alumno;

public interface AlumnoService extends CommonService<Alumno> {

    public Alumno save(Alumno alumno);
    public void deleteById(Long id);
}
