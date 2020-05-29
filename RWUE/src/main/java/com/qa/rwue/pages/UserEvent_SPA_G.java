/**
 * 
 */
package com.qa.rwue.pages;

import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.util.Calendar;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.testng.ITestResult;

/**
 *  @author Pratyush
 *
 *  This class is for Guest login as If we want to test UserEvent as Guest then we have to run this class.
 * 
 *  Created on 09/05/20
 * 
 *  All Methods and Locators were present here and we call them in Testcases.
 * 
 *  This class is created on POM Design Pattern with normal Approach.
 */

public class UserEvent_SPA_G {

		WebDriver driver;
		LocalDate date1 =  LocalDate.now().plusDays(7);
		int Date1 = date1.getDayOfMonth();
		
		/*SimpleDateFormat sdf = new SimpleDateFormat("yyyy/MM/dd");
		Calendar cal = Calendar.getInstance();
		
		String newDate = sdf.format(cal.getTime());*/
		LocalDate date2 = LocalDate.now().plusDays(1);
		int Date2 = date2.getDayOfMonth();

		/**
		 * Locators for Method As_Guest
		 */
		
		By Btn_Guest = By.xpath("//button[@class='splash__button']");
		By Srch_bar = By.id("search__rally-ip");
		By New_Dest = By.xpath("//button[@class='button button--dark']");
		
		
		/**
		 * Locators for Method Where_We_going
		 */
		
		By Rally_from = By.id("rally-from");
		By Focus_out = By.xpath("//label[@class='control-label' and contains(text(),'Rally from')]");
		By Add_rally_Point = By.xpath("//div[@class='addrally__item']");
		By Rally_from_1 = By.id("rally-rp-0");
		By Rally_to = By.id("rally-to");
		By Add_times = By.xpath("//div[@class='button--parent right']/button[@class='button button--yellow']");
		
		/**
		 * Locators for Method Where_we_going_time
		 */
		
		By One_Side = By.xpath("//div[@class='tab__item ' and contains(text(),'One way trip')]");
		By Outbound_One = By.xpath("//div[@class='button current-date']");
		By Sel_date = By.xpath("//button[@class='day chosen']/div[@class='number' and contains(text(),'"+Date1+"')]");
		By Round_Side = By.xpath("//div[@class='tab__item ' and contains(text(),'Round trip')]");
		By Return_Date = By.xpath("//div[@id='returnDateTime']/div/div/div[@class='button current-date']");
		By Nxt_mnth = By.xpath("//button[@class='next']");
		By Sel_date1 = By.xpath("//button[@class='day ']/div[@class='number' and contains(text(),'"+Date2+"')]");
		By Add_Contct_Info = By.xpath("//div[@class='button--parent right']/button[@class='button button--yellow']");
		
		/**
		 * Locators for Method How_Stay_touch
		 */
		
		By Name_rally = By.xpath("//*[@id=\"main__content\"]/div/div/form/div[2]/div/input");
		By User_Name = By.xpath("//*[@id=\"main__content\"]/div/div/form/div[5]/div/input");
		By User_Email = By.xpath("//*[@id=\"main__content\"]/div/div/form/div[6]/div/input");
		By User_Phone = By.xpath("//*[@id=\"main__content\"]/div/div/form/div[7]/div/input");
		By Sel_bus = By.xpath("//div[@class='button--parent right']/button[@class='button button--yellow']");
		By Chs_Fund_Mthd = By.xpath("//div[@class='button--parent right']/button[@class='button button--yellow']");
		
		/**
		 * Locators for Method How_fund_trip 
		 */
		
		By Single_payer = By.xpath("//div[@class='tab__item ' and contains(text(),'Single payer')]");
		By Rally_nt_lstd = By.xpath("//span[@class='sliderswitchbtn round']");
		By Crowdpowered = By.xpath("//div[@class='tab__item ' and contains(text(),'Crowdpowered')]");
		By Review = By.xpath("//div[@class='button--parent right']/button[@class='button button--yellow']");
		By Final_Step = By.xpath("//div[@class='button--parent right nicejob-btn']/button[@class='button button--yellow']");
		
		
	public UserEvent_SPA_G(WebDriver driver) {
		this.driver = driver;
	}
	
