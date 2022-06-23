package ZerothaUsingPOM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class POM1zerothaLogInPage {
	
	
	//variable declaration
	
	@FindBy(id="userid")private WebElement userID;
@FindBy(id="password") private WebElement password;
@FindBy(xpath="//button[@type='submit']") private WebElement SubmitButton;


//make constructor for initialisation

 public POM1zerothaLogInPage (WebDriver driver){
	 PageFactory.initElements(driver,this);}

//usage
	 
	public void enterUserId(String UI) {
		userID.sendKeys(UI);
		
	}

public void enterPassword( String pass) {
	password.sendKeys(pass);
}
public void enterSubmitButton() {
	SubmitButton.click();
}



}
