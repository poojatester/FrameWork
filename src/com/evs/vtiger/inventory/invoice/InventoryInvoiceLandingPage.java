package com.evs.vtiger.inventory.invoice;

import myWork.MyMethod;

public class InventoryInvoiceLandingPage{
	
	public void clickOnCreateInvoiceButton() {
    MyMethod.myClick("//img[@alt='Create Invoice...']", "Invoice Page");
    
		}
	public void SearchContact() {
		MyMethod.myClick("//img[@alt='Search in Invoice...']", "Search Invoice");
	}
	}

