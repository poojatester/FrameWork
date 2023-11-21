package Collection_by_myMethod;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.ElementClickInterceptedException;
import org.openqa.selenium.ElementNotInteractableException;
import org.openqa.selenium.InvalidSelectorException;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class My_ganric_Method {
public static WebDriver driver;

public static void browserLounch(String url) {
	System.setProperty("webdriver.chrome.driver", "driver//chromedriver.exe");
	ChromeOptions option  = new ChromeOptions();
	option.addArguments("--remote-allow-origins=*");
     driver = new ChromeDriver(option);
     driver.get(url);
	
}
public static WebElement  MyfindElement(String xpathvalue,String Elementname) {
	WebElement we = null;
try {	
  we=driver.findElement(By.xpath(xpathvalue));

}catch(NoSuchElementException e){
	 WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(1000));
	 wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.xpath(xpathvalue))));
	we= driver.findElement(By.xpath(xpathvalue));

}catch(InvalidSelectorException e){
	System.out.println("there are invalid syntex in xpath");
	
}catch(Exception e){
	throw e;
}
return we;
}

//************************************************************************************
public static void Mysendkey(WebElement we, String sendkeyValue) {
	try {
	we.sendKeys(sendkeyValue);
	}catch(StaleElementReferenceException e){
		
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(60));
		 wait.until(ExpectedConditions.visibilityOf(we));	
		 we.sendKeys(sendkeyValue);
}catch(ElementNotInteractableException e) {
	WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(60));
	 wait.until(ExpectedConditions.visibilityOf(we));
	 Actions actobj  =	 new Actions(driver);
	 actobj.sendKeys(we,sendkeyValue);
}catch(Exception e) {
	throw e;
}}
	
	//**************************************************************************************************

public static void MyclickMethod(WebElement we ,String clickElement) {
	try {
    we.click();		
	}catch(StaleElementReferenceException e) {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(60));
		 wait.until(ExpectedConditions.visibilityOf(we));
		 we.click();
		 
		
	}catch(ElementClickInterceptedException e){
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(1000));
		 wait.until(ExpectedConditions.visibilityOf(we));
		 Actions obj=	 new Actions(driver);
		 obj.click(we).build().perform();
		 
	}catch(Exception e) {
		try {
			JavascriptExecutor javascript =(JavascriptExecutor)driver;
			javascript.executeScript("arguments[0].click", we);
		} catch (Exception e2) {
			throw e2;
		}
		
			 
		 
		 
	}
	}}
