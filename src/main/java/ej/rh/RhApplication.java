package ej.rh;

import ej.rh.repositorio.EmpleadoRepositorio;
import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class RhApplication {

	public static void main(String[] args) {
		SpringApplication.run(RhApplication.class, args);
	}

	/*@Bean
	public ApplicationRunner applicationRunner(EmpleadoRepositorio empleadoRepositorio){
		return args -> {
			empleadoRepositorio.findAll();
		};
	}*/
}
