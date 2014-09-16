import java.util.Scanner;

public class Root {
    			  // main method required for every Java program
   	public static void main(String[] args) {    
   	    Scanner myScanner;
   	    myScanner = new Scanner ( System.in );
   	    System.out.print("Enter a number ");
   	    double number = myScanner.nextDouble();
   	    
   	    double g1 = number/3;
   	    
   	    double g2 = (2*g1*g1*g1+number)/(3*g1*g1);
   	    double g3 = (2*g2*g2*g2+number)/(3*g2*g2);
   	    double g4 = (2*g3*g3*g3+number)/(3*g3*g3);
   	    double g5 = (2*g4*g4*g4+number)/(3*g4*g4);
   	    double g6 = (2*g5*g5*g5+number)/(3*g5*g5);
        
        
        
        System.out.println("The estimated cubed root of " + number + " is " + g6);
        System.out.println(g6 + "*" + g6 + "*" + g6 + "=" + g6*g6*g6);


   	    
    }  //end of main method   
} //end of class