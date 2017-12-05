package TestData;

import java.io.File;
import java.io.FileInputStream;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ModifyData {

	public static void main(String[] args) throws Exception{
		File f=new File("E:\\ExcelData\\sheet.xlsx");
	       FileInputStream fis=new FileInputStream(f);
	       XSSFWorkbook wb=new XSSFWorkbook(fis);
	       XSSFSheet sheet1=wb.getSheetAt(0);
	       int rowcount = sheet1.getLastRowNum();
	       for(int i=0;i<rowcount;i++) {
	    	   int cellCount=wb.getSheet("Sheet1").getRow(i).getLastCellNum();
	    	   for(int j=0;j<cellCount;j++) {
	    	   String data=wb.getSheet("Sheet1").getRow(i).getCell(j).toString();
	    	   System.out.print(data+"\t");
	       }
	    	   System.out.println("\t");
	   }
	       
	}

}
