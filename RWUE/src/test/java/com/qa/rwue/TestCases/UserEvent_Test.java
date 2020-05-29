/**
 * 
 */
package com.qa.rwue.TestCases;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
import com.qa.rwue.pages.Booking_SPA_L;
import com.qa.rwue.pages.UserEvent_SPA_G;

/**
 *  @author Pratyush
 *  This class is Test class to Run Test cases which we create in pages.
 *  
 */


public class UserEvent_Test {
	
	@Test(priority=1)
	public void Verify_Userevent_G_Case1() throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\chromedriver.exe");
		//System.setProperty("webdriver.chrome.driver", "D:\\a\\1\\s\\RWUE\\chromedriver.exe");
		
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
	
	@Test(priority=2)
	public void Verify_Userevent_G_Case2() throws InterruptedException {
	
		System.setProperty("webdriver.chrome.driver", "C:\\chromedriver.exe");
		//System.setProperty("webdriver.chrome.driver", "D:\\a\\1\\s\\RWUE\\chromedriver.exe");
		
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
		
		userevent_spa_g.How_Stay_touch("This is Testing Script Case2 " + dateObj, "Wild Net", "wildnet1@rallybus.net", "+93444904571");
		
		userevent_spa_g.How_fund_trip();
		
		driver.quit();
	}
	
	@Test(priority=3)
	public void Verify_Userevent_G_Case3() throws InterruptedException {
	
		System.setProperty("webdriver.chrome.driver", "C:\\chromedriver.exe");
		//System.setProperty("webdriver.chrome.driver", "D:\\a\\1\\s\\RWUE\\chromedriver.exe");
		
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
		
		userevent_spa_g.How_Stay_touch("This is Testing Script Case3 " +dateObj, "Wild Net", "wildnet1@rallybus.net", "+93444904571");
		
		userevent_spa_g.How_fund_trip();
		
		driver.quit();
	}
	
	@Test(priority=1)
	public void Verify_booking_SPA_L() throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\chromedriver.exe");
		//System.setProperty("webdriver.chrome.driver", "D:\\a\\1\\s\\RWUE\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://rally-bolide-dev.azurewebsites.net/Search");
		
		Booking_SPA_L booking_spa_l = new Booking_SPA_L(driver);
		
		booking_spa_l.Search_Rally_point("this is");
		
		booking_spa_l.Add_rides("wildnet1@rallybus.net","wildnet1@rallybus.net");
		
		booking_spa_l.Review_booking("4111111111111111","05/32","123");
		
		driver.quit();
	}
}
