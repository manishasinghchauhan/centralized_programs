package Assign8;

import java.util.Scanner;

public class SwappingWithThirdVariable {
	public static void main(String[] args) {
		System.out.println("Enter value of a & b");
		Scanner s=new Scanner(System.in);
		int a= s.nextInt(); //2
		int b= s.nextInt(); //3
		System.out.println("Before Swapping:");
		System.out.println("Value of a:" +a);//2
		System.out.println("Value of b:" +b);//3
		System.out.println("After Swapping:");
		int c=a;//c=2
		a=b;//b=2
		System.out.println("Value of a:" +a);
		b=c;
		System.out.println("Value of b:" +b);
	}
}
