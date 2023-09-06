package com.pages.Recruitment;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.Base.Pages;

public class AddCandidate extends Pages {

	

	public void enterFirstName(String firstName) {
		//driver.findElement(By.xpath("//input[@name=\"firstName\"]")).sendKeys("Krishna");
		type("enterFirstName_XPATH",firstName);
	}

	public void enterMiddleName(String middleName) {
		type("enterSecondName_XPATH",middleName);
		//driver.findElement(By.xpath("//input[@name=\"middleName\"]")).sendKeys("Govinda");
	}

	public void enterLastName(String lastName) {
		type("enterLastName_XPATH",lastName);
		//driver.findElement(By.xpath("//input[@name=\"lastName\"]")).sendKeys("Mukunda");
	}

	public void selectVacancy(String vacancy) {
		click("selectVancany_XPATH");
		//driver.findElement(By.xpath("//i[@class=\"oxd-icon bi-caret-down-fill oxd-select-text--arrow\"]")).click();
		List<WebElement> AI = driver.findElements(By.xpath("//div[@role=\"option\"]"));
		for (WebElement s : AI) {
			System.out.println(s.getText());
			if (s.getText().contains(vacancy)) {
				s.click();
				break;
			}
		}

	}

	public void enterEmail(String email) throws InterruptedException {
		Thread.sleep(5000);
		/*WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(20));
		WebElement ec=wait.until(ExpectedConditions.presenceOfElementLocated( By.xpath("//label[contains(text(),\"Email\")]//parent::div//following-sibling::div//input")));
		ec.sendKeys("abc@abc.com");*/
		//driver.findElement(By.xpath("//label[contains(text(),\"Email\")]//parent::div//following-sibling::div//input")).sendKeys("abc@abc.com");
	type("enterEmail_XPATH",email);
	}

	public void enterContactNumber(String contactNumber) {  
		//driver.findElement(By.xpath("(//input[@placeholder=\"Type here\"])[2]")).sendKeys("343434");
		type("enterContactNumber_XPATH",contactNumber);
	}

	public void clickSave() {
		click("clickSubmit_XPATH");
	}
}
