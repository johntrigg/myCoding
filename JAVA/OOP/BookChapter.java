// Feel free to add here any import statements that you need

public class BookChapter {
   
   private String title;
   private int numberOfPages;

   public BookChapter(String title, int numberOfPages){
      this.title = title;
      if(numberOfPages<1)
      this.numberOfPages = 1;
      else
      this.numberOfPages = numberOfPages;
      
      int count = 20;
   }// end constructor
  
   

   public int getNumberOfPages(){
      
      return numberOfPages;
   }// end getNumberOfPages method
   
   public String getTitle(){
      return title;
   }// end getTitle method
   
   
}// end class