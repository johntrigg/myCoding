// Feel free to add here any import statements that you need for your tests
import java.util.*;
/*
note: it wasn't in IE1 to provide getters for everything, but to show everything worked, i made my own getters for what i needed. i hope that's okay.
*/
/**
   TOTAL 3 points
   Use the main method in this class to test the features of our
   InvoiceItem class. To do so, you are free to create several objects,
   call methods...
**/
public class IE1{
   
   public static void main(String[] args){
         
      /*
      Write your tests in this main method.
      You will be graded on the thoroughness of your tests; 
         1 point  main code tests each of the available methods at least once, 
                  this includes testing object creation with all available constructors
         1 point  In addition, methods are tested on parameters that they should reject
                  or handle as special cases.
         1 point  All tests result in clear information being displayed on the screen
                  so that, by just reading the programs' output, we can understand exactly
                  what has been tested, with what values, and what was the result or
                  consequences of running the test.
      */
      System.out.println("Starting the testing of the InvoiceItem class...");
      System.out.println("Testing object creation without inputting any parameters");
      
      InvoiceItem allDefaults = new InvoiceItem();

      System.out.println("Unit Price: " + allDefaults.getUnitPrice());//my unit price
      System.out.println("Quantity: " + allDefaults.getQuantity());//my quantity
      System.out.println("Total Price: " + allDefaults.getTotalPrice());//my total price
      System.out.println("Description:" + allDefaults.getDescription());//my description
      System.out.println("Name: " + allDefaults.getName());//my name 
      System.out.println("toString: " + allDefaults.toString());//and showing toString works here. 
      
      System.out.println(allDefaults.toString());//this tested the no parameter constructor and the defaults
      
      System.out.println("Testing parameter based constructor and toString");
      
      InvoiceItem Cakes = new InvoiceItem("Cakes", "Diabetes Fuel", 7, 19.99);
      System.out.println("Unit Price: " + Cakes.getUnitPrice());//my unit price
      System.out.println("Quantity: " + Cakes.getQuantity());//my quantity
      System.out.println("Total Price: " + Cakes.getTotalPrice());//my total price
      System.out.println("Description:" + Cakes.getDescription());//my description
      System.out.println("Name: " + Cakes.getName());//my name 
      System.out.println("toString: " + Cakes.toString());//and showing toString works here. 
      
      System.out.println("Testing mutator tasks");
      System.out.println("Testing decrease quantity with a parameter of -3");
      System.out.println("Before:" + Cakes.getQuantity());
      Cakes.decreaseQuantity(-3);
      System.out.println("After:" + Cakes.getQuantity());     
      System.out.println("Testing decrease quantity with a parameter of 20");
      System.out.println("Before:" + Cakes.getQuantity());
      Cakes.decreaseQuantity(20);
      System.out.println("After:" + Cakes.getQuantity());//testing invalid parameters for decrease quantity
      
      System.out.println("Testing decrease quantity with a parameter of 3");
      System.out.println("Before:" + Cakes.getQuantity());
      Cakes.decreaseQuantity(3);
      System.out.println("After:" + Cakes.getQuantity());//testing valid parameter for decrease quantity
      
      System.out.println("Testing increase quantity with a parameter of -3");
      System.out.println("Before:" + Cakes.getQuantity());
      Cakes.increaseQuantity(-3);
      System.out.println("After:" + Cakes.getQuantity());     //testing invalid parameters for increase quantity 
      System.out.println("Testing increase quantity with a parameter of 20");
      System.out.println("Before:" + Cakes.getQuantity());
      Cakes.increaseQuantity(20);
      System.out.println("After:" + Cakes.getQuantity()); //testing valid parameter for increase quantity
      
      /*
      That should be everything. We tested all of our getters, our constructors with and without parameters, our increase quantity with valid and invalid parameters
      , our decrease quantity with valid and invalid parameters. 
      */
      
   
      
   }//end of main method
   
} // end public class
