/*Sample of expected output:
 *   Enter an int- 9
 *   You entered 9
 *   sum is 25
 *   Again, you entered 9
 */

import java.util.Scanner;
public class Enigma0{
  public static void main(String arg []){
    System.out.print("Enter an int- ");
    Scanner scan=new Scanner(System.in);
    if(scan.hasNextInt()){
      int n=scan.nextInt();
      System.out.println("You entered "+n);
      int k=4,p=6,q=7,r=8;
        switch(k+p+q+r){
          case 24: System.out.println("sum is 24"); break;
          case 25: System.out.println("sum is 25"); break;
          default:
            System.out.println("The sum of variables k, p, q, and r is " +(k+p+q+r));
        }
    System.out.println("To repeat, you entered "+n);
    }
    else{
      int n=4;
      System.out.println("You did not enter a valid integer");
    }
  }
}

/* Error report:
 *   Expand this comment:
 *   I moved all of the operations in the bottom half of the code under the if statment into the if stament
 *      because some of those operations can not be completed with out and int input
 *   I changed the default output incase those cases are not correct
 *   I also question the need for the switch statment becasue the numbers its testing are always the same
 *      thus the output must also be the same every time, but left it because i am unsure of the intentiosn
 *      of the program
 */

