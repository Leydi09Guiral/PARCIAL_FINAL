package com.guiral.servicio_usuario.repository;

import com.tamara.commonsEntity.Alumno;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AlumnoRepository extends CrudRepository<Alumno, Long> {

}
