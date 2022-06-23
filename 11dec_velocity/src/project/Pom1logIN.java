package project;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

public class Pom1logIN {

		
	@FindBy(id="userid")private WebElement userID;
	@FindBy(id="password") private WebElement password;
	@FindBy(xpath="//button[@type='submit']") private WebElement SubmitButton;
	@FindBy(xpath="//*[@id=\"container\"]/div/div/div/form/p[1]") private WebElement errormsg;
	
	
	
 public  Pom1logIN (WebDriver driver){
 PageFactory.initElements(driver,this);}
	
public void id(String UI) {
userID.sendKeys(UI);
}
 
 
public void Verifypass(String pass) throws InterruptedException {
		password.sendKeys(pass);		
	SubmitButton.click();
	}
	
	public void verifyerror(String Status) {
	
	if (Status.equals("invalid")) {
	errormsg.getText().equals("Invalid username or password.");
		Assert.assertTrue(false, "invalid usename and password"); 
	}}}

