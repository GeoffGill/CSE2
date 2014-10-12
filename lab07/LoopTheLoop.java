//Geoff Gill
//lab07
//10/10/14
//This program allows the user to input a number of stars and then prints them out in a specified format

import java.util.Scanner;

public class LoopTheLoop{   //Creates class
    public static void main (String[] args) {   //main method
        Scanner myScanner = new Scanner (System.in);        //initializes scanner
        while (true){
            System.out.println("Enter the number of stars desired between [1-15]");       //prompts input
            int nStars = myScanner.nextInt();
            int counter = nStars;
            while (counter>1){
                System.out.print("*");
                counter--;
            }System.out.println("*");
            int x = 0;
            while (x<nStars){
                int y = x;
                while (y>0){
                    System.out.print("*");
                    y--;
                }System.out.println("*");
                x++;
            }
        System.out.print("Would you like to continue? (Y/y/N/n)");
        String playAgain = myScanner.next();
            if (playAgain.equals("Y")){
            }else if (playAgain.equals("y")){
            }else{
                break;
            }
        }
    }
}