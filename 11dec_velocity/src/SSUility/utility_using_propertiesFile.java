package SSUility;

import java.io.File;
import java.io.FileInputStream;

import java.io.IOException;
import java.util.Properties;


import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.io.FileHandler;

public class utility_using_propertiesFile {

	
		 public static void screenshot(WebDriver driver,int shotno) throws IOException {
		File snap=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		File dest= new File("D:\\Seleniumscreenshot\\"+shotno+"snapshot.png");
		FileHandler.copy(snap, dest);
		
		 }

		 public static String getData(String key) throws IOException {
	 Properties p= new Properties();
  FileInputStream Myfile = new FileInputStream("C:\\Users\\Abhijit shinde\\eclipse-workspace\\11dec_velocity\\store.properties");
       p.load(Myfile);
       String data=p.getProperty(key);
         return data;
				
			 
		 }}
		