package txtfile;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class txt3 {
	public void WriteData(int a) throws IOException {
		File f = new File("../Assignment/TestOutputFile.txt");
		FileWriter fr = new FileWriter(f);
		BufferedWriter b = new BufferedWriter(fr);
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the data till row number"+a+":\n");
		String s1;
		for(int j=1;j<=a;j++) {
			s1=s.nextLine();
			b.write(s1);
			b.newLine();
		}
		b.close();
		}
public static void main(String[] args) throws IOException {
	Scanner s= new Scanner(System.in);
	System.out.println("Enter the row count:");
	int a= s.nextInt();
	txt3 t = new txt3();
	t.WriteData(a);
	}
}
