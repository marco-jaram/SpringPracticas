package com.mtec.di.profiles;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

@Service
@Profile("prod")
public class ProdEviroment implements EnviromentService{

	@Override
	public String getEnviroment() {
		// TODO Auto-generated method stub
		return ("Prod");
	}

	

}

