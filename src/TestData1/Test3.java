package TestData1;

import java.io.FileInputStream;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Test3 {

	public static void main(String[] args) throws Exception{
		String xlpath="./input/data1.xlsx";		
		FileInputStream fis=new FileInputStream(xlpath);
		Workbook wb=WorkbookFactory.create(fis);
		/*
		Sheet c=wb.getSheet("Sheet1");
		for(int i=0;i<=c.getLastRowNum();i++) {
	    	   for(int j=0;j<=2;j++) {
	    		   String s=c.getRow(i).getCell(j).toString();
	    	   System.out.print(s+"\t");
	       }
	    	   System.out.println("\t");	    	   
	   }
	   */
		for(int i=0;i<=2;i++) {
	    	   for(int j=0;j<=2;j++) {
	    		   String s=wb.getSheet("Sheet1").getRow(i).getCell(j).toString();
	    	   System.out.print(s+"\t");
	       }
	    	   System.out.println("\t");	    	   
	   }
	}

}
