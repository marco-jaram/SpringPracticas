package com.mtec.di.cualifires;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Perro extends Animal {

	public Perro(@Value("Manchitas") String nombre, @Value("5") Integer edad) {
		super(nombre, edad);
		
	}

}
