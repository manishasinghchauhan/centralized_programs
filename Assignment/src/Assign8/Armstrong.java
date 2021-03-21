package Assign8;

import java.util.Scanner;

public class Armstrong {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the number");
		int n=s.nextInt();
		int a=n;
		int sum=0;
		while(a!=0) {
			int b=a/10;
			int c=a%10;
			a=b;
			sum=sum+c*c*c;
		}
		if(sum==n) {
			System.out.println("Number is Armstrong");
		}
		else{
			System.out.println("Number is not Armstrong");
		}
	}

}
