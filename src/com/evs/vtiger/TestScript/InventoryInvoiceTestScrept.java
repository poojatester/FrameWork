package com.evs.vtiger.TestScript;

import com.eva.vtigert.reuseble.commen.Reuseable_java;
import com.evs.vtiger.inventory.invoice.InventoryInvoiceLandingPage;
import com.evs.vtiger.inventory.invoice.InventoryInvoiceNewPage;

public class InventoryInvoiceTestScrept {
	public void VerifyTC00Invector() throws InterruptedException {
		Reuseable_java rs = new Reuseable_java();
		rs.login();
		rs.gotoInventoryInvoicePage();
	   InventoryInvoiceLandingPage ILp = new InventoryInvoiceLandingPage();
	   ILp.clickOnCreateInvoiceButton();;
	  InventoryInvoiceNewPage Inp = new  InventoryInvoiceNewPage();
	  Inp.CreateInvoicePageInventoryInfo();
	  Inp.ClickOnSaveButton();
	
}
	}

