package TestData;

import java.io.File;
import java.io.FileInputStream;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadData3 {
	public static void main(String[] args) throws Exception {
	   File f=new File("E:\\ExcelData\\sheet1.xlsx");
       FileInputStream fis=new FileInputStream(f);
       XSSFWorkbook wb=new XSSFWorkbook(fis);
       XSSFSheet sheet1=wb.getSheetAt(0);
      
       String data0=sheet1.getRow(0).getCell(0).getStringCellValue();
       System.out.print("Data in Excel is "+data0);
       String data1=sheet1.getRow(0).getCell(1).getStringCellValue();
       System.out.print("---->Data in Excel is "+data1);
       
	}

}
