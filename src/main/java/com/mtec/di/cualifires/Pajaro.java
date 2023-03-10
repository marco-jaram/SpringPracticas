package com.mtec.di.cualifires;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;


@Component
public class Pajaro extends Animal implements Volador{
	
	public Pajaro(@Value("PajaroCUCU") String nombre, @Value("1") Integer edad) {
		super(nombre, edad);
		
	}

	private static final Logger log = LoggerFactory.getLogger(Pajaro.class);

	@Override
	public void volar() {
		log.info("Soy un pajaro y estoy volando");
		
	}

}
