package com.UD.TestCases;

import org.testng.annotations.AfterSuite;

import com.Base.Pages;

public class Testbase {
	@AfterSuite
	public void tearDown() {
	Pages.tearDown();
		
	}

}
