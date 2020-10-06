import java.util.*;
public class testFan{
   public static void main(String[] args){
      
      Fan myFan = new Fan();
      
      System.out.println(myFan.getColor());
      myFan.setColor("Black");
      System.out.println(myFan.getColor());
      
      
      Cup myCup = new Cup();
      System.out.println(myCup.radius);
      System.out.println(myCup.filled);
      myCup.filled = true;
      myCup.radius = 10;
      System.out.println(myCup.radius);
      System.out.println(myCup.filled);
      myFan.turnOn();
      System.out.println(myFan.toString());
      
      Fan[] myFanArray = Fan.createFanArray(7);
      
      myFanArray[3].turnOn();
      myFanArray[6].turnOn();
      myFanArray[3].setFast();
      myFanArray[6].setMedium();
      
      for(int i = 0; i < myFanArray.length; i++){
      myFanArray[i].turnOn();
      System.out.println(myFanArray[i].toString());
      }
      
   }
}