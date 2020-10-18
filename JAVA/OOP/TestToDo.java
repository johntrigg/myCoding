public class TestToDo{
public static void main(String[] args){

   ToDo one = new ToDo("Feed the cat", "Give the cat her food");
   one.setDone(true);
   System.out.println(one.toString());
   ToDo two = new ToDo("Feed the duck", "Give the duck his food");
   two.setDone(true);
   ToDoList myList = new ToDoList(10);
   
   myList.add(one);
   myList.add(two);
   myList.toString();
}//end of main method
}//end of test to do class