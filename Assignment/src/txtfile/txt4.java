package txtfile;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class txt4 {
	public void WriteDataInaRange(int initial_row_count, int end_row_count) throws IOException {
		File f = new File("../Assignment/TestOutputFile1.txt");
		FileWriter fr = new FileWriter(f);
		BufferedWriter b = new BufferedWriter(fr);
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the data");
		String s1;
		for(int i=1;i<initial_row_count;i++) {
			b.newLine();
			b.write("");
		}
		for(int i=initial_row_count;i<=end_row_count;i++) {
			if(i>=initial_row_count && i<=end_row_count) {
				System.out.println("Line"+i);
				s1=s.nextLine();
				b.write(s1);
				b.newLine();
			}
		}
		b.close();
}
	public static void main(String[] args) throws IOException {
		Scanner s= new Scanner(System.in);
		System.out.println("Enter the initial row count:");
		int a= s.nextInt();
		System.out.println("Enter the end row count:");
		int b= s.nextInt();
		txt4 t = new txt4();
		t.WriteDataInaRange(a,b);
		}
}

