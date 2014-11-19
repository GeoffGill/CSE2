//Geoff Gill
//hw07
//10/22/14
//Explanation:  This program will print out 3 pyramids of integers with four tiers in each pyramid
        //Each pyramid is identical but they are created using for, while, and do-while loops respectivel


import java.util.Scanner;

public class Problem3{
  		
	public static int sumsq(int input){
		int answer=0;
		for(int x=1;x<=input;x++){
			answer+=(x*x);
		}
		return answer;
	}

	public static void main( String args[] ){
		Scanner scan = new Scanner(System.in);
		do{
			System.out.println("Please enter an posotive integer to continue, or a negative one to break");
			while(!scan.hasNextInt()){
				System.out.println("you did not enter and intger, please try again");
			}
			int input = scan.nextInt();
			int answer;
			if(input>0){
				answer = sumsq(input);
				System.out.println("the sume of 1+2*2+3*3+...+n*n for n = " + input+ " is " + answer);
			}
			if(input<=0){
				break;
			}
		}while(true);
	}

}