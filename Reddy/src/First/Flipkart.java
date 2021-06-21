package First;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Flipkart {

public WebDriver driver;

public void openurl() {




System.setProperty("webdriver.chrome.driver", "C:\\Users\\vcred\\Downloads\\chromedriver_win32\\chromedriver.exe");
driver = new ChromeDriver();
driver.get("https://www.flipkart.com/");

}

public void login() {

driver.findElement(By.linkText("Login")).click();
                     
driver.findElement(By.xpath("/html/body/div[2]/div/div/div/div/div[2]/div/form/div[1]/input")).sendKeys("v.c.reddy112@gmail.com");

driver.findElement(By.xpath("/html/body/div[2]/div/div/div/div/div[2]/div/form/div[2]/input")).sendKeys("");

driver.findElement(By.xpath("/html/body/div[2]/div/div/div/div/div[2]/div/form/div[4]/button")).click();


}

public void logout() {

driver.close();

}

public static void main(String[] args) {

Flipkart r = new Flipkart();
r.openurl();
r.login();
r.logout();

}




	}


