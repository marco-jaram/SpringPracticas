package com.mtec.di.autowire;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;


@Component
public class Circules implements Figure{
@Value("5.4")
	private double radius;
	@Override
	public double claculateArea() {
		// TODO Auto-generated method stub
		return Math.PI * Math.pow(radius, radius);
	}

}
