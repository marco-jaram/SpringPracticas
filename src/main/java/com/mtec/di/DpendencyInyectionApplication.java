package com.mtec.di;

import org.slf4j.Logger;

import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.mtec.di.autowire.AreaCalculatorService;
import com.mtec.di.profiles.EnviromentService;
import com.mtec.di.scopes.EjemploScopeService;


@SpringBootApplication
public class DpendencyInyectionApplication {

	private static final Logger log = LoggerFactory.getLogger(DpendencyInyectionApplication.class);

	public static void main(String[] args) {

		ConfigurableApplicationContext context = SpringApplication.run(DpendencyInyectionApplication.class, args);
		
		AreaCalculatorService calculator = context.getBean(AreaCalculatorService.class);
		log.info("Area total {}", calculator.calcAreas());
		
		
		
		
		

//		EjemploScopeService ejemploScopeService= context.getBean(EjemploScopeService.class);
//		EjemploScopeService ejemploScopeService2 = context.getBean(EjemploScopeService.class);
//		
//		log.info("Are beans equa {}", ejemploScopeService.equals(ejemploScopeService2));
//		log.info("Are beans == {}", ejemploScopeService == ejemploScopeService2);
//		
		
//		EnviromentService ens = context.getBean(EnviromentService.class);
//		log.info("Active enviroment {}", ens.getEnviroment());
//		
		
		
		// Avion avion= context.getBean(Avion.class);
//		avion.volar();

//		Animal animal= context.getBean("pajaro", Animal.class);
//		log.info("Objeto Animal. Nombre: {}, Edad: {}.", animal.getNombre(), animal.getEdad());
//		

//		Pajaro pajaro= context.getBean(Pajaro.class);	
//      log.info("Objeto Pajaro. Nombre: {}, Edad: {}.", pajaro.getNombre(), pajaro.getEdad());
//		
//		
//		EnviromentService enviromentservice = context.getBean(EnviromentService.class);
//	log.info("Active eviroment {}", enviromentservice.getEnviroment());
//		

	}
}
