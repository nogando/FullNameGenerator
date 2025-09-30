package com.pluralsight;

import java.util.Scanner;

public class FullNameParser {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);


        //Have user Enter name
        System.out.println("Enter your Full Name:");
        String fullname = scanner.nextLine();
        System.out.println();


        //Split the user Input
        String[] parts = fullname.split("\\s+");


        //Create variables to use for if else statements
        String firstName;
        String middleName;
        String lastName;


        //based off of the split create if else statment to create the output
        if (parts.length == 2) {
            //which would be first and lastname
            firstName = parts[0];
            middleName = "None";
            lastName = parts[1];

            //Im going to print it with the if else Statement cause i want to keep it a certain way
            System.out.printf("Full Name: %s\n",fullname);
            System.out.println("========================");
            System.out.printf("First Name: %s\n",firstName);
            System.out.printf("Middle Name: %s\n",middleName);
            System.out.printf("Last Name: %s\n",lastName);

//
        } else if (parts.length == 3) {

            //which would be First middle and Lastname
            firstName = parts[0];
            middleName = parts[1];
            lastName = parts[2];

            //Im going to print it with the if else Statement cause i want to keep it a certain way
            System.out.printf("Full Name: %s\n",fullname);
            System.out.println("========================");
            System.out.printf("First Name: %s\n",firstName);
            System.out.printf("Middle Name: %s\n",middleName);
            System.out.printf("Last Name: %s\n",lastName);


        }
        // I created this so that way the user knows how i want the program to work when its not working the
        // way i want 
        else{
            System.out.println("Invalid format. Please enter either 'first last' or 'first middle last.");
        }


    }
}
