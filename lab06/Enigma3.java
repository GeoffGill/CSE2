/* Insert System.out.println() statements statements in the code
 * below, displaying the status of n and k, which 
 * should help you identify when n  or k becomes 0 and causes
 * the program to crash
 */

import java.util.Scanner;
public class Enigma3{
    public static void main(String [] arg){
    int n=40,k=60;
    String out="";
    switch(k%14){
      case 12: 
      case 13: out+=13;
      System.out.println(n + ", " +k + " 1");
         break;
      default: out+=40;
          n/=3;
          k-=7;
          System.out.println(n + ", " +k+ " 2");
    }
    if(n*k%12< 12){
      n-=20;
      out+=n;
      System.out.println(n + ", " +k+ " 3");
    }
    if(n*n>k){
      n=42;
      out+=n+k;
      System.out.println(n + ", " +k+ " 4");
    }
    else {
      n=45;
      out+=n+k;
      System.out.println(n + ", " +k+ " 5");
    }
    switch(n+k){
      case 114: 
        n-=11;
        k-=3;
        System.out.println(n + ", " +k+ " 6");
        break;
      case 97:
        n-=14;
        k-=2;
        System.out.println(n + ", " +k+ " 7");
        break;
      case 98:
        n/=5;
        k/=9;
        System.out.println(n + ", " +k+ " 8");
      default:
        n-=3;
        k-=5;
        System.out.println(n + ", " +k+ " 9");
    }
    if ((n==0)||(k==0)){
    System.out.println("either n or k is equal to zero and the calculatiosn can not be completed");
    }
    else{
         out+=1/n + 1/k;   
    System.out.println(out);
    }
  }
}

/*
 * Error report:
 * The error occurs when the program tries to divide by zero in line 57.
 * This happening because in the default operations from line 52 k is set to zero because it doesnt 
 * fall under any of the cases listed in the switch statment
 * I included an if statment to test is either k or n is equal to zero and if so it prints out that
 * the operation is not possible because you can not divide by zero
 */

