package p1;
import java.util.*;
class ATransport{
	String name;
	int w;
	int charge;
	void accept() {
		Scanner sc=new Scanner(System.in);
		System.out.println("Name");
		name=sc.nextLine();
		System.out.println("Weight");
		w=sc.nextInt();
	}
	void calculate() {
		if(w<=10) {
			charge =w*25;
		}
		else if(w>=10 && w<=20 ) {
			charge =(10*25)+((w-10)*20);
		}
		else {
			charge =(10*25)+(20*20)+((w-30)*10);
		}
		
	}
	void print() {
		System.out.println("Name"+"\t"+"Weight"+"\t"+"Bill amount");
		System.out.println("--------------------------------------------------------------");
		System.out.println(name+"\t"+w+"Kg"+"\t"+" "+"Rs"+charge+(charge*0.005));
	}
	
}
public class Ex45 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter");
		ATransport trans=new ATransport();
		trans.accept();
		trans.calculate();
		trans.print();
		
	}

}
