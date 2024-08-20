package com.example.CarEngine;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Car {
        @Autowired
        private Engine engine;

        @Autowired
        public Car(Engine engine) {
            this.engine = engine;
        }
        @Autowired
        public void displayEngineType() {
            System.out.println(engine.toString());
        }
    }


