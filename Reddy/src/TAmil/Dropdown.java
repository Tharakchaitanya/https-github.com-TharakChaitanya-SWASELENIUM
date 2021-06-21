package TAmil;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import org.openqa.selenium.support.ui.Select;

public class Dropdown {

	public static void main(String[] args) throws InterruptedException {
		

		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\vcred\\Downloads\\chromedriver_win32 (2)\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://www.leafground.com/pages/Dropdown.html");
driver.manage().window().maximize();

WebElement dropdown =driver.findElement(By.id("dropdown1"));
Select select=  new Select(dropdown);
select.selectByIndex(4);
Thread.sleep(3000);
select.selectByValue("2");
Thread.sleep(3000);
select.selectByVisibleText("Appium");
List<WebElement> listofoptions = select.getOptions();
int size =listofoptions.size();
System.out.println("no.of Elements" +size);
//last
WebElement multiselect= driver.findElement(By.xpath("//*[@id='contentblock']/section/div[6]/select"));
Select multi= new Select(multiselect);
multi.selectByIndex(1-4);



	}

}
