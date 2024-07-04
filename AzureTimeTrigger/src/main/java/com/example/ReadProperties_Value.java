package com.example;

import java.io.IOException;
import java.io.InputStream;
import java.time.LocalDateTime;
import java.util.Properties;
import java.util.function.Function;

import com.microsoft.azure.functions.ExecutionContext;

public class ReadProperties_Value {

	private Properties properties = new Properties();

    public void PropertiesLoader(String propertiesFileName) {
        try (InputStream inputStream = getClass().getClassLoader().getResourceAsStream(propertiesFileName)) {
            if (inputStream == null) {
                System.out.println("Sorry, unable to find " + propertiesFileName);
                return;
            }

            // Load a properties file from class path, inside static method
            properties.load(inputStream);
        } catch (IOException ex) {
            ex.printStackTrace();
        }
    }

    public String getProperty(String key) {
        return properties.getProperty(key);
    }

    public static void main(String[] args) {
    	ReadProperties_Value loader = new ReadProperties_Value();
    	 loader.PropertiesLoader("config.properties");
        String greeting = loader.getProperty("greeting");
        String target = loader.getProperty("target");    
        System.out.println(greeting + ", " + target + "!");
    }

}
