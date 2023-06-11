//PolyMorphism
//Make an array in the test class to store the undergrad and postgrad in the array
//to use the methods that are in the post & undergrad classes make an empty method in the Father class(Student)
//With the same type & name of the method you want to use
public class Student {
	
private String name;
private String Id;
private int totalMarks;

public Student()
{
name = " ";
Id = " ";
totalMarks= 0;
}

public Student(String nn, String ii, int tt)
{
name = nn;
Id = ii;
totalMarks= tt;
}

public String getName() {
return name;
}

public void setName(String name) {
this.name = name;
}

public String getId() {
return Id;
}

public void setId(String id) {
Id = id;
}

public int getTotalMarks() {
return totalMarks;
}

public void setTotalMarks(int totalMarks) {
this.totalMarks = totalMarks;
}

public void computeGrade() {
	System.out.println(" ");
}
public void display(){
System.out.println("The name is : " + name);
System.out.println("The Id is : " + Id);
System.out.println("The total Marks is : " + totalMarks);
}

public String toString(){
return ("The name is : " + name + "\nThe Id is : " + Id +
"\nThe total Marks is : " + totalMarks);
}

	}
