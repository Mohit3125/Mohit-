package p1;
import java.util.*;
public class Ex23 {
	public static void main(String[] args) {
		System.out.println("Enter no");
		Scanner sc=new Scanner(System.in);
		int num=sc.nextInt();
		int sum=0,digit;
		while(num!=0) {
			digit=num%10;
			sum=sum+digit;
			num=num/10;
		}
		System.out.println("sum ="+sum);
	}

}
