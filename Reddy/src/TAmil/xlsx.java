package TAmil;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class xlsx {

	public static void main(String[] args) throws  ClassNotFoundException, IOException, InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\vcred\\Downloads\\\\chromedriver_win32 (2)\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/");
File src= new File("C:\\Users\\vcred\\OneDrive\\Desktop\\loo.xlsx");
FileInputStream input= new FileInputStream(src);
XSSFWorkbook wb= new XSSFWorkbook(input);
XSSFSheet s= wb.getSheetAt(0);
Thread.sleep(1000);
String username= s.getRow(0).getCell(0).getStringCellValue();
System.out.println(username);
driver.findElement(By.name("txtUsername")).sendKeys(username);
Thread.sleep(1000);
//
String password=s.getRow(0).getCell(1).getStringCellValue();
System.out.println(password);
driver.findElement(By.name("txtPassword")).sendKeys(password);
//
Thread.sleep(1000);
//String click=s.getRow(0).getCell(2).getStringCellValue();
//System.out.println(click);
driver.findElement(By.id("btnLogin")).click();






		
		
	}

}
