/* Abstract Modifire is used instead of Polymorphism. It used instead of writing a whole method to direct */

public abstract class Student {
	
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

public abstract void computeGrade();

public void display(){
System.out.println("The name is : " + name);
System.out.println("The Id is : " + Id);
System.out.println("The total Marks is : " + totalMarks);
}

public String toString(){
return ("The name is : " + name + "\nThe Id is : " + Id + "\nThe total Marks is : " + totalMarks);
}

	}
