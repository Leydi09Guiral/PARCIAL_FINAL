package com.guiral.servicio_usuario.controller;


import com.guiral.servicio_usuario.service.AlumnoService;
import com.tamara.SpringCommons.controller.CommonController;
import com.tamara.commonsEntity.Alumno;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.Map;
import java.util.Optional;

@RestController
@RequestMapping("api/alumnos")
public class AlumnoController extends CommonController<Alumno, AlumnoService> {

    @Autowired
    private AlumnoService service;

    @Value("${config.balanceador.test}")
    private String balanceadorTest;

    public AlumnoController(AlumnoService service) {
        super(service);
    }


    @GetMapping("/balanceador-test")
    public ResponseEntity<?> balanceadorTest() {
        Map<String, Object> response = new HashMap<>();
        response.put("balanceador", balanceadorTest);
        response.put("alumno", service.findAll());

        return ResponseEntity.ok().body(response);
    }

    @PostMapping("/Guardar")
    public ResponseEntity<?> crear(@RequestBody Alumno alumno){

        Alumno alumno1 = service.save(alumno);
        return ResponseEntity.status(HttpStatus.CREATED).body(alumno1);
    }

    @PutMapping("/{id}")
    public ResponseEntity<?> editar(@RequestBody Alumno alumno, @PathVariable Long id) {
        Optional<Alumno> alumnoExistente = service.findById(id);

        if (alumnoExistente.isEmpty()) {
            return ResponseEntity.noContent().build();
        }

        Alumno alumnoActual = alumnoExistente.get();

        alumnoActual.setNombre(alumno.getNombre());
        alumnoActual.setApellido(alumno.getApellido());
        alumnoActual.setEmail(alumno.getEmail());

        Alumno alumnoActualizado = service.save(alumnoActual);

        return ResponseEntity.ok(alumnoActualizado);
    }

    //CONFIG
    /*
    @GetMapping("/endpoint")
    public String retrieveLimits(){
        return configuration.getValue();
    }*/
    //CONFIG

}
