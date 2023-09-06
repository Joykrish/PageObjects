package com.rough;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.Base.Pages;
import com.Base.SideMenu;
import com.pages.DashboardPage;
import com.pages.LoginPage;
import com.pages.Recruitment.AddCandidate;

public class VerifyLogin {
	
	public static void main(String[] args) throws InterruptedException {
	
		
	LoginPage lp=new LoginPage();
	//lp.enterUserName();
	//lp.enterPassword();
	DashboardPage dp=lp.clickOnLoginButton();
	
	dp.openHelp();
	
	Pages.sm.moveToRecruitment();
	AddCandidate ad=new AddCandidate();
	//ad.btnAdd();
	//ad.enterFirstName();
	//ad.enterLastName();
	//ad.enterMiddleName();
	//ad.selectVacancy();
	//ad.enterEmail();
	//ad.enterContactNumber();
	ad.clickSave();
	
	

}
}