package DataDriverTesting;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Iterator;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ReadMutipleDataFromExcelUsingJava {

	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		// TODO Auto-generated method stub
		
        FileInputStream fis = new FileInputStream("./src/test/resources/Data.xlsx");
		
		Workbook wb = WorkbookFactory.create(fis);
		
		Sheet sh= wb.getSheet("Sheet1");
		
		DataFormatter df= new DataFormatter();
		
		for(int i=0;i<=sh.getLastRowNum();i++)
		{
			
			String key= df.formatCellValue(sh.getRow(i).getCell(0));
			
			String value=df.formatCellValue(sh.getRow(i).getCell(1));
			
			System.out.println(key + "\t" + value);
		}

		wb.close();
	}

}
