package framework;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;


import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.io.FileHandler;

import net.bytebuddy.utility.RandomString;

public class Utility {
	
	
	
	public static String getdatafromexcel(int rowcount,int cellcount) throws EncryptedDocumentException, IOException {

		 FileInputStream Myfile = new FileInputStream("D:\\Excel_Study\\Excel_test1.xlsx");
			Sheet excelsheet = WorkbookFactory.create(Myfile).getSheet("zerothawithddf");
			String  data= excelsheet.getRow(rowcount).getCell(cellcount).getStringCellValue();
			
			 return data;
			 }
	
	public static void snapshot(WebDriver driver) throws IOException {
	File snap=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
	String	random=RandomString.make(3);
File dest= new File("D:\\Seleniumscreenshot\\snapshot"+random+".png");
FileHandler.copy(snap, dest);
	
	}

	
	
	
	

}
