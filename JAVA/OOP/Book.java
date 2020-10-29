import java.util.*;

public class Book{

   private String title;
   private String author;
   private int maxNumberOfChapters;//how to use?
   private int currentNumberOfChapters;
   private ArrayList<BookChapter> myBookArrayList;

   public Book(String title, String author, int numberOfChapters){   
      this.author = author;
      this.title = title;
      if(numberOfChapters<1)
         currentNumberOfChapters = 1;
       else
         currentNumberOfChapters = numberOfChapters;
      
       
      myBookArrayList = new ArrayList<BookChapter>();
   
   }// end 3-args constructor
  
   public Book(){
      this("Untitled book", "anonymous", 1);
   }// end no-args constructor
   
      
   public ArrayList<BookChapter> getArrayList(){
   return myBookArrayList;
   }

   public void addChapter(BookChapter b){
      myBookArrayList.add(b); //does it automatically look for null?
   }
   public int getTotalPages(){
      int count = 0;
      for(BookChapter myChapter : myBookArrayList){
         count = count + myChapter.getNumberOfPages();
      }
      return count;
   }

   public String tableOfContents(){
      String description = "";
      for(BookChapter myChapter : myBookArrayList){//this works?
         description = description + "\n" + myChapter.getTitle() + " ... " + myChapter.getNumberOfPages() +" Pages ";
      }
      return description;
   }
   
}// end class

/*
   public void addChapter(BookChapter b){
   int destination = currentNumberOfChapters + 1;
   if(b==null){//checking if null to prevent runtime error
   }else if(currentNumberOfChapters == maxNumberOfChapters){
   
   }else{
   chapters[destination] = b;
   currentNumberOfChapters++;
   }
      
   }// end addChapter method
   

   public int getTotalPages(){
      int count = 0;
      
      for(int i = 0; i<chapters.length;i++){
      if(chapters[i]==null){ //checking if null to prevent runtime error
      }else{
      count = count + chapters[i].getNumberOfPages();
      }
      }//end of for determining count
      return count;
   }// end getTotalPages method
    
     public void displayTableOfContents(){
      String description = title + " by " + author;
      for(int i = 0; i<currentNumberOfChapters+1;i++){
      if(chapters[i]==null){ //checking if null to prevent runtime error
            
      }else{
      description = description + "\n" + chapters[i].getNumberOfPages() + "..." + chapters[i].getTitle();
      }
      
      }//end of for loop
      System.out.println(description);
   }// end displayTableOfContents method
   */