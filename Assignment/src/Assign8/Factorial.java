package Assign8;

import java.util.Scanner;

public class Factorial {
	public static void main(String[] args) {
	int i,fact=1;
	System.out.println("Factorail Of:");
	Scanner s=new Scanner (System.in);
	int num=s.nextInt();
	for(i=1;i<=num;i++)
	{
		fact=fact*i;
		System.out.println("Factorial of"+num+ " is: "+fact);
	}
}
}
