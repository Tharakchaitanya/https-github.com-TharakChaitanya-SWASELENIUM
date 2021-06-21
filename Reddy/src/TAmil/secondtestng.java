package TAmil;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeSuite;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterSuite;

public class secondtestng {
  WebDriver driver;
  long starttime;
  
  
 
  @BeforeSuite
  public void beforeSuite() {
	  System.setProperty("webdriver.gecko.driver", "C:\\Users\\vcred\\Downloads\\geckodriver-v0.29.1-win64\\geckodriver.exe");
	  driver= new FirefoxDriver();
	  starttime= System.currentTimeMillis();
  }
  
  @Test
  public void youtubee() {
	  driver.get("https://www.youtube.com/");
 System.out.println("youtube opened"); }
  
  @AfterSuite
  public void afterSuite() {
	  driver.quit();
  }

}
