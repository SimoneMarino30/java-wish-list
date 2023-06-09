package org.lessons.java.christmas;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class WishList {
    public static void main(String[] args) {
        // istanzio la mia lista wishlist
        List<String> wishList = new ArrayList<>();

        // chiedo all' utente i regali da aggiungere alla lista
        Scanner scan = new Scanner(System.in);

        // booleano per capire  se andare avanti ad aggiungere o stampare lista completa
        boolean keepGoing = true;
        System.out.println("What present would you like to add to your wishlist? ");
        while (keepGoing) {

            String present = scan.nextLine();

            // aggiungo il regalo alla wishlist
            wishList.add(present);
            // ordino la lista alfabeticamente
            Collections.sort(wishList);

            System.out.println("----------WISHLIST---------");
            System.out.println(wishList);
            System.out.println("---------------------------");
            // riepilogo temporaneo della lista
            System.out.println("You have " + wishList.size() + " presents in your wishlist");

            // chiedo all' utente se vuole continuare
            System.out.print("Would you like to add another present? (y/n)");
            String answer = scan.nextLine().toLowerCase();

            if(answer.equals("y")) {
                System.out.println("Please add another present: ");
            } else if(answer.equals("n")) {
                keepGoing = false;
                System.out.println("Here's your summary: ");
                for (String gift : wishList) {
                    System.out.println(gift);
                }
                System.out.println("MERRY CHRISTMAS !!");
            }else {
                System.out.println("Invalid input. Please enter 'y' to continue or 'n' to see your summary.");
            }
        }

    }
}
