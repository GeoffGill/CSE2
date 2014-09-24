//Geoff Gill
//CSE02
//hw04
import java.util.Scanner;

public class IncomeTax {
    			  // calculates the tax bracket percentage and the dollar amount
   	public static void main(String[] args) {    
   	    Scanner myScanner;
   	    myScanner = new Scanner ( System.in );
   	    System.out.print("Enter an int giving the mumber of thousands: ");
   	    int income = myScanner.nextInt();
   	    double tax;     //Initialize tax percetage
   	    double tax$;    //Initialize the tax $amount
   	    
   	    //income under 20k calculations
   	    if (income < 20){
   	        tax = .05; //tax percentage
   	        tax$ = income*1000 * tax;   //calculates tax
   	        System.out.println("The tac rate on $" + income*1000 + " is " +((int)(tax*100))+"%, and the tax is "+((int)tax$));
   	    } //income 20<=x<40
   	    else if ((income>=20)&&(income<40)){
   	        tax = .07; //tax percentage
   	        tax$ = income*1000 * tax;   //calculates tax
   	        System.out.println("The tax rate on $" + income*1000 + " is " +((int)(tax*100))+"%, and the tax is "+((int)tax$));
   	    }//income 40<=x<78
   	    else if ((income>=40)&&(income<78)){
   	        tax = .12; //tax percentage
   	        tax$ = income*1000 * tax;   //calculates tax
   	        System.out.println("The tax rate on $" + income*1000 + " is " +((int)(tax*100))+"%, and the tax is "+((int)tax$));
   	    }//income x>78
   	    else if (income>=78){
   	        tax = .14; //tax percentage
   	        tax$ = income*1000 * tax;   //calculates tax
   	        System.out.println("The tax rate on $" + income*1000 + " is " +((int)(tax*100))+"%, and the tax is "+((int)tax$));
   	    }
   	}
}