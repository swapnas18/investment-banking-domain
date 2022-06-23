package Excel_Study;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class first_test {

	public static void main(String[] args) throws EncryptedDocumentException, IOException {
	
FileInputStream  MyFile=new FileInputStream("D:\\Excel_Study\\Excel_test1.xlsx");
Sheet sheet = WorkbookFactory.create(MyFile).getSheet("Sheet1");
String value = sheet.getRow(1).getCell(1).getStringCellValue();
System.out.println("data form excel is--->"+value);	 


String Value2=sheet.getRow(1).getCell(2).getStringCellValue();
System.out.println("data form excel is--->"+ Value2);



double value3= sheet.getRow(1).getCell(3).getNumericCellValue();
System.out.println("data form excel is--->"+value3);



	
	}

}
