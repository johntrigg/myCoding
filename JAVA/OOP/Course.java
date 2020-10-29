import java.util.*;

public class Course{

public Course(String courseName){
this.courseName = courseName;
}


private ArrayList<String> studentsArrayList = new ArrayList<String>();
private String[] students;
private int numberOfStudents;

private String courseName;

public void addStudent(String student){
studentsArrayList.add(student);
}

public void dropStudent(String student){
studentsArrayList.remove(studentsArrayList.indexOf(student));
}

public String getCourseName(){
return courseName;
}

public int getNumberOfStudents(){
return studentsArrayList.size();
}

public ArrayList getStudents(){
return studentsArrayList;
}

}//end of public class