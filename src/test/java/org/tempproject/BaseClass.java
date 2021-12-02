package org.tempproject;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClass {
public static WebDriver driver;
	
	public static void launchchrome() {
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
	}
	public static void loadurl(String url) {
		driver.get(url);

	}
	public static void winmax() {
		  driver.manage().window().maximize();	
		}
	public static void printtitle() {
		String title = driver.getTitle();
		System.out.println(title);

	}
	public static void printcurrenturl() {
		String currentUrl = driver.getCurrentUrl();
		System.out.println(currentUrl);
	}
	public static void fill(WebElement loc,String value) {
		loc.sendKeys(value);
	}
	public static void click(WebElement loc) {
		loc.click();
	

	}
	public static void rightclick(WebElement loc) {
		Actions a = new Actions(driver);
		a.contextClick(loc).perform();
	}
	public static void doubleclick(WebElement loc) {
		Actions a = new Actions(driver);
		a.doubleClick(loc).perform();
	}
	public static void draganddrop(WebElement source, WebElement target) {
		Actions a = new Actions(driver);
		a.dragAndDrop(source, target).perform();
		
	}
	public static void pressenter() throws AWTException {
		Robot r =new Robot();
		r.keyPress(KeyEvent.VK_ENTER);
	
	}
	public static void keyrelease() throws AWTException {
		Robot r =new Robot();
		r.keyRelease(KeyEvent.VK_ENTER);
		

	}
	public static void keyup () throws AWTException {
		Robot r =new Robot();
		r.keyPress(KeyEvent.VK_DOWN);
		r.keyRelease(KeyEvent.VK_DOWN);
		
	}
	public static void alertaccept() {
	
	  Alert a = driver.switchTo().alert();
	  a.accept();
		
	}
	public static void alerdismiss() {
		 Alert a = driver.switchTo().alert();
		 a.dismiss();
		 
		
	}
	public static void selectbyvalue() {
	
	
		WebElement dropdown = null;
		Select s = new Select(dropdown);
		s.selectByValue("string");
		
		
		

	}
	
	
	
}

	



	
	
	


