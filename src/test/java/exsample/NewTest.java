package exsample;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;

public class NewTest {
	 private WebDriver driver;       
     @Test              
     public void testEasy() {    
        
    	 System.out.println("testing........");
    	 System.setProperty("webdriver.chrome.driver", "D:\\Manas\\entytle\\campaignplanner\\chromedriver\\chromedriver.exe");

    	// WebDriver driver=new FirefoxDriver();
    	 WebDriver driver=new ChromeDriver();
    	 driver.get("http://www.facebook.com");
    	 System.out.println("--->"+driver.getTitle());
    	 driver.quit();
     }   
          
            

}
