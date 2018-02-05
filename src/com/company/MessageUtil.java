package com.company;

public class MessageUtil {

    public static void Class(){
        System.out.println("What type of car would you like? Prebuilt or Custom. \n");
    }
    public static void model (){
        System.out.println("What model of car would you like? \n");
    }
    public static void year(){
        System.out.println("What year would you like your car to be? \n");
    }
    public static void color (){
        System.out.println("What color would you like your car to be? \n");
    }
    public static void make(){
        System.out.println("What is the make of your car? \n");
    }
    public static void custom(String model, int year, String color, String make){
        System.out.println("You made a " + color + " " + year + " " + make + " " + model);
    }
    public static void speedup(String car, int speed, int gas){
        System.out.println("The current car is a " + car + " It is going " + speed + " MPH and has " + gas + "% of its gas left. ");
    }
}
