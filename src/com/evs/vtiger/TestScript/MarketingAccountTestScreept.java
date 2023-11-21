package com.evs.vtiger.TestScript;

import com.eva.vtigert.reuseble.commen.Reuseable_java;
import com.evs.vtiger.main.marketingtab.accountsubta.MarketingAccountLandingPage;
import com.evs.vtiger.main.marketingtab.accountsubta.MarketingCreateAccountNewPage;

public class MarketingAccountTestScreept {
	public void VerifyT001CreateAccount() {
	Reuseable_java rs = new Reuseable_java();
	rs.login();
	rs.gotoMarketingAccount();
	MarketingAccountLandingPage mcp = new MarketingAccountLandingPage(); 
	mcp.ClickPlusButtonInMemberof();
	mcp.ClickPlusButtonInMemberof();
	MarketingCreateAccountNewPage mcnp = new MarketingCreateAccountNewPage();
	mcnp.MarketingAccountInfoPage();
}
}