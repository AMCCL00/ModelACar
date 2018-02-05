package com.company;

import java.util.Scanner;

public class Driving extends Code {
    Scanner speedup = new Scanner(System.in);
    int gas = 100;
    int speed = 0;

    public void driving() {
        MessageUtil.speedup(car, speed, gas);
        int Speedup = speedup.nextInt();
        switch(Speedup) {
            case 0:
                // Accelerate
                speed += 10;
                gas -= 3;
                break;
            case 1:
                //Decelerate
                speed -= 10;
                gas -= 3;
                break;
            case 2:
                //Fill gas tank
                gas = 100;
                break;
            case 3:
                System.exit(23232);
                // Exit
        }
    }
}
