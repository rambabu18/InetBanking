package basicTest;

import java.sql.Driver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Testclass {

	public static void main(String[] args) {
		
          System.setProperty("webdriver.chrome.driver", "chromedriver");
          
          WebDriver driver = new ChromeDriver();
          
          driver.get("https://www.facebook.com");
          
          System.out.println(driver.getTitle());
          driver.findElement(By.name("email")).sendKeys("ram.rambabu300@gmail.com");
          
          driver.findElement(By.name("pass")).sendKeys("rambabu18");
          
          driver.findElement(By.id("loginbutton")).click();
     
          
          String exptitle = "Facebook";
          String acttitle = driver.getTitle();
          if(exptitle.equals(acttitle)==true) {
        	  
        	  System.out.println("test is passed");
          }
        	  
        	  else 
        	  {
        		  System.out.println("test is failed");
        	  
        	  }
         
          
	}
          
	
          
	}
 


