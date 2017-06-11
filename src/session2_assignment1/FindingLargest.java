package session2_assignment1;

import java.util.Scanner;

public class FindingLargest {

	public static void main(String[] args) {
		
		int a;
		int b;
		int c;
		
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the 3 numbers : ");

		a=s.nextInt();
		b=s.nextInt();
		c=s.nextInt();
		
		if(a>=b && a>=c){
			System.out.println("Largest number : " +a);
		}
		
		if(b>=a && b>=c){
			System.out.println("Largest number : " +b);
		}
		
		if(c>=a && c>=b){
			System.out.println("Largest number : " +c);
		}
		
		if(a==b && b==c && c==a){
			System.out.println("All the numbers are equal");
		}
		
		s.close();
	}

}
