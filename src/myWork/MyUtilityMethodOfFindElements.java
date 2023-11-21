package myWork;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.InvalidSelectorException;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class MyUtilityMethodOfFindElements {

	private static final String ColumNuber = null;
	public static WebDriver driver;

	public static void lounchbrowser() {

		System.setProperty("webdriver.chrome.driver", "driver//chromedriver.exe");
		ChromeOptions option = new ChromeOptions();
		option.addArguments("--remote-allow-origins=*");
		driver = new ChromeDriver(option);
		// driver.get("http://localhost:8888/");

	}

//*******************************************************************************************************
	public static void myGetUrl(String url) {
		// try {
		driver.get(url);
//	     }catch (Exception e) {
//	    System.out.println("URL Format may be wrong");
		// }
	}

//******************************************************************************************************

	public static List<WebElement> MyFindElementsMthod(String xpath, String ElementName) {
		List<WebElement> weobj = null;

		try {
			weobj = MyMethod.driver.findElements(By.xpath(xpath));

		} catch (NoSuchElementException e) {
			WebDriverWait wait = new WebDriverWait(MyMethod.driver, Duration.ofSeconds(10000));
			wait.until(ExpectedConditions.visibilityOf(MyMethod.driver.findElement(By.xpath(xpath))));
			weobj = MyMethod.driver.findElements(By.xpath(xpath));

		} catch (InvalidSelectorException e) {
			System.out.println(ElementName + "Somthing is in xpath sentex");
		} catch (Exception e) {
			throw e;
		}
		return weobj;
	}

//*****************************************************************************************************	     

	public static WebElement myFindElement(String xpath, String ElementName) {
		WebElement we = null;
		try {
			we = driver.findElement(By.xpath(xpath));

		} catch (NoSuchElementException e) {
			WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10000));
			wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.xpath(xpath))));
			we = driver.findElement(By.xpath(xpath));

		} catch (InvalidSelectorException e) {
			System.out.println(ElementName + "Somthing is in xpath sentex");
		} catch (Exception e) {
			throw e;
		}
		return we;
	}

//******************************************************************************************************	     
	public static void mySendKeys(String xpath, String sendValue, String ElementName) {
		WebElement we = myFindElement(xpath, ElementName);
		try {
			we.sendKeys(sendValue);

		} catch (StaleElementReferenceException e) {
			WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(1000));
			wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.xpath(xpath))));
			we.sendKeys(sendValue);

		} catch (Exception e) {
			throw e;
		}
	}

//************************************************************************************

	public static void myClick(String xpath, String ElementName) {
		WebElement we = myFindElement(xpath, ElementName);

		try {
			we.click();
			System.out.println("Click on " + ElementName + "is done");

		} catch (StaleElementReferenceException e) {
			WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(1000));
			wait.until(ExpectedConditions.visibilityOf(we));
			we.click();

		} catch (Exception e) {
			throw e;
		}
	}

//********************************************************************************************************		
	public static void switchToWindowByTitle(String title) {
		Set<String> winHandle = MyMethod.driver.getWindowHandles();
		for (String abs : winHandle) {
			MyMethod.driver.switchTo().window(abs);
			System.out.println(title);
			if (MyMethod.driver.getTitle().equalsIgnoreCase(title)) {
				break;

			} else {
				MyMethod.driver.close();
			}
		}
	}
	//******************************************************************************************
	public static void switchToWindowByUrl(String Url) {
		Set<String> winHandle = MyMethod.driver.getWindowHandles();
		for (String abs : winHandle) {
			MyMethod.driver.switchTo().window(abs);
			System.out.println(Url);
			if (MyMethod.driver.getCurrentUrl().equalsIgnoreCase(Url)) {
				break;

			}
		}
	}
	//********************************************************************************************

	public static void MySelectMultipalTextBox(String xpath, String ElementName) {
		List<WebElement> Countsize = MyMethod.driver.findElements(By.xpath(xpath));

		int cheakbox = Countsize.size();
		for (int i = 0; i < cheakbox; i++) {

			WebElement we = Countsize.get(i);
			boolean cheakboxstatus = we.isSelected();

			if (cheakboxstatus == false) {

			}

			we.click();
		}

	}

