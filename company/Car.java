package com.company;

public class Car {
    private  boolean engine ;
    private int cylinders ;
    private String name ;
    private int hp ;
    private int numberOfDoors ;
    public Car (int cylinders , String name , int hp , int numberOfDoors) {
    this.cylinders=cylinders ;
    this.name=name;
    this.hp=hp;
    this.numberOfDoors=numberOfDoors;
    this.engine=true;

    }

    public void startEngine(){
        System.out.println("Car ->startEngine()");
    }

    public void accelerate(){
        System.out.println("Car ->accelerate()");
    }

    public void brake (){
        System.out.println("Car -brake()");
    }


    public int getCylinders() {
        return cylinders;
    }

    public String getName() {
        return name;
    }

    public int getHp() {
        return hp;
    }

    public int getNumberOfDoors() {
        return numberOfDoors;
    }
}
