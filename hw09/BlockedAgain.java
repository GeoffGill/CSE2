
import java.util.Scanner;

public class BlockedAgain{
    public static void main(String []s){
        int m;
        //force user to enter int in range 1-9, inclusive.
        m = getInt();   //recieves input from getInt
        allBlocks(m);   //prints out the number blocks
    }
    
    //this method tests the integer to make sure it is an int and is in the range [1,9]
    public static int getInt (){
        //initialize scanner
        Scanner scan = new Scanner(System.in);
        //prompt input
        System.out.println("Enter an int from 1-9 - ");
        //checks if is an int through checkInt method
        if((checkInt(scan)==true)){
            int input = scan.nextInt();
            //checks if the range is between [1,9]
            if(checkRange(input)!=0){
            //returns user input if range is correct
            return checkRange(input); 
            }
        }
        //restarts the getInt method if it was not a valid entry
        return getInt();
    }
    //this method checks if the input is an int
    public static boolean checkInt(Scanner scan){
        //test for int value
        if ((scan.hasNextInt())){
            //if it is an int it returns true to the getInt method
            return true;
        }
        else{
        //if false it prints out a statment saying aso and returns false(eventually prompting a restart of getInt)
        System.out.println("Your input wasnt an int");
        return false;
        }
    }
    //this method checks the range of the int now that it is an establised int value
    public static int checkRange (int userInput){
        //test if the int is between 1-9, if so returning the numebr to the main method through getInt
        if((userInput>=1)&&(userInput<=9)){
            return userInput;
        }
        //if it is not within the range it tells the user and restarts the getInt method
        else{
            System.out.println("you input wasnt in the specified range");
            return 0;
        }
    }
    //this method holds the counter variable for the number printed
    public static void allBlocks(int x){
        //counter variable starts at 1
        int counter = 1;
        //increments counter variable up through to the user input value
        while (counter<=x){
            //calls block method, which then calls line method
            block(counter,x);
            counter++;
        }
    }
    //this method holds the counter variable for the blocks and how many rows each block should be
    public static void block(int counter,int x){
        //creates an increment variable
        int counter2 = 0;
        //calls on line method to print the correct number of numbers
        while(counter2<counter){
            line(counter, x); 
            counter2++;
        }
        //resets incrment variable and prints the spacing
        int increment=counter;
        while((9-increment)>0){
            System.out.print(" ");
            increment++;
        }
        //resets incrmeent variable and prints the dashes after each set of blocks
        increment = 0;
        while(increment<(counter*2-1)){
            System.out.print("-");
            increment++;
        }
        //returns after the dashes are all printed
        System.out.println();
    }
    //method prints the numebers out so that the tower stays balanced
    public static void line(int counter, int x){
        int increment = counter;
        //prints out spacing under while loop specifications
        while((9-increment)>0){
            System.out.print(" ");
            increment++;
        }
        increment = 0;
        //prints out numbers under while loops specifications
        while(increment<(counter*2-1)){
            System.out.print(counter);
            increment++;
        }
        //returns after the line is complete
        System.out.println();
    }
}