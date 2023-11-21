package myWork;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.InvalidSelectorException;
import org.openqa.selenium.NoAlertPresentException;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.NoSuchFrameException;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class MyMethod {
public static	WebDriver driver;

public static void lounchbrowser() {
		
		System.setProperty("webdriver.chrome.driver", "driver//chromedriver.exe");
		ChromeOptions option =  new ChromeOptions();
		option.addArguments("--remote-allow-origins=*");
		driver =  new ChromeDriver(option);
		driver.get("http://localhost:8888/");

	}

   
     
     
     ///*********************************************************************************
  
     public static WebElement myFindElement(String xpath, String ElementName) {
    	 WebElement we = null;
    	 try {
    	    	we= driver.findElement(By.xpath(xpath));

			
		} catch (NoSuchElementException e) {
			WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10000));
			wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.xpath(xpath))));
	    	we= driver.findElement(By.xpath(xpath));

		}catch (InvalidSelectorException e) {
			System.out.println(ElementName+"Somthing is in xpath sentex");
		}catch (Exception e) {
			throw e;
		}
    	 return we;
     }
     
     ///***************************************************************************
     
public static void mySendKeys(String xpath,String sendValue,String ElementName) {
	WebElement we = myFindElement(xpath, ElementName);
	try {
		we.sendKeys(sendValue);

	} catch (StaleElementReferenceException e)  {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(1000));
		wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.xpath(xpath))));
		we.sendKeys(sendValue);

	}catch (Exception e) {
		throw e;
	}}
//************************************************************************************
	
	
public static void myClick(String xpath,String ElementName) {
	WebElement we = myFindElement(xpath, ElementName);

	try {
		we.click();
		System.out.println("Click on "+ElementName+ "is done");

	} catch (StaleElementReferenceException e) {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(1000));
		wait.until(ExpectedConditions.visibilityOf(we));
		we.click();

	}catch (Exception e) {
		throw e;
	}
}

//**********************************************************************************

public static String MyValueByAtrebutte(String xpath,String ElementName, String AtributteName) {
	WebElement we = myFindElement(xpath, ElementName);
	String value ;
	try {
	 value = we.getAttribute(AtributteName);
	
	}catch(Exception e){
		throw e;
	}
	return value;
	
}

//**********************************************************************************

public static String MyInnertextByGetTextMethod(String xpath,String ElementName) {
	WebElement we = myFindElement(xpath, ElementName);
	String str;
	
	try {
      str= we.getText();


	}catch(Exception e){
throw e;
	}
	
	
return str;
}




//	*******************************************************************************
public static void MyHandleDropDownMethod (String xpath,String ElementName,int value) {
	WebElement we=myFindElement(xpath,ElementName);
	Select selobj = new Select(we);
	try {
	selobj.selectByIndex(value);
	System.out.println("if select the value by idex number the test case pass");
	
	}catch(Exception e) {	
	throw e;
	
	
}}
//**********************************************************************************	
public static void selectByValueMethod (String xpath,String ElementName,String Name) {
	WebElement we=myFindElement(xpath,ElementName);
	Select selobj = new Select(we);
	try {
	selobj.selectByValue(Name);
	System.out.println(Name +"if select the value then test case pass");
	}catch(Exception e){
throw e;
}}
//**********************************************************************************

public static void SelectVisibleMethod(String xpath,String ElementName,String Name) {
	WebElement we=myFindElement(xpath,ElementName);
	Select selobj = new Select(we);
	try {
	selobj.selectByVisibleText(Name);
	System.out.println("if select the value by visiable in text box the it pass");
	}catch(Exception e) {
	throw e;	
	}
	
}

//************************************************************************************

public static void MygetOptionMethod(String xpath,String ElementName,String Name) {
	WebElement we=myFindElement( xpath, ElementName);
	
	Select selobj = new Select(we);
	try {
	selobj.getFirstSelectedOption();
}catch(Exception e){
System.out.println("if select frist value then test case is pass");	
}}

//**********************************************************************************
public static ArrayList<String> MygetCountMethod (String xpath,String ElementName) {
     WebElement we = myFindElement(xpath, ElementName);
	Select selobj = new Select(we);
	ArrayList<String> arr = new ArrayList<String>();
	try {
	List<WebElement> opt = selobj.getOptions();
	
	for (WebElement weOpt : opt) {
		arr.add(weOpt.getText());
	}	
	}catch(Exception e){
	throw e;	
	
	}	
return arr;

}

//***********************************************************************************

