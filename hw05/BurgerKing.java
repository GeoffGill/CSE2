//Geoff Gill
//hw05.1
//9/30/14
//This order ask the user what they would like to order off a selective menu
//and it will print out the order

import java.util.Scanner;

public class BurgerKing{
    public static void main (String[] args) {
        //initialize scanner
        Scanner myScanner = new Scanner (System.in);
        System.out.println("Enter a letter to indicate a choice of  ");
        System.out.println("Burger (B or b)");
        System.out.println("Soda (S or S)");
        System.out.println("Fries (F or f)");
        char choice1 = myScanner.next().charAt(0);
        char choice2;
      
        switch (choice1) {
//logic for choice of a burger (capital B)
            case 'B': 
                //prompts user for an imput
                System.out.println("Enter (A or a) for all the fixins");
                System.out.println("Enter (C or C) for cheese");
                System.out.println("Enter (N or n) for no toppings");
                choice2 = myScanner.next().charAt(0);
                    //logic for all toppings
                    switch (choice2) {
                        case 'A':
                            System.out.println("You ordered a burger with all the fixins");
                        return;
                        case 'a':
                            System.out.println("You ordered a burger with all the fixins");
                        return;
                        case 'C':
                            System.out.println("You ordered a burger with cheese");
                        return;
                        case 'c':
                            System.out.println("You ordered a burger with cheese");
                        return;
                        case 'N':
                            System.out.println("You ordered a plain burger");
                        return;
                        case 'n':
                            System.out.println("You ordered a plain burger");
                        return;
                        default :
                        System.out.println("You entered an unexpected input");
                        return;
                    }

//Logic for input b
            case 'b': 
                //prompts user for an imput
                System.out.println("Enter (A or a) for all the fixins");
                System.out.println("Enter (C or C) for cheese");
                System.out.println("Enter (N or n) for no toppings");
                choice2 = myScanner.next().charAt(0);
                    //logic for different topping choices
                    switch (choice2) {
                        case 'A':
                            System.out.println("You ordered a burger with all the fixins");
                        return;
                        case 'a':
                            System.out.println("You ordered a burger with all the fixins");
                        return;
                        case 'C':
                            System.out.println("You ordered a burger with cheese");
                        return;
                        case 'c':
                            System.out.println("You ordered a burger with cheese");
                        return;
                        case 'N':
                            System.out.println("You ordered a plain burger");
                        return;
                        case 'n':
                            System.out.println("You ordered a plain burger");
                        return;
                        default :
                        System.out.println("You entered an unexpected input");
                        return;
                    }

//Logic for input S
            case 'S': 
                //prompts user for an imput
                System.out.println("Enter (P or p) for Pepsi");
                System.out.println("Enter (C or c) for Coke");
                System.out.println("Enter (S or s) for Sprite");
                System.out.println("Enter (M or m) for Mountain Dew");
                choice2 = myScanner.next().charAt(0);
                    //logic for different soda choices
                    switch (choice2) {
                        case 'P':
                            System.out.println("You ordered Pepsi");
                        return;
                        case 'p':
                            System.out.println("You ordered Pepsi");
                        return;
                        case 'C':
                            System.out.println("You ordered Coke");
                        return;
                        case 'c':
                            System.out.println("You ordered Coke");
                        return;
                        case 'S':
                            System.out.println("You ordered Sprite");
                        return;
                        case 's':
                            System.out.println("You ordered Sprite");
                        return;
                        case 'M':
                            System.out.println("You ordered Mountain Dew");
                        return;
                        case 'm':
                            System.out.println("You ordered Mountain Dew");
                        return;
                        default :
                        System.out.println("You entered an unexpected input");
                        return;
                    }
//logic for input s            
            case 's': 
                //prompts user for an imput
                System.out.println("Enter (P or p) for Pepsi");
                System.out.println("Enter (C or c) for Coke");
                System.out.println("Enter (S or s) for Sprite");
                System.out.println("Enter (M or m) for Mountain Dew");
                choice2 = myScanner.next().charAt(0);
                    //logic for different soda choices
                    switch (choice2) {
                        case 'P':
                            System.out.println("You ordered Pepsi");
                        return;
                        case 'p':
                            System.out.println("You ordered Pepsi");
                        return;
                        case 'C':
                            System.out.println("You ordered Coke");
                        return;
                        case 'c':
                            System.out.println("You ordered Coke");
                        return;
                        case 'S':
                            System.out.println("You ordered Sprite");
                        return;
                        case 's':
                            System.out.println("You ordered Sprite");
                        return;
                        case 'M':
                            System.out.println("You ordered Mountain Dew");
                        return;
                        case 'm':
                            System.out.println("You ordered Mountain Dew");
                        return;
                        default :
                        System.out.println("You entered an unexpected input");
                        return;
                    }
//Logic for input F            
            case 'F': 
                //prompts user for an imput
                System.out.println("Do you want large or small fries (L, l, S, or s)");
                choice2 = myScanner.next().charAt(0);
                    //logic for different fry options
                    switch (choice2) {
                        case 'L':
                            System.out.println("You ordered large fries");
                        return;
                        case 'l':
                            System.out.println("You ordered large fries");
                        return;
                        case 'S':
                            System.out.println("You ordered small fries");
                        return;
                        case 's':
                            System.out.println("You ordered small fries");
                        return;
                        default :
                        System.out.println("You entered an unexpected input");
                        return;
                    }
//Logic for input f
            case 'f': 
                //prompts user for an imput
                System.out.println("Do you want large or small fries (L, l, S, or s)");
                choice2 = myScanner.next().charAt(0);
                    //logic for different fry options
                    switch (choice2) {
                        case 'L':
                            System.out.println("You ordered large fries");
                        return;
                        case 'l':
                            System.out.println("You ordered large fries");
                        return;
                        case 'S':
                            System.out.println("You ordered small fries");
                        return;
                        case 's':
                            System.out.println("You ordered small fries");
                        return;
                        default :
                        System.out.println("You entered an unexpected input");
                        return;
                    }
            //logic if user doesnt provide a usable input
            default :
                System.out.println("You entered an unexpected input");
            break;
        }
    }
}