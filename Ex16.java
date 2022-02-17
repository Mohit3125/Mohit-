package p1;
import java.util.*;

public class Ex16 {
public static void main(String[] args) {
	float cel,frah;
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the choice for Temperature conversion");
	int choice=sc.nextInt();
	switch(choice) {
	case 1:System.out.println("Celsius to Frah");
	 System.out.println("Enter the Celsius");
	    cel=sc.nextFloat();
	   
	   System.out.println((frah=(cel*9)/5 + 32)+"\tFrah");
	   break;
	case 2:System.out.println("Frah to Cel");
	   System.out.println("Enter the frah");
	    frah=sc.nextFloat();
	   System.out.println((cel=(((frah -32)*5)/9))+"\tcelsius");
	   break;
	   default:System.out.println("Invalid query");
	   break;
	}
	
}
}
