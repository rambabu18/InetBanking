package com.IBanking.Testcases;

import org.testng.annotations.Test;

import com.IBanking.Pageobjects.LoginPage;

import junit.framework.Assert;

public class TC_LoginPage_001 extends BaseClass {
	
	@Test
	public void logintest() {
		
		
		
		logger.info("Entered URL");

		
	     LoginPage lp = new LoginPage(driver);
		
		lp.setUserName(username);
		
		logger.info("Entered Username");
		
		lp.setPassword(password);
		
		logger.info("Entered Password");
 
		lp.clickSubmit();
		
		logger.info("Sucessfully executed");
		
		if(driver.getTitle().equals(" Guru99 Bank Manager HomePage ")) {
			
			Assert.assertTrue(true);
			
			
		}else {
			Assert.assertFalse(false);
		}
		
	}

}
