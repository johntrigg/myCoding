/*
My name is John Trigg. This is my submission for my final exam
for my Fundamentals of Programming COP2512 course. This takes a string from the user. 
Then, that string becomes an array, each word an element.
Then, each element word of that array is trimmed, terminating s's removed, and turned into lowercase.
Then, we turn each element into an int.
Then, we show the final resulting array.
*/
import java.util.Scanner;

public class FinalExam {


   /*
         The main method will keep reading a line of text from the user until they enter
         an empty line. For each line, you will use the translate method that you will write below
         in order to convert the text to an integer value. 
         
         The text that the user will provide to your program will represent the spelling of a number between 0
         and 9999, in words. You will display the corresponding integer value.
         
         Examples; 
         What the user types:                      The value your program must display:
         ten                                       10
         nineteen                                  19
         twenty three                              23
         ninety nine                               99
         one hundred and ninety nine               199
         two hundred and ninety nine               299
         two hundreds and ninety nine              299
         twelve hundreds and ninety nine           1299
         ninety hundreds seventy five              9075
         twelve thousands two hundreds and nine    12209
         three thousand nine hundred and three     3903
         
         For this exam, you can safely assume that the user will always follow the syntax
         illustrated by these examples and the tests inside FinalExamHelper.testTranslate()
   */
   public static void main(String[] args){
      boolean exitCond1Boolean = true; // controls user-input while loop. changes to false when user inputs an empty line.
      String exitCond1String = "";//if the user enters this, the while loop and the program end
      String[] userInputArray = {"blah"};//eventually turn input into words in this array
      while(exitCond1Boolean){          
      
         Scanner sc = new Scanner(System.in);
         System.out.println("Hello. To exit, simply hit enter.");
         String userInput = sc.nextLine();
                                   
         if(userInput.equals(exitCond1String)){
            exitCond1Boolean = false;
            break;
         }//detects if user input the exit condition
      //take user input, trim it, to lowercase, turn into array, take out hundreds, thousands, and, print out number

      
         userInputArray = FinalExam.cleanUp(userInput);//call cleanup to remove useless words, make elements lowercase, trim, etc
          
         userInputArray = FinalExam.translateWordToValue(userInputArray);
         
         userInputArray = FinalExam.translate(userInputArray);
      
         for(int i = 0; i < userInputArray.length; i++){//this is supposed to print the end result. our numbers.. 
            System.out.println(userInputArray[i]);
         
         
         }//end of for
      
      
      }//end of user-input while loop
   
      
   }// end main
   
   
   /*
      The translate method takes a String representing a line of text
      provided by the user and applies the following processing to it;
      1. It uses the FinalExamHelper.tokenize method to break down the one
         String into an array of Strings named tokens that contains the words
         from the initial String as elements. 
      2. It uses the cleanUp method, that we will write later, to take
         tokens as parameter and return a new array of Strings that we will
         refer to as cleanTokens.
         See the details in the instruction for the cleanUp method below.
      3. It creates an array of integer values, named values, that has the same
         size as cleanTokens.
      4. It iterates over all elements in cleanTokens and stores in value[i]
         the result of calling the method translateWordToValue on cleanTokens[i]
      5. It then return the result of calling the method TranslateAllValue on the
         array values

         Uncomment the call to FinalExamHelper.testTranslate() in the main to run a
         series of basic tests on this method.
   */
   public static String[] translate(String[] input){
      
      return input; // Replace with valid code, if necessary
   }
      
   /*
      Method cleanUp takes an array of Strings as parameter. It returns a new array of Strings
      of the same length in which, every element of the original array has been trimmed and
      converted to lower cases. In addition, we will also make sure that if any of the String
      ends with a letter 's' (or 'S' since we convert to lower case beforehand anyway), then
      we remove that letter. This will allow us to transform things like "   ThOUSAnDS   "
      into an easier String to work with; "thousand".
      
      Uncomment the call to the method FinalExamHelper.testCleanUp();
      in the main if you want to see the result or testing this method on a basic series
      of tests. 
   */
   public static String[] cleanUp(String toks){ 
   /*
   this takes in the user's string. then, makes an array based on their input. then, cleans up the elements of the array by trimming and lower casing them.
   and then returns the cleaned array to where it was called
   */
      String buzzword1 = "thousand";
      String buzzword2 = "hundred";
   
   
      String[] inputArray = toks.split("\\s+");//creates an array based on our user input. this is where i "tokenize" so to speak
   
      for(int i = 0; i < inputArray.length; i++){//we use this for loop to modify the elements of the array to our liking. also 
      
         inputArray[i] = inputArray[i].trim();//takes out the spaces on the elements
         inputArray[i] = inputArray[i].toLowerCase();//and converts our elements to lowercase
         int length = inputArray[i].length();
         String sus = "s";
         String last = inputArray[i].substring(inputArray[i].length()-1,inputArray[i].length());//take last letter. to see if its s
         if (last.equals(sus)){
            inputArray[i] = inputArray[i].substring(0,inputArray[i].length()-1);//we remove terminating 's' here
         }

               
         
      }//end of for
   
      return inputArray; // replace with valid code, if necessary
   }//end cleanUp method
   
   
   
   /*
      Method translateWordToValue takes a String representing one of the following words and returns its value. 
      "zero" to "nineteen" --> values 0 to 19
      "twenty", "thirty" ... "hundred" --> values 20, 30, ... 100
      "thousand" --> value 1000
      If the String passed as parameter does not match any of these, return 0
      
      You will be graded on your ability to use loops, when possible, to process some of the tests.
      
      Uncomment the call to the method FinalExamHelper.testTranslateWordToValue();
      in the main if you want to see the result or testing this method on a basic series
      of tests.
   */
   public static String[] translateWordToValue(String[] words){
    
      for(int i = 0; i < words.length; i++){//this takes our array, and turns the elements into corresponding values. 
      
             
      }//end of translation for
      
      return words; // replace with valid code, if necessary
   }//end translateWordToValue method
   
   
   /*
      Method translateAllValues takes an array of int values like the ones returned
      by the method translateWordToValue. It convert such a sequence of values into 
      the final value represented by the original string entered by the user.
      
      To do so, you can start by adding all the values together. 
      When the user enters things like "twenty three" the parameter will be an array
      {20, 3} so this method is enough to handle the trivial cases.
      
      However, when the user enters things like "two hundred twenty three" 
      or "two thousand twenty three" then, when you encounter the values 100 or 1000,
      you need to do something a bit more clever in order to compute the right value. 
      This last part of the exam is the hardest so focus on getting as much as you can
      working before to dig into this.
      
      Uncomment the call to the method FinalExamHelper.testTranslateAllValues();
      in the main if you want to see the result or testing this method on a basic series
      of tests.
   */
   public static String[] translateAllValues(String[] values){
      
      for(int i = 0; i < values.length; i++){//this takes our array, and translates the values         
         
      }//end of translation for
      
      
      // TODO - write your code here
      return values; // replace with valid code, if necessary
   }//end translateAllValues method

}// end class
