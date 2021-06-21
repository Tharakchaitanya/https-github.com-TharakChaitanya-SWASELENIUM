package TAmil;

import org.openqa.selenium.By;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Buttons {
Actions action;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\vcred\\Downloads\\chromedriver_win32 (2)\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://www.leafground.com/pages/Button.html");
//driver.manage().window().maximize();
	//2
		WebElement position= driver.findElement(By.id("position"));
		Point xypoint = position.getLocation();
		int x=xypoint.getX();
		int y=xypoint.getY();
		System.out.println("x value is" + x+ "y value is" + y);
	//3
		WebElement color =driver.findElement(By.id("color"));
	String str=	color.getCssValue("background-color");
	System.out.println(str);
	//4
	WebElement size=driver.findElement(By.id("size"));
	 int h=size.getSize().getHeight();
	int w=size.getSize().getWidth();
	System.out.println("size are" + h +"size is" + w);
	
	
		
		
	}

}
