package p1;
import java.util.*;

public class Ex2 {
	public static void main(String args[]) {
		// specify f as float otherwise it will take double
		Scanner sc=new Scanner(System.in);
		float p=sc.nextFloat();
		float r=sc.nextFloat();
		int t=sc.nextInt();
		float SI=(p*r*t)/100;
		System.out.println("SI ="+SI);
		sc.close();
		 
	}

}
