package Assign8;

import java.util.Scanner;

public class TablePrint {
	public static void main(String[] args) {
		int i;
		System.out.println("Table Of:");
		Scanner s= new Scanner(System.in);
		int a=s.nextInt();
		for(i=1;i<=10;i++)
		{
			int tabledata=a*i;
			System.out.println(a+ " * "+i+" = " +tabledata);
		}
	}

}
