package p1;
import java.util.*;
public class Ex22 {
	public static void main(String[] args) {
		System.out.println("Enter a no");
		Scanner sc=new Scanner(System.in);
		int sum=0,digit,num1;
		int num=sc.nextInt();
		num1=num;
		while(num!=0) {
			digit=num%10;
			sum=sum+digit*digit*digit;
			num=num/10;
		}
		System.out.println(sum);
	}

}
