package DataDriverTesting;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ReadFromExcelDataFromatter {

	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		// TODO Auto-generated method stub
		
		FileInputStream fis = new FileInputStream("./src/test/resources/Data.xlsx");
		
		Workbook wb = WorkbookFactory.create(fis);
		
		Cell c= wb.getSheet("Sheet1").getRow(2).getCell(1);
		
		DataFormatter df= new DataFormatter();
		
		String data= df.formatCellValue(c);
		
		System.out.println(data);
		
		wb.close();

	}

}
