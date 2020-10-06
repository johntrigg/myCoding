import java.util.Arrays;

public class FinalExamHelper{

   /*
      You may modify this method to add tests if this helps
      The TAs will also use similar tests to check if your code is working.
   */
   public static void testTranslate(){
      // all the strings that we are going to pass as parameter to our translate method
      String[] inputs = {
         "ten",
         "nineteen",
         "twenty three", 
         "ninety nine",
         "one hundred and ninety nine",
         "two hundred and ninety nine",
         "two hundreds and ninety nine",
         "twelve hundreds and ninety nine",
         "ninety hundreds seventy five",
         "twelve thousands two hundreds and nine",
         "three thousand nine hundred and three"
         };
      
      // for each of the above, the value that we expect as result from our translate method
      int[] expectedResults = {10, 19, 23, 99, 199, 299, 299, 1299, 9075, 12209, 3903};
   
      System.out.println("\n\nTesting method translate");
   
      // we make sure that the arrays inputs and expectedResults have the same length
      // there should be an expected value for each input string
      int numberOfTests = inputs.length;
      if(numberOfTests != expectedResults.length)
         System.out.println("\tERROR - You have a different number of inputs and results in your tests");
      else
         for(int i=0 ; i < numberOfTests ; i++)
            displayTestResult(i, expectedResults[i], FinalExam.translate(inputs[i]), inputs[i]);
   }//end testTranslate method
   


   
   /*
      You may modify this method to add tests if this helps
      The TAs will also use similar tests to check if your code is working.
   */
   public static void testTranslateWordToValue(){
      int n=0;
      System.out.println("\n\nTesting method translateWordToValue");
         
      String[] numbers = { "zero", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine",
                           "ten", "eleven", "twelve", "thirteen", "fourteen", "fifteen", "sixteen", "seventeen", "eighteen", "nineteen"};
         
      for(int i=0 ; i < numbers.length ; i++,n++)
         displayTestResult(i, i, FinalExam.translateWordToValue(numbers[i]), numbers[i]);
         
      String[] numbers2 = {  "twenty", "thirty", "fourty", "fifty", "sixty", "seventy", "eighty", "ninety", "hundred"};
      
      for(int i=0 ; i < numbers2.length ; i++,n++)
         displayTestResult(i+19, (i+2)*10, FinalExam.translateWordToValue(numbers2[i]), numbers2[i]);
         
      displayTestResult(n, 1000, FinalExam.translateWordToValue("thousand"), "thousand");
         
   }//end testTranslateWordToValue method
   
   
   /*
      You may modify this method to add tests if this helps
      The TAs will also use similar tests to check if your code is working.
   */
   public static void testCleanUp(){
      String[] inputs = {
         "   trim start", "trim end   ", "   trim both   ",
         "lower", "UPPER", 
         "remove plurals", "remove PLURALS", "remove pluralS"
      };
      
      String[] expected = {
         "trim start", "trim end", "trim both",
         "lower", "upper", 
         "remove plural", "remove plural", "remove plural"
      };
      
      System.out.println("\n\nTesting method cleanUp");
      
      String[] observed = FinalExam.cleanUp(inputs);
      
      for(int i=0 ; i < inputs.length ; i++)
         displayTestResult(i, expected[i], observed[i], inputs[i]);
   }//end testCleanUp method
   
   
   public static void testTranslateAllValues(){
      System.out.println("\n\nTesting method translateAllValues");
         
      int[][] inputs = {
         {10}, {19}, {20, 3}, {90, 9}, {1, 100, 90, 9}, {2, 100, 90, 9},
         {12, 100, 90, 9},
         {90, 100, 70, 5},
         {12, 1000, 2, 100, 9},
         {3, 1000, 9, 100, 3}
      };
      int[] expected = {10, 19, 23, 99, 199, 299, 1299, 9075, 12209, 3903};
      for(int i=0 ; i < inputs.length ; i++)
         displayTestResult(i, expected[i], FinalExam.translateAllValues(inputs[i]), Arrays.toString(inputs[i]));
   }//end testTranslateAllValues
   
   
   // DO NOT MODIFY this method.
   public static void displayTestResult(int n, int expected, int observed, String input){
      System.out.printf("\tTest #%2d \t %4s \t\tExpected %5d \t\t Observed %5d \t\tfor input string: \"%s\"\n",
         n, ((expected == observed)?"OK":"FAIL"), expected, observed, input);
   }
   
   
   // DO NOT MODIFY this method.
   public static void displayTestResult(int n, String expected, String observed, String input){
      System.out.printf("\tTest #%2d \t %4s \t\tExpected %-15s \t\t Observed %-15s \t\tfor input string: \"%s\"\n",
         n, (expected.equals(observed)?"OK":"FAIL"), "\"" + expected + "\"", "\"" + observed + "\"", input);
   }   
   
   /*
      DO NOT MODIFY this method.
      This method was given to you in IE6. It turns a String of text like "hello there how are you"
      into an array of String objects, each representing one of the words in the above sentence.
      Example:
      String[] words = tokenize("hello there how are you");
      would return a reference to an array such as; 
         words[0] --> "hello"
         words[1] --> "there"
         words[2] --> "how"
         words[3] --> "are"
         words[4] --> "you"
   */
   public static String[] tokenize(String str) {
      String[] tokens = str.split("\\s+");
      return tokens;
   }//end tokenize method
}// end class
