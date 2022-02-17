package p1;
import java.util.*;
public class Ex10 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		if(n%5==0 && n%3==0)
			System.out.println("Divisible by 3 and 5");
			else
				System.out.println("Invalid");
		sc.close();
	}

}
