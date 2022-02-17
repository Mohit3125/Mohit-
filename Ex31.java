package p1;
import java.util.*;

public class Ex31{
	public static void main(String[]args) {
		Scanner sc=new Scanner(System.in);
		int count=0;
		System.out.println("Enter a String");
		String s=sc.nextLine().toLowerCase();
		System.out.println("Enter a character to be search");
		char ch=sc.next().charAt(0);
		for(int i=0;i<s.length();i++) {
			if(ch==s.charAt(i)) {
				count++;
			}
		}
		System.out.println("char "+" " +"found"+" "+count+" "+"times");
		
	}
}
