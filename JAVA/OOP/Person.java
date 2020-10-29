import java.util.*;

public class Person{

public Person(String address, int phoneNumber, String name, String emailAddress){
this.name = name;
this.address = address;
this.emailAddress = emailAddress;
this.phoneNumber = phoneNumber;
}

public Person(){
this("0000 Road", 1234567890, "Name", "name@gmail.com");
}

protected String address;
protected int phoneNumber;
protected String name;
protected String emailAddress;

public void setAddress(String address){
this.address = address;
}

public void setName(String name){
this.name = name;
}

public void setEmail(String emailAddress){
this.emailAddress = emailAddress;
}

public void setPhoneNumber(int phoneNumber){
this.phoneNumber = phoneNumber;
}

public String getAddress(){
return address;
}

public String getName(){
return name;
}

public String getEmail(){
return emailAddress;
}
public int getPhoneNumber(){
return phoneNumber;
}

}//end of person class

class Student extends Person{


public Student(String status){
super();
this.status = status;
}

public Student(){
this("Freshman");
}
final protected String status;

public String getStatus(){
return status;
}
}//end of student class


class Employee extends Person{

public Employee(int salary, Date dateHired, int office){
super();

}

public Employee(){
this(0, new Date(), 0);
}

protected int salary;
protected Date dateHired;
protected int office;

public void setOffice(int office){
this.office = office;
}

public int getOffice(){
return office;
}

}//end of employeee class

class Faculty extends Employee{

public Faculty(int officeHoursBegin, int officeHoursEnd, String Rank){
this.officeHoursBegin = officeHoursBegin;
this.officeHoursEnd = officeHoursEnd;
this.rank = rank;
}

public Faculty(){
}

protected int officeHoursBegin;
protected int officeHoursEnd;
protected String rank;  

}//end of faculty class

class Staff extends Employee{

int title;
}//end of staff class