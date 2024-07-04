package com.example.config;

import org.aeonbits.owner.Config;
import  org.aeonbits.owner.Config.Sources;;





@Sources("classpath:config.properties")
public interface IConfig extends Config {
	
	@DefaultValue("Welcome")
	@Key("greeting")
	String keygreeting();

}
