package com.evs.vtiger.main.marketingtab.accountsubta;

import myWork.MyMethod;

public class MarketingAccountLandingPage {

	
	
	public void ClickPlusButtonInMemberof() {
		MyMethod.myClick("//img[@alt='Create Account...']", "plush Button");

	}
	public void ClickOnAccountMember() {
		MyMethod.mySendKeys("//input[@id=search_txt']", "pooja", "seach Member Of");
		MyMethod.MyHandleDropDownMethod("//select[@class='txtBox']", "Accont Name", 4);
		MyMethod.myClick("//input[@name='search']", "SearchForOnMemberOf");
	}
	
	
}
