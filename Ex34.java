package p1;
import java.util.*;

public class Ex34 {
public static void main(String[] args) {
	
	StringBuffer s=new StringBuffer(" Chennai Super Kings");
	s.insert(0,"**");
	System.out.println(s);
	s.replace(3, 5," ");
	System.out.println(s);
	s.reverse();
	System.out.println(s);
	s.append("The");
	System.out.println(s);
	s.delete(2, 5);
	System.out.println(s);
	s.deleteCharAt(5);
	System.out.println(s);
	
}
}
