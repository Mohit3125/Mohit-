package p1;
import java.util.*;
public class Ex13 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the character");
		char vowels=sc.next().charAt(0);
		sc.close();
		
		switch (vowels) {
        case 'a':
        case 'e':
        case 'i':
        case 'o':
        case 'u':
        case 'A':
        case 'E':     
        case 'I':
        case 'O':
        case 'U':System.out.println("vowel");
        
        break;
        default:System.out.println("Not a vowel");
        break;
		}
		
		
	}

}
