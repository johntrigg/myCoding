public class TestPerson{
public static void main(String[] args){

Student James = new Student("Senior");
James.setName("James");
James.setPhoneNumber(8675309);
James.setEmail("james@gmail.com");
System.out.println(James.getStatus());

Faculty Maddie = new Faculty();

Maddie.setName("Maddie");
Maddie.setOffice(77);

System.out.println(Maddie.getOffice());
System.out.println(Maddie.getName());
}//end of main method
}//end of testperson