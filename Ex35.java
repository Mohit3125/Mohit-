package p1;
import java.util.*;
public class Ex35 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a String");
		StringBuffer s=new StringBuffer(sc.nextLine().toLowerCase());
		
		for(int i=0; i<s.length();i++) {
			char ch=s.charAt(i);
			if(ch =='a' || ch =='e' ||ch =='i' || ch=='o' || ch=='u') {
				s.deleteCharAt(i);
			
				
			}
			
	}
		System.out.println(s);
	}
}

