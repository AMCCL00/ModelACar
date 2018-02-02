package com.company;
import java.util.Scanner;

public class Code {
    PremadeCar premadeCar = new PremadeCar();
    Custom custom = new Custom();

    Scanner Year = new Scanner(System.in);
    Scanner Color = new Scanner(System.in);
    Scanner Make = new Scanner(System.in);
    Scanner Model = new Scanner(System.in);
    Scanner Type = new Scanner(System.in);
    int Speed  = 0;
    int year = Year.nextInt();


    public void init (){

    }

    public void premadeCar(){
        premadeCar.premade();
    }
    public void custom(){
        custom.custom();
    }
}
