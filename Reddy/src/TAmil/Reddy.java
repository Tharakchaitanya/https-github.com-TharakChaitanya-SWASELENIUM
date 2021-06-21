package TAmil;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.Alert;
public class Reddy {

	public static void main(String[] args) {
		//System.setProperty("webdriver.chrome.driver", "C:\\Users\\vcred\\Downloads\\chromedriver_win32\\chromedriver.exe");
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\vcred\\Downloads\\geckodriver-v0.29.1-win64\\geckodriver.exe");
//WebDriver driver= new ChromeDriver();

		WebDriver driver = new FirefoxDriver();
	driver.get("http://www.leafground.com/pages/autoComplete.html");
	 WebElement input=driver.findElement(By.id("tags"));
	 input.sendKeys("s");
	
	 List<WebElement> list=	driver.findElements(By.xpath("//*[@id=\'ui-id-1\']"));
		System.out.println(list.size());
	
	
	
/*	for (WebElement webElement : list) {
		if(webElement.getText().equals("Web Services"));
			webElement.click();
			System.out.println("If part");
			break;
	*/
	}

	
	}