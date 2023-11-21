package com.evs.vtiger.TestScript;

import java.util.List;

import com.eva.vtigert.reuseble.commen.Reuseable_java;
import com.evs.vtiger.inter.marketing.Marketing_Compaign_LandingPage;
import com.evs.vtiger.main.marketingtab.leads.Marketing_Leads_LandingPage;
import com.evs.vtiger.main.marketingtab.leads.Marketing_NewCreateLeadsPage;

import myWork.MyMethod;
import myWork.MyUtilityMethodOfFindElements;

public class TestScript {
	
	
///**********************************************************************************
//*********************************************************************************	
	
		public  void TC003TakeColumList() {
			Reuseable_java rs = new Reuseable_java();
			rs.login();

			
			List<String> rowList = MyUtilityMethodOfFindElements.GetColumInList("//table[@class='lvt small']//tr[1]//td", "getrowHeader");
for (String str : rowList) {
	System.out.println(str);
	
}



   MyUtilityMethodOfFindElements.getTableColumByColumNumber("//table[@class='lvt small']//tr","RowNumber", 4);
   MyUtilityMethodOfFindElements.getColumDataByColumNumber("//table[@class='lvt small']//tr//td[3]","ColumNumber", 3);
 MyUtilityMethodOfFindElements.getRowNumberByAccountNumber("//table[@class='lvt small']//tr//td[2]", "RowCount", "LEA9");
		
		}
//*******************************************************************************************************			
		public static void TC004() {	
			Reuseable_java rs = new Reuseable_java();
			rs.login();

		  MyUtilityMethodOfFindElements.GetColumInList("//table[@class='hdrTabBg']//a" , "MainPageTab");			
		  MyUtilityMethodOfFindElements.getColumnumNumberByColumName("//table[@class='hdrTabBg']//a", "MainPage", "Sales");
			MyUtilityMethodOfFindElements.MySelectMultipalTextBox("//input[@name='selected_id']", "selectbox");
			MyUtilityMethodOfFindElements.MyDeSelectedMethodInSelectBox("//input[@name='selected_id']", "DeSelect");
			
			
			
			
			
		}		
			
			
		public static void TC005() {	
			Reuseable_java rs = new Reuseable_java();
			rs.login();

			MyMethod.myClick("//a[text()='About Us']", "AboutUs");
			MyMethod.myClick("//a[text()='Feedback']", "Feedback");
			MyMethod.myClick("//a[text()='Help']", "Help");

			MyUtilityMethodOfFindElements.switchToWindowByTitle( "vtiger CRM 5 - Free, Commercial grade Open Source CRM");
			MyMethod.myClick("//input[@name='close']", "close aboutus");
			
		}
			
			
			
			
		public static void TC006() {	
			MyUtilityMethodOfFindElements.switchToWindowByTitle("title");	
			MyUtilityMethodOfFindElements.switchToWindowByTitle("title");	
	//(By.xpath("http://localhost:8888/index.php?module=Users&action=about_us"));

			
		MyMethod.myClick("//a[text()='Marketing']" , "MarketingButton");
		}	
//************************************************************************************
		
		public static void TC007() {
	//MyMethod.MethodOfActionClass("//a[text()='Sales']", "Click SelasByAction");
	
		MyMethod.MyDragAndDropMethod("//tr[@id='headerrow_14']//td[@align='left']", ("//div[@id='stuff_5']"),"ElementDrag");	
		MyMethod.MySendKeysByActionCLass("//input[@name='user_password']", "userpass", "admin");
	MyMethod.MyDoubleClickMethod("//a[text()='Marketing']", "Marketting");	
		
		}
		//**********************************************************************************
		public static void TC008() {
		
		MyMethod.myClick("//img[@alt='Create Campaign...']", "plushButton");

		MyMethod.mySendKeys("//input[@name='campaignname']", "Deepti","campaign name");
		MyMethod.mySendKeys("//input[@id='targetaudience']", "tester","Target audience");
		MyMethod.mySendKeys("//input[@name='sponsor']", "Software","sponsor");
		
		MyMethod.mySendKeys("//input[@id='numsent']", "6392910120","Num Sent");
		MyMethod.mySendKeys("//input[@name='product_name']", "Sumsang","Product Name");
		MyMethod.mySendKeys("//input[@id='targetsize']", "4.5","Target Size");
		}

//************************************************************************************		
public  void Tc001TakecolomName() {
	
	MyUtilityMethodOfFindElements.GetColumInList("//table[@class='lvt small']//tr[1]//td", "takeColoum");
}
	


public static void Tcoo2TakeFristName() {
	Marketing_NewCreateLeadsPage m  =new Marketing_NewCreateLeadsPage();

	Reuseable_java rs = new Reuseable_java();
	rs.login();
	rs.goToLeads();

	MyUtilityMethodOfFindElements.VerifyfristName("//table[@class='lvt small']//tr//td[3]//a", "Lead", "Jones");
	
}
public static void createLeads() {
	Marketing_NewCreateLeadsPage m  =new Marketing_NewCreateLeadsPage();

	Reuseable_java rs = new Reuseable_java();
	rs.login();
rs.goToLeads();
new Marketing_Leads_LandingPage().clickOnCreateButton();
	m.enterLeadsinfo();
	m.takeTheMoreInformation();
	m.ClickOnTheCalender();
	m.ClickOnTheDayTab();
	m.ClickOneTheWatch();
	m.ClickOnCalkutterTab();
	m.takeTheMoreInformation();

}
public static void TakeInfo() {
	Reuseable_java rs = new Reuseable_java();
	rs.login();
//	Marketing_Reuseble_code_Leads mrk  =new Marketing_Reuseble_code_Leads();
//	mrk.goToLeads();
//	mrk.clickOnCreateButton();
//	mrk.enterLeadsinfoAndSave();
//	mrk.takeTheMoreInformation();
}	
	public static void TakemarketingTabandSubtab() {
		Reuseable_java rs = new Reuseable_java();
		rs.login();
		Marketing_Compaign_LandingPage	com=new Marketing_Compaign_LandingPage();
		
		
	}
	
}














