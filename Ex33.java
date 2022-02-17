package p1;
import java.util.*;

public class Ex33 {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	String ms=" ";
	System.out.println("Enter a word");
	String s=sc.nextLine().toLowerCase();
	for(int i=0; i<s.length();i++) {
		char ch=s.charAt(i);
		if(ch =='a' || ch =='e' ||ch =='i' || ch=='o' || ch=='u') {
			System.out.println(ch);
			continue;
		}
		else {
			 ms=ms+s.charAt(i);
		}
	}
	System.out.println("Ater removing vowels" +" "+ms );
	
}
}
