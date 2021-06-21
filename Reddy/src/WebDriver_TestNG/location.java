package WebDriver_TestNG;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
public class location {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
 
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\vcred\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://www.leafground.com/home.html");
driver.manage().window().maximize();

driver.findElement(By.xpath("//*[@id=\"post-153\"]/div[2]/div/ul/li[2]/a/img")).click();
WebElement getposition =driver.findElement(By.id("position"));
Point xyvalue =getposition.getLocation();
 int x= xyvalue.getX();
 int y= xyvalue.getY();
 System.out.println("X is" + x+ "Y is" + y);
 
 WebElement backgroundcolour = driver.findElement(By.id("color"));
String colour = backgroundcolour.getCssValue("background-color");
System.out.println(colour);

//size
WebElement totalsize = driver.findElement(By.id("size"));
int height = totalsize.getSize().getHeight();
int weidth = totalsize.getSize().getWidth();
		System.out.println("height is" +height+ "weidth is" +weidth);
		
	//close
		driver.findElement(By.id("home")).click();
		
		
		
		
		
		
		
		
		
	}

}
