package com.IBanking.Testcases;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.safari.SafariDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;

import com.IBanking.Utilities.ReadConfig;


public class BaseClass {
	ReadConfig readconfig = new ReadConfig();
	
	public String baseURL = readconfig.getApplicationUrl();
	public String username = readconfig.getUserName();
	public String password = readconfig.getPassword();
	public static WebDriver driver;
	public Logger logger;
	
	@Parameters("browser")
	
	@BeforeClass
	
	public void setup(String br) {
		
	    logger = Logger.getLogger("ebanking");
	    PropertyConfigurator.configure("Log4j.properties");
	    
	    if(br.equals("chrome")) {
	    	
	    System.setProperty("webdriver.chrome.driver", readconfig.getChromePath());
		
	    driver = new ChromeDriver();
	}
	    
	    else if(br.equals("safari")) {
	    	
	    	System.setProperty("webdriver.safari.driver", readconfig.getSafariPath());
			
		    driver = new SafariDriver();
	    }
	   
	    driver.get(baseURL);
	    
	}
	
	@AfterClass
	public void tearDown() {
		
		driver.quit();
	}
	
	
	
}
