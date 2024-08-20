package com.example.CarEngine;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class CarEngineApplication {

	public static void main(String[] args) {
		//SpringApplication.run(CarEngineApplication.class, args);
		ApplicationContext context = SpringApplication.run(CarEngineApplication.class, args);
		Car car = context.getBean(Car.class);
		//Engine engine = new Engine();
		car.displayEngineType();
	}

}
