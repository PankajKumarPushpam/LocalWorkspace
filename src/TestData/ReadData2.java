package TestData;

import java.io.File;
import java.io.FileInputStream;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadData2 {

	public static void main(String[] args) throws Exception{
		   File f=new File("E:\\ExcelData\\sheet1.xlsx");
	       FileInputStream fis=new FileInputStream(f);
	       XSSFWorkbook wb=new XSSFWorkbook(fis);
	       XSSFSheet sheet1=wb.getSheetAt(0);
	       int rowcount = sheet1.getLastRowNum();
	       System.out.println("Total number of Rows:"+rowcount);
	       for(int i=0;i<rowcount;i++) {
	    	   for(int j=0;j<3;j++) {
	    	   String data=sheet1.getRow(i).getCell(j).getStringCellValue();
	    	   System.out.print(data+"\t");
	       }
	    	   System.out.println("\t");
	   }
	       
	}

}
