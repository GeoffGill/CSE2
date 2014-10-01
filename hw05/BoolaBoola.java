//Geoff Gill
//hw05.2
//9/30/14
//This problem prompts the user with a boolean expression and askes them
    //to determine the correct state of the boolean after operations
    //and then tells them if they were correct. It is a usefull tool to help
    //understand boolean operation.

import java.util.Scanner;

public class BoolaBoola{
    public static void main (String[] args) {
        //creates random variables used to randomly generate operators and boolean expressions
        double rand1 = Math.random();
        double rand2 = Math.random();
        double rand3 = Math.random();
        double rand4 = Math.random();
        double rand5 = Math.random();
        double rand6 = Math.random();
        //initiates boolean expressions
        boolean option1;
        boolean option2;
        boolean option3;
        //initiates the user response and what will be the correct answer boolean
        boolean answer;
        boolean response;
        
        //determine first T/F option
        if (rand1 <=.5){
            option1 = true;
        }else{
            option1 = false;   
        }
        //determine second T/F option
        if (rand2 <=.5){
            option2 = true;
        }else{
            option2 = false;   
        }
        //determine third T/F option
        if (rand3 <=.5){
            option3 = true;
        }else{
            option3 = false;   
        }
        //Begins to ask the user questions part by part
            System.out.print("Is "+option1+" ");
        if (rand4<=.5){
            System.out.print("&&");
        }else{
            System.out.print ("||");
        }
        System.out.print(" "+option2+" ");
        if (rand5<=.5){
            System.out.print("&&");
        }else{
            System.out.print ("||");
        }
        System.out.println(" "+option3+ " equal to true r false? (enter either t or f)");
//accepts the users answer and if not equal to t or f tells the user they are wrong
        Scanner myScanner = new Scanner (System.in);
        String responseInput = myScanner.next();
        if(responseInput.equals("t")){
            response = true;
                //determines which set of operators to use based on random variables rand4 and rand5
            if ((rand4<=.5)&&(rand5<=.5)){
                answer = option1&&option2&&option3;
            }else if((rand4<=.5)&&(rand5>.5)){
                answer = option1&&option2||option3;
            }else if((rand4>.5)&&(rand5<=.5)){
                answer = option1||option2&&option3;
            }else {
                answer = option1||option2||option3;
            }
            //tests to see if the response given matches the correct answer
            if(((response==true)&&(answer==true))||((response==false)&&(answer==false))){
                System.out.println("Correct");
            }else{
                System.out.println("Wrong, Please try again!");
            }
        }else if(responseInput.equals("f")){
                response = false;
            //determines which set of operators to use based on random variables rand4 and rand5
            //then calculates the answer
            if ((rand4<=.5)&&(rand5<=.5)){
                answer = option1&&option2&&option3;
            }else if((rand4<=.5)&&(rand5>.5)){
                answer = option1&&option2||option3;
            }else if((rand4>.5)&&(rand5<=.5)){
                answer = option1||option2&&option3;
            }else {
                answer = option1||option2||option3;
            }
            //tests to see if the response given matches the correct answer
            if(((response==true)&&(answer==true))||((response==false)&&(answer==false))){
                System.out.println("Correct");
            }else{
                System.out.println("Wrong, Please try again!");
            }
            }else{
                System.out.println("Wrong, Please try again");
            }

    }
}