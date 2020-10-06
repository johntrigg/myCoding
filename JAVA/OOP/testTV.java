public class testTV{
   public static void main(String[] args){
   
      TV tv1 = new TV();
      tv1.turnOn();
      tv1.setChannel(30);
      tv1.setVolumeLevel(3);
   
      System.out.println("tv1's channel is " + tv1.channel + " and tv1's volume level is " + tv1.volumeLevel);
      
      Cup myCup = new Cup(5);
      System.out.println(myCup.radius);
   
   }//end of main method
}//end of class