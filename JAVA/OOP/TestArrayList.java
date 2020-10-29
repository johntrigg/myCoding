import java.util.*;

public class TestArrayList{
public static void main(String[] args){

int[] intArray = {8,9,7,3};
System.out.println("Array put in");

ArrayList<Integer> myIntArray = new ArrayList<Integer>();

System.out.println("Arraylist made");

for(int i = 0; i < intArray.length; i++){
myIntArray.add(intArray[i]);
System.out.println("Elements added");
}//end of for

for(Integer i : myIntArray){
System.out.println(i);


}

}
}