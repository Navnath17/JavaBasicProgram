package com.startup.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.stereotype.Component;

@Component
public class PropRead {
	
	@Autowired
	private Environment environment;
	
	public String getName() {
		return environment.getProperty("database");
	}
	
	public static void main(String[] args) {
		PropRead n = new PropRead();
		n.getName();
	}
}


