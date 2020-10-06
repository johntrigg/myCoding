public class Fan{

   public Fan(){
   }//constructor

   private boolean on;  
   {
   }//initalizes as false

   private int radius; 
   {
      radius = 5;
   }

   final int SLOW = 1;
   final int MEDIUM = 2; 
   final int FAST = 3;

   private int speed;  
   {
      speed = SLOW;
   }
   private String color;  {
      color = "Blue";  }

   public boolean getOn(){
      return on;  }
   public int getRadius(){
      return radius;
   }
   public int getSpeed(){
      return speed;
   }

   public String getColor(){
      return color;
   }

   public void setColor(String newColor){
      color = newColor;
   }

   public void turnOn(){
      on = true;
   }

   public void turnOff(){
      on = false;
   }

   public void setSlow(){
      speed = SLOW;
   }
   public void setMedium(){
      speed = MEDIUM;
   }
   public void setFast(){
      speed = FAST;
   }

   public String toString(){
      if(!on){
         return "Fan is off";
      }else{
         return "Fan's radius is " + radius + " the Fan's color is: " + color + " the Fan's speed is: " + speed;
      }
   }//end of toString method
   
   public static Fan[] createFanArray(int size){
  Fan[] FanArray = new Fan[size];
   for(int i = 0; i < FanArray.length; i++){
   FanArray[i] = new Fan();
   }
   
   return FanArray;  
   }

}//end of public class

class Cup{
public Cup(){
}

int radius;{
radius = 5;
}

boolean filled;{
   }
}