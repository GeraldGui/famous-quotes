package com.pluralsight;

import java.lang.reflect.Array;
import java.util.Scanner;

public class FamousQuotes {
    public static void main(String[] args) {

        String[] quotes = new String[]{"Be yourself; everyone else is already taken.", "Fall seven times, stand up eight.", "Life’s a short trip. You’ll find out.", "Try to be a rainbow in someone's cloud.",
                "What we think, we become.", "If you tell the truth, you don't have to remember anything.", "Happiness depends upon ourselves.", "Simplicity is the ultimate sophistication.", "Never regret anything that made you smile.", "Live as if you were to die tomorrow."};

        Scanner myObj = new Scanner(System.in);

        System.out.println("Type a number in 1-10 to display a quote.");
        int command = myObj.nextInt();
        myObj.nextLine();


        try {
            if (command < 10) {
                System.out.println(quotes[command - 1]);

                System.out.println("Would you like to see another? (Y/N)");
                String again = myObj.nextLine();

                while (again.equalsIgnoreCase("y")) {
                    System.out.println("Type a number in 1-10 to display a quote.");
                    command = myObj.nextInt();
                    myObj.nextLine();

                    System.out.println(quotes[command - 1]);

                    System.out.println("Would you like to see another? (Y/N)");
                    again = myObj.nextLine();

                }
                if (again.equalsIgnoreCase("n")) {
                    System.out.println("See you again!");
                }
            }
        } catch (Exception e) {
            throw new RuntimeException(e);
        }



    }
}


