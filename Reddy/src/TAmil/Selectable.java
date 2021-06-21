package TAmil;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Selectable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\vcred\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://www.leafground.com/pages/selectable.html");
		
		List<WebElement> selectable=driver.findElements(By.xpath("//*[@id=\'selectable\']/li"));
	int list = selectable.size();
	System.out.println(list);
	Actions action = new Actions(driver);
	//action.keyDown(Keys.CONTROL).click(selectable.get(1)).build().perform();
		
	//or
	
	action.click(selectable.get(6));
	action.click(selectable.get(4));
	action.build().perform();
		
		
		
		
		
		
		
		
		
		
	}

	
	}


