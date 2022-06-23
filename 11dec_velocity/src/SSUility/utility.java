package SSUility;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.io.FileHandler;

import net.bytebuddy.utility.RandomString;

public class utility {
	
	public static String FetchDatafromfile(int row,int cell) throws EncryptedDocumentException, IOException {
		String data;
		FileInputStream Myfile = new FileInputStream("D:\\Excel_Study\\Excel_test1.xlsx");
		Sheet excelsheet = WorkbookFactory.create(Myfile).getSheet("zerothawithddf");
		try {
			 data = excelsheet.getRow(row).getCell(cell).getStringCellValue();
			
		} catch (Exception e) {
			data="";
		}
		
		return data;
		}
	
	public static void snapshot(WebDriver driver) throws IOException {
		File snap=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		String	random=RandomString.make(3);
	File dest= new File("D:\\Seleniumscreenshot\\snapshot"+random+".png");
	FileHandler.copy(snap, dest);
		
	
	}
}
