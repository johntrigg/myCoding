/* 
I am John Trigg. This is my submission for IE5. This program is designed to help
USF's squirrels, now living lavlishly after the quarantine, keep track of their 3
types of nuts: walnuts, almonds, and peanuts. 

*/
import java.util.Scanner;

public class nutCounterStorage{
   public static void main(String[] args){
   
      Scanner userInput = new Scanner(System.in);
      String exitCond1 = "bye";
      String exitCond2 = "exit";
      boolean exitCond1Boolean = true;
      boolean exitCond2Boolean = true;
      boolean acceptableNutType = false;
      String nut1 = "almond";
      String nut2 = "peanut";
      String nut3 = "walnut";
      int almonds = 0;
      int peanuts = 0;
      int walnuts = 0;
      //these variables are used to control the user input while loop. if the program detects a string with bye or exit as the sole input, user input will cease.
      //the booleans are there to put this into practice.
      
      System.out.println("Hello. Please enter the type of nut(peanut, walnut, or almond) (there should be no capital letters anywhere),");
      System.out.println("Immediately followed by an equals sign, then immediately followed by the number.");
      System.out.println("To terminate, please enter 'bye' or 'exit'.");
   
      while(exitCond1Boolean){
      
         String userData = userInput.nextLine();//we take the user input as a string, and store it into userdata
         boolean syntaxError1 = false;
         userData = userData.trim();
         
      
         if (userData == exitCond1){
            exitCond1Boolean = false;
            break;
         } else if (userData == exitCond2){
            exitCond1Boolean = false;
            break;  
         }//end of determing if user wants to terminate inputting
         
         int equalsHere = 0;//if we don't initalize here, the program won't accept this later on.
         if(userData.indexOf('=')<=0){
            System.out.println("Syntax error.");
            break; 
         }//we make sure the user is inputting an equals sign in their input. if not, we print the else     
           
         int endNumberHere = userData.length();
         int equalsSignHere = userData.indexOf('='); 
         String part1 = userData.substring(0, equalsSignHere);
         String part2 = userData.substring(equalsSignHere+1);
         int nutCountInt = Integer.parseInt(part2);
         part1 = part1.trim();
         part2 = part2.trim();
         
         if(part1.equals(nut1)){
            System.out.println("Almond");
            almonds = almonds + nutCountInt;
         }else if(part1.equals(nut2)){
            System.out.println("Peanut");
            peanuts = peanuts + nutCountInt;
         }else if (part1.equals(nut3)){   
            System.out.println("Walnut");
            walnuts = walnuts + nutCountInt;
         }else{
            System.out.println("We could not detect what nut type it was.");
            System.out.println("Nut Type"+part1);
            System.out.println("Nut Count"+part2);
         }
         //these variables take the user input, and copy it into several variables. the integer variables here control the substring of userinput
         //that tells us the type of nut, and the number of them
         //the strings are the actual copies of the userData string, with regards to number of nuts and the type of nuts
         //in addition, we trim our strings as to avoid any shenanigans
         
         System.out.println("Nut Type:"+part1);
         System.out.println("Nut Count"+part2);
      

         
         exitCond1Boolean = true;
         exitCond2Boolean = true;
         acceptableNutType = false;
         nutCountInt = 0;   
         //here we reset the variables, so when our loop runs again, it does not accidentally copy variables it might not be able to overwrite.
         
         System.out.println("Our current stocks are:");
         System.out.println("peanuts:"+peanuts);
         System.out.println("walnuts:"+walnuts);
         System.out.println("almonds:"+almonds);
         //output printlines to tell user what they're storing
         
      }//end of user input while loop 
       
   }//end of main method
   
}//end of class