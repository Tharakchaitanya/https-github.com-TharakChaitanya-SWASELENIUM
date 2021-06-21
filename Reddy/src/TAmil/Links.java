package TAmil;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Links {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\vcred\\Downloads\\geckodriver-v0.29.1-win64\\geckodriver.exe");

		WebDriver driver = new FirefoxDriver();
		driver.get("http://www.leafground.com/pages/Link.html");
WebElement withoutclick=driver.findElement(By.partialLinkText("Find where"));
String click1=withoutclick.getAttribute("href");
 System.out.println("where the link is going" + click1 );
 //verify broken
 WebElement broken= driver.findElement(By.partialLinkText("Verify am"));
 broken.click();
String title= driver.getTitle();
 if(title.contains("404")) {
	 System.out.println("link is broken");
 }
 //3
 driver.navigate().back();
 List<WebElement> total=driver.findElements(By.tagName("a"));
int all= total.size();
 System.out.println("no.of links are:" + all  );
 
 
 
 
 
 
 
 }
 
 
 
 
	
}

