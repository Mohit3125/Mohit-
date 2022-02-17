package p1;
import java.util.*;

public class Ex11 {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	float rate=sc.nextFloat();
	float discount;
	if(rate>=1000 && rate<=2000) {
		discount=(rate*2)/100;
		System.out.println(rate-discount);
	}
	else if(rate>2000 && rate<=3000) {
		discount=(rate*3)/100;
	System.out.println(rate-discount);}
	else if(rate>3000 && rate<=4000) {
		discount=(rate*4)/100;
	System.out.println(rate-discount);}
	else {
		discount=(rate*5)/100;
	System.out.println(rate-discount);}
	sc.close();
}
}

