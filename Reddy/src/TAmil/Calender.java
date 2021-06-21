package TAmil;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Calender {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
System.setProperty("webdriver.gecko.driver", "C:\\\\Users\\\\vcred\\\\Downloads\\\\geckodriver-v0.29.1-win64\\\\geckodriver.exe");
		
WebDriver driver= new FirefoxDriver();
driver.get("http://www.leafground.com/pages/Calendar.html");

WebElement calender=driver.findElement(By.id("datepicker"));
calender.click();
WebElement date=driver.findElement(By.xpath("//a[contains(text(),'10')]"));
date.click();
		// if not use sendkeys
		
		
		
		
		
	}

}
