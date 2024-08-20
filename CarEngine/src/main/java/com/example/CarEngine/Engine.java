package com.example.CarEngine;

import org.springframework.stereotype.Component;

@Component
public class Engine {
    private String type;

    public Engine() {
        this.type = "this";
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    @Override
    public String toString() {
        return "Engine type: " + type;
    }
}


