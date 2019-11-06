import java.util.Set;

import org.openqa.selenium.Cookie;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CookieTest {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "chromedriver");
		
		WebDriver driver = new ChromeDriver();
		
        driver.get("https://www.amazon.in");	
        
        Set <Cookie> cookies = driver.manage().getCookies();
        
        System.out.println(cookies.size());
        
       Cookie cook = new Cookie("name", ""+ ":" +"jai sree ram");
       
       driver.manage().addCookie(cook);
       
       cookies = driver.manage().getCookies();
       
       System.out.println(cookies.size());
       
       for(Cookie s:cookies)
       {
    	   
    	   System.out.println(s.getName() + ":" + s.getValue());
    	   
       }
       driver.quit();
       
        
        
		
		
		
		

	}

}
