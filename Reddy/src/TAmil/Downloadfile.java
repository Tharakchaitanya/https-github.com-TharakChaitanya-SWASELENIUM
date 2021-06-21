package TAmil;

import java.io.File;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Downloadfile {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//System.setProperty("webdriver.chrome.driver", "C:\\Users\\vcred\\Downloads\\chromedriver_win32\\chromedriver.exe");
				System.setProperty("webdriver.gecko.driver", "C:\\Users\\vcred\\Downloads\\geckodriver-v0.29.1-win64\\geckodriver.exe");
		//WebDriver driver= new ChromeDriver();

				WebDriver driver = new FirefoxDriver();
			driver.get("http://www.leafground.com/pages/download.html");
	//1
			WebElement download=driver.findElement(By.linkText("Download"));
			download.click();
			File downloadfile = new File("C:\\Users\\vcred\\Downloads\\testleaf.xlsx\\");
		File[] file=	downloadfile.listFiles();
		for (File file2 : file) {
			if(file2.getName().equals("download.xls"));
			System.out.println("file is downloded");
		break;
	
	}	
			}
	
	}


