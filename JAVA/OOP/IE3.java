// Feel free to add here any import statements that you need for your tests


/**
   Use the main() method in this class to test your other classes. 
   We provide you with minimalist tests to get you started. 
   Feel free to modify them or add as many as you need.
   This part of your code will not be graded but will help
   you ensure that your other classes fullfill the requirements.
**/
import java.util.*;

public class IE3{
   public static void main(String[] args){
      // create a SickLeaveRequestsManager
      SickLeaveRequestsList list = new SickLeaveRequestsList();
   
      // create the sick leave requests for the above
      SickLeaveRequest s1 = new SickLeaveRequest("John Smith", 7, "new game released");
      SickLeaveRequest s2 = new SickLeaveRequest("Jane Doe", -23, "zombies");
      SickLeaveRequest s3 = new SickLeaveRequest("John Smith", 2, "new game released!");
      SickLeaveRequest s4 = new SickLeaveRequest("Jake Von Statefarm", 2, "finding a new job");
      SickLeaveRequest s5 = new SickLeaveRequest("John Smith", 1, "non-gaming related stuff");
      
      s4.approve();//testing approve 
      
      // add the sick leave requests
      list.addRequest(s1);
      list.addRequest(s2);
      list.addRequest(s3);
      list.addRequest(s4);
      list.addRequest(s5);
      
      System.out.println("Testing out getTotalDaysForEmployee John Smith");
      System.out.println(list.getTotalDaysForEmployee("John Smith")); //works
      
      System.out.println("Testing out toString for sick leave request");//works
      
      System.out.println(s1.toString());      
      System.out.println(s2.toString());
      System.out.println(s3.toString());      
      System.out.println(s4.toString());
            
      // display information about all the requests stored in m
      System.out.println("Testing the println of list");
     
      System.out.println(list);//works but functions the same as my toString?
      
      System.out.println("Testing List toString");
      
      System.out.println(list.toString());//works
      
      System.out.println("Employee John Smith requested a total of "
            + list.getTotalDaysForEmployee("John Smith")
            + " days");//works  
   }// end main
}// end class