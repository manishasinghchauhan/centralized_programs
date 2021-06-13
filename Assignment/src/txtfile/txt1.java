package txtfile;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class txt1 {
	public void ReadData(int a) throws IOException
	{
		File f = new File("../Assignment/TestFile.txt");
		FileReader  fr = new FileReader(f);
		BufferedReader br = new BufferedReader(fr);
		String s;
		int i=0;
		while((s=br.readLine())!=null) {
		i++;
		if(i==a) {
				System.out.println(s);
				}
		}
		br.close();
			}
	public static void main(String[] args) throws IOException {
		System.out.println("Please enter the row number to read:");
		Scanner s = new Scanner(System.in);
		int num= s.nextInt();
		txt1 t = new txt1();
		t.ReadData(num);
	}

}
