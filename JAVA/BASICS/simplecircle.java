import java.util.Arrays;
import java.util.Scanner;
public class simplecircle {
 
   double radius;
   simplecircle() {
      radius = 1;
   }//create a circle with radius 1
 
   double getArea(){
      return radius * radius * Math.PI;
   } //returns the area of our circle
 
   double getPerimeter(){
      return (radius + radius) * Math.PI;
   } //returns circumference of the circle

 
   public static void main(String[] args){
      simplecircle circle1 = new simplecircle();
      System.out.println("The area of the circle of radius " + circle1.radius + " is " + circle1.getArea());
      System.out.println("The permieter of the circle of radius " + circle1.radius + " is " + circle1.getPerimeter());
   }//end of main method
 
}//end of class