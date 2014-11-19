//Geoff Gill
//hw07
//10/22/14
//Explanation:  This program will print out 3 pyramids of integers with four tiers in each pyramid
        //Each pyramid is identical but they are created using for, while, and do-while loops respectivel


import java.util.Scanner;

public class Problem2{
    public static int perplex(int x,int y){
	x++;
	y+=x;
	System.out.println(x+" "+y);
	return x+y;
}

public static void main( String args[] ){
	int x=3,z=5;
	int y=perplex(x,z);
	System.out.println(y+" "+x+" "+z);
	x=10;
	y=perplex(x,x);
	System.out.println(y+ " " + x);
}

}