package com.pages.Recruitment;

import com.Base.Pages;

public class RecruitmentHomePage extends Pages {
	public AddCandidate btnAdd() throws InterruptedException {
		Thread.sleep(10000);
		//driver.findElement(By.xpath("//button[@class=\"oxd-button oxd-button--medium oxd-button--secondary\"]"))
			//	.click();
	click("btnAddCandidate_XPATH");
	return new AddCandidate();
	
	
	}
}
