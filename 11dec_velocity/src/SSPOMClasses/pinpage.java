package SSPOMClasses;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

public class pinpage {
	//declaration
		@FindBy(xpath="//input[@type='password']") private WebElement pin;
		
		@FindBy(xpath="//button[@type='submit']")private WebElement continueButton;
	@FindBy(xpath="//div[@class='form-header text-center']")private WebElement title;
		
		//initialization
	public	pinpage (WebDriver driver){
			PageFactory.initElements(driver,this);}


	public void log_in_validate	(String status,String uid) {
	String actual = title.getText();
	String expected=uid;
	if(status.equals("valid")) {
	Assert.assertEquals(actual, expected,"data not matching!!!!");}
		
	}
	
	public void enterPin(String epin) {
		
			pin.sendKeys(epin);
		 
		}
	public void sub() {
		continueButton.click();
	}

}
