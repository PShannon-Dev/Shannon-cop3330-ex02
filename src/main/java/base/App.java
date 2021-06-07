/*
 *  UCF COP3330 Summer 2021 Assignment 2 Solution
 *  Copyright 2021 Paul Shannon
 */
package base;//base package to deliver the first part of the exercise

import java.util.Scanner;//package for scanner used latter

public class App {
    public static void main(String[] args) //main
    {
        //prompt input from user, use print to have input on same line.
        System.out.print("What is the input string? ");

        //create scanner for input, make sure to input java.util package
        Scanner input = new Scanner(System.in);
        String origString = input.nextLine();

        //print out resulting length in one output statement using the built-in function - string.length()
        System.out.printf("%s has %d characters.\n", origString, origString.length());
    }

}
