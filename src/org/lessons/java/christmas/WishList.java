package org.lessons.java.christmas;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class WishList {
    public static void main(String[] args) {
        // istanzio la mia lista wishlist
        ArrayList<String> wishList = new ArrayList<>();
        // Scanner input utente
        Scanner scan = new Scanner(System.in);
        // chiedo all' utente i regali da aggiungere alla lista
        System.out.println("What present would you like to add to your wishlist? ");
        // booleano per capire  se andare avanti ad aggiungere o stampare lista completa
        boolean keepGoing = true;
        // ciclo while
        while (keepGoing) {
            String present = scan.nextLine();
            // aggiungo il regalo alla wishlist
            wishList.add(present);
            // ordino la lista alfabeticamente
            Collections.sort(wishList);
            // stampo la wishlist di riepilogo
            System.out.println("----------WISHLIST---------");
            for (String gift : wishList) {
                System.out.println("-" + gift);
            }
            //System.out.println(wishList);
            System.out.println("---------------------------");
            // riepilogo dimensioni della lista

            if(wishList.size() == 1 ) {
                System.out.println("You have " + 1 + " present in your wishlist");
            } else if (wishList.size() > 1) {
                System.out.println("You have " + wishList.size() + " presents in your wishlist");
            }

            // chiedo all' utente se vuole continuare
            System.out.println("1-Would you like to add another present? (y/n)");
            String answer = scan.nextLine().toLowerCase();
            /*System.out.print("Please add another present: ");*/

            while(!answer.equals("y") && !answer.equals("n"))  {
                // qualsiasi  altra risposta
                System.out.println("-----------------");
                System.out.println("INVALID INPUT \n" +
                        "Please enter 'y' to continue or 'n' to see your summary.");
                System.out.println("2-Would you like to add another present? (y/n)");
                answer = scan.nextLine().toLowerCase();
            }
            if(answer.equals("y")) {
                // se la risposta è y
                System.out.print("Please add another present: ");
            }
            if(answer.equals("n")) {
                // se la risposta è n
                keepGoing = false;
                System.out.println("--------------------");
                System.out.println("Here's your summary:");
                System.out.println("--------------------");
                for (String gift : wishList) {
                    System.out.println("-" + gift);
                }
                System.out.println("------------------");
                System.out.println("MERRY CHRISTMAS !!");
                System.out.println("------------------");
            }
        }

    }
}
