import java.util.*;

public class ToDo{

   private String title;
   private String description;
   private Date dateCreated;
   private Date dateCompleted;
   private boolean isDone;
   public ToDo(){
      this("Default ToDo Task","...");
   /*
   how to use constructors to call another constructor with preset args. note the no dot.
   */
   }

   public ToDo(String title, String description){
      this.title = title;
      this.description = description;
      dateCreated = new Date();
      dateCompleted = null;
      isDone = false;
   }//end of full args constructor

   public boolean isDone(){
      return isDone;
   }

   public String toString(){
      String str = "[";
      if (isDone){
         str = str + "x";
      }else{
         str = str + "";
      }
      str = str + "]";// my /t is a tab(6 lines of space)
      str = str + "\n" + title;//my /n is a new line.
      str = str + "\n" + description;
   
      if(isDone){
         str = str + "\n Date Completed:" + dateCompleted;
      }
   
      return str;
   }  /* 
ask questions about this
ask questions about date
and object arrays
*/
   public void setDone(boolean flag){
      isDone = flag;
   
      if(flag){
         dateCompleted = new Date();
      }else{
         dateCompleted = null;
      }
   
      if(isDone != flag){
         isDone = flag;
      }
   }


}//end of todo class
class ToDoList{

   private ToDo[] tasks;
   private int capacity;
   private int size;

   public ToDoList(){
      this(5);
   }

   public ToDoList(int capacity){
      this.capacity = capacity;
      tasks = new ToDo[this.capacity];//all set to null by default
      size = 0;
   }
   public void add(ToDo task){
      if(size == tasks.length){
         // need to expand
         capacity *= 2;
         ToDo[] expanded = new ToDo[capacity];
         
         for(int index=0 ; index < tasks.length ; index++)
            expanded[index] = tasks[index];
         tasks = expanded;
      }
      tasks[size++] = task; 
      // validate parameter; e.g. non null
   }
   
   public String toString(){
      String str = "ToDo List [capacity = "+capacity+" size = "+size+"]\n";
      for(ToDo t: tasks)
         if(t!=null) str += t.toString() + "\n";
      return str;
   }
}//end of todolist class