package TAmil;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alerttotal {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\vcred\\Downloads\\chromedriver_win32 (2)\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://www.leafground.com/");
driver.manage().window().maximize();
////*[@id="post-153"]/div[2]/div/ul/li[9]/a/img
////*[@id="contentblock"]/section/div[1]/div/div/button

driver.findElement(By.xpath("//*[@id=\"post-153\"]/div[2]/div/ul/li[9]/a/img")).click();
WebElement  alert1 =driver.findElement(By.xpath("//*[@id=\"contentblock\"]/section/div[1]/div/div/button"));
alert1.click();
Thread.sleep(3000);
driver.switchTo().alert().accept();
//2. confrim box
WebElement confrimalert = driver.findElement(By.xpath("//*[@id=\"contentblock\"]/section/div[2]/div/div/button"));
confrimalert.click();
driver.switchTo().alert().dismiss();
//3. promptbox
WebElement prompt = driver.findElement(By.xpath("//*[@id=\"contentblock\"]/section/div[3]/div/div/button"));
prompt.click();
driver.switchTo().alert().sendKeys("chaitu");


	}

}
