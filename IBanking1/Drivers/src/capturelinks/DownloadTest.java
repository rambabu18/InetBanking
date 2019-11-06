package capturelinks;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DownloadTest {

	public static void main(String[] args) {
		
		System.setProperty("wedriver.chrome.driver", "chromedriver");
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("http://demo.automationtesting.in/FileDownload.html");
		
		 driver.findElement(By.id("textbox")).sendKeys("testing");
		 
		 driver.findElement(By.id("createTxt")).click();
		 driver.findElement(By.id("link-to-download")).click();
		 
		 
		
	
		
		
	}

}
