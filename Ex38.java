package p1;
import java.util.*;
class Employee{
	
	String name;
	char gender                ;
    int id;
    float salary;
    void input() {
    	Scanner sc=new Scanner(System.in);
    	System.out.println("Enter Employee name");
    	name=sc.nextLine();
    	System.out.println("Enter Employee gender");
    	gender=sc.next().charAt(0);
    	System.out.println("Enter Employee id");
    	id=sc.nextInt();
    	System.out.println("Enter Employee salary");
    	salary=sc.nextFloat();
    	
    }
    void display() {
    	System.out.println("Employee name is"+" "+name);
    	System.out.println("Employee gender is"+" "+gender);
    	System.out.println("Employee id is"+" "+id);
    	System.out.println("Employee salary is"+" "+salary);
    }
}

public class Ex38 {
	public static void main(String[] args) {
		Employee eobj=new Employee();
		eobj.input();
		eobj.display();
		
	}

}
