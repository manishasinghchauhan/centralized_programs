package Assign8;

import java.util.Scanner;

public class Palindrome {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the number");
		int n=s.nextInt();
		int a=n;
		int sum=0;
		while(a!=0) {
			int x=a/10;
			int y=a%10;
			a=x;
			sum = sum*10+y;
			}
		if(sum==n) {
			System.out.println("Number is Palindrome");
		}
		else {
			System.out.println("Number is not Palindrome");
		}
	}

}
