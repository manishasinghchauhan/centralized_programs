package txtfile;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class txt2 {
	public void ReadDataofRange(int initial_row, int end_row) throws IOException
	{
		File f = new File("../Assignment/TestFile.txt");
		FileReader  fr = new FileReader(f);
		BufferedReader br = new BufferedReader(fr);
		String s;
		int i=0;
		while((s=br.readLine())!=null) {
			i++;
			if(i>=initial_row && i<=end_row) {
				System.out.println(s);
				initial_row++;
			}
					}
}
	public static void main(String args[]) throws IOException {
		Scanner s= new Scanner(System.in);
		System.out.println("Enter the initial row:");
		int a=s.nextInt();
		System.out.println("Enter the end row:");
		int b=s.nextInt();
		txt2 t = new txt2();
		t.ReadDataofRange(a,b);
		}
	}
