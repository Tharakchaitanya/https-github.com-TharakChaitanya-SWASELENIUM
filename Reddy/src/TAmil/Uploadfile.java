package TAmil;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;

import javax.tools.Tool;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Uploadfile {

	public static void main(String[] args) throws AWTException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\vcred\\Downloads\\geckodriver-v0.29.1-win64\\geckodriver.exe");

		WebDriver driver = new FirefoxDriver();
		driver.get("http://www.leafground.com/pages/upload.html");
WebElement uploadfile=driver.findElement(By.name("filename"));
 uploadfile.click();
		String file="C:\\Users\\vcred\\Downloads\\testleaf.xlsx";
		StringSelection selection = new StringSelection(file);
		Toolkit.getDefaultToolkit().getSystemClipboard()
		.setContents(selection, null);
		
		Robot robot= new Robot();
		robot.keyPress(KeyEvent.VK_CONTROL);
		robot.keyPress(KeyEvent.VK_V);
		robot.keyRelease(KeyEvent.VK_V);
		robot.keyRelease(KeyEvent.VK_CONTROL);
		robot.keyPress(KeyEvent.VK_ENTER);
		robot.keyRelease(KeyEvent.VK_ENTER);
		
		
		
		
		/*String file= ("C:\\Users\\vcred\\Downloads\\testleaf.xlsx");
	StringSelection upload= new StringSelection(file);
		
		Toolkit.getDefaultToolkit().getSystemClipboard().
setContents(upload, null);
*/
}}
