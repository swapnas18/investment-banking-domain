package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class list_box {

	public static void main(String[] args) throws InterruptedException {
	
		System.setProperty("webdriver.chrome.driver","D:\\chromedriver_win32\\chromedriver.exe");
	WebDriver	driver=new ChromeDriver();
	driver.get("https://www.facebook.com/");
	Thread.sleep(200);
	driver.manage().window().maximize();
WebElement gettext1 = driver.findElement(By.xpath("//h2[text()='Facebook helps you connect and share with the people in your life.']"));
	String result=gettext1.getText();
	System.out.println(result);
	String result1="Facebook helps you connect and share with the people in your life.";
if(result.equals(result1)) {
		System.out.println("test case pass");//gettext methodcomplete
driver.findElement(By.xpath("(//a[@role='button'])[2]")).click();
Thread.sleep(2000);
	WebElement selected = driver.findElement(By.xpath("//input[@value='1']"));	
//	selected.click();
	//System.out.println(" click on "+ selected);
	boolean result2=selected.isSelected();	
	if(result2) {
		System.out.println("check box allredy selected");
	}else {
		System.out.println(" check box not selected");
		selected.click();
		Thread.sleep(200);
		boolean result3=selected.isSelected();
		System.out.println("updated  check box selected "+ result3);}Thread.sleep(200);//isselected method complete
		
	WebElement selectdate = driver.findElement(By.name("birthday_day"));
	selectdate.click();Thread.sleep(200);
	Select ss=new Select(selectdate);
	ss.selectByValue("18");
	WebElement selectmonth = driver.findElement(By.name("birthday_month"));
	selectdate.submit();Thread.sleep(200);
	Select ss2=new Select(selectmonth);
	ss2.selectByVisibleText("Sep");
	WebElement selectyear = driver.findElement(By.name("birthday_year"));
	selectdate.click();Thread.sleep(200);
	Select ss3=new Select(selectyear);
	ss3.selectByVisibleText("1998");Thread.sleep(200);
	driver.findElement(By.xpath("//input[@name='firstname']")).sendKeys("sapna");Thread.sleep(200);
	driver.findElement(By.xpath("//input[@name='lastname']")).sendKeys("shinde");Thread.sleep(200);
	driver.findElement(By.xpath("//input[@name='reg_email__']")).sendKeys("sapna@123gmail.com");	Thread.sleep(200);
	driver.findElement(By.xpath("//input[@name='reg_passwd__']")).sendKeys("21313131");	
		
		

	}}}


