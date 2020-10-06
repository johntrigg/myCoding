import java.util.Scanner;
public class DayOfTheWeek{
   public static void main(String[] args){
   
   int letMeOut = 0;
   while(letMeOut == 0){
   Scanner input = new Scanner(System.in);   
   boolean dayDone = false;
   int day = 10;
   while (!dayDone){
   System.out.println("Please enter day of the week as a number according to the following:");
   System.out.println("1 for Monday or Wednesday, 2 for Tuesday or Thursday, 3 for Friday, 4 for Saturday or Sunday");
   System.out.println("Alternatively, enter 0 to close program.");
   day = input.nextInt();//sentiel controlled loop, user inputs their int and the loop closes
      
      if(day == 0){
      letMeOut = 1;
      dayDone = true;
      }else if((day > 4)||(day < 1)){
      System.out.println("Error. Please enter 0,1, 2, 3, or 4 based on the previous line.");
      day = 30;
      }else{
      dayDone = true;
      }//end of if else to tell user they input incorrectly
      
      
   }//end of sentiel controlled while loop
    
   if(letMeOut == 1){
       break;
       }
   int searchHere = 0;
   
   if(day == 1){
   searchHere = 23;
   }else if(day == 2){
   searchHere = 42;
   }else{
   searchHere = 5;
   }//if else series to determine where user should search based on input
   
   if(searchHere == 23){
   System.out.println("You should search in Cooper Hall.");
   }else if(searchHere == 42){
   System.out.println("You should search in the Engineering Building.");
   }else{
   System.out.println("You should search in the Marshall Student Center.");
   }//if else series to tell user where to look
   
   boolean dayEven = false;
   boolean dayOdd = false;
   boolean locationEven = false;
   boolean locationOdd = false;
   boolean locationBiggerThanTen = false;
   boolean locationSmallerOrEqlToTen = false;
   int foodQuality = 0;
 
   int dayEvenOrOdd2 = day%2;//if 0, day is even, if 1, day is odd
   int locationEvenOrOdd2 = searchHere%2;//if 0, location is even, if 1, location is odd
   
   if (dayEvenOrOdd2 == 0){ 
   dayEven = true;
   }else{
   dayOdd = true;
   }//determine if day is even or odd
   
   if(locationEvenOrOdd2 == 0){
   locationEven = true;
   }else{
   locationOdd = true;
   }//determine if location is even or odd
   
   if(searchHere > 10){
   locationBiggerThanTen = true;
   }else{
   locationSmallerOrEqlToTen = true;
   }//determine if the location # is bigger than 10, or if it is smaller than or equal to 10
   //series of if-else statements to properly set booleans that determine food quality
   
   System.out.println("Food quality is expected to be as follows:");
   
   if ((dayEven)&&(locationEven)){
   foodQuality = 1;
   System.out.println("The food quality is exceptional.");
   } else if ((dayEven)&&(locationOdd)){
   foodQuality = 2;
   System.out.println("The food quality is satisfactory.");
   }else if ((dayOdd)&&(locationBiggerThanTen)){
   foodQuality = 3;
   System.out.println("The food quality is average.");
   }else if((dayOdd)&&(locationSmallerOrEqlToTen)){
   foodQuality = 3;
   System.out.println("The food quality is disappointing");
   }//end of if-else statement that determines food quality

   
   

   }//end of super-while-loop
    }//end of main
}//end of class