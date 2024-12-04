package com.guiral.servicio_usuario.config;


import org.springframework.boot.context.properties.ConfigurationProperties;

@ConfigurationProperties("microservice-one")
public class Configuration {


    private String value;

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

}
