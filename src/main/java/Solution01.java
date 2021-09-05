/*
 *  UCF COP3330 Fall 2021 Assignment 1 Solution 01
 *  Copyright 2021 Danny Yu
 */

// Program wil prompt user for name and print a greeting back to the user

import java.util.Scanner;

public class Solution01
{

    /*
        prompt user for name
            read input from user
        prints user input and greeting
     */

    public static void main(String [] args)
    {
        Scanner in = new Scanner(System.in);
        System.out.print("Hello, what is your name?\n");
        String name = in.nextLine();
        System.out.println("Hey " + name + ", it's nice to meet you!");
    }
}
