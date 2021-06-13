package xlsfile;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import jxl.Cell;
import jxl.Sheet;
import jxl.Workbook;
import jxl.read.biff.BiffException;

public class xls2 {
	public void readDatBasedUponRowNo(int rowNo ) throws  IOException, BiffException {
		File f = new File("..//Assignment/sheet.xls");
		FileInputStream fis = new FileInputStream(f);
		Workbook workbook = Workbook.getWorkbook(fis);
		Sheet sheet = workbook.getSheet(0);
		int rowSize= sheet.getRows();
		int colSize= sheet.getColumns();
		System.out.println("row size:" +rowSize+ "col size:" +colSize);
		System.out.println("Row data:");
		for(int j=0;j<colSize;j++) {
			Cell c1 = sheet.getCell(j).rowNo());
			
		}
}
}
