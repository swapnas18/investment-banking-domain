package ZerothaUsingPOM;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.support.FindBy;

import net.bytebuddy.utility.RandomString;

public class Snapshot {

public static void shot (WebDriver driver) throws IOException {
			
			File s=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
			 String Random = RandomString.make(2);
			 File ss=new File("D:\\Seleniumscreenshot\\zerotha"+ Random+".png");
			 FileHandler.copy(s, ss);
		
		}
		
	}

