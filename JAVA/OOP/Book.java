// Feel free to add here any import statements that you need


/** TOTAL = 10 points
   This class models information about a book.
   The code below compiles but is missing critical parts that you need to write. 
   Look for the TASK tags to tell you what you need to write.
   You may work on these tasks in a different order but they are numbered
   so as to provide you with a logical order to follow.
**/
public class Book{

   /* TASK #1 - 1 point (0.2 point per attribute)
      Declare the following attributes as private:
         title                   of data type   String
         author                  of data type   String         
         maxNumberOfChapters     of data type   int
         currentNumberOfChapters of data type   int
         chapters                of data type   array of BookChapter
         DONE
   */
   private String title;
   private String author;
   private int maxNumberOfChapters;
   private int currentNumberOfChapters;
   private BookChapter[] chapters = new BookChapter[20];

   
   /* TASK #2 - 2 points
      Write the code for the following constructor.
      Do not alter the name of the parameters.
      Initialize appropriately all attributes (0.2 point per attribute).
      The currentNumberOfChapters is always 0 since
      we have not yet added BookChapters.
      If the numberOfChapters passed as parameter is negative or zero,
      set it to 1 instead (1 point). 
      DONE
   */
   public Book(String title, String author, int numberOfChapters){   
   this.author = author;
   this.title = title;
   if(numberOfChapters<1){
   currentNumberOfChapters = 1;
   } else{
   currentNumberOfChapters = numberOfChapters;
   }
 
   }// end 3-args constructor
  
  
   /* TASK #3 - 1 point
      Write the code for the following no-args constructor.
      The default value must be as follows;
         string "Untitled Book" for the title
         string "anonymous" for the author
         integer 1 for the number of chapters
      To get full credit, make sure to not write code that would be
      redundant with respect to the constructor from task #2
      DONE
   */
   public Book(){
   this("Untitled book", "anonymous", 1);
   }// end no-args constructor
   
   
   
   /* TASK #4 - 2 points
      Write a method that allows you to add an already created BookChapter
      object to this book (1 point).
      Simply ignore further requests to add more BookChapters if we 
      already reached the numberOfChapters (0.5 point).
      Similarly, ignore any request if the parameter is null (0.5 point).
      DONE
   */
   public void addChapter(BookChapter b){
   int destination = currentNumberOfChapters + 1;
   if(b==null){//checking if null to prevent runtime error
   }else if(currentNumberOfChapters == maxNumberOfChapters){
   
   }else{
   chapters[destination] = b;
   currentNumberOfChapters++;
   }
      
   }// end addChapter method
   
   

   /* TASK #5 - 1 point
      Write a method that returns the total number of pages
      in this book by adding together the number of pages
      in each of the chapters.
      DONE
   */
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
   
   
   
   /* TASK #6 - 3 points
      Write a method that displays the book's table of content.
      To do this, you will display the title (0.5 point), 
      the author (0.5 point), the total number of pages in the book
      (0.5 point), use the getNumberOfPages method to do so in order
      to receive full credit, and then the list of all chapters
      in order with their name (0.5 point) preceded by the page number
      at which they start (1 point).
      You will have to follow to the letter the format used in the example below.
      
      Example; 
         Let us say that our book's title is "Short Book", its
         author is Hinn Kognito, and it features 3 chapters; 
             "Beginnings", 20 pages long
             "The Plot Thickens", 5 pages long
             "Never Saw It Coming" 3 pages long

         Then, the table of content will be displayed as follows;
         
            Short Book by Hinn Kognito (28 pages)
            1 ... Beginnings 
            21 ... The Plot Thickens
            26 ... Never Saw It Coming
            DONE
   */
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
   
   
}// end class