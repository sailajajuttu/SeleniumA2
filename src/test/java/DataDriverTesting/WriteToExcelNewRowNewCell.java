package DataDriverTesting;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class WriteToExcelNewRowNewCell {

	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		
		FileInputStream fis = new FileInputStream("./src/test/resources/Data.xlsx");
		
		Workbook wb = WorkbookFactory.create(fis);
		
		Sheet sh = wb.getSheet("Sheet1");
		
		Row r= sh.createRow(5);
		
		Cell c1=r.createCell(0);
		
		c1.setCellValue("course");
		
        Cell c2=r.createCell(1);
		
		c2.setCellValue("selenium");
		
		FileOutputStream fos= new FileOutputStream("./src/test/resources/Data.xlsx");
		
		wb.write(fos);
		
		wb.close();
		
		
	}
}
