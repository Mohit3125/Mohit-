package p1;
import java.util.*;

public class Ex36 {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	int count=0;
	System.out.println("Enter a Sentence");
	String s=sc.nextLine();
	String ch[]=s.split(" ");
	System.out.println("Enter a  Search word ");
	String w=sc.next();
	for(int i=0; i<ch.length; i++) {
		if(ch[i].equals(w))
			count++;
	}
	System.out.println("Occurence of word "+" "+count);
}
}
