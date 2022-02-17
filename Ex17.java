package p1;

public class Ex17 {
public static void main(String[] args) {
	int i=1;
	int sum=0;
	while(i<=100) {
		sum=sum+i;
		System.out.print("\t"+i);
		i++;
		
		
	}
	System.out.println();
	System.out.println(sum);
	int j=100;
	while(j>=1) {
		System.out.print("\t"+j);
		j--;
	}
	System.out.println();
	for(int k=2;k<100;k+=2){
		sum=sum+k;
		System.out.print("\t"+k);

		
	}
	System.out.println();
	System.out.println(sum);
}
}
