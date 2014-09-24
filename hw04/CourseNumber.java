//Geoff Gill
//CSE02
//hw04
import java.util.Scanner;

public class CourseNumber {
    			  // calculates the tax bracket percentage and the dollar amount
   	public static void main(String[] args) {    
   	    Scanner myScanner;
   	    myScanner = new Scanner ( System.in );
   	    System.out.print("Enter an int giving the mumber of thousands: ");
   	    int number = myScanner.nextInt();
   	    int year = number/100;              //figrues out the year of the course
   	    int semester = number-(year*100);   //figrues out the semester
   	    //checks if number is valid
   	    if ((number<186510)||(number>201440)){
   	        System.out.println("The number was outside the range [186510,201440]");
   	    }//determins spring semester
        else if (semester-10 == 0){
            System.out.println("The course was offered in the Spring session of " + year);
        }//determines summer 1
        else if(semester-20==0){
            System.out.println("The course was offered in the Summer 1 session of " + year);
        }//determines summer 2
        else if(semester-30==0){
            System.out.println("The course was offered in the Summer 2 session of " + year);
        }//determines fall semester
        else if(semester-20==0){
            System.out.println("The course was offered in the Fall session of " + year);
        }//if not a legitimate input
        else if(0==0){
            System.out.println(semester + " is not a legitimate semester");
        }
   	}
}