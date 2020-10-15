public class StringToCharArray { 
    public static void main(String args[])   { 
        String string = "ProgrammingInJavaIsFun"; 
  
        // Creating array of string length 
        char[] characterArray = new char[string.length()]; 
  
        // Copy character by character into array 
        for (int i = 0; i < string.length(); i++) { 
            characterArray[i] = string.charAt(i); 
        } 
  
        // Printing content of array 
        for (int i = 0; i < characterArray[i].length; i++) { 
            System.out.println(characterArray[i]); 
        } 
    } 
} 
