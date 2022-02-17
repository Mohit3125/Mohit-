package p1;
import java.util.*;
public class Ex6 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int a=sc.nextInt();
		int b=sc.nextInt();
		int c=sc.nextInt();
		int result=(a>b?a:b);
		if (result>c)
		System.out.println(result);
		else
			System.out.println(c);
		sc.close();
	}

}
