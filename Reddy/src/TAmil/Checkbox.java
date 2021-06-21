package TAmil;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Checkbox {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\vcred\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://www.leafground.com/pages/checkbox.html");
		
	for(int i=1;i <=5 ; i++) {
		
	
			
		
	WebElement option1 = driver.findElement(By.xpath("//*[@id=\"contentblock\"]/section/div[1]/div["+i+"]/input"));
	option1.click();
	
	}
	for(int i=1; i<=4; i++)
	{
	
		WebElement lastoptions= driver.findElement(By.xpath("//*[@id='contentblock']/section/div[4]/div["+i+"]/input"));
	 lastoptions.click();
	}
	WebElement sele= driver.findElement(By.xpath("//*[@id=\"contentblock\"]/section/div[2]/div/input"));
	boolean seleselected= sele.isSelected();
	System.out.println(seleselected);
	WebElement firstElement = driver.findElement(By.xpath(""));
	if(firstElement.isSelected()) {
	firstElement.click();
	}
	}
}

