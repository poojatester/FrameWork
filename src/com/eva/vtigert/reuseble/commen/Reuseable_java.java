package com.eva.vtigert.reuseble.commen;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;



import Collection_by_myMethod.My_ganric_Method;
import myWork.MyMethod;

public class Reuseable_java {


	public  void login() {
		MyMethod.lounchbrowser();
		//MyMethod.myGetUrl("http://localhost:8888/");
		
			MyMethod.mySendKeys("//input[@name='user_name']", "admin","User Name");
		    MyMethod.mySendKeys("//input[@name='user_password']", "admin","User Password");
			MyMethod.myClick("//input[@name='Login']", "LoginButton");
		
	}
	
		public void LogOutMethod() {
			
			MyMethod.myClick("//a[text()='Sign Out']", "Log Out");	
			}
		public void goToMarketingCampaigins() {
			   MyMethod.myClick("//a[text()='Marketing']", "MarketingButton");

			MyMethod.myClick("(//a[text()='Campaigns'])[1]", "Compaign SubTab");
			
			}
		public void gotoMarketingAccount() {
			   MyMethod.myClick("//a[text()='Marketing']", "MarketingButton");

		MyMethod.myClick("//a[text()='Accounts']", "Account ButtonSubTab");	
		}
		public  void goToLeads() {
			   MyMethod.myClick("//a[text()='Marketing']", "MarketingButton");
				MyMethod.myClick("//a[text()='Leads']", "Leads");
				
				}
public void gotoInventoryInvoicePage() {
MyMethod.myClick("//a[text()='Inventory']", "Inventory page");
MyMethod.myClick("//a[text()='Invoice']", "Invoice");

}

		}
		
			
	

  
	

     
    
     
     
     
     
     











