package com.joeyroomuser.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import com.google.j2objc.annotations.Property;
import com.joeyrooms.utilies.PropertyReader;

public class DailyBooking 
{
	public WebDriver driver;
	Select select;
	public DailyBooking(WebDriver driver)
	{
		this.driver=driver;
	}
public void isdispaly() throws Exception
{
	String clickondaily=PropertyReader.getLocater("DailBookings", "Dailylink");
	By clickondailyl=By.xpath(clickondaily);
	WebElement clickondailylinkl=driver.findElement(clickondailyl);
	clickondailylinkl.isDisplayed();
	clickondailylinkl.click();
}
public void clickonlocationXIcon() throws Exception
{
	String clickonlocationXicon=PropertyReader.getLocater("DailBookings", "locationicon");
	By clickonlocationXiconl=By.xpath(clickonlocationXicon);
	WebElement clickonlocationXicons=driver.findElement(clickonlocationXiconl);
	clickonlocationXicons.isDisplayed();
	clickonlocationXicons.click();
}
public void ChangeLocation(String locationname) throws Exception
{
	String changelocationl=PropertyReader.getLocater("DailBookings", "location");
	By changelocationL=By.xpath(changelocationl);
	WebElement changelocation=driver.findElement(changelocationL);
	changelocation.clear();
	changelocation.sendKeys(locationname);
}
public void ChangeGender() throws Exception
{
	String changeGender=PropertyReader.getLocater("DailBookings", "Gender");
	By changeGenderl=By.xpath(changeGender);
	WebElement changeGenderls=driver.findElement(changeGenderl);
	select =new Select(changeGenderls);
	select.selectByVisibleText("Any");	
}
public void clickonSearch() throws Exception
{
	String clickonsearchl=PropertyReader.getLocater("DailBookings", "Searchbtn");
	By clickonsearchbtbnl=By.xpath(clickonsearchl);
	WebElement clickonseachbtn=driver.findElement(clickonsearchbtbnl);
	clickonseachbtn.click();
	
}
public void clickonproperty() throws Exception
{
	String propertyl=PropertyReader.getLocater("DailBookings", "propertynamel");
	By property=By.xpath(propertyl);
	WebElement propertylinkl=driver.findElement(property);
	propertylinkl.isDisplayed();
	propertylinkl.click();
	
}
public void isdisplaypropertyname() throws Exception
{
	String propertynamel=PropertyReader.getLocater("DailBookings", "propertyname");
	By propertyname=By.xpath(propertynamel);
	WebElement propertynameL=driver.findElement(propertyname);
	propertynameL.isDisplayed();
	String propertytext=propertynameL.getText();
	System.out.println(propertytext);
	
	
}
public void isdisplayroomprice() throws Exception
{
	String roomprice=PropertyReader.getLocater("DailBookings", "roomprice");
	By roompricel=By.xpath(roomprice);
	WebElement roompriceL=driver.findElement(roompricel);
	roompriceL.isDisplayed();
	String roomtext=roompriceL.getText();
	System.out.println(roomtext);
	
	
	
}
public void clickonroom() throws Exception
{
	String selectToroom=PropertyReader.getLocater("DailBookings", "clickonroom");
	By selectToRooml=By.xpath(selectToroom);
	WebElement selectTorooml=driver.findElement(selectToRooml);
	selectTorooml.isDisplayed();
	selectTorooml.click();
	
}
public void clickonbooknow() throws Exception
{
	String booknow=PropertyReader.getLocater("DailBookings", "booknowl");
	By booknowl=By.xpath(booknow);
	WebElement booknowL=driver.findElement(booknowl);
	booknowL.isDisplayed();
	booknowL.click();
	
}
public void ViewmoreCoupons() throws Exception
{
	String viewmorecoupons=PropertyReader.getLocater("DailBookings", "viewmorecoupons");
	By viewmorecouponsl=By.xpath(viewmorecoupons);
	WebElement viewmorecouponsL=driver.findElement(viewmorecouponsl);
	viewmorecouponsL.click();
}
public void clickonApplybtn() throws Exception
{
	String applybtn=PropertyReader.getLocater("DailBookings", "clickonapplybtn");
	By applybtnl=By.xpath(applybtn);
	WebElement applybtnL=driver.findElement(applybtnl);
	applybtnL.click();
}
public void clickonpayatcheckinbtn() throws Exception
{
	String payatcheckbtn=PropertyReader.getLocater("DailBookings", "payatcheckin");
	By payatcheckbtnl=By.xpath(payatcheckbtn);
	WebElement payatcheckl=driver.findElement(payatcheckbtnl);
	payatcheckl.click();
	
	
}

}
