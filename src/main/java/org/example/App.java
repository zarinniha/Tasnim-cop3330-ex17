/*
 *  UCF COP3330 Fall 2021 Assignment 1 Solution
 *  Copyright 2021 Zarin Tasnim
 */

import java.util.Scanner;

class blood_alcohol {

    public static void main(String args[]) {
        int gender = 0;
        int ounces = 0;
        int weight = 0;
        int hours = 0;
        double ratio = 0;

        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.print("Enter a 1 is you are male or a 2 if you are female: ");
            String temp1 = sc.nextLine();
            //only allow to input numbers
            if (temp1.matches("[1-2]+")) {

                gender = Integer.parseInt(temp1);
                break;
            } else {
                System.out.println("Please enter between 1 or 2.");

            }
        }

        while (true) {
            System.out.print("How many ounces of alcohol did you have? ");
            String temp2 = sc.nextLine();
            //only allow to input numbers
            if (temp2.matches("[0-9]+")) {
                ounces = Integer.parseInt(temp2);
                break;
            } else {
                System.out.println("Please enter a numeric value.");
            }
        }
        while (true) {
            System.out.print("What is your weight, in pounds? ");
            String temp3 = sc.nextLine();
            //only allow to input numbers
            if (temp3.matches("[0-9]+")) {
                weight = Integer.parseInt(temp3);
                break;
            } else {
                System.out.println("Please enter a numeric value.");
            }
        }


        while (true) {
            System.out.print("How many hours has it been since your last drink? ");
            String temp4 = sc.nextLine();
            //only allow to input numbers
            if (temp4.matches("[0-9]+")) {
                hours = Integer.parseInt(temp4);
                break;
            } else {
                System.out.println("Please enter a numeric value.");
            }

        }

        if (gender == 1) {
            ratio = (double) 0.73;
        } else if (gender == 2) {
            ratio = (double) 0.66;
        }

        //bac= (ounces*5.14/weight *ratio)-0.015*hours

        double bac = (ounces * 5.14 / weight * ratio) - (0.015 * hours);
        System.out.printf(String.format("\n\nYour BAC is %.6f\n",bac));
        String answer = (bac >= 0.08) ? "It is not lgal for you to drive." : "It is legal for you to drive";
        System.out.print(answer);


    }
}