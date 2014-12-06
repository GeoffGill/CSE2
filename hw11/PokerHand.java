//Geoff Gill
//HW11
//This program allows the user to ender a set of cards and then outputs the poker hand it consistes of

import java.util.Random;
import java.util.Scanner;
public class PokerHand{
    //defines arrays used in every method
    static String[] faceValues = {"A","K","Q","J","10","9","8","7","6","5","4","3","2"};
    static String[] suitValues = {"C","H","S","D"};
    
    public static void main(String [] arg){
        //calls scanner
        Scanner scan = new Scanner(System.in);  
        //creates loop only user input can break
        boolean x = true;
        while(true){
            //creates strings for face and suit values as well as user enters so as not to repeat
        String[] face = new String[5];
        String[] suit = new String[5];  
        String[] faceEnteredArray = new String[100];     //assuming no more than 100 entries needed to get 5 cards
        String[] suitEnteredArray = new String[100];//assuming no more than 100 entries needed to get 5 cards
       //sets counters to zero
        int faceEntered = 0;
        int suitEntered = 0;
        //prompts user for all five cards
        for(int i=0;i<5; i++){
            System.out.print("please enter the face value of your card (A,K,Q,J,10,9,8,7,6,5,4,3,2) - ");
            face[i] = generateFace();
            faceEnteredArray[faceEntered] = face[i];
            faceEntered ++;
            System.out.print("please enter the suit value of your card (S,C,H,D) - ");
            suit[i] = generateSuit();
            suitEnteredArray[suitEntered] = face[i];
            suitEntered ++;
            //test if card is valid and not entered
            if(testCard(face[i], suit[i], faceEnteredArray, suitEnteredArray) == false){
                System.out.println("you already entered that card");
                i--;
            }
        }//finds the type of poker hand it is
        findHand(face, suit);
        //asks user if they want to play agian
        System.out.println("Enter Y to input another hand : ");
        String repeat = scan.next();
        if((repeat.equals("Y"))||(repeat.equals("y"))){
            x=false;
        }
        }
        
    }
    //this method gets the face value
    public static String generateFace(){
        String input;
        Scanner scan = new Scanner (System.in);
        input = scan.next();
        String x = getValidFace(input);
        input = x;
        return input;
    }
    //this method gets the suit value
    public static String generateSuit(){
        String input;
        Scanner scan = new Scanner (System.in);
        input = scan.next();
        String x = getValidSuit(input);
        input = x;
        return input;
    }
    //this method checks if the card has already been entered
    public static String getValidSuit(String value){
        Scanner scan = new Scanner (System.in);
        int valid = 0;
        while (valid == 0){
            for(int i = 0;i<4;i++){
                if(suitValues[i].equals(value)){
                    valid = 1;
                }
            }
            if(valid==0){
                System.out.println("Your input wasnt valid please try again");
                value = scan.next();
            }
        }
        return value;
    }
    //this method checks if the card has already been entered
    public static String getValidFace(String value){
        Scanner scan = new Scanner (System.in);
        int valid = 0;
        while (valid == 0){
            for(int i = 0;i<13;i++){
                if(faceValues[i].equals(value)){
                    valid = 1;
                }
            }
            if(valid==0){
                System.out.println("Your input wasnt valid please try again");
                value = scan.next();
            }
        }
        return value;
    }
    //this checks if the card has been entered
    public static boolean testCard (String face, String suit, String[] faceEnteredArray, String[] suitEnteredArray){
        for(int i=0;i<100;i++){
            if((face.equals(faceEnteredArray[i]))||(suit.equals(suitEnteredArray[i]))){
                return true;
            }
        }
        return false;
    }
    //This prints out the hand if the desired format
    public static void printHand(String[] face, String[] suit){
        String clubsArray[] = new String[5];
        String spadesArray[] = new String[5];
        String heartsArray[] = new String[5];
        String diamondsArray[] = new String[5];
        int clubs = 0;
        int spades = 0;
        int hearts = 0;
        int diamonds = 0;
        //this checks how many times a suti comes up
        for (int i = 0; i<5; i++){
            if(suit[i].equals("C")){
                clubsArray[clubs] = face[i];
                clubs++;
            }
            if(suit[i].equals("S")){
                spadesArray[spades] = face[i];
                spades++;
            }
            if(suit[i].equals("H")){
                heartsArray[hearts] = face[i];
                hearts++;
            }
            if(suit[i].equals("D")){
                diamondsArray[diamonds] = face[i];
                diamonds++;
            }
        }
        //these prints statments print out the arrays
        System.out.print("Clubs:  ");
        for(int i = 0; i<clubs;i++){
            System.out.print(clubsArray[i]+", ");
        }
        System.out.println();
        System.out.print("Spades:  ");
        for(int i = 0; i<spades;i++){
            System.out.print(spadesArray[i]+", ");
        }
        System.out.println();
        System.out.print("Hearts:  ");
        for(int i = 0; i<hearts;i++){
            System.out.print(heartsArray[i]+", ");
        }
        System.out.println();
        System.out.print("Diamonds:  ");
        for(int i = 0; i<diamonds;i++){
            System.out.print(diamondsArray[i]+", ");
        }
        System.out.println();
        System.out.println(findHand(face,suit));
        
    }
    //this method creates a seperate arraay with integers in place of the strings
    public static String findHand(String[] face, String[] suit){
        int[] faceOrdered = new int[5];
        String hand = "y";
        for(int i =0; i<5; i++){
            if(face[i].equals("A")){
                faceOrdered[i] = 14;
            }
            if(face[i].equals("K")){
                faceOrdered[i] = 13;
            }
            if(face[i].equals("Q")){
                faceOrdered[i] = 12;
            }
            if(face[i].equals("J")){
                faceOrdered[i] = 11;
            }
            if(face[i].equals("10")){
                faceOrdered[i] = 10;
            }
            if(face[i].equals("9")){
                faceOrdered[i] = 9;
            }
            if(face[i].equals("8")){
                faceOrdered[i] = 8;
            }
            if(face[i].equals("7")){
                faceOrdered[i] = 7;
            }
            if(face[i].equals("6")){
                faceOrdered[i] = 6;
            }
            if(face[i].equals("5")){
                faceOrdered[i] = 5;
            }
            if(face[i].equals("4")){
                faceOrdered[i] = 4;
            }
            if(face[i].equals("3")){
                faceOrdered[i] = 3;
            }
            if(face[i].equals("2")){
                faceOrdered[i] = 2;
            }
        }
        //here we try and calculate different hands using max values and mins and repeats of values
        int doubles = 0;
        int max = 0;
        int min = 14;
        for(int i=0;i<5;i++){
            for(int k = 0;k<5;k++){
                if((faceOrdered[k] == faceOrdered[i])&&(k!=i)){
                    doubles++;
                }
                if(faceOrdered[i]>max){
                    faceOrdered[i] = max;
                }
                if(faceOrdered[i]<min){
                    faceOrdered[i]=min;
                }
            }
        }
        //here we print out the hand results
        if(doubles==1){
            hand.equals("1 Pair");
        }
        if(doubles==2){
            hand.equals("2 Pair");
        }
        if(((max-min)==4)&&(doubles ==0)){
            hand.equals("Straight");
        }
        else{
            hand.equals("The high card wins");
        }
        //this is our default value
        return hand;
    }
    
}    