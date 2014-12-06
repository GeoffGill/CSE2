//Geoff Gill
//CSE2
//hw10
//This program gives the user a random pair of cards for a period of time dependant of the  of the
//users input. If the user chooses to end the program it then shows the montecarlo simulation odds of 
//running the program 1000 times
//I am aware that my odds are not correct but i was not able to figure out how to change the logic to help improve it
import java.util.Random;
import java.util.Scanner;
public class PokerOdds{
  public static void main(String [] arg){
    showHands();
    simulateOdds();
  }
  //THis method prints out different card hans
  public static void showHands(){
      //this is a variable only user input can effect
      int x=0;
      //this while loop will only be broken due to a user input
    while(x!=999){      
      int number = 13;
      String[] suit = new String[52];
      //in this for loop we define the suit of all the cards
      for (int k =0;k<52;k++){
          
          if(k<=12){
            suit[k]="Clubs";
          }
          else if((k<=25)&&(k>12)){
              suit[k]="Diamonds";
          }
          else if((k<=38)&&(k>25)){
              suit[k]="Hearts";
          }
          else if((k<=51)&&(k>38)){
              suit[k]="Spades";
          }
          //in these if statments we define the unique value of the cards
          if(number<=9){
              suit[k]=((number+1)+suit[k]);
          }
          if(number==10){
              suit[k]=("J"+suit[k]);
          }
          if(number==11){
              suit[k]=("Q"+suit[k]);
          }
          if(number==12){
              suit[k]=("K"+suit[k]);
          }
          if(number==13){
              suit[k]=("A"+suit[k]);
          }
          if(number>1){
           number--;
          }
          else{
              number=13;
          }
      }
 
    //Code to pick a hand
    int random = 0;
    String[] temp = new String[5];
    for(int i=0;i<5;i++){
        //a random int is generated to pick the card
        random = (int) (Math.random()*(51-i));
        //the value of that vard is stored in a seperate array
        temp[i]=suit[random];
        //the array is shifted to the left 1
        for(int k=random; k<(suit.length-1); k++){
              suit[k]=suit[k+1];  
            }
    }
    //this pritns out the hands selected
    for(int g=0;g<5;g++){
        suit[(suit.length-1-g)]=temp[g];
    }
    //we pprint the hand
    System.out.println("Your hands was a "+ temp[0]+", "+temp[1]+", "+temp[2]+", "+temp[3]+", "+temp[4]);
    Scanner scan = new Scanner(System.in);
    //we scan for a user input to continue or quit
    System.out.print("would you like to play again? y to continute, anything else to end ->> ");
    String input = scan.next();
    //if the user input is anything but "y" we stop the program
    if(!input.equals('y')){
        x=999;
    }
    }
  }
  
  public static void simulateOdds(){
     //aces
     int aces = 0;
     //her is an arrary to store suit values for printing
     String[] suitValue = {"A","K","Q","J","10","9","8","7","6","5","4","3","2"};
     int[] suitDoubles = new int[13];
     int[] handTest = new int[5];
     //this code is nested inside a loop to test all three loops and is almost identical to the find dups code
     for(int suit = 0;suit<13;suit++){
         for(int round = 0;round<1000;round++){
             for(int draw = 0;draw<5;draw++){
                 handTest[draw] = (int) (Math.random()*13);
             }
            int counter = 0;
            for (int j=0;j<5;j++){
                for(int k=0;(k<5);k++){
                    if((handTest[j]==handTest[k])&&(k!=j)){
                        counter++;
                    }
                }
            //this adds the dups counter to the array in the correct location
            suitDoubles[suit]+=counter;    
            }
            
         }
         //this prints the dups counter
          System.out.println(suitValue[suit]+" "+suitDoubles[suit]);
     }
   
  }
}
