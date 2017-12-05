package TestData1;

import java.io.FileInputStream;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Test1 {

	public static void main(String[] args) throws Exception {
		
		String xlpath="./input/data1.xlsx";
		//Open the workbook
		FileInputStream fis=new FileInputStream(xlpath);
		Workbook wb=WorkbookFactory.create(fis);
		/*
		//Get Sheet
		Sheet sh = wb.getSheet("Sheet1");
		//Get Row
		Row r=sh.getRow(0);
		//Get Cell
        Cell c = r.getCell(0);
        //convert to String
        String st=c.toString();
		System.out.println(st);
		*/
		//Optimized code
		String st=wb.getSheet("Sheet1").getRow(0).getCell(0).toString();
		System.out.println(st);
		
	}

}
