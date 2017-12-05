package TestData;

import java.io.File;
import java.io.FileInputStream;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadData {

	public static void main(String[] args) throws Exception {
	   File f=new File("E:\\ExcelData\\sheet1.xlsx");
       FileInputStream fis=new FileInputStream(f);
       XSSFWorkbook wb=new XSSFWorkbook(fis);
       XSSFSheet sheet1=wb.getSheetAt(0);
       String data0=sheet1.getRow(0).getCell(0).getStringCellValue();
       System.out.println("Data in Excel is "+data0);
       String data1=sheet1.getRow(0).getCell(1).getStringCellValue();
       System.out.println("Data in Excel is "+data1);
       String data2=sheet1.getRow(0).getCell(2).getStringCellValue();
       System.out.println("Data in Excel is "+data2);
       String data3=sheet1.getRow(0).getCell(3).getStringCellValue();
       System.out.println("Data in Excel is "+data3);
       
	}

}
