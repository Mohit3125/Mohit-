package p1;
import java.util.*;
class ShowRoom{
	Scanner sc=new Scanner(System.in);
	String name;
	long mobno;
	double cost;
	double dis;
	double amount;
	void input() {
	 System.out.println("Name");	
	 name=sc.nextLine();
	 System.out.println("Mobile-no");	
	 mobno=sc.nextLong();
	 System.out.println("Cost");	
	 cost=sc.nextDouble();
	 
	}
	void calculate() {
		if(cost<=10000) {
			dis=(cost*5)/100;
		}
		else if(cost>10000 && cost<=20000) {
			dis=(cost*10)/100;
		}
		else if(cost>20000 && cost<=35000) {
			dis=(cost*10)/100;
		}
		else {
			dis=(cost*20)/100;
		}
		amount =cost-dis;
	}
	void display() {
		System.out.println("Name"+" "+name);
		System.out.println("Mobile-no"+" "+mobno);
		System.out.println("Amount"+" "+amount);
	}
}
public class Ex42 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		ShowRoom obj=new ShowRoom();
		System.out.println("Enter");
		obj.input();
		obj.calculate();
		obj.display();
		
		
	}
	

}
