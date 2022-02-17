package p1;
import java.util.*;
public class Ex28 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int s=sc.nextInt();
		System.out.println("Enter array size");
		int n=sc.nextInt();
		int []a=new int[n];
		
		int pos=0;
        System.out.println("Enter array elements");
		for(int i=0;i<a.length;i++) {
			a[i]=sc.nextInt();
			if(a[i]==s) {
				
				pos=i+1;
				
			}
			
		}
		if(pos>0) {
			System.out.println("Search is found at pos "+ pos);
		}
		else {
			System.out.println("Not found");
		}
		
	}

}
