package com.UD.TestCases;

import java.util.Hashtable;

import org.testng.annotations.Test;

import com.Base.Pages;
import com.pages.Recruitment.AddCandidate;
import com.pages.Recruitment.RecruitmentHomePage;
import com.w2a.utilities.Utilities;

public class VerifyAddCandidate extends Testbase {
	@Test(dataProviderClass=Utilities.class,dataProvider="dp")
	public void verifyAddCandidate(Hashtable<String,String> data) throws InterruptedException {
		Pages.sm.moveToRecruitment();
		
		RecruitmentHomePage rmh=new RecruitmentHomePage();
		AddCandidate ad=rmh.btnAdd();
		ad.enterFirstName(data.get("FirstName"));
		ad.enterLastName(data.get("LastName"));
		ad.enterMiddleName(data.get("MiddleName"));
		ad.selectVacancy(data.get("Vaccancy"));
		ad.enterEmail(data.get("Email"));
		String s=data.get("CotactNumber");
		System.out.println("ContactNumber is" + s.substring(0,s.length()-2) );
		ad.enterContactNumber(s.substring(0,s.length()-2));
		ad.clickSave();
	}

}
