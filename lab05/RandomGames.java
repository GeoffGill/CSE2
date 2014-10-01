//Geoff Gill
//lab05
//9/26/14
//This program allows the user to pick from one of three random variable games
//and it will print out the random occurence caused by the event

import java.util.Scanner;

public class RandomGames{
    public static void main (String[] args) {
        Scanner = myScanner;
        myScanner = new Scanner (System.in);
        System.out.println("Enter R or r for Roulette, C or c for craps, P or p for pick a card - ");
        String choice = myScanner.Next();
        int output;
        switch (choice) {
            
            case "C" : (output = Math.random(0,36));
            return;
            
        }
    }
}