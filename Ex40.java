package p1;
class Overloading{
	void display() {
		System.out.println("No arguments");
	}
	void display(int i) {
		System.out.println("One argument");
	}
	void display(int i, int j) {
		System.out.println("Two Argument");
	}
}
public class Ex40 {
	public static void main(String[] args) {
		Overloading obj=new Overloading();
		obj.display();
		obj.display(5);
		obj.display(5,10);
	}

}
