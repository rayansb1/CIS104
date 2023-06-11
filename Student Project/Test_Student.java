public class Test_Student {
public static void main(String[] args) {

	Student Arr[] = new Student[10];
	Arr[0]= new undergradSt ("Bader" , "1122" , 85, true);
	Arr[1]= new undergradSt ("Ahmed" , "1982" , 55, false);
	Arr[2]= new PostGrad ("Yasser" , "4652" , 90, false);
	Arr[3]= new PostGrad ("Khalid" , "1783" , 99, true);
	
	for(int i=0; i<4; i++) {	
		Arr[i].display();
		System.out.print("The Student " +Arr[i].getName() + " has: ");
		Arr[i].computeGrade();
		System.out.println(" ================ ");	
	}              
	
	
	int Count = 0;
	for(int i=0; i<4; i++) {
	if ( Arr[i] instanceof PostGrad)
		Count ++;
	}
	System.out.println(" There are " + Count +" of Post Grad");


	
	
	}
}