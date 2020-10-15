public class MyString2 {

     final private char[] container;
      
     private MyString2(char[] array) {
         this.container = array;
     }
     
     public MyString2(String s) {
         if (s == null) {
             throw new IllegalArgumentException();
         }
         char[] arr = new char[s.length()];
         for (int i = 0; i < s.length(); i++) {
             arr[i] = s.charAt(i);
         }
         this.container = arr;
     }
     
         
         
     // Return 0 if the two strings are equal, otherwise return any other value 
     public int compare(String s) {
         if (s.length() != container.length) {
             return -1; // need to check return values 
         }
         
         for (int i = 0; i < container.length; i++) {
             if (s.charAt(i) != container[i]) {
                 return -1;
             }
         }
         
         return 0;
     }
     
     // Return a new string starting at begin to the end of the string
     public MyString2 substring(int begin) {
         if (begin > container.length) {
            // You have two options either to fail or return an empty string
            // lets just say that if its empty then we should return an empty string
            return new MyString2("");
        }
        
        // since the first if-statement didnt return we know that the begin index is value
        char[] substringContainer = new char[container.length - begin  + 1];
        int subStringContainerIndex = 0;
        for (int i = begin; i < container.length; i++) {
               substringContainer[subStringContainerIndex] = container(i);
            subStringContainerIndex++;
        }
        
        return new MyString2(substringContainer);
     }
     
     // Create a new coppy of this string that is converted to upper case
     public MyString2 toUpperCase() {
         char[] containerCopy = new char[container.length];
         for (int i = 0; i < container.length; i++) {
             containerCopy[i] = Character.toUpperCase(container[i]);
         }
         
         return new MyString2(containerCopy);
     }
     
     
     // Return a char array representation of this string
     public char[] toChars() {
          char[] containerCopy = new char[container.length];
         for (int i = 0; i < container.length; i++) {
             containerCopy[i] = container[i];
         }        
         return containerCopy;
     }   
     public static MyString2 valueOf(boolean val) {
         if (val) {
             return new MyString2("true");
         } else {
             return new MyString2("false");
         }
     }
}
