package com.guiral.servicio_curso;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.context.annotation.ComponentScan;

@EnableDiscoveryClient
@SpringBootApplication
@ComponentScan({"com.tamara.commonsEntity","com.guiral"})
@EntityScan(basePackages = {
		"com.guiral.servicio_curso.models.entity",
		"com.tamara.commonsEntity"
})
public class ServicioCursoApplication {

	public static void main(String[] args) {
		SpringApplication.run(ServicioCursoApplication.class, args);
	}

}
