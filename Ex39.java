package p1;
import java.io.*;
 class School{
	 int sid; 
	  String name;
	  float amount;
	  
	  void input() throws IOException {
		  InputStreamReader is=new InputStreamReader(System.in);
		  BufferedReader br=new BufferedReader(is);
		  
		  System.out.println("Enter School id");
		  sid=Integer.parseInt(br.readLine());   
		  System.out.println("School name");
		   name=br.readLine();
		  System.out.println("Total schoo fees");
		  amount = Float.parseFloat(br.readLine());
		  
	  }
	  void display() {
		  
		  System.out.println("School id="+sid);
		  System.out.println("School name="+name);
		  System.out.println("Total Fees collected "+amount);
	  }
	
}

public class Ex39 {

	public static void main(String[] args) throws IOException {
School ob=new School();
		ob.input();
		ob.display();

	}

}


