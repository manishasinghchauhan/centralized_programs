package xlsfile;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;

import jxl.Cell;
import jxl.Sheet;
import jxl.Workbook;
import jxl.read.biff.BiffException;

public class xsl1 {
	public void readDataBasedUponRowNo(int colNo,int rowNo ) throws  IOException, BiffException {
		File f = new File("..//Assignment/sheet.xls");
		FileInputStream fis = new FileInputStream(f);
		Workbook workbook = Workbook.getWorkbook(fis);
		Sheet sheet = workbook.getSheet(0);
		System.out.println("Cell Data is");
		Cell c1= sheet.getCell(colNo,rowNo);
		System.out.println("cell("+rowNo+","+colNo+"):"+c1.getContents());
		workbook.close();
		fis.close();
	}
	public static void main(String[] args) throws BiffException, IOException {
		Scanner s= new Scanner(System.in);
		System.out.println("Enter Row number");
		int a= s.nextInt();
		System.out.println("Enter Column number");
		int b= s.nextInt();
		xsl1 x= new xsl1();
		x.readDataBasedUponRowNo(a,b);
	}

}
