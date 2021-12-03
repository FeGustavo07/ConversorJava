package com.letscode.converter;

import java.util.Scanner;

public class converter {

    static float celsius;

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the degrees in celsius: ");
        celsius = input.nextFloat();
        System.out.printf("CONVERTED DEGREES! %n");
        System.out.printf("to Kelvin = %.2f %n", converteToKelvin());
        System.out.printf("to Fahreheint = %.2f %n", converteToFahrenheit());
        System.out.printf("to Rankine = %.2f %n", converteToRankine());
        System.out.printf("to Réaumur = %.2f %n", converteToReaumur());
        input.close();
    }

    static double converteToKelvin() {
        return celsius + 273.15;
    }

    static double converteToFahrenheit() {
        return (celsius * 1.8) + 32;
    }

    static double converteToReaumur() {
        return celsius * 0.8;
    }

    static double converteToRankine() {
        return (celsius * 1.8) + 491;
    }

}
