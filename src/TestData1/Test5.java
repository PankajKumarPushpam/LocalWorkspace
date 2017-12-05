package TestData1;

import java.io.FileInputStream;
import java.io.FileOutputStream;

import org.apache.poi.ss.usermodel.CreationHelper;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Test5 {

	public static void main(String[] args) throws Exception{
		String xlpath="./input/Empty.xlsx";
		FileInputStream fis=new FileInputStream(xlpath);
		Workbook wb=WorkbookFactory.create(fis);
		
		CreationHelper ch=wb.getCreationHelper();
		wb.getSheet("Sheet1").createRow(0).createCell(0).setCellValue(ch.createRichTextString("SweetHeart"));
		wb.getSheet("Sheet1").createRow(1).createCell(1).setCellValue(ch.createRichTextString("11111"));
		FileOutputStream fos=new FileOutputStream(xlpath);
		wb.write(fos);
		fos.close();
		
		
	}

}
