package com.guiral.servicio_curso.repository;

import com.guiral.servicio_curso.models.entity.Curso;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CursoRepository extends CrudRepository<Curso, Long> {


}
