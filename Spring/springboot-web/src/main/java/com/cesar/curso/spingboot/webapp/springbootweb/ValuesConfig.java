package com.cesar.curso.spingboot.webapp.springbootweb;

import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

// Se puede tener esta conexión a archivos properties 
// tanto desde el archivo de aplicación original como en un una clase alterna

@Configuration
@PropertySource(value="classpath:values.properties", encoding = "UTF-8")
public class ValuesConfig {

}
