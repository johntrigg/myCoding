// Feel free to add here any import statements that you need
import java.util.*;

/** TOTAL = 7 points
   This class models information about a list of sick leave requests
   and provides a few useful methods to manage them.
   The code below compiles but is missing critical parts that you need to write. 
   Look for the TASK tags to tell you what you need to write.
   You may work on these tasks in a different order but they are numbered
   so as to provide you with a logical order to follow.
**/
public class SickLeaveRequestsList {

   /* TASK #1 - 1 point
      Declare the following attributes as private:
         requests    of data type   ArrayList of SickLeaveRequest
         DONE
   */

   private ArrayList<SickLeaveRequest> requests;

   
   /* TASK #2 - 1 point
      Write the code for the following constructor so that it
      initializes appropriately all attributes.
      DONE
   */
   
   public SickLeaveRequestsList(){     
      requests = new ArrayList<SickLeaveRequest>();
      
   }// end no-args constructor
   
   /* TASK #3 - 1 point
      Write a method that allows you to add an already created
      SickLeaveRequest object to our ArrayList attribute (.5 point).
      Simply ignore requests to add null references (.5 point).
      DONE
   */
   public void addRequest(SickLeaveRequest s){
   
      if(s!=null){
         requests.add(s);
      }
      
   }// end addChapter method chapters? in MY sick leave? it's more likely than you think
   
   

   /* TASK #4 - 2 points
      Write a method that returns the total number of days
      that an employee, specified as parameter by its name,
      has requested in sick leave.
      To get full credit, make sure you use a for-each loop.
      DONE
   */
   public int getTotalDaysForEmployee(String employeeName){
      int days = 0;
      
      for(SickLeaveRequest requested : requests){
      
         if(requested.identifyEmployee(employeeName)){
            days += requested.getNumberOfDays();     
         }//checking for employee, if it's true we add their days to the variable of the same name
      
      }//end of for

      return days;
   
   }// end getTotalTotalDays method

   /* TASK #5 - 2 points
      Write a method that returns a string describing,
      one per line, each of the sick leave requests stored
      in the attribute requests.
      To get full credit make sure you use a for-each loop.
      DONE
   */
   
   
   public String toString(){
            
      String result = "";
      
      for(SickLeaveRequest requested : requests){
      result += requested.toString() + "\n"; 
      }//end of for
      
      return result;
   }// end toString method
   
   
}// end class