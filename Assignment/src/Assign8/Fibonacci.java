package Assign8;

import java.util.Scanner;

public class Fibonacci {
	public static void main(String[] args) {
			int a,f1=1,f2=1;
			System.out.println("Enter the number");
			Scanner s=new Scanner(System.in);
			a=s.nextInt();
			for(int i=1;i<a;i++) {
				System.out.print(f1 + " , ");
				int sum = f1+f2;
				f1=f2;
				f2=sum;
			}
		}
}
