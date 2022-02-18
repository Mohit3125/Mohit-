package p1;

import java.util.Scanner;

class Vol{
	 void volume(double R) {
			double v =(4/3)*(22/7)*(R*R*R);
			System.out.println("Vol of Sphere"+" "+v);
			
		}
		void volume(double H,double R ) {
			double v =(22/7)*(R*R)*H;
			System.out.println("Vol of Cylinder"+" "+v);
		}
		void volume(double L,double B,double H ) {
			double v =L*B*H;
			System.out.println("Volume of cuboid"+" "+v);
		}
		
	}
	 
 
public class Ex44 {
	public static void main(String[] args) {
		Vol obj=new Vol();
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter radius of Sphere");
		obj.volume(sc.nextDouble());
		System.out.println("Enter height and radius of Cylinder");
		obj.volume(sc.nextDouble(),sc.nextDouble());
		System.out.println("Enter length,breadth and height of Cuboid");
		obj.volume(sc.nextDouble(),sc.nextDouble(),sc.nextDouble());
		sc.close();
	}

}
