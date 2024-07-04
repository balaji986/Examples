package com.example.config;

import org.aeonbits.owner.ConfigFactory;

public class ReadProperties {

	public static void main(String[] args) {
 
		IConfig config = ConfigFactory.create(IConfig.class);
		
		System.out.println(config.keygreeting());
	}

}