	public void As_Guest(String srch_name) throws InterruptedException {
		
		driver.findElement(Btn_Guest).click();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.findElement(Srch_bar).click();
		Thread.sleep(5000);
		driver.findElement(Srch_bar).sendKeys(srch_name);
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.findElement(New_Dest).click();
		Thread.sleep(5000);
		System.out.println("Guest method run completed");
		System.out.println(Date1);
		System.out.println(Date2);
	}
	
	public void Where_We_going(String rally_from, String rally_from_1, String rally_to) throws InterruptedException {
		
		driver.findElement(Rally_from).click();
		driver.findElement(Rally_from).sendKeys(rally_from);
		Thread.sleep(5000);
		driver.findElement(Rally_from).sendKeys(Keys.ARROW_DOWN);
		driver.findElement(Focus_out).click();
		Thread.sleep(5000);
		driver.findElement(Add_rally_Point).click();
		Thread.sleep(5000);
		driver.findElement(Rally_from_1).click();
		driver.findElement(Rally_from_1).sendKeys(rally_from_1);
		Thread.sleep(5000);
		driver.findElement(Rally_from_1).sendKeys(Keys.ARROW_DOWN);
		Thread.sleep(5000);
		driver.findElement(Focus_out).click();
		Thread.sleep(5000);
		driver.findElement(Rally_to).click();
		driver.findElement(Rally_to).sendKeys(rally_to);
		Thread.sleep(5000);
		driver.findElement(Rally_to).sendKeys(Keys.ARROW_DOWN);
		driver.findElement(Focus_out).click();
		Thread.sleep(5000);
		driver.findElement(Add_times).click();
		Thread.sleep(5000);
		System.out.println("Where_We_going method run completed");
	}
	
	public void Where_we_going_time() throws InterruptedException {
		
		driver.findElement(One_Side).click();
		Thread.sleep(5000);
		driver.findElement(Outbound_One).click();
		driver.findElement(Nxt_mnth).click();
		Thread.sleep(5000);
		driver.findElement(Sel_date).click();
		Thread.sleep(5000);
		driver.findElement(Round_Side).click();
		Thread.sleep(5000);
		driver.findElement(Return_Date).click();
		Thread.sleep(5000);
		driver.findElement(Nxt_mnth).click();
		Thread.sleep(5000);
		driver.findElement(Nxt_mnth).click();
		Thread.sleep(5000);
		driver.findElement(Sel_date1).click();
		Thread.sleep(5000);
		driver.findElement(Add_Contct_Info).click();
		Thread.sleep(5000);
		System.out.println("Where_we_going_time method run completed");
	}
	
	public void How_Stay_touch(String name_rally, String user_name, String user_email, String user_phone) throws InterruptedException {
		
		driver.findElement(Name_rally).click();
		driver.findElement(Name_rally).sendKeys(name_rally);
		Thread.sleep(5000);
		driver.findElement(User_Name).click();
		driver.findElement(User_Name).sendKeys(user_name);
		Thread.sleep(5000);
		driver.findElement(User_Email).click();
		driver.findElement(User_Email).sendKeys(user_email);
		Thread.sleep(5000);
		driver.findElement(User_Phone).click();
		driver.findElement(User_Phone).sendKeys(user_phone);
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		driver.findElement(Sel_bus).click();
		Thread.sleep(5000);
		driver.findElement(Chs_Fund_Mthd).click();
		Thread.sleep(5000);
		System.out.println("How_Stay_touch method run completed");
	}
	
	public void How_fund_trip() throws InterruptedException {
		
		driver.findElement(Single_payer).click();
		driver.findElement(Rally_nt_lstd).click();
		Thread.sleep(5000);
		driver.findElement(Crowdpowered).click();
		Thread.sleep(5000);
		
		/**
		WebElement Price_Slider = driver.findElement(By.id("userevent-seat-range-slider"));
		Actions move = new Actions(driver);
        Action action = (Action) move.dragAndDropBy(Price_Slider, 30, 0).build();
        action.perform();
        */
        
          WebElement slider = driver.findElement(By.id("userevent-seat-range-slider"));

           for (int i = 1; i <= 13 ; i++) {
            slider.sendKeys(Keys.ARROW_LEFT);
        }
         
        
        driver.findElement(Review).click();
        Thread.sleep(5000);
        driver.findElement(Final_Step).click();
        System.out.println("How_fund_trip method run completed");
		
	}
	
	
}
