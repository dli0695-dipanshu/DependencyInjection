package com.example.CarEngine;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

@SpringBootApplication
public class CarEngineApplication {

	public static void main(String[] args) {
		SpringApplication.run(CarEngineApplication.class, args);
		ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");

		Car car = (Car) context.getBean("car");
		car.displayEngineType();
	}

}
