package p1;
import java.util.*;

public class Ex18 {
	public static void main(String[] args) {
		int fact=1;
		Scanner sc=new Scanner(System.in);
		
		int i=sc.nextInt();
		sc.close();
		while(i>=1) {
			fact=fact*i;
			
			i--;
		}
		System.out.println("Factorial\t"+fact);
		if(i==0) {
			fact=1;
			
		}
		
		
	}

}
