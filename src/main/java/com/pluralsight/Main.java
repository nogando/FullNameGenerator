package com.pluralsight;


import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        //first name
        System.out.println("Enter your First name");
        String firstName = scanner.nextLine();


        //Middle name
        System.out.println("Enter your Middle Initial or Middle Name");
        String middleName = scanner.nextLine();

        //Last name
        System.out.println("Enter your Last name");
        String lastName = scanner.nextLine();


        //Suffix
        System.out.println("Suffix:");
        String suffix = scanner.nextLine();

        // variables

        if (middleName.isEmpty() && suffix.isEmpty()){
            System.out.printf("First name: %s \nLast name: %s\n\nFull Name:\n%s %s\n",firstName,lastName,firstName,lastName);

        }
        else if (middleName.isEmpty() && !suffix.isEmpty()){

            System.out.printf("First name: %s \nLast name: %s \nSuffix: %s\n\nFull Name:\n%s %s, %s\n",firstName,lastName,suffix,firstName,lastName,suffix);

        }
        else if(suffix.isEmpty() && !middleName.isEmpty()){
            System.out.printf("First name: %s \nMiddle name: %s \nLast Name: %s\n\nFull Name:\n%s %s. %s\n",firstName,middleName,lastName,firstName,middleName,lastName);
        }
        else{
            System.out.printf("First name: %s \nMiddle name: %s \nLast Name: %s \nSuffix: %s\n\nFull Name:\n%s %s. %s, %s\n",firstName,middleName,lastName,suffix,firstName,middleName,lastName,suffix);
        }


    }
}