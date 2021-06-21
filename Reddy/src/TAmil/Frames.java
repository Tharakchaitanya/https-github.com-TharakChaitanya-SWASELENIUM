package TAmil;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Frames {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\vcred\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://www.leafground.com/pages/frame.html");
		
		driver.switchTo().frame(0);
		WebElement button1=driver.findElement(By.id("Click"));
		button1.click();
		
	String text= 	driver.findElement(By.id("Click")).getText();
		System.out.println(text);
		//2nd frame
		
		driver.switchTo().defaultContent();
		driver.switchTo().frame(1);
		driver.switchTo().frame("frame2");
	WebElement button2=	driver.findElement(By.id("Click1"));
		button2.click();
		List<WebElement> number=	driver.findElements(By.tagName("iframe"));
		//3
		driver.switchTo().defaultContent();
		List<WebElement> total= driver.findElements(By.tagName("iframe"));
	int number1=total.size();
		System.out.println(number1);
		
		
		
		
	}

}
