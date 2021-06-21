package TAmil;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Images {

	public static void main(String[] args) {
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\vcred\\Downloads\\geckodriver-v0.29.1-win64\\geckodriver.exe");

		WebDriver driver = new FirefoxDriver();
		driver.get("http://www.leafground.com/pages/Image.html");
WebElement brokenimage=driver.findElement(By.xpath("/html/body/div/div/div[3]/section/div[2]/div/div/img"));
 brokenimage.click();
	if(brokenimage.getAttribute("naturalWidth").equals("0")) {
	System.out.println("image broken");
	}else {
		System.out.println("image good");
	
	}
	
	
	}

}
