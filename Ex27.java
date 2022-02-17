package p1;
import java.util.*;
import java.math.*;
public class Ex27 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Array size");
		int n=sc.nextInt();
		System.out.println("Enter Array elements");
		int sum=0;
		float avg=0;
		
		int [] array= new int[n];
		int min=array[0];
		//int max=array[0];
		for(int i=0; i<n;i++) {
			array[i]=sc.nextInt();
			sum=sum+array[i];
			if(array[i]<min) {
				min=array[i];
			}
			/* if (array[i]>max){
				max=array[i];
			} */
			
		}
		sc.close();
		avg=(float)sum/array.length;
		System.out.println(Arrays.toString(array));
		System.out.println("sum ="+sum);
		System.out.println("Avg ="+avg);
		System.out.println("Min no ="+min);
		//System.out.println("Max no ="+max);

	}
	

}
