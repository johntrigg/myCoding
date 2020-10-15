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
String toStringDesc = "";

return toStringDesc;
}  /* ask questions about this*/
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

}//end of todolist class