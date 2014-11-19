//Geoff Gill
//hw07
//10/22/14
//Explanation:  This program will print out 3 pyramids of integers with four tiers in each pyramid
        //Each pyramid is identical but they are created using for, while, and do-while loops respectivel


import java.util.Scanner;

public class Problem1{

	public static void main( String args[] ){
		for (int x = 6;x>0;x--){
		    for(int y = (x-2);y>0;y--){
    		        for(int z = 0;z<(y);z++){
    		            System.out.print(x);
		            }
		           System.out.println(); 
		    }
		    if(x<=2){
		        System.out.println(x);
		    }
		}
		
	}

}