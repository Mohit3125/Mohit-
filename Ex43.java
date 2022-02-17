package p1;
import java.util.*;
class Railway{
	Scanner sc=new Scanner(System.in);
	String name;
	String coach;
	long mobno;
	int amount;
	int totalamount;
	void accept() {
	 System.out.println("Name");	
	 name=sc.nextLine();
	 System.out.println("Coach-Name");	
	 coach=sc.nextLine();
	 System.out.println("Mobile-no");	
	 mobno=sc.nextLong();
	 
	 
	}
	void update() {
		
		Scanner sc=new Scanner(System.in);
		int ticket;
		System.out.println("Tickets");
		ticket=sc.nextInt();
		if(coach.equals("FirstAc")) {
		amount=700;	
		totalamount=amount*ticket;
	}
		else if(coach.equals("SecondAc")) {
			amount=500;	
			totalamount=amount*ticket;
		}
		else if(coach.equals("ThirdAc")) {
			amount=250;	
			totalamount=amount*ticket;
		}
		
	else if(coach.equals("Sleeper")) {
		amount=0;	
		totalamount=amount*ticket;
	}
	else {
		System.out.println("Invalid case");
	}
}
	
	void display() {
		System.out.println("Name"+" "+name);
		System.out.println("Coach"+" "+coach);
		System.out.println("Mobile-no"+" "+mobno);
		System.out.println("total amount"+" "+totalamount);
	}
}
public class Ex43 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter");
		Railway  r=new Railway();
		r.accept();
		r.update();
		r.display();
		
		
	
		
		
	}
	

}

