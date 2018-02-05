package com.company;
import java.util.Scanner;

public class Code {
    PremadeCar premadeCar = new PremadeCar();
    Custom custom = new Custom();
    Driving Driving = new Driving();

    Scanner CoP  = new Scanner (System.in);
    String car = "";
    String premade = "2016 Silver Hyundai Sonata";
    String Custom = "";

    public void init (){
        MessageUtil.Class();
        String CorP = CoP.nextLine();
        if (CorP.equalsIgnoreCase("Prebuilt")){
            premadeCar.premade();
            car = premade;
        }
        else if (CorP.equalsIgnoreCase("Custom")){
            custom.custom();
            car = Custom;
        }
        else{
            init();
        }
        Driving.driving();
    }
}
