package p1;
import java.util.*;
class Student{
	
	String name;
	char gender;
    int rollno;
    void input() {
    	Scanner sc=new Scanner(System.in);
    	System.out.println("Enter student name");
    	name=sc.nextLine();
    	System.out.println("Enter student gender");
    	gender=sc.next().charAt(0);
    	System.out.println("Enter student rollno");
    	rollno=sc.nextInt();
    	
    }
    void display() {
    	System.out.println("Student name is"+" "+name);
    	System.out.println("Student gender is"+" "+gender);
    	System.out.println("Student rollno is"+" "+rollno);
    }
}

public class Ex37 {
	public static void main(String[] args) {
		/*Student sobj=new Student();
		sobj.input();
		sobj.display(); */
		System.out.println("Student Details");
		Student s[] =new Student[2];
		for(int i=0; i<s.length;i++){
			s[i]=new Student();
			s[i].input();
			s[i].display();
		}
		
	}

}
