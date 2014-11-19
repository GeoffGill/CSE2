//Geoff Gill
//hw07
//10/22/14
//Explanation:  This program will print out 3 pyramids of integers with four tiers in each pyramid
        //Each pyramid is identical but they are created using for, while, and do-while loops respectivel


import java.util.Scanner;

public class Problem1{
    public static void main (String[] args) {
        int x=0;
            while(x<=5){
                for(int k=0; k<=x; k++){
                    System.out.print(x);
                }
                System.out.println();
                x++;
            }
            while((x>5)&&(x<=9)){
                for(int k=0; k<(10-x);k++){
                    System.out.print(x);
                }
                System.out.println();
                x++;
            }
    }
}