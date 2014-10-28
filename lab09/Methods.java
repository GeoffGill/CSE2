import java.util.Scanner;
public class Methods{
  public static void main(String [] arg){
	Scanner scan=new Scanner(System.in);
	int a,b,c;
	System.out.println("Enter three ints");
	a=getInt(scan);
	b=getInt(scan);
	c=getInt(scan);
	System.out.println("The larger of "+a+" and "+b+" is "+larger(a,b));
	System.out.println("The larger of "+a+", "+b+", and "+c+
                   	" is "+larger(a,larger(b,c)));
	System.out.println("It is "+ascending(a,b,c)+" that "+a+", "+b+
                   	", and "+c+" are in ascending order");
  }


public static int larger(int a, int b){
    if(a>b){
        return(a);
    }
    else if(b>a){
        return(b);
    }
    else{
        System.out.println("a and b are equal");
        System.exit(0);
        return(0);
    }
}

public static int getInt(Scanner scan){
       Scanner myScanner;
            myScanner= new Scanner(System.in);
      System.out.print("pick your number : ");
                     //check if user entered an integer
                     if(myScanner.hasNextInt() ){
                            //accept user input
                            return(myScanner.nextInt());
                     }
                        
                        else{
                            System.out.println("you did not enter an int");
                            System.exit(0); //ends the program
                            return(0);
                        }
}

public static boolean ascending(int a,int b,int c){
    if(a<b&&a<c&&b<c){
        return(true);
    }
    else{
        return(false);
    }
}

}