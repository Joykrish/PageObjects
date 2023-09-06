package com.UD.TestCases;

import java.util.Hashtable;

import org.testng.SkipException;
import org.testng.annotations.Test;

import com.pages.DashboardPage;
import com.pages.LoginPage;

import com.w2a.utilities.Utilities;

public class VerifyLogin extends Testbase {

	@Test(dataProviderClass=Utilities.class,dataProvider="dp")
	public void verifyLogin(Hashtable<String,String> data) {
if(!data.get("runmode").equals("Y")){
			
			throw new SkipException("Skipping the test case as the Run mode for data set is NO");
		}
		LoginPage lp=new LoginPage();
		lp.enterUserName(data.get("UserName"));
		lp.enterPassword(data.get("Password"));
		DashboardPage dp=lp.clickOnLoginButton();
	}
}
