package org.example;

/*
 *  UCF COP3330 Summer 2021 Assignment 1 Solution
 *  Copyright 2021 Asad merouani
 */


import java.util.Scanner;

public class App {
    public static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int number1, number2, number3;

        App app = new App();

        System.out.println(" Enter the first number.");
        number1 = Integer.parseInt(scanner.nextLine());

        System.out.println(" Enter the second number.");
        number2 = Integer.parseInt(scanner.nextLine());

        System.out.println(" Enter the third number.");
        number3 = Integer.parseInt(scanner.nextLine());

        if( (number1 != number2 && number1 != number3 && number2 != number3))
        app.compareNumbers(number1, number2, number3);
    }

    private void compareNumbers(int number1, int number2, int number3) {
        if (number1 > number2 && number1 > number3) {
            System.out.printf("The largest number is %d.", number1);
        }
        else if (number2 > number1 && number2 > number3) {
            System.out.printf("The largest number is %d.", number2);
        }
        else if (number3 > number1 && number3 > number2) {
            System.out.printf("The largest number is %d.", number3);
        }
        else {

        }

    }

}
