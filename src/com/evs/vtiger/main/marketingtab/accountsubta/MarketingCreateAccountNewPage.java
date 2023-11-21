package com.evs.vtiger.main.marketingtab.accountsubta;

import myWork.MyMethod;

public class MarketingCreateAccountNewPage {
	public void MarketingAccountInfoPage() {
	MyMethod.mySendKeys("//input[@name='accountname']", "pooja Yadav", "Account Name");
	MyMethod.mySendKeys("//input[@id='tickersymbol']", "mumbai", "tickers Name");

	
	MyMethod.mySendKeys("//input[@id='phone']", "6392910120", "phone");
	MyMethod.mySendKeys("//input[@name='fax']", "fx0045", "Fax");
	MyMethod.mySendKeys("//input[@id='bill_city']", "jaunpur", "city");
	MyMethod.mySendKeys("//input[@id='bill_country']", "India", "Country");
	MyMethod.mySendKeys("//input[@id='ship_pobox']", "uyhfuyef", "shipBox");
	MyMethod.mySendKeys("//input[@id='ship_city']", "mumbai", "City");
	MyMethod.mySendKeys("//textarea[@name='description']", "Application is ready for testing parpuse", "Deacreption");

	
	}
	public void ClickOnTheSaveButton() {
	MyMethod.myClick("//input[@title='Save [Alt+S]']", "clickSaveButton");
	

}}
