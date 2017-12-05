package TestData;

import java.io.FileInputStream;
import java.io.FileOutputStream;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ModifyData1 {
		public static void main(String[] args) throws Exception{
			String f="E:\\ExcelData\\sheet1.xlsx";
			//File f=new File("E:\\ExcelData\\sheet1.xlsx");
		       FileInputStream fis=new FileInputStream(f);
		       XSSFWorkbook wb=new XSSFWorkbook(fis);
		       XSSFSheet sheet1=wb.getSheetAt(0);
		       int rowcount = sheet1.getLastRowNum();
		       Cell cell=null;
		       cell=sheet1.getRow(1).getCell(2);
		       cell.setCellValue("XYZ"); 
		       FileOutputStream fos=new FileOutputStream("E:\\ExcelData\\sheet1.xlsx");
		       wb.write(fos);
		}

}
