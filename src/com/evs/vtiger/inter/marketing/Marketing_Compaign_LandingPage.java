package com.evs.vtiger.inter.marketing;

import myWork.MyMethod;

public class Marketing_Compaign_LandingPage {
	
public void clickOnCreateMarketingInCampaignButton() {
	MyMethod.myClick("//img[@alt='Create Campaign...']", "plus Button");
}
public void ClickOnSearchTextButton() {
	MyMethod.myClick("//input[@name='search_text']", "plus Button");
	
}
public void SeachCampaign() {
    MyMethod.mySendKeys("//input[@class='txtBox']", "pooja", "search Box");
    MyMethod.MyHandleDropDownMethod("//select[@name='search_field']", "compaign For", 1);
    MyMethod.myClick("//input[@name='submit']", "SearchNow");
}
}
