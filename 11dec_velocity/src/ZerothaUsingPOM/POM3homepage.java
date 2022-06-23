package ZerothaUsingPOM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class POM3homepage {

		//declaration
		@FindBy(xpath="//span[@class='user-id']") private WebElement showingIdonhomepage;
		@FindBy(xpath="//span[@class='user-id']") private WebElement clickOnUserId;
		
		@FindBy(xpath="//a[@target='_self']")private WebElement clickOnLogOut;
		
		//initiation
		
	public	POM3homepage(WebDriver driver){
	PageFactory.initElements(driver,this);
	}
		
// usage
	public void idfromhomepage(String id) {
		String expectedString = id;
		String actualresult = showingIdonhomepage.getText()
;			
			if(actualresult.equals(expectedString))
				System.out.println("Test passed !!!!");
			else
				System.out.println("Test failed");
			
		}
		
		public void clickOnShowingId() {
			clickOnUserId.click();
		}
public void clickOnlogOutButton() {
	clickOnLogOut.click();
}

}


