package p1;
import java.util.*;
import java.math.*;

public class Ex14 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the first no");
		int a=sc.nextInt();
		System.out.println("Enter the operation");
		char opr=sc.next().charAt(0);
		System.out.println("Enter the sec no");
		int b=sc.nextInt();
		sc.close();
		switch(opr) {
		case '+':System.out.println(Math.addExact(a, b));
		break;
		case '-':System.out.println(Math.subtractExact(a, b));
		break;
		case '/':System.out.println(Math.floorDiv(a, b));
		break;
		case '*':System.out.println(Math.multiplyExact(a, b));
		break;
		case '%':System.out.println(Math.IEEEremainder(a, b));
		break;
		default:System.out.println("Invalid operation");
		}
	}

}
