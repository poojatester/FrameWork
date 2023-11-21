package com.evs.vtiger.TestScript;

import com.eva.vtigert.reuseble.commen.Reuseable_java;
import com.evs.vtiger.inter.marketing.MarketingCompaignCreateNewPage;
import com.evs.vtiger.inter.marketing.Marketing_Compaign_LandingPage;
import com.evs.vtiger.main.marketingtab.leads.Marketing_NewCreateLeadsPage;

public class MarketingCampaiginsTestScript {
	public void varify001CreateCampaigins() {
		Reuseable_java rs = new Reuseable_java();
		rs.login();
		rs.goToMarketingCampaigins();
		Marketing_Compaign_LandingPage mc = new Marketing_Compaign_LandingPage();
		//mc.clickOnCreateMarketingInCampaignButton();
		mc.ClickOnSearchTextButton();
		mc.SeachCampaign();
		MarketingCompaignCreateNewPage cmc = new MarketingCompaignCreateNewPage();
		mc.clickOnCreateMarketingInCampaignButton();

		cmc.MarketingCreateCompaignInfoPage();
		cmc.MarketingInSerchForDeteilPage();
		cmc.allInfoDelet();
		cmc.VerifyTheCampaignName();
		
	}

}
