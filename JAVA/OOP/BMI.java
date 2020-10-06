public class BMI{

public BMI(String name, int age, double weight, double feet, double inches){
name = this.name;
weight = this.weight;
height = (feet*12)+(inches);
bmiNumber = ((this.weight)/(height*height))*imperialConstant;
}//end of args constructor

private int age;{}
private String name;{}
private double height;{}
private double weight;{}
private double bmiNumber;{}

private final double imperialConstant;{ 
imperialConstant = 703;
}//formula for BMI without kg and meters needs this constant to work

public double calculateBMI(){
bmiNumber = ((weight)/(height*height))*imperialConstant;
return bmiNumber;
}

public void setHeight(double height){
height = this.height;
}

public void setWeight(double weight){
weight = this.weight;
}

public void setName(String name){
name = this.name;
}

public void setAge(int age){
age = this.age;
}

}//end of bmi class