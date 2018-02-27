package com.example.myproject.bean;

import org.springframework.boot.context.properties.ConfigurationProperties;

@ConfigurationProperties(prefix = "my")
public class Config {

	private String url;
	private String name;

	public String getUrl() {
		return url;
	}

	public String getName() {
		return name;
	}
	
	public static String getVal(){
		Config config = new Config();
		return config.getUrl() + config.getName();
	}

}
