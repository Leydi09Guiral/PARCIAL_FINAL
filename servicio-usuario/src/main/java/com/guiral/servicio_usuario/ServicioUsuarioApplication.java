package com.guiral.servicio_usuario;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.context.annotation.ComponentScan;

@EnableDiscoveryClient
@SpringBootApplication
@ComponentScan({"com.tamara.commonsEntity","com.guiral"})
@EntityScan({"com.tamara.commonsEntity"})
public class ServicioUsuarioApplication {

	public static void main(String[] args) {
		SpringApplication.run(ServicioUsuarioApplication.class, args);
	}

}