//************************************************************************************************************************  	 

	public static void MyDeSelectedMethodInSelectBox(String xpath, String ElementName) {
		List<WebElement> Countsize = MyMethod.driver.findElements(By.xpath(xpath));
		int cheakbox = Countsize.size();
		for (int i = 0; i < cheakbox; i++) {

			WebElement we = Countsize.get(i);
			boolean cheakboxstatus = we.isSelected();

			if (cheakboxstatus == true) {

			}

			we.click();
		}

	}

	public static List<String> GetColumInList(String xpath, String ElementName) {
		List<WebElement> Columsize = MyMethod.driver.findElements(By.xpath(xpath));
		List<String> list = new ArrayList<String>();
		try {
			int colum = Columsize.size();
			for (int i = 0; i < colum; i++) {

				WebElement we = Columsize.get(i);
				String text = we.getText();
				list.add(text);

			}
			System.out.println(list);

		} catch (Exception e) {
			throw e;
		}
		return list;

	}

//*****************************************************************************************************

	public static void getColumnumNumberByColumName(String xpath, String ElementName, String name) {
		List<String> listName = GetColumInList(xpath, ElementName);
		for (int i = 0; i < listName.size(); i++) {
			String str = listName.get(i);
			if (str.equalsIgnoreCase(name)) {

				i++;
				System.out.println(name + "==>" + i);

			}

		}

	}

//******************************************************************************************************

	public static List<String> getColumDataByColumNumber(String xpath, String ElementName, int Number) {
		int size;
		List<String> arr = new ArrayList<String>();
		
		List<WebElement> elements = MyMethod.driver.findElements(By.xpath(xpath));

		try {
			size = elements.size();
			for (int i = 0; i < size; i++) {

				
					WebElement we = elements.get(i);
					String ColumName = we.getText();
					arr.add(ColumName);
				
			}
			System.out.println(arr);
		} catch (Exception e) {
			throw e;

		}
		return arr;
	}
			

	public static List<String> getTableColumByColumNumber(String xpath, String ElementName, int number) {
		int size;
		List<String> arr = new ArrayList<String>();
		
		List<WebElement> elements = MyMethod.driver.findElements(By.xpath(xpath));

		try {
			size = elements.size();
			for (int i = 0; i < size; i++) {

				if (i == number) {
					WebElement we = elements.get(i);
					String ColumName = we.getText();
					arr.add(ColumName);
				}
			}
			System.out.println(arr);
		} catch (Exception e) {
			throw e;

		}
		return arr;
	}
	
	public static int GetColumNumberByColumNameMethod(String xpath, String ElementName,String Name) {
		int ColumNumber=-1;
		List<String> listName = GetColumInList(xpath, ElementName);
		for (int i = 0; i <listName.size()-1 ; i++) {
			String getColumNumber = listName.get(i);
			 if (getColumNumber.equalsIgnoreCase(Name)) {
				 ColumNumber=i+1;
				 
				 break;
				
			}
	
		}
	return ColumNumber;
		
	}

	public static int getRowNumberByAccountNumber(String xpath, String ElementName,String Name) {
		
		int ColumNumber=-1;
   List<WebElement> listName = MyFindElementsMthod(xpath, ElementName);
		for (int i = 0; i <listName.size()-1 ; i++) {
			WebElement getColumNumber = listName.get(i);
			String text = getColumNumber.getText();
			 if (text.equalsIgnoreCase(Name)) {
				 ColumNumber=i+1;
				 System.err.println(ColumNumber);
				 break;
				
			}
	
		}
	return ColumNumber;
		
	}
	public static void VerifyfristName(String xpath, String ElementName,String Name) {
		   List<WebElement> FistName = MyFindElementsMthod(xpath, ElementName);
		   for (int i = 0; i <FistName.size(); i++) {
		WebElement getfristnumber =	   FistName.get(i);
		String textTheget = getfristnumber.getText();
//System.out.println(textTheget);
		if (textTheget.equalsIgnoreCase(Name)) {
			getfristnumber.click();

			System.out.println("if frist number is match then this is click");
			break;
		}
		   
		   }}
}

