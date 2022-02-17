package p1;
import java.util.*;

public class Ex8 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		char grade=sc.next().charAt(0);
		if(grade=='A') 
		System.out.println("Marks in the range between  89 to  101");
		else if(grade=='B')
			System.out.println("Marks in the range between 69 to 90");
		else if(grade=='C')
			System.out.println("Marks in the range between 39 to 70");
		else if(grade=='D')
			System.out.println("Marks in the range between -1 to 40");
		else
			System.out.println("Invalid result");
		sc.close();
	}

}
