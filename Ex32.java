package p1;
import java.util.*;

public class Ex32 {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter a String");
	 String s=sc.nextLine();
	 int sp=s.indexOf(' ');
	 int lis=s.lastIndexOf(' ');
     String s1=s.charAt(0)+"."+s.charAt(sp+1)+"."+s.substring(lis+1);
     System.out.println(s1);
	
	
}
}
