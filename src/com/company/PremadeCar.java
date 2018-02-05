package com.company;

public class PremadeCar extends Code{
    String premadeColor = "Silver";
    String premadeMake = "Hyundai";
    String premadeModel = "Sonata";
    int premadeYear = 2016;
    String premade = premadeColor + premadeYear + premadeMake + premadeModel;

    public void premade(){
        System.out.println("The premade car is a " + premadeColor + premadeYear + premadeMake + premadeModel);
    }

}
