package framework;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import selenium.webelement;

public class POM5ClickonLogo {

	@FindBy(xpath="//a[@class='logo kite-logo']") private WebElement clickLogo;
	//
	
	
	public POM5ClickonLogo(WebDriver driver){
		PageFactory.initElements(driver, this);}
//
	
	
	public void logo() {
		clickLogo.click();
	}
	
	
}
