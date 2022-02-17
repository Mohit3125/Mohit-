package p1;
import java.util.*;
public class Ex3 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String name=sc.nextLine();
		int age=sc.nextInt();
		char gender = sc.next().charAt(0);
		int roll=sc.nextInt();
		
		System.out.println(name+"\n"+age+"\n"+gender+"\n"+roll);
		sc.close();
	}

}
