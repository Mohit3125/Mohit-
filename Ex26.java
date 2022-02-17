package p1;
import java.util.*;

public class Ex26 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int k=1;
		
		for(int i=1; i<=n;i++) {
			 
			for(int j=1;j<=i;j++) {
				System.out.print(k+" ");
				k++;
					
			}
			
			System.out.println(" ");
		}
		outer:
		for(int m=1;m<=3;m++) {
			inner:
			for(int o=1;o<=3;o++) {
				if(m==2) {
					break inner;
				}
				System.out.println("m ="+m+" "+"o ="+o);
			}
			System.out.println();
		}
	}

}
