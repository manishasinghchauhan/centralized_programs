package Assign8;

import java.util.Scanner;

public class Primenumber 
{
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the number");
		int n=s.nextInt();
		int a=0;
		for(int i=2;i<=n/2;i++)
		{
			if(n%i==0)
			{
			a=a+1;
		}
	}
	if(a==0) {
			System.out.println("Nnumber is Prime");
	}
		else {
			System.out.println("Number is not Prime");
		}
	}
}
