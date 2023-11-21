package com.evs.vtiger.inter.marketing;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import myWork.MyMethod;
import myWork.MyUtilityMethodOfFindElements;

public class MarketingCompaignCreateNewPage {

	public void MarketingCreateCompaignInfoPage() {
		
		MyMethod.mySendKeys("//input[@name='campaignname']", "Anshika", "Compaign Name");
		MyMethod.mySendKeys("//input[@id='targetaudience']", "softeare", "Targete Name");
		MyMethod.mySendKeys("//input[@id='sponsor']", "Accept", "Sponser Name");
		MyMethod.mySendKeys("//input[@id='numsent']", "75", "Num sent");
		MyMethod.mySendKeys("//input[@name='product_name']", "moblileText", "Product Name");
		MyMethod.mySendKeys("//input[@id='expectedsalescount']", "4", "Expected Sales");
		MyMethod.mySendKeys("//input[@id='expectedresponsecount']", "65", "ResposeCount");
		MyMethod.mySendKeys("//input[@id='actualsalescount']", "45", "ActualSales");
		MyMethod.mySendKeys("//input[@id='actualresponsecount']", "34", "Actual Response");
		MyMethod.mySendKeys("//textarea[@name='description']", "My software is ready", "Description");
	}
public void CompaignsSaveButton() {
	MyMethod.myClick("//input[@title='Save [Alt+S]']", "clickSaveButton");
	
}
		
		
	
	public void MarketingInSerchForDeteilPage() {
		MyMethod.myClick("//input[@name='selectall']", "Detail Page");
	}
	public void allInfoDelet() {
		MyMethod.myClick("//input[@type='button']","Delet Information");
	}
	public void VerifyTheCampaignName() {
    
	WebElement  getInfo=MyMethod.myFindElement("//table[@class=\"lvt small\"]//tr[2]//td[3]//a ","CompaignFor");
if (getInfo.getText().equalsIgnoreCase("pooja")) {
	System.out.println("testCase is Pass");
}		
	}

	}

