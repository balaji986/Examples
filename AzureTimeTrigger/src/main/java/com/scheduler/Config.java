package com.scheduler;

import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

public class Config {
	private Properties properties;

    public Config(String propertiesFileName) {
        properties = new Properties();
        try (InputStream input = getClass().getClassLoader().getResourceAsStream(propertiesFileName)) {
            if (input == null) {
                throw new RuntimeException("Sorry, unable to find " + propertiesFileName);
            }
            properties.load(input);
        } catch (IOException ex) {
            ex.printStackTrace();
        }
    }

    public String getProperty(String key) {
        return properties.getProperty(key);
    }
}
