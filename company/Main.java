package com.company;

public class Main {

    public static void main(String[] args) {
  Volvo volvo = new Volvo(5,"S60",220,4);
  volvo.startEngine();
  volvo.accelerate();
  volvo.brake();
  volvo.carDetails();
    }
}
