/**
 * 
 */
package com.qa.rwue.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

/**
 * @author Pratyush
 * 
 *  This class is for Booking SPA as If we want to test Booking SPA then we have to run this class.
 * 
 *  Created on 26/05/20
 * 
 *  All Methods and Locators were present here and we call them in Testcases.
 * 
 *  This class is created on POM Design Pattern with normal Approach.
 * 
 */

public class Booking_SPA_L {

	WebDriver driver;
	
	/**
	 * Locator for Method Search_Rally_Point
	 */
	By Srch_rally = By.xpath("//input[@id='search__rally-ip']");
	By Slct_From_Lst = By.xpath("//*[@id=\"search__component\"]/div/div/ul/li[1]/div[2]/div");
	By Slct_City = By.xpath("//*[@id=\"divCitiesTable\"]/table/tbody/tr/td[2]/ul/li[2]/a");
	By Slct_book = By.xpath("//*[@id=\"mainWrapper\"]/div/div[1]/div/div/div/div/div/div/div/div[2]/a");
	
	/**
	 * Locator for Method Add_rides
	 */
	By Add_one_ride = By.xpath("/html/body/div/main/div[3]/div/button/div[2]");
	By Log_In = By.xpath("/html/body/div/main/div/div[1]/span/a");
	By Email = By.xpath("//input[@id='Email']");
	By Pass = By.xpath("//input[@id='Password']");
	By Submit = By.xpath("//*[@id=\"log_in_form\"]/div[5]/a");
	
	/**
	 * Locator for Method Review_booking
	 */
	By Confrm_book = By.xpath("//button[@text='Confirm booking']");
	By Card_Num = By.xpath("/html/body/div/main/div/div[2]/div/label/input");
	By Date = By.xpath("/html/body/div/main/div/div[2]/div/div[2]/label[1]/input");
	By Cvv = By.xpath("/html/body/div/main/div/div[2]/div/div[2]/label[2]/input");
	By fnl_book = By.xpath("/html/body/div/main/div/div[3]/button/div[2]");
	By fnl_text = By.xpath("//h3[contains(text(),'Thank you!')]");
	
	
	public Booking_SPA_L(WebDriver driver) {
		this.driver = driver;
	}
	
	public void Search_Rally_point(String srch_rally) throws InterruptedException{
		
		driver.findElement(Srch_rally).click();
		driver.findElement(Srch_rally).sendKeys(srch_rally);
		Thread.sleep(5000);
		driver.findElement(Slct_From_Lst).click();
		Thread.sleep(5000);
		driver.findElement(Slct_City).click();
		Thread.sleep(5000);
		driver.findElement(Slct_book).click();
		System.out.println("Method Search_Rally_point completed");
		Thread.sleep(10000);
	}
	
	public void Add_rides(String uname, String pass) throws InterruptedException{
		
		driver.findElement(Add_one_ride).click();
		Thread.sleep(5000);
		driver.findElement(Log_In).click();
		Thread.sleep(5000);
		driver.findElement(Email).sendKeys(uname);
		driver.findElement(Pass).sendKeys(pass);
		driver.findElement(Submit).click();
		System.out.println("Method Add_rides Completed");
		Thread.sleep(5000);
	}
	
	public void Review_booking(String card,String date, String cvv) throws InterruptedException{
		
		driver.findElement(Confrm_book).click();
		Thread.sleep(5000);
		driver.findElement(Card_Num).click();
		driver.findElement(Card_Num).sendKeys(card);
		Thread.sleep(5000);
		driver.findElement(Date).click();
		driver.findElement(Date).sendKeys(date);
		Thread.sleep(5000);
		driver.findElement(Cvv).click();
		driver.findElement(Cvv).sendKeys(cvv);
		Thread.sleep(5000);
		driver.findElement(fnl_book).click();
		System.out.println("Method Review_booking Completed");
	}
}
