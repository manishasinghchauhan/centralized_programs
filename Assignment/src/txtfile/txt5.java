package txtfile;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class txt5 {
	public static void main(String args[]) throws IOException
	{
	File f1 = new File("../Assignment/TestFile.txt");
	FileReader  fr = new FileReader(f1);
	BufferedReader br = new BufferedReader(fr);
	File f2 = new File("../Assignment/TestFilecopy.txt");
	FileWriter fw= new FileWriter(f2);
	BufferedWriter bw  = new BufferedWriter(fw);
	String s;
	while((s=br.readLine())!=null) {
		bw.write(s);
		bw.newLine();
	}
	br.close();
	bw.close();
	System.out.println("Copied File to another file");
	}
	}
