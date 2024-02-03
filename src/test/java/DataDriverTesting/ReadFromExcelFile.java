package DataDriverTesting;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ReadFromExcelFile {

	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		
		// Step1: Convert Physical File To Java Readable File
		FileInputStream fis =new FileInputStream("./src/test/resources/Data.xlsx");
		
		// Step2: Open Workbook
		Workbook wb = WorkbookFactory.create(fis);
		
		// Step3: Get Control Over Sheet
		Sheet s= wb.getSheet("Sheet1");
		
		//Step4: Get Control Over Row
		Row r=s.getRow(0);
		
		//Step5: Get Control Over Cell
		Cell c=r.getCell(1);
		
		//Step6: Retrieve Data
		System.out.println(c.getStringCellValue());
		
		//Step7:Close Workbook
		wb.close();
		
		

	}

}
