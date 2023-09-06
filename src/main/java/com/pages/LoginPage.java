package com.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.Base.Pages;

public class LoginPage extends Pages {



	
	
	public String readUserName() {

		return driver.findElement(By.xpath("//p[@class=\"oxd-text oxd-text--p\"][1]")).getText();

	}

	public String readPassword() {
		return driver.findElement(By.xpath("//p[@class=\"oxd-text oxd-text--p\"][2]")).getText();
	}

	public void enterUserName(String Username) {
		type("enterUserName_XPATH",Username);
		//driver.findElement(By.xpath(
			//	"//label[text()=\"Username\"]//preceding-sibling::i//parent::div//following-sibling::div//child::input"))
				//.sendKeys("Admin");
	}

	public void enterPassword(String Password) {
		type("enterPassword_XPATH",Password);
		//driver.findElement(By.xpath(
			//	"//label[text()=\"Password\"]//preceding-sibling::i//parent::div//following-sibling::div//child::input"))
				//.sendKeys("admin123");
	}

	public DashboardPage clickOnLoginButton() {
		//driver.findElement(By.xpath("//button")).click();
		click("btnLogin_XPATH");
		return new DashboardPage();
	}

	public void clickOnForgetPasswordLink() {
		driver.findElement(By.cssSelector("p.oxd-text oxd-text--p orangehrm-login-forgot-header")).click();
	}

	public void clickOrangeHrmHomePage() {
		driver.findElement(By.xpath("//a[text()=\"OrangeHRM, Inc\"]")).click();
	}
}
