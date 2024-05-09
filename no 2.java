package com.mycompany.mavenproject2;

import java.util.Scanner;

public class AgeeCategory {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter your name: ");
        String name = input.nextLine();
        System.out.print("Enter your age: ");
        int age = input.nextInt();

        if (age < 5) {
            System.out.println(name + " is a baby.");
        } else if (5 <= age && age < 12) {
            System.out.println(name + " is a child.");
        } else if (12 <= age && age < 18) {
            System.out.println(name + " is a teenager.");
        } else if (18 <= age && age < 40) {
            System.out.println(name + " is a young adult.");
        } else if (40 <= age && age < 60) {
            System.out.println(name + " is a middle-aged adult.");
        } else if (age >= 60) {
            System.out.println(name + " is a senior citizen.");
        } else {
            System.out.println("Invalid age.");
        }

        System.out.println("\nNow, let's check the categories for the following people:");
        System.out.println("a) Miroku is 12 years old");
        if (12 == age) {
            System.out.println("Miroku is a child.");
        }
        System.out.println("b) Kafka Hibino is 39 years old");
        if (39 == age) {
            System.out.println("Kafka Hibino is a young adult.");
        }
        System.out.println("c) Saitama is 20 years old");
        if (20 == age) {
            System.out.println("Saitama is a young adult.");
        }
    }
}