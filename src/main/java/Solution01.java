/*
 *  UCF COP3330 Fall 2021 Assignment 1 Solution 01
 *  Copyright 2021 Danny Yu
 */

// Create program that prompts user for name, and prints a greeting back to the user

import java.util.Scanner;

public class Solution01
{

    public static void main(String [] args)
    {
        Scanner in = new Scanner(System.in);
        // variable to get user input
        System.out.print("Hello, what is your name?\n");
        // prompt user for input (name)
        String name = in.nextLine();
        // read input from user
        System.out.println("Hey " + name + ", it's nice to meet you!");
        // print out input using standard output
    }
}
