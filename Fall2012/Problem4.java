//Geoff Gill
//hw07
//10/22/14
//Explanation:  This program will print out 3 pyramids of integers with four tiers in each pyramid
        //Each pyramid is identical but they are created using for, while, and do-while loops respectivel


import java.util.Scanner;

public class Problem4{
  		
	public static int sumPow(int input){
		int answer=0;
		int section=1;
		for(int x=1;x<=input;x++){
			section=1;
			for(int y=1;y<=x;y++){
				section*=x;	
			}
			answer+=section;
		}
		return answer;
	}

	public static void main( String args[] ){
		Scanner scan = new Scanner(System.in);
		System.out.println("please enter an int");
		int input = scan.nextInt();
		System.out.println(sumPow(input));
	}

}