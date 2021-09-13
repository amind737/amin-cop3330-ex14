/*
 *  UCF COP3330 Fall 2021 Assignment 1 Solution
 *  Copyright 2021 Dharik Amin
 */
package org.example;
import java.util.Scanner;
public class App
{
    public static void main(String[] args) {

        Scanner obj = new Scanner(System.in);

        System.out.print("What is the order amount? ");
        double amount = Double.parseDouble(obj.nextLine());

        System.out.print("What is the state? ");
        String state = obj.nextLine();

        System.out.print("The subtotal is $");
        System.out.printf("%.2f", amount);


        if (state.toLowerCase().equals("wi")) {

            double tax = amount * 0.055;
            System.out.print("\nThe tax is $"+ tax);

            amount = amount + tax;
            System.out.print("\nThe total is $"+ amount + ".");
        }

    }
}
