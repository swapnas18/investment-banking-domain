package selenium;
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Table_Study {

public static void main(String[] args) throws InterruptedException {
System.setProperty("webdriver.chrome.driver","D:\\chromedriver_win32\\chromedriver.exe");
WebDriver driver=new ChromeDriver();
driver.get("https://vctcpune.com/");
driver.manage().window().maximize();
Thread.sleep(200);
driver.navigate().to("https://vctcpune.com/selenium/practice.html");
Thread.sleep(200);
List <WebElement> headername = driver.findElements(By.xpath("//table[@id='product']//th"));
System.out.println("headername");
for(WebElement w:headername) {
System.out.print(w.getText() +"||");}
Thread.sleep(200);
for(int i=2;i<=11;i++) {
System.out.println();
List<WebElement> tableRow = driver.findElements(By.xpath("//table//tbody//tr["+i+"]//td"));
for(WebElement w:tableRow) {
System.out.print(w.getText() + " ||");



 }}}}
