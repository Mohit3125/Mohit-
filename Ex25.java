package p1;
import java.util.*;
public class Ex25 {
	public static void main(String[] args) {
		System.out.println("Enter no");
		Scanner sc=new Scanner(System.in);
		int num=sc.nextInt();
		System.out.println("Factors");
		for(int i=1;i<=num;i++) {
			if(num%i==0) {
				
				System.out.print("\t"+i);
				
			}
		}
		
		
		
	}

}
