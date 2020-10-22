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
    }
}
