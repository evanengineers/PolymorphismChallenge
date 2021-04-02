package com.company;


class Car {

    private String name;
    private boolean engines;
    private int cylinders;
    private int wheels;

    public Car(String name, int cylinders) {
        this.name = name;
        this.engines = true;
        this.cylinders = cylinders;
        this.wheels = 4;
    }

    public String getName() {
        return name;
    }

    public boolean isEngines() {
        return engines;
    }

    public int getCylinders() {
        return cylinders;
    }

    public String startEngine() {
       return "Car Starting";
    }

    public String Accelerate() {
        return "Vroom Vroom";
    }

    public String brake() {
        return "Slowing down";
    }
}

class Mercedes extends Car{

    public Mercedes() {
        super("C300", 6);
    }

    @Override
    public String Accelerate() {
        return "Your Mecedes is Speeding up";
    }
}

class Bmw extends Car{

    public Bmw() {
        super("i8", 12);
    }

    @Override
    public String startEngine() {
        return "Roof Roof";
    }
}






public class Main {



    public static void main(String[] args) {



    }
}
