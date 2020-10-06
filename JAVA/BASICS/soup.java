import java.util.Scanner;

public class soup{
   public static void main(String[]args){
   
      Scanner sc = new Scanner(System.in);
      String firstNames = "";
      String lastNames = "";
      String temporaryStorage = "";
      String firstName = "";
      String lastName = "";
      String space = " ";
      
      int firstNameEnd = 0;
      int lastNameEnd = 0;
   
      boolean userInputController = true;
      boolean userInputEmpty = false;
   
   
      System.out.println("Please enter a first name, followed by a space, and that space should be followed by a last name.");
      
      while(userInputController){
         String userInput = sc.nextLine();
       
         temporaryStorage = userInput;
         if(temporaryStorage.length() == 0){
            userInputController = false;
            userInputEmpty = true;
         }//end of determining if user wants to terminate input
       
      
       
       
         if (userInputEmpty){
         //lol
         }else{
            userInput.trim();
            firstNameEnd = userInput.indexOf(' ');//determines where the space is. first name is before, last name is after
            lastNameEnd = userInput.length();
            
            firstName = userInput.substring(0, firstNameEnd);
            lastName = userInput.substring(firstNameEnd, lastNameEnd);
            firstName = firstName + ",";
            lastName = lastName + ",";
            
            firstNames = firstNames + firstName;
            lastNames = lastNames + lastName;
         
         }//end of list concatanation 
         firstNameEnd = 0;
         lastNameEnd = 0;
         temporaryStorage = "";
         firstName = "";
         lastName = "";
      //we do this because we want to make sure variables don't carry over incorrectly
      
      }//end of input loop
      
      lastNames.trim();
      firstNames.trim();
      lastNames = lastNames.substring(0, (lastNames.length() -1));
      firstNames = firstNames.substring(0,(firstNames.length()-1));
      
      System.out.println("The first names are:");
      System.out.println(firstNames);
      System.out.println("The last names are:");
      System.out.println(lastNames);
      
      
      
   }//end of main method
}//end of class