package com.company;

public class Volvo extends Car {

    public Volvo(int cylinders, String name, int hp, int numberOfDoors) {
        super(cylinders, name, hp, numberOfDoors);
    }

    @Override
    public void startEngine() {
         super.startEngine();
    }

    @Override
    public void accelerate() {
        super.accelerate();
    }

    @Override
    public void brake() {
        super.brake();
    }
    public void carDetails(){
        System.out.println("Volvo " + getName() + " has a " + getCylinders() + " engine with  " + getHp() + "hp " + " and it has " + getNumberOfDoors() + " doors ." );
    }
}
