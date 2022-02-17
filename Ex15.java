package p1;
import java.util.*;
public class Ex15 {
	
		public static void main(String[] args) {
			float length, breadth,base , height, radius,side,area;
			int choice;
			
			Scanner sc=new Scanner(System.in);
			//Menu
			System.out.println("**********MENU***************");
			System.out.println("1.Area of square");
			System.out.println("2.Area of Reactangle");
			System.out.println("3.Area of Circle");
			System.out.println("4.Area of Triangle");
			
			System.out.println("Please enter your choice");
			choice = sc.nextInt();
			sc.close();
			
			switch(choice) {
			case 1:
				    System.out.println("Find Area of square");
			        System.out.println("Enter side of square");
			        side=sc.nextFloat();
			        area=side*side;
			        System.out.println("Area of square of side "+side+" is "+area);
			        break;
			case 2: System.out.println("Area of reactangle");
			        System.out.println("Enter length of reactangle");
			         length=sc.nextFloat();
			         System.out.println("Enter breadth of a reactangle");

}
}
}