package com.nileshhazra;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        System.out.println("Hello! My name is Electron.");
        System.out.println("I was created in 2020.");
        System.out.println("Please remind me your name.");
        Scanner scanner = new Scanner(System.in);
        String name = scanner.next();
        System.out.println("What a great name you have, " + name + "!");
        System.out.println("Let me guess your age.");
        System.out.println("Say me remainders of dividing your age by 3, 5 and 7.");
        byte rem3 = scanner.nextByte();
        byte rem4 = scanner.nextByte();
        byte rem5 = scanner.nextByte();
        int age = (rem3*70 + rem4*21 + rem5*15)% 105;
        System.out.println("Your age is "+ age+"; that's a good time to start programming!");
        System.out.println("Now I will prove to you that I can count to any number you want.");
        byte number = scanner.nextByte();
        for (int i = 0; i<=number; i++)
            System.out.println(i+"!");
        System.out.println("Let's test your programming knowledge.");
        System.out.println("Q. Why do we use methods?");
        System.out.println("1. Repeat a statement several times.");
        System.out.println("2. To decompose a program into several subroutines.");
        System.out.println("3. To determine the execution time of a program.");
        System.out.println("4. To interrupt the execution of a program.");
        byte option = scanner.nextByte();
        while (true){
            if(option == 2){
                System.out.println("Congratulations! Have a nice day.");
                break;
            }
            else {
                System.out.println("Please try again!");
                option = scanner.nextByte();
            }

        }
    }
}
