package p1;
import java.util.*;
class Addition{
	
	
	void add(int a, int b) {
		Scanner sc=new Scanner(System.in);
		int c=a+b;
		System.out.println("Answer"+" "+c);
		
	}
	void add(float a,float b ) {
		float c=a+b;
		System.out.println("Answer"+" "+c);
	}
	
}
public class Ex41 {
	public static void main(String[] args) {
		Addition obj=new Addition();
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter inputs");
		obj.add(sc.nextInt(),sc.nextInt());
		System.out.println("Enter inputs again");
		obj.add(sc.nextFloat(),sc.nextFloat());
	}

}
