package TAmil;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.server.handler.GetAllWindowHandles;

public class Windowhandler {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\vcred\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://www.leafground.com/pages/Window.html");
	//1.	 
		WebElement oldwindow = driver.findElement(By.id("home"));
		oldwindow.click();
	//2.	 
		WebElement firstwindow = driver.findElement(By.xpath("//*[@id=\"contentblock\"]/section/div[2]/div/div/button"));
		firstwindow.click();
	Set<String> handle =	driver.getWindowHandles();
for (String newWindow : handle) {
	driver.switchTo().window(newWindow); 
}
WebElement editbox= driver.findElement(By.xpath("//*[@id=\"post-153\"]/div[2]/div/ul/li[1]/a/img"));
	editbox.click();
	driver.close();
	driver.switchTo().defaultContent();
	WebElement multiplewindows = driver.findElement(By.xpath("//*[@id=\"contentblock\"]/section/div[2]/div/div/button"));
	multiplewindows.click();
	
	int numberofwindows=driver.getWindowHandles().size();
	System.out.println("No.of windows opened:"+ numberofwindows);
	WebElement dontcloseme = driver.findElement(By.id("colour"));
	dontcloseme.click();
	Set<String> newwindowHandles =driver.getWindowHandles();
	for(String allwindows : newwindowHandles) {
		if(!allwindows.equals(oldwindow)) {
			driver.switchTo().window(allwindows);
			driver.close();
			
		}
	}
	
	}

}
