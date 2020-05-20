/**
 * 
 */
package com.qa.rwue.TestCases;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.time.format.DateTimeFormatter;
import java.util.Date;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;
import com.qa.rwue.pages.UserEvent_SPA_G;

/**
 *  @author Pratyush
 *  This class is Test class to Run Test cases which we create in pages.
 *  
 */

public class UserEvent_Test {

	@Test
	public void Verify_Userevent_G() throws InterruptedException {
		
		//String path = System.getProperty("user.dir");
		//System.setProperty("webdriver.chrome.driver", path+"\\test-output\\chromedriver.exe");
		//System.setProperty("webdriver.chrome.driver", "$env:chromedriver.exe");
		//System.setProperty("webdriver.chrome.driver", "D:/a/_temp\\chromedriver.exe");
		System.setProperty("webdriver.chrome.driver", "D:\\a\\1\\s\\RWUE\\chromedriver.exe");
		//System.setProperty("webdriver.chrome.driver", "\\desktop\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://rally-bolide-dev.azurewebsites.net/userevent/");
		
		//For Selecting Date to make name dynamic.
		DateFormat df = new SimpleDateFormat("dd/MM/yy HH:mm:ss");
		Date dateObj = new Date();
		
		UserEvent_SPA_G userevent_spa_g = new UserEvent_SPA_G(driver);
		
		userevent_spa_g.As_Guest("Testing Event");
		
		userevent_spa_g.Where_We_going("1010 Massachusetts", "nvidia", "106 West 32nd");
		
		userevent_spa_g.Where_we_going_time();
		
		userevent_spa_g.How_Stay_touch("This is Automated Testing script " + dateObj, "Wild Net", "wildnet1@rallybus.net", "+93444904571");
		
		userevent_spa_g.How_fund_trip();
		
		driver.quit();
	}
	
	public void Verify_Userevent_L() {
		
	}
	
	
}
