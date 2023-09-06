package com.pages;

import java.util.ArrayList;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.Base.Pages;

public class DashboardPage extends Pages{


	public void openHelp() {
		driver.findElement(By.xpath("//i[@class=\"oxd-icon bi-question-lg\"]")).click();
		Set<String> st=driver.getWindowHandles();
		for(String s:st) {
			System.out.println("Window handle is "+s);
		
		
	}
		ArrayList<String> AI=new ArrayList<String>(st);
		driver.switchTo().window(AI.get(0));
		
}
}