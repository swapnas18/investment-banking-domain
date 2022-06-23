package Excel_Study;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class xcel {

	public static void main(String[] args) throws EncryptedDocumentException, IOException {
FileInputStream  file= new FileInputStream("D:\\Excel_Study\\Excel_test1.xlsx");
Sheet sheet = WorkbookFactory.create(file).getSheet("Sheet3");
 String row = sheet.getRow(1).getCell(0).getStringCellValue();
 System.out.println(row);


	}

}