public static void MyDragAndDropMethod(String source,String target,String ElementName) {
	WebElement we=myFindElement(source, ElementName);
	WebElement wei=myFindElement(target, ElementName);
	
    Actions actobj = new Actions(driver);
    try {
    actobj.clickAndHold(we).moveToElement(wei).release().build().perform();
System.out.println("elementdrop");
}catch(Exception e) {
throw e;	
	
}}
//**********************************************************************************
public static void mouseHover(String xpath,String ElementName) {
	WebElement we=myFindElement(xpath,ElementName);
       Actions actobj = new Actions(driver);
       try {
       actobj.moveToElement(we).click().build().perform();
}catch(Exception e) {
	System.out.println("if mouse over is done test case is select");
	
}}
  //**********************************************************************************
  public static void MySendKeysByActionCLass(String xpath,String ElementName,String interValue) {
	  WebElement we=myFindElement(xpath,ElementName);
      Actions actobj = new Actions(driver);
      try {
      actobj.sendKeys(we, interValue).build().perform();
      }catch(Exception e) {
    	  throw e;
      }
  }
  //************************************************************************************
 public static void MyDoubleClickMethod(String xpath,String ElementName) {
	WebElement we=myFindElement(xpath,ElementName);
      Actions actobj = new Actions(driver);
      try {
      actobj.doubleClick(we).build().perform();
 }catch(Exception e) {
    throw e; 
    
    
}
 }
 //**************************************************************************************************
 
 
 
public static void MyWindowHandleMethod(String xpath,String ElementName) {
	 WebElement we=myFindElement(xpath,ElementName);
	 
	 try {
	 String winhandl = driver.getWindowHandle();
	System.out.println(winhandl);
    }catch(Exception e){
     throw e;



}}
//****************************************************************************************************
public static void MyPopAlertAcceptMethod(String alertNName) {
	try {
	 driver.switchTo().alert().accept();
	}catch(NoAlertPresentException e){
		System.out.println("there is no alert value");
	}catch(Exception e){
    throw e;

}}

//*******************************************************************************************************

public static void MyPopUpDissmissMethod(String alertNName) {
	try {
	driver.switchTo().alert().dismiss();
}catch(NoAlertPresentException e) {
	System.out.println("when alert class is dissmiss then it's pass");
}catch(Exception e) {

throw e;

}}
//******************************************************************************************************

public static void MyPopUpSendKeyMethod(String value,String alertNName) {
	
	try {
	driver.switchTo().alert().sendKeys(value);
	System.out.println("value send in textbox");
	
	}catch(NoAlertPresentException e){
		System.out.println("enter the value text box");
	}catch(Exception e) {
		throw e;
		
	}
	
}	
//******************************************************************************************************
public static void MygetTexByAlertMethod(String alertNName) {
	
	try {
	String getF = driver.switchTo().alert().getText();
}catch(NoAlertPresentException e) {
	
	System.out.println("get the value by alert");
	
}catch(Exception e) {
	
	throw e;
}

}
//***************************************************************************************************
public static void MyFremMethodName(int num) {
	
	try {
   driver.switchTo().frame(num);
}catch(NoSuchFrameException e) {
	System.out.println("There is no frame");

}catch(Exception e){
	throw e;
}}

//***************************************************************************************************
public static void MyFrameStringName(String FrameName ) {
	
	try {
driver.switchTo().frame(FrameName);

	}catch(NoSuchFrameException e) {
		System.out.println("There is enter the frameName");

	}catch(Exception e){
		throw e;


	}}
//*********************************************************************************************************

public static void MyFramWebElementMethod(String xpath, String ElementName) {
	
	 WebElement we=myFindElement(xpath,ElementName);

	try {
	driver.switchTo().frame(we);
	
   }catch(NoSuchFrameException e) {
	System.out.println("Inter the value By frame");
     }catch(Exception e) {
	
	throw e;
	
  }}
//****************************************************************************************************
public static void MySwicthToMainPageMethod() {
	
	
	try {
	driver.switchTo().defaultContent();
	
	}catch(NoAlertPresentException e) {	
	System.out.println("return the main frame");
	
}catch(Exception e) {
	throw e;
}
}


public static String MyAttibuteMrthod(String xpath,String ElementName,String AttributeName) {
WebElement we =	myFindElement(xpath,ElementName);

String valueAttribute=null;

try {
 valueAttribute = we.getAttribute(AttributeName);
	
	
}catch(Exception e) {
	throw e;
}

return valueAttribute;
	
}



	

}






	


