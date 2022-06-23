package framework;

import java.sql.Driver;
import java.util.Iterator;
import java.util.List;

import org.apache.poi.hssf.record.PageBreakRecord.Break;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import selenium.webelement;

public class POM3homepage {

		//declaration
		@FindBy(xpath="//span[@class='user-id']") private WebElement showingIdonhomepage;
		@FindBy(xpath="//span[@class='user-id']") private WebElement clickOnUserId;
		
		@FindBy(xpath="//a[@target='_self']")private WebElement clickOnLogOut;
		@FindBy(xpath="//input[@icon='search']")private WebElement watchlist;
		@FindBy(xpath="//ul[@class='omnisearch-results']//li")private List<WebElement> totalStock;
		//initiation
		
	public	POM3homepage(WebDriver driver){
	PageFactory.initElements(driver,this);
	}
		
// usage
	public  String POM3homepage() {
		
	String actualresult = showingIdonhomepage.getText()
;			return actualresult;
			
		}
	
	public void clickOnWatchlist(String stockName) throws InterruptedException {
		
		watchlist.sendKeys(stockName);
		//Iterator<WebElement> s = totalStock.iterator();
		Thread.sleep(3000);
		int total = totalStock.size();
		System.out.println(total);
	for(WebElement w:totalStock) {
	String	actualname = w.getText();
	System.out.println(actualname);
			}
//			if (actualname.equals(stockName)) {
//				System.out.println(actualname);
//				w.click();
//				
			
	}	
			
		
		

	
	
	
		public void clickOnShowingId() {
			clickOnUserId.click();
		}
public void clickOnlogOutButton() {
	clickOnLogOut.click();
}


}


