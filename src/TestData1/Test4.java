package TestData1;

import java.io.FileInputStream;

import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Test4 {

	public static void main(String[] args) throws Exception{
		String xlpath="./input/data1.xlsx";		
		FileInputStream fis=new FileInputStream(xlpath);
		Workbook wb=WorkbookFactory.create(fis);
		int rowCount=wb.getSheet("Sheet1").getLastRowNum();		
		for(int i=0;i<=rowCount;i++) {
			int cellCount=wb.getSheet("Sheet1").getRow(i).getLastCellNum();
	    	   for(int j=0;j<cellCount;j++) {
	    		   String s=wb.getSheet("Sheet1").getRow(i).getCell(j).toString();
	    	   System.out.print(s+"\t");
	       }
	    	   System.out.println("\t");	    	   
	   }
	}
}
