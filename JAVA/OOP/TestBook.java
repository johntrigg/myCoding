// Feel free to add here any import statements that you need for your tests


/**
   Use the main() method in this class to test your other classes. 
   We provide you with minimalist tests to get you started. 
   Feel free to modify them or add as many as you need.
   This part of your code will not be graded but will help
   you ensure that your other classes fullfill the requirements.
**/
public class TestBook {
   public static void main(String[] args){
      // create a Book
      Book b = new Book("Short Book", "Hinn Kognito", 3);

      // create the chapters for the above
      BookChapter c1 = new BookChapter("Beginnings", 20);
      BookChapter c2 = new BookChapter("The Plot Thickens",5);
      BookChapter c3 = new BookChapter("Never Saw It Coming",3);
        
      // add the chapters
      b.addChapter(c1);
      b.addChapter(c2);
      b.addChapter(c3);
      
       Book AAAA = new Book("vine compilation", "generic name", 5);
       BookChapter blah1 = new BookChapter("a", 100);
       BookChapter blah2 = new BookChapter("aa", 200);
       BookChapter blah3 = new BookChapter("aaa", 300);
       
       AAAA.addChapter(blah1);
       AAAA.addChapter(blah2);
       AAAA.addChapter(blah3);
      
      // make sure we are able to display the TOC
      System.out.println("Checking the table of contents function");
      System.out.println(b.tableOfContents());
      System.out.println("Checking getTotalPages function");
      System.out.println(b.getTotalPages());//checking pagecount function
      System.out.println("Doing the same for the custom test");
      System.out.println(AAAA.tableOfContents());
      
      System.out.println(AAAA.get);
      
      System.out.println(AAAA.getTotalPages());
   }// end main
}// end class