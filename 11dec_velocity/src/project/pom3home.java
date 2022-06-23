package project;



import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.Reporter;

public class pom3home {
	
	@FindBy(xpath="//h1[@class='page-title big']")private WebElement titlename;
@FindBy(xpath="//span[@class='user-id']")private WebElement userId;
@FindBy(xpath="//*[@id=\"app\"]/div[1]/div/div[2]/div[1]//a") private List<WebElement> Totalmodule;


 public pom3home(WebDriver driver) {
	 PageFactory.initElements(driver,this);
	 
 } 
	 public void hometitlename() {
String actulname = titlename .getText()	;
 String expectedname="Hi, Ajinkya";
 Assert.assertEquals( actulname, expectedname,"not matching home page name");
 }
	 public void homeuserid(String homeid) {
		 String actualid = userId.getText();
		 String expectedid=homeid;
		 Assert.assertEquals(actualid, expectedid,"not matching home id");
		
	 }
	public void modules() {
		int size = Totalmodule.size();
		System.out.println("module names from homepage"+size);
		for(WebElement w:Totalmodule) {
			 String name=w.getText();
			System.out.println("Name of modules"+name);
		}
		
	}
	 
 }

