package com.evs.vtiger.inventory.invoice;

import myWork.MyMethod;
import myWork.MyUtilityMethodOfFindElements;

public class InventoryInvoiceNewPage {
	private String subject="//input[@name='subject']";
public void CreateInvoicePageInventoryInfo() throws InterruptedException {
	MyMethod.mySendKeys(subject, "selenium Automate", "Subject");
	MyMethod.mySendKeys("//input[@id='customerno']", "Requirement", "By Customer");
	MyMethod.mySendKeys("//input[@name='contact_name']", "Pooja", "Contact Name");
	//MyMethod.mySendKeys("//input[@name='account_name']", "UBI", "Accunt Name");
	MyMethod.myClick("(//img[@title='Select'])[3]", "acountbutton");
	MyUtilityMethodOfFindElements.switchToWindowByUrl("http://localhost:8888/index.php?module=Accounts&action=Popup&popuptype=specific_account_address&form=TasksEditView&form_submit=false&fromlink=");
	MyMethod.mySendKeys("//input[@id='search_txt']", "vtiger", "inputSearch");
	MyMethod.selectByValueMethod("//select[@name='search_field']","acountSelect", "accountname");
	MyMethod.myClick("//input[@name='search']", "searchbutton");
MyMethod.myClick("//a[text()='vtiger']", "selectValue");
	MyMethod.MyPopAlertAcceptMethod("selectAcount");
	Thread.sleep(1000);
	MyUtilityMethodOfFindElements.switchToWindowByUrl("http://localhost:8888/index.php?module=Invoice&action=EditView&return_action=DetailView&parenttab=Inventory");

	MyMethod.mySendKeys("//input[@id='vtiger_purchaseorder']", "EarPhone", "Parcheged");
	MyMethod.mySendKeys("//textarea[@name='bill_street']", "Leduka", "Billind area");
	MyMethod.mySendKeys("//input[@id='bill_pobox']", "200Mon", "pay bill");
	MyMethod.mySendKeys("//input[@id='bill_city']", "Jaunpur", "City");
	MyMethod.mySendKeys("//input[@id='bill_state']", "Up", "State");
	MyMethod.mySendKeys("//input[@id='bill_code']", "C0045", "Code");
	MyMethod.mySendKeys("//input[@id='bill_country']", "USA", "Contury");
	MyMethod.myClick("//img[@id='searchIcon1']", "addProduct");
	MyUtilityMethodOfFindElements.switchToWindowByUrl("http://localhost:8888/index.php?module=Products&action=Popup&html=Popup_picker&select=enable&form=HelpDeskEditView&popuptype=inventory_prod&curr_row=1&&&return_module=Invoice&currencyid=1");
	MyMethod.mySendKeys("//input[@id='search_txt']", "abcd1234", "inputSearch");
	MyMethod.selectByValueMethod("//select[@name='search_field']","acountSelect", "productname");
	MyMethod.myClick("//input[@name='search']", "searchbutton");
MyMethod.myClick("//a[text()='abcd1234']", "selectValue");
	Thread.sleep(1000);
	MyUtilityMethodOfFindElements.switchToWindowByUrl("http://localhost:8888/index.php?module=Invoice&action=EditView&return_action=DetailView&parenttab=Inventory");
	MyMethod.mySendKeys("//input[@id='qty1']", "32", "qty");
	MyMethod.mySendKeys("//input[@id='listPrice1']", "10", "price");
}
public void ClickOnTheAccountPlusButton() {
	MyMethod.myClick("//img[@alt='Select']", "AccountPlush");
}

	public void ClickOnSaveButton() {
		MyMethod.myClick("//input[@title='Save [Alt+S]']", "Save Button");
		
	}
	public void ClickOnCanclatioButton() {
		MyMethod.myClick("//input[@title='Cancel [Alt+X]']", "Cantaletion Button");
	}
	
	
	}


