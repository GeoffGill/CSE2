//Geoff Gill
//HW10
//THis program tells you if your length 10 array of user inputs has any dups
import java.util.Scanner;
public class FindDuplicates{
    public static void main(String [] arg){
        //this scans a user input
        Scanner scan=new Scanner(System.in);
        //cretes an array length 10
        int num[]=new int[10];
        String answer="";
        //prompts the user for 10 inputs and stores in an array
        do{
            System.out.print("Enter 10 ints- ");
            for(int j=0;j<10;j++){
                num[j]=scan.nextInt();
            }
        //prints out a string which will be added too as the arrays are chosen
          String out="The array ";
          out+=listArray(num); //return a string of the form "{2, 3, -9}"
          //printed if has dupes is true
          if(hasDups(num)){
              out+="has ";
          }
          //printed is has dupes is false
          else{
              out+="does not have ";
          }
          out+="duplicates.";
          System.out.println(out);
          out="The array ";
          //adds to the array ut if it is true
          out+=listArray(num);    
          //similar operation to above but of exactlyOneDup comes back as true
          if(exactlyOneDup(num)){
            out+="has ";              }
              else{
                out+="does not have ";
              }
              out+="exactly one duplicate.";
              System.out.println(out); 
              //asks the user if they want to go again and tests for it
              System.out.print("Go again? Enter 'y' or 'Y', anything else to quit- ");
              answer=scan.next();
        }while(answer.equals("Y") || answer.equals("y"));
    }

    public static String listArray(int num[]){
        String out="{";
        //creates formating to show the array
        for(int j=0;j<num.length;j++){
            //addds commas after each input
            if(j>0){
                out+=", ";
            }
            out+=num[j];
        }//format for end of array
        out+="} ";
        return out;
          
    }
    public static boolean hasDups(int num[]){
        int counter = 0;
        //test each array variable against all others
        for (int j=0;j<10;j++){
            for(int k=0;(k<10);k++){
                //discouts dupes when you check num againsts itself
                if((num[j]==num[k])&&(k!=j)){
                    counter++;
                }
            }
        }//of if didnt count any dups it retuns false
        if(counter==0){
            return false;
        }
        //if coutns dupes returns true
        return true;
    }
    //runs same exact test as above but only returns true if it only counts one dup.
    public static boolean exactlyOneDup(int num[]){
        int counter = 0;
        for (int j=0;j<10;j++){
            for(int k=0;(k<10);k++){
                if((num[j]==num[k])&&(k!=j)){
                    counter++;
                }
            }
        }
        if(counter==2){
            return true;
        }
        return false;
    }
}