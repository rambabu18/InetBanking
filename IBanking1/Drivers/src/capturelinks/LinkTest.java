package capturelinks;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.sql.Driver;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;



public class LinkTest {

	public static void main(String[] args) throws InterruptedException, IOException {
		
	System.setProperty("webdriver.chrome.driver","chromedriver");
	
	WebDriver driver= new ChromeDriver();
	
	driver.manage().window().maximize();
	
	Thread.sleep(5000);
	
	driver.get("http://newtours.demoaut.com/");
	
	 List <WebElement> links = driver.findElements(By.tagName("a"));
	 
	 System.out.println(links.size());
	 
	 for(int i=0;i<=links.size();i++) {
		 
		 WebElement element = links.get(i);
		 
		 String reflink=element.getAttribute("href");
		 
		 URL link = new URL(reflink);
		 
		 HttpURLConnection httpConn = (HttpURLConnection) link.openConnection();
		 
		 
		 Thread.sleep(2000);
		 
		 httpConn.connect();
		 
		 int rescode = httpConn.getResponseCode();
		 
		 if(rescode>=400) {
			 
			 System.out.println(link + " - " + "is a broken link" );
		 }
			 
			 else
			 {
				 System.out.println(link + " - " + "is valid link" );
			 }
		 driver.quit();
		 }
		 
	 }

	}


