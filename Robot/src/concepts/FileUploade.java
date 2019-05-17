package concepts;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.firefox.FirefoxDriver;

public class FileUploade {

	public static void main(String[] args) throws InterruptedException, AWTException 
	{
	System.setProperty("webdriver.gecko.driver", "D:\\selenium\\geckodriver.exe");
	FirefoxDriver driver=new FirefoxDriver();
	driver.get("https://www.google.com/");
	driver.findElement(By.id("lst-ib")).sendKeys("online doc to pdf converter",Keys.ENTER);
	Thread.sleep(2000);
	driver.findElement(By.linkText("Save DOC files (Word) as PDF online & free - Online PDF Converter")).click();
	Thread.sleep(5000);
	driver.findElement(By.xpath("//button[@class='browse_button']")).click();
	Thread.sleep(2000);
	Robot robot=new Robot();
	StringSelection str=new StringSelection("C:\\Users\\Priojit\\Desktop\\test.docx");
	Toolkit.getDefaultToolkit().getSystemClipboard().setContents(str, null);
	
	robot.keyPress(KeyEvent.VK_CONTROL);
	robot.keyPress(KeyEvent.VK_V);
	robot.keyRelease(KeyEvent.VK_CONTROL);
	robot.keyRelease(KeyEvent.VK_V);
	
	robot.keyPress(KeyEvent.VK_ENTER);
	Thread.sleep(2000);
	driver.findElement(By.xpath("//button[@class='convert_button']")).click();
	Thread.sleep(4000);
	robot.keyPress(KeyEvent.VK_TAB);
	robot.keyRelease(KeyEvent.VK_TAB);
	robot.setAutoDelay(2000);
	robot.keyPress(KeyEvent.VK_TAB);
	robot.keyRelease(KeyEvent.VK_TAB);
	robot.setAutoDelay(2000);
	robot.keyPress(KeyEvent.VK_TAB);
	robot.keyRelease(KeyEvent.VK_TAB);
	robot.setAutoDelay(2000);
	robot.keyPress(KeyEvent.VK_TAB);
	robot.keyRelease(KeyEvent.VK_TAB);
	robot.setAutoDelay(2000);
	
	robot.keyPress(KeyEvent.VK_ENTER);
	
	
	}

}
