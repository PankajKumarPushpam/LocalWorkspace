package TestData1;

import java.io.FileInputStream;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;



public class Test2 {

	public static void main(String[] args) throws Exception {
		String xlpath="./input/data1.xlsx";
		//Open the workbook
		FileInputStream fis=new FileInputStream(xlpath);
		Workbook wb=WorkbookFactory.create(fis);
		//without using toString method
		Cell c=wb.getSheet("Sheet1").getRow(0).getCell(0);
		System.out.println(c+" ");
	}

}
