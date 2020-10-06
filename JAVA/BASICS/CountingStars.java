import java.util.Scanner;
public class CountingStars{
   public static void main(String[] args){
   
      int starsUser = 1;
      int numberOfLines = 0;
      
      do{
         Scanner userInput = new Scanner(System.in);     
         System.out.print("Hello! Please enter the number of stars you want the top line to display:");
         starsUser = userInput.nextInt();//how many stars the puts in
         System.out.print("Hello! Please enter the number of lines of you want to display:");
         numberOfLines = userInput.nextInt(); //number of lines our program will display
         if (numberOfLines > starsUser){
            System.out.println("Error: Number of Lines greater than number of stars.");
         }else {
            break;
         }//end of error checking if
      
      } while(numberOfLines > starsUser); //end of user input do-while
      
      for (int lines = 0 ; lines < numberOfLines; lines++){
         for(int stars=0 ; stars < starsUser ; stars++){
            System.out.print('*');
         }//end of for that prints stars
         System.out.println();
         starsUser--;
      }//end of for that controls lines of display
   
   }//end of main method
}//end of class