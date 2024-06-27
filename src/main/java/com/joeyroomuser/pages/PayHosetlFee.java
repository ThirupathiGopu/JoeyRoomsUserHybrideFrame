package com.joeyroomuser.pages;

import org.openqa.selenium.By;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import com.joeyrooms.utilies.PropertyReader;

public class PayHosetlFee 
{

	private  WebDriver driver;
	Select select;
	public PayHosetlFee(WebDriver driver) 
	{
		this.driver=driver;
	}
	public void clickonPayHosetlFee() throws Exception
	{
		String payHostelFeeLinkL=PropertyReader.getLocater("PayHostelFee", "payhostelFee");
		By payhstlfeel=By.xpath(payHostelFeeLinkL);
		WebElement payhostelL=driver.findElement(payhstlfeel);
		if (payhostelL.isDisplayed())
		{
			payhostelL.click();
			String payHostelFeeTitletext=PropertyReader.getLocater("PayHostelFee", "payhosteltext");
			By payHostelFeeTitletextl=By.xpath(payHostelFeeTitletext);
			WebElement payHostelFeeTitletextL=driver.findElement(payHostelFeeTitletextl);
			String text=payHostelFeeTitletextL.getText();
			System.out.println(text);
		}
	}
	public void EnterGuestName(String guesename) throws Exception
	{
		String guestnamel=PropertyReader.getLocater("PayHostelFee", "Guestname");
		By guestname=By.xpath(guestnamel);
		WebElement guestnameL=driver.findElement(guestname);
		guestnameL.sendKeys(guesename);
	}
	public void EnterMobileNumber(String mobilenumber) throws Exception
	{
		String guestnamel=PropertyReader.getLocater("PayHostelFee", "MobileNumber");
		By guestname=By.xpath(guestnamel);
		WebElement guestnameL=driver.findElement(guestname);
		guestnameL.sendKeys(mobilenumber);
	}
	public void EnterEmailId(String emailid) throws Exception
	{
		String email=PropertyReader.getLocater("PayHostelFee", "EmailId");
		By emaill=By.xpath(email);
		WebElement emaillL=driver.findElement(emaill);
		emaillL.sendKeys(emailid);
	}
	public void EnterPropertyId(String propertid) throws Exception
	{
		String propertyid=PropertyReader.getLocater("PayHostelFee", "PropertyId");
		By propertyidl=By.xpath(propertyid);
		WebElement propertyidL=driver.findElement(propertyidl);
		propertyidL.sendKeys(propertid);
		
	}
	public void clickonroomModel() throws Exception
	{
		String roomModel=PropertyReader.getLocater("PayHostelFee", "RoomModel");
		By roomModell=By.xpath(roomModel);
		WebElement roomModelL=driver.findElement(roomModell);
		select =new Select(roomModelL);
		select.selectByVisibleText("Rrr");
		
	}
	public void SelectMotn() throws Exception
	{
		String selecetmonth=PropertyReader.getLocater("PayHostelFee", "SelectMonth");
		By selectmntl=By.xpath(selecetmonth);
		WebElement selectmntlL=driver.findElement(selectmntl);
		selectmntlL.isDisplayed();
		selectmntlL.click();
		Thread.sleep(3000);
		String febMonthcheckbox=PropertyReader.getLocater("PayHostelFee", "FebMonth");
		By febmonth=By.xpath(febMonthcheckbox);
		WebElement febmontl=driver.findElement(febmonth);
		febmontl.click();
		Thread.sleep(2000);
	    String marchmonthcheckbx=PropertyReader.getLocater("PayHostelFee", "MarchMonth");
		By march=By.xpath(marchmonthcheckbx);
		WebElement marchl=driver.findElement(march);
		marchl.click();
		
	}
	
	public void EnterBookingamount(String amount) throws Exception
	{
		String bookingamount=PropertyReader.getLocater("PayHostelFee", "BookingAmount");
		By bookingamountl=By.xpath(bookingamount);
		WebElement bookingamountlL=driver.findElement(bookingamountl);
		bookingamountlL.sendKeys(amount);
			
	}
	public void Viewmorecoupons() throws Exception
	{
		String coupons=PropertyReader.getLocater("PayHostelFee", "viewmorecupons");
		By couponsl=By.xpath(coupons);
		WebElement couponslL=driver.findElement(couponsl);
	   if (	couponslL.isDisplayed())
	 {
			couponslL.click();
			String applycoupons=PropertyReader.getLocater("PayHostelFee", "applybtn");
			By apply=By.xpath(applycoupons);
			WebElement applyl=driver.findElement(apply);
			applyl.click();
	 }
		
	}
	public void clickonbooknowButton() throws Exception
	{
		String booknowbtn=PropertyReader.getLocater("PayHostelFee", "booknowbtn");
		By booknowbtnl=By.xpath(booknowbtn);
		WebElement booknowbtne=driver.findElement(booknowbtnl);
		booknowbtne.click();
	}
	
	
}
