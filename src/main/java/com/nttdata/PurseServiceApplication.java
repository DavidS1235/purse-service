package com.nttdata;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.boot.autoconfigure.jdbc.XADataSourceAutoConfiguration;

@SpringBootApplication
@EnableAutoConfiguration(exclude={DataSourceAutoConfiguration.class, XADataSourceAutoConfiguration.class})
/**
 * Clase pincipal
 */
public class PurseServiceApplication {
	private final Logger logger = LoggerFactory.getLogger("MovementServiceApplication");

	/**
	 * Éste es el método principal del proyecto
	 * @param args[] es un arreglo con los parámetros que el reciba por consola
	 * @return void
	 */
	public static void main(String[] args) {
		SpringApplication.run(PurseServiceApplication.class, args);
	}

}
