public class MockExamHelper{

   // You do not have to modify this method but you are free to add tests if this helps you.
   public static void testSayHello(){
      String[] inputs = {"   john", "john   ", "   john   "};
      String[] expected = {"Hello john!!!", "Hello john!!!", "Hello john!!!"};
      
      for(int i=0 ; i < inputs.length ; i++)
         displayTestResult(i, expected[i], MockExamHelper.testSayHello(inputs[i]), inputs[i]);
      
   }//end method testSayHello
   

   /*
      DO NOT MODIFY this method.
      It is used by the testing methods provided to you in this file, see above.
   */
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
      return str.split("\\s+");
   }//end tokenize method
}// end class
