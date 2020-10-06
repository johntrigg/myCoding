import java.util.Scanner;
public class scannerTest{
   public static void main(String[] args){
      int x = 1;
      System.out.println(x);
      Scanner input = new Scanner(System.in);
      x = input.nextInt();
      System.out.println(x);
      x++;
      System.out.println(x);
   }
}