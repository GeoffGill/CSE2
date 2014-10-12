//Geoff Gill
//hw06.1
//10/14/14
//This program runs motecarlo situations for a rulette game where you place a 1$ bet on the same ranom 
//rullete square 100x in a row and counts the number of times you loose all your money, the total earnings
//as well as the number of times you walked away with a profit (normal roulette rules apply)


public class Roulette{
    public static void main (String[] args) {
        int round=1;        //variable to define x of 1000 rounds played
        int bet=1;          //variable to define the x of 100 bets placed in a round
        int noWins = 0;     //variable to track number of rounds you loose everyting
        int tProfits = 0;   //variable to track total profits
        int profitRound = 0;    //variable that tracks number of profitable rounds
        while (round<=1000){    //round increments up from 1 to 1000 to simulate 1000 trials
            int choice = (int) (Math.random()*38);      //decides roulet choice
            int earnings = 0;                           //sets original earnings to zero
            bet = 1;                                    //sets bet to 1 or first bet
            while (bet <=100){                          //rounds increment untill you get to 100
                int outcome = (int) (Math.random()*38); //decides the roulette roll
                if (outcome==choice){           //tests if you won the roll
                    earnings+=36;               //if you did you add 36$ to earnings
                }
                bet++;                          
            }
            tProfits+=earnings;                 //adds x round earning to total profits
            if (earnings>100){                  //if you won over 100$ it adds 1 to profitable rounds
                profitRound++;
            }
            else if(earnings==0){               //if you didnt win anything you add 1 to totall lose
                noWins++;
            }
            round++;
        }
        //these three print out the results of all 1000 rounds of 100
        System.out.println("You lost everything "+noWins+ " times" );                   
        System.out.println("You won "+tProfits+" over the course of 1000 rounds");
        System.out.println("You made a profit on "+profitRound+ " rounds");
    }
}