package ZerothaUsingPOM;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class POM2zerothaPinPage {

	//declaration
	@FindBy(xpath="//input[@type='password']") private WebElement pin;
	
	@FindBy(xpath="//button[@type='submit']")private WebElement continueButton;
	
	//initialization
public	POM2zerothaPinPage (WebDriver driver){
		
		PageFactory.initElements(driver,this);
	}
	
	//usage
	public void enterPin(String epin) {
		
	 pin.sendKeys(epin);
	 
	}
	public void submitbutton() {
		continueButton.click();
	}
}
