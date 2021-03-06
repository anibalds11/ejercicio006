package es.cic.bootcamp.ejercicio006;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;


@SpringBootApplication
@ComponentScan({"es.cic.bootcamp.controller"})
public class Ejercicio006Application {

	public static void main(String[] args) {
		SpringApplication.run(Ejercicio006Application.class, args);
	}
}