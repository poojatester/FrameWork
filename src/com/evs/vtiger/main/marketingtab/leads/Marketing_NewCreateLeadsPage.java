package com.evs.vtiger.main.marketingtab.leads;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import myWork.MyMethod;
import myWork.MyUtilityMethodOfFindElements;

public class Marketing_NewCreateLeadsPage {

	
	
	public void enterLeadsinfo() {
		MyMethod.mySendKeys("//input[@name='firstname']", "Anshika", "Enter Frist Name");
		MyMethod.mySendKeys("//input[@name='lastname']", "Yadav", "LastName");
		MyMethod.mySendKeys("//input[@name='company']", "Defnice", "CompanyName");
		MyMethod.mySendKeys("//input[@name='phone']", "756483", "Mobile");
		MyMethod.mySendKeys("//input[@name='mobile']", "639290120", "Phone");
		MyMethod.mySendKeys("//input[@id='fax']", "Fax004", "Fax");
		MyMethod.mySendKeys("//input[@id='email']", "pooja@gmail.com", "ld");
		MyMethod.mySendKeys("//textarea[@name='lane']", "CityStation Road", "Street");
		MyMethod.mySendKeys("//input[@name='code']", "PosTD00534", "Postal Code");
		MyMethod.mySendKeys("//input[@name='country']", "My Love Country", "India");
		MyMethod.mySendKeys("//input[@name='pobox']", "PostBTD00534", "Post Box");
		MyMethod.mySendKeys("//input[@name='city']", "Jaunpur", "City Name");
		MyMethod.mySendKeys("//input[@id='state']", "Uttar Pradesh", "State");
		MyMethod.mySendKeys("//textarea[@name='description']", "Create Descrepion ByPooja", "Descrepion Box");
		
	}
	public void MarketingLeadsSaveButton() {
		MyMethod.myClick("//input[@title='Save [Alt+S]']", "SaveBtton");
	}
	
	public void ClickOnTheCalender() {
		MyMethod.myClick("//img[@title='Open Calendar...']", "Catender");
		
		
	}
		public void ClickOnTheDayTab() {
		MyMethod.myClick("//td[@class='currDay']//a[text()='9']", "Date");
	}
	public void ClickOneTheWatch() {
		MyMethod.myClick("//img[@alt='Show World Clock...']", "Watch");
	}
		public void ClickOnCalkutterTab() {
		MyMethod.myClick("//img[@alt='Open Calculator...']", "Calkutater");

	}
		public void takeTheMoreInformation() {
			List<WebElement> info = MyUtilityMethodOfFindElements.MyFindElementsMthod("//td[@class='dvtUnSelectedCell']//a", "Info Button");
	        for (int i = 0; i <info.size() ; i++) {
		    WebElement getInfo = info.get(i);
		    String getThetext = getInfo.getText();
		    System.out.println(getThetext);
	}}


	}
	

