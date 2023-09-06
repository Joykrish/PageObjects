package com.Base;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class SideMenu {
	
	WebDriver driver;
	
	SideMenu(WebDriver driver){
		this.driver=driver;
	}
	
	Pages p;
	public void moveToRecruitment() {
		p=new Pages();
		//Pages.driver.findElement(By.xpath("//span[text()='Recruitment']")).click();
		p.click("moveToRecruitment_XPATH");
	}

}
