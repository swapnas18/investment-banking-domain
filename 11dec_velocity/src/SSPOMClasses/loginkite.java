package SSPOMClasses;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class loginkite {

	
	@FindBy(id="userid")private WebElement userID;
	@FindBy(id="password") private WebElement password;
	@FindBy(xpath="//button[@type='submit']") private WebElement SubmitButton;
	@FindBy(xpath="//*[@id=\"container\"]/div/div/div/form/p[1]") private WebElement uiandpasswrong;
	@FindBy(xpath="//span[text()='User ID should be minimum 6 characters.']")private WebElement userErrormsg;
	@FindBy(xpath="//span[text()='Password should be minimum 6 characters.']")private WebElement passErrormsg;
	@FindBy(xpath="//p[@class='error text-center']")private WebElement Wrongpassuser;
 public  loginkite (WebDriver driver){
 PageFactory.initElements(driver,this);}
	
public void id(String UI) {
userID.sendKeys(UI);
}
 
 
public void Verifypass(String pass) throws InterruptedException {
		password.sendKeys(pass);		

	}
public void submit() {
	SubmitButton.click();
}public String useridcheck() {
	String ActualuserError =  userErrormsg.getText();
	
	return ActualuserError ;
	
}
	public String Erroruseeridmsg() {
		String ActualuserError =  userErrormsg.getText();
		
		return ActualuserError ;
		
	}
	public String errorpassmsg() {
		String Actualerror = passErrormsg.getText();
		return Actualerror;
	}
	public String uiandpasswrong() {
		
		String actual=Wrongpassuser.getText();
		return actual;
	}
}

