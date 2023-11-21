package com.evs.vtiger.runner;

import com.evs.vtiger.TestScript.MarketingAccountTestScreept;

public class RunnerForMarketingAccount {

	public static void main(String[] args) {
		MarketingAccountTestScreept mts = new MarketingAccountTestScreept();
		mts.VerifyT001CreateAccount();

	}

}
