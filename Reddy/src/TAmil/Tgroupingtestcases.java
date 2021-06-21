package TAmil;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeSuite;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterSuite;

public class Tgroupingtestcases {
	 public WebDriver driver;
	
	
  @Test(groups= {"apple"})
  public void apple1() {
  System.out.println("Apple testing");
  }
  @Test(groups= {"apple"})
  public void apple2() {
	  System.out.println("Apple Tesing");}
	 @Test(groups= {"moto"})
	 public void moto1() {
		  System.out.println("Moto testing");
	  }
	 @Test(groups= {"moto"})
	 public void moto2() {
	 System.out.println("moto tesing");
	 }
  @BeforeSuite
  public void beforeSuite() {
	  System.setProperty("webdriver.chrome.driver","C:\\Users\\vcred\\Downloads\\chromedriver_win32 (2)\\chromedriver.exe");
	  driver = new ChromeDriver();
  }

  @AfterSuite
  public void afterSuite() {
  }

}
