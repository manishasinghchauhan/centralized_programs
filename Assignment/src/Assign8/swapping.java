package Assign8;

import java.util.Scanner;

public class swapping {
	public static void main(String[] args) {
		System.out.println("Enter vaule of a & b");
		Scanner s= new Scanner(System.in);
		int a=s.nextInt();
		int b=s.nextInt();
		System.out.println("Before Swapping:");
		System.out.println("Value of a:" +a);
		System.out.println("Value of b:" +b);
		a=a+b;
		b=a-b;
		a=a-b;
		System.out.println("After Swapping:");
		System.out.println("Enter value of a:" +a);
		System.out.println("Enter value of b:" +b);
	}

}
