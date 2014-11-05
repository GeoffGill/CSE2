//Geoff Gill
//hw07
//10/22/14
//Explanation:  This program will print out 3 pyramids of integers with four tiers in each pyramid
        //Each pyramid is identical but they are created using for, while, and do-while loops respectivel


import java.util.Scanner;

public class NumberStack{
    public static void main (String[] args) {
        //prompts for input and checks to see if it is a valid input
        //if not it askes for a new input
        System.out.print("Please enter a number between 1-9 - "); //Prompts for input
        Scanner scan = new Scanner (System.in);
        while (!scan.hasNextInt()){
            System.out.println("Did not enter an int please enter and integer");
            scan = new Scanner (System.in);
        }
        int input = scan.nextInt();             //Saves input
        
        //code for for loops
        
        // 'a' is a variable to count the numebr of lines
        // 'b' is a variable to count the number of numbers on a line
        // 'c' is a variable to increment the dashes
        // 'd' is a variable to increment the spacing
        System.out.println("Using for loops");
        for (int stack = 0;stack<=(input-1);stack++){
            for(int a=0;a<=stack;a++){              //increments the line
                for(int d=0;d<=(input-stack);d++){      //increments the spacing for the stacks
                    System.out.print(" ");
                }
                for(int b=0;(b<=(stack*2));b++){    //prints out the number
                    System.out.print((stack+1));
                }
            System.out.println();
            }
        for(int d=0;d<=(input-stack);d++){          //correct spacing for the dashes
                    System.out.print(" ");
        }           
        for(int c=0;c<(1+stack*2);c++){         //prints out the dashes
            System.out.print("-");
        }
        System.out.println();                   //indents line after the spacer dashes
        }
        
        //code for while loops
        System.out.println("Using while loops");
        //resets all of my counter vairables
        int stack=0;    //increments stacks
        int a=0;        //increments the lines of numbers
        int b=0;        //increments the number of numbers on a line
        int c=0;        //increments the dashes
        int d=0;        //increments the spacing
        //this while loop is for the series of numbers, and it is incremented by stacks
        while(stack <=(input-1)){   
            a=0;        //resets variables
            c=0;        //resets variables
            while(a<=stack){
                b=0;        //resets variables
                d=0;        //resets variables
                while(d<=(input-stack)){        
                    System.out.print(" ");      //spaces the stacks
                    d++;
                }
                while(b<=(stack*2)){            //Determines the number for each stack
                    System.out.print((stack+1));
                    b++;
                }
            System.out.println();               
            a++;                                //increments the line by 1
            }
        d=0;
        while(d<=(input-stack)){
            System.out.print(" ");              //spaces out the dashes
            d++;
        }
        while(c<d(1+stack*2)){
            System.out.print("-");              //inserts spacer dashes
            c++;
        }
        System.out.println();                   //creates a new line
        stack++;                                //increments the stack
            
            
        }
        
        
       //do-while loops
       System.out.println("Using do-while loops");
       //resets all of my counter variables
         stack=0;    //increments stacks
        a=0;        //increments the lines of numbers
        b=0;        //increments the number of numbers on a line
        c=0;        //increments the dashes
        d=0;        //increments the spacing
       
       do{
           a=0;             //resets variables
           c=0;             //resets variables
           do{
                b=0;        //resets variables
                d=0;        //resets variables
                do{
                   System.out.print(" ");       
                   d++;
                }while(d<=(input-stack));           //incremetns spacing for stacks
                do{
                   System.out.print((1+stack));     //prints out stack numbers
                   b++;
                }while(b<=(stack*2));                   //increments the number of numbers on a line
                System.out.println();
                a++;
            }while(a<=stack);                           //increments number of lines
            d=0;
            do{
                System.out.print(" ");                  //spaces out the dashes
                d++;
            }while(d<=input-stack);
            do{
                System.out.print("-");                  //prints out the dashes
                c++;
            }while(c<(1+stack*2));
            System.out.println();                       //indents to new line
            stack++;                                    //increments stacks
        }while(stack <=(input-1));
    }
}
    