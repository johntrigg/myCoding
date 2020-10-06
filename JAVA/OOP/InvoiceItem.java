import java.util.Date;

public class InvoiceItem{


   private String name;    {
   }
   private String description;      {
   }
   private int quantity;    {
   }
   private double unitPrice;  {
   }
   private Date dateRegistered = new Date();
   {
   } //we declare our private attributes here

   public InvoiceItem(String name, String description, int quantity, double unitPrice){
   
      this.name = name;
      this.description = description;
      this.quantity = quantity;
      this.unitPrice = unitPrice;
      this.dateRegistered = new Date(); //we set the desired attributes here
   
   }// end constructor with 4 args
  
  
  
   public InvoiceItem(){
      this.name = "Default Item";
      this.description = "...";
      this.quantity = 0;
      this.unitPrice = 0.0;
      this.dateRegistered = new Date();
   
   }//end of no args constructor 
  
   public double getTotalPrice(){
      double totalPrice = this.quantity * this.unitPrice;
      
      return totalPrice; 
   }// end method getTotalPrice
   
   public int getQuantity(){
      return quantity;
   }//getter for quantity
   
   public String getName(){
      return name;
   }//getter for name
   public String getDescription(){
      return description;
   }//getter for description
   
   public double getUnitPrice(){
      return unitPrice; 
   }// end method getUnitPrice 
   
   public void increaseQuantity(int v){
      if (v<0){
         v = 0;
      } //if invalid parameter, this is used but the measure wont change
      quantity = quantity + v;
   }// end method increaseQuantity

   public void decreaseQuantity(int v){
      if (v<0){
         v = 0;//if invalid parameter, this is used but the measure wont change
      } else if (v>quantity){
         v = 0;//same as above if
      }  
      quantity = quantity - v;   
   }// end method decreaseQuantity

   public String toString(){
   
      String stringDescription = (name + ": " + quantity + ", " + unitPrice + " (" + description + ")");
      return stringDescription;
   }// end method toString
   
   
   
}// end class
