package framework;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class POM4newUser {

//	declaration
	
	@FindBy(xpath="//a[text()='Change user']") private WebElement changeUser;
	
	//
	public  POM4newUser(WebDriver driver){
		PageFactory.initElements(driver, this);
	}
	
	//
	public void  clickOnChangeUser() {
		changeUser.click();
	}
}
