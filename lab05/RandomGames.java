//Geoff Gill
//lab05
//9/26/14
//This program allows the user to pick from one of three random variable games
//and it will print out the random occurence caused by the event

import java.util.Scanner;

public class RandomGames{   //Creates class
    public static void main (String[] args) {   //main method
        Scanner myScanner = new Scanner (System.in);        //initializes scanner
        System.out.println("Enter R or r for Roulette, C or c for craps, P or p for pick a card - ");       //prompts input
        String choice = myScanner.next();   //initializes input as string
        int output;     //initialize roulets output
        switch (choice) {   //start of switch operation to test inputs
            
            case "R" :
                output = (int) (Math.random()*37);  //creates a random rulette outcome
                    if(output==0){  
                        System.out.println("The outcome was 0");    //outcome for zero
                    }else if(output==1){
                        System.out.println("The outcome was 00");   //outcome for double zero
                    }else{
                        System.out.println("The outcome was " + (output - 1));  //outcome for 1-36
                    }
                    
                return;
            case "r":
                output = (int) (Math.random()*37);  //creates a random rulette outcome
                    if(output==0){
                        System.out.println("The outcome was 0");    //outcome for zero
                    }else if(output==1){
                        System.out.println("The outcome was 00");   //outcome for double zero
                    }else{ 
                        System.out.println("The outcome was " + (output - 1));  //outcome for 1-36
                    }
                    
                return;
            case "C":
                System.out.println("These options have not been initialized");      //tells user the program isnt able to proess those inputs yet
                return;
            case "c":
                System.out.println("These options have not been initialized");      //tells user the program isnt able to proess those inputs yet
                return;
            case "P":
                System.out.println("These options have not been initialized");      //tells user the program isnt able to proess those inputs yet   
                return;
            case "p":
                System.out.println("These options have not been initialized");      //tells user the program isnt able to proess those inputs yet
                return;
            default :
                System.out.println("This was not a correct input");     //default output used if input doesnt match the right format
                return;
            
        }
    }
}