public class shenanigans{
   public static void main(String[] args){
   
   
      String car1 = "Toyota";
      String car2 = "Volkswagen";
      String car3 = "BMW";
      String[] cars = {"Toyota Volkswagen BMW Hyundai Honda Opel"};
      char looky = car1.charAt(3);//char 3 of var car1
      System.out.println(looky);
      char last = cars[1].charAt(cars[1].length);
   
   
      System.out.println(cars.length);
      System.out.println(cars[0]);
      //outputs cardinality of the array
   
      String lineOfCurrencies = "USD JPY AUD SGD HKD CAD CHF GBP EURO INR"; 
      String[] currencies = lineOfCurrencies.split(" ");//creates array based on this string. each word becomes an array entry. uses spaces to seperate
      System.out.println(lineOfCurrencies);
      System.out.println(currencies[4]);
      
     
     
    
   }//end of main method
}//end of class