package com.example.CarEngine;


    public class Car {
        private Engine engine;

        public Car(Engine engine) {
            this.engine = engine;
        }

        public void displayEngineType() {
            System.out.println(engine.toString());
        }
    }


