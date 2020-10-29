// Feel free to add here any import statements that you need
import java.util.*;


/** TOTAL = 9 points
   This class models information we keep about a sick leave request.
   The code below compiles but is missing critical parts that you need to write. 
   Look for the TASK tags to tell you what you need to write.
   You may work on these tasks in a different order but they are numbered
   so as to provide you with a logical order to follow.
**/
public class SickLeaveRequest {
   
   /* TASK #1 - 1 point (.2 per attribute)
      Declare the following attributes as private:
         employeeName      of data type   String
         numberOfDays      of data type   int
         reasonForRequest  of data type   String
         isApproved        of data type   boolean
         dateApproved      of data type   Date
         DONE
   */

//initalize object variables

private Date dateApproved;
private String employeeName;
private String reasonForRequest;
private int numberOfDays;
private boolean isApproved;

   

   /* TASK #2 - 1 point (.2 per attribute)
      Write the code for the following constructor.
      Do not alter the name of the parameters.
      Initialize appropriately ALL attributes.
      If the parameter numberOfDays is < 0, set it to 1.
      The attribute isApproved should be false by default
      and the attribute dateApproved should be null.
      DONE
   */
   public SickLeaveRequest(String employeeName, int numberOfDays, String reasonForRequest){   
      if(numberOfDays<0){
      numberOfDays = 1;
      }//checks and sets for invalid arguement
      this.numberOfDays = numberOfDays;
      this.employeeName = employeeName;
      this.reasonForRequest = reasonForRequest; 
   }// end constructor

   /* TASK #3 - 1 point
      Write the code for the following method so that
      it sets the isApproved attribute to true (.5 point)
      and records the time and date that it was approved
      in the attribute dateApproved (.5 point).
      DONE
   */
   
   public void approve(){
      dateApproved = new Date();
      isApproved = true;   
   }// end approve method

   /* TASK #4 - 1 point
      Write the code for the following method so that
      it returns true if the String parameter matches
      the name stored in the employeeName attribute.
      DONE
   */
   
   public boolean identifyEmployee(String employeeName){
      
      if(employeeName.equals(this.employeeName)){
      return true;
      } else{
      return false;
      }

   }// end method identifyEmployee
   
   
   /* TASK #5 - 1 point
      Write the code for the following method so that
      it returns the value of the attribute numberOfDays
      DONE
   */
   public int getNumberOfDays(){
      return numberOfDays;
   }// end method getNumberOfDays

   /* TASK #6 - 4 point (1 for each component of the String)
      Write the code for the following method so that
      it returns a String representing the information
      stored in the attributes. 
      The following examples illustrate the format that you 
      must follow in your strings;
         example #1 "John Smith, 1 day for 'new game released' NOT APPROVED YET"
         example #2 "Jane Doe, 28 days for 'zombies' APPROVED"
         example #3 "Jake Von Statefarm", 2 days for 'finding a new job' APPROVED"
      Please note that if the number of day is 1, we use "day"
      instead of "days" in the String that we return.
      DONE
   */
   public String toString(){
      // replace the code in this method by your code     
         
      String result = "Name: " + employeeName + ", " + numberOfDays;
      
      if(numberOfDays == 1){
      result += " day ";
      }else{
      result += " days ";
      }//end of checking if 1 day
      
      result += "for '" + reasonForRequest + "' ";
      
      if(isApproved){
      result += "APPROVED";
      }else{
      result += "NOT APPROVED YET";
      }
      
      return result;
   }// end toString method
   
   
   
}// end class
