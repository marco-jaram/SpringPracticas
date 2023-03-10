package com.mtec.di.autowire;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;


@Component
public class Square  implements Figure{
@Value("2.5")
	private double size;
	
	@Override
	public double claculateArea() {
		// TODO Auto-generated method stub
		return size * size;
	}

}
