package p1;
import java.util.*;
public class Ex24 {
	public static void main(String[] args) {
		System.out.println("Enter no");
		Scanner sc=new Scanner(System.in);
		int num=sc.nextInt();
		int sum=0,digit;
		int square=num*num;
		while(square!=0) {
			digit=square%10;
			sum=sum+digit;
			square=square/10;
		}
		if(sum==square) {
			System.out.println("Neon no");
		
		}
		else {
			System.out.println("not");
		}
	}

}
