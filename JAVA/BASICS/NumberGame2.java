/*My name is John Trigg. This is my program for Intermediary Exercise 3. 
This is a number game. A player and a computer each pick a number between 1 and 3 inclusive on their turn.
At the end of their turn, the number they picked, should it be a valid value, is deducted from the coin pile.
The goal of the game is to take the last coin, so that the coin counter is zero or negative at the end of your turn.
*/
import java.util.Scanner;
public class NumberGame2{
   public static void main(String[] args){
   
   Scanner input = new Scanner(System.in);//initalize scanner

   int take = 0;
   int whoWon = 0;//initalize var whoWon
   int youDecide = 0;//initalize variable to be changd by scanner"who won? you decide!" epic rap battles of history much?
   int whoIsNext = 2;//if this is 2, then it is the humans turn. if it is 1, it is the computer's turn
   
   int coins = 21;//initalize var coins
      while(whoWon == 0){
         boolean validValue = false;
         boolean small = false;
         boolean big = false;
         System.out.println("There are this many coins right now:" + coins);
            if(whoIsNext == 1){//computer's turn
            take = (int)(Math.random() * 3 + 1);//get a random value, this is what the computer's turn is
            System.out.println("Computer takes " + take + " coins");
            coins = coins - take;
            if (coins < 1){
            whoWon = 1;
            }//computer has taken last coin and won
         whoIsNext = 2;//computer's turn is done, it will be the human's turn next
         }else if(whoIsNext == 2){//human's turn
         while(validValue == false){
         System.out.println("It is your turn, fellow human. Enter 1, 2, or 3.");
         youDecide = input.nextInt();
         if(youDecide<4){
         small = true;
         }else{
         small = false;
         System.out.println("Your number is too big. Please enter a value betwene 1 and 3, inclusive.");
         }//check if number is small enough
         
         if(youDecide>0){
         big = true;
         }else{
         big = false;
         System.out.println("Your number is not big enough. Please enter a value between 1 and 3, inclusive.");
         }//check is number is big enough
         if((small)&&(big)){
         validValue = true;
         }else{
         validValue = false;
         small = false;
         big = false;
         }//end of if-else to properly assign loop controlling booleans
         
         }//end of valid input check loop
         coins = coins - youDecide;
         if (coins < 1){
         whoWon = 2;//human wins if the above is true
         }
         whoIsNext = 1;//update whose turn it is
          
         }//end of human turn
  
 
  
      }//end of game super loop
   if(whoWon == 1){
   System.out.println("The computer won, bow to your AI overlord!");
   }else if(whoWon == 2){
   System.out.println("The human player won, this time.");
   }else{
   System.out.println("Nobody won. Something is wrong.");
   }//end of who won return statement
  }//end of method
}//end of public class