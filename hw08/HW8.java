//Geoff Gill
//CSE2 Hw08


import java.util.Scanner;
public class HW8{
    //main method
    //imports methods with lines starting with input from other methods with correct paramaters and inputs
    public static void main(String []arg){
        char input;
    	Scanner scan=new Scanner(System.in);//initialize scanner
    	System.out.print("Enter 'C' or 'c' to continue, anything else to quit- ");                 //prompts input
    	input=getInput(scan,"Cc");                                                                  //gets input from line 24 method
    	System.out.println("You entered '"+input+"'");                                             //prints response
        System.out.print("Enter 'y', 'Y', 'n', or 'N'- ");                                          //promts input
     	input=getInput(scan,"yYnN",5);                                                              //gets input from method on line38
     	if(input!=' '){
       	System.out.println("You entered '"+input+"'");                                              //prints out answers
     	}
     	input=getInput(scan,"Choose a digit.","0123456789");                                        //prompts input
     	System.out.println("You entered '"+input+"'");                                              //prints out your choice
    }
  
    public static char getInput (Scanner scan, String answer){                                      //get input with inputs of a scanner and a string
        String userInput = scan.next();
        while (userInput.length()>1){                                                               //tests if it is a singel variable input
            System.out.println("your input was more than one charecter. Please try again");         //rejects if it is not a signle variable
            System.out.print("you should enter exactly one digit - " );
            userInput = scan.next();                                                                //gets a new input
        }
        while((userInput.charAt(0)!=answer.charAt(0))&&(userInput.charAt(0)!=answer.charAt(1))){    //tests if you entered either acceptable input
            System.out.print("you did not enter either C or c - ");                                 //rejects if did not enter Cc
            userInput=scan.next();                                                                  //gets new input
        }
        return userInput.charAt(0);                                                                 //returns the input because it is ither Cc by this point
    }
    
    public static char getInput(Scanner scan, String answer, int chances){                          //method for a scanner, string, and an int
        String userInput = scan.next();                                                             //gets input
        while (chances>1){                                                                          //increments chances down
            while (userInput.length()>1){                                                               //tests if it is a singel variable input
                System.out.print("You did not enter a character from the list 'yYnN'; try again- ");         //rejects if it is not a signle variable
                userInput = scan.next();                                                                //gets a new input
            }
            for (int counter=0;(counter<(answer.length()));counter++){                              //checks the iinput lenght
                if ((answer.charAt(counter))==(userInput.charAt(0))){                               //chekcs if input is YyNn
                    return userInput.charAt(0);                                                     //retuns input if it works
                }
            }
            System.out.print("You did not enter a character from the list 'yYnN'; try again- ");    //rejects input
            userInput=scan.next();                                                                  //gets new input
            chances--;                                                                              //increment chances
        }
        System.out.println("you failed after 5 attempts");                                          //tells the user they have no more guesses
        return ' ';
    }
    
    public static char getInput(Scanner scan, String prompt, String options){                       //method calling for a scanner, string, and string
        System.out.println("Choose a digit");                                                       //prompts user for an input
        System.out.print("Enter either ");                                                          //prints out the options
        for (int x=1;x<=9;x++){
            System.out.print("'"+x+"'");                                                            //prints out 1-9 formatted
        }System.out.println();
        String userInput = scan.next();                                                             //gathers input
        for (int counter=0;(counter<(options.length()));counter++){                                 //checks all of the inputs
            if ((options.charAt(counter))==(userInput.charAt(0))){                                  //if they are valid its returns that input
                return userInput.charAt(0);
            }
        }
        System.out.println("your input was not correct");                                           //i was unsur what was wanted if the input was not correct
        return ' ';                                                                                 //so i just had it return a space
    }
    
}
