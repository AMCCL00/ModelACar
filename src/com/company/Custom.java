package com.company;

import java.util.Scanner;

public class Custom extends Code{
    Scanner Year = new Scanner(System.in);
    Scanner Color = new Scanner(System.in);
    Scanner Make = new Scanner(System.in);
    Scanner Model = new Scanner(System.in);

    public void custom(){
        MessageUtil.model();
        String model = Model.nextLine();

        MessageUtil.year();
        int year = Year.nextInt();

        MessageUtil.color();
        String color = Color.nextLine();

        MessageUtil.make();
        String make = Make.nextLine();

        String Custom = color + " " + year + " " + make + " " +model;

        MessageUtil.custom(model,year,color,make);
    }
}
