package framework;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class POM1zerothaLogInPage {
@FindBy(id="userid")private WebElement userID;
@FindBy(id="password") private WebElement password;
@FindBy(xpath="//button[@type='submit']") private WebElement SubmitButton;

public POM1zerothaLogInPage (WebDriver driver){
	 PageFactory.initElements(driver,this);}
public void enterUserId(String UI) {
userID.sendKeys(UI);}

public void enterPassword( String pass) {
	password.sendKeys(pass);
}
public void enterSubmitButton() {
	SubmitButton.click();
}



}
