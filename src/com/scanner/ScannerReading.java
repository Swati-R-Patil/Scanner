package com.scanner;

import java.util.Scanner;

public class ScannerReading
{
    public static void main(String[] args) {
        int firstNumber;
        int secondNumber;

        Scanner kb=new Scanner(System.in);

        System.out.println("Enter first number: ");
        firstNumber=kb.nextInt();

        System.out.println("Enter second number: ");
        secondNumber=kb.nextInt();

        double average=(firstNumber+secondNumber)/2.0;

        System.out.println("Average: "+average);

        String name;
        String surname;

        kb.nextLine();
        System.out.println("Please enter your name");
        name= kb.nextLine();

        System.out.println("Please enter your surname");
        surname=kb.nextLine();

        System.out.println(name+" "+surname);


    }
}
