package com.evs.vtiger.runner;


import com.evs.vtiger.TestScript.InventoryInvoiceTestScrept;


public class RunnerForInventry {
		public static void main(String[] args) throws InterruptedException {
			InventoryInvoiceTestScrept mis=		new InventoryInvoiceTestScrept();
			mis.VerifyTC00Invector();
		}

}
