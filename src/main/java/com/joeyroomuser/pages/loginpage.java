package com.joeyroomuser.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import com.joeyrooms.utilies.Browser;
import com.joeyrooms.utilies.DataConfiguration;
import com.joeyrooms.utilies.PropertyReader;

public class loginpage
{
	private  WebDriver driver;
	public loginpage(WebDriver driver) 
	{
		this.driver=driver;
	}
	public  void isdisplaymsg() throws Exception
	{
		
		String searchtextmsgl=PropertyReader.getLocater("Loginpage", "searchtext");
		By searchtextmsgs=By.xpath(searchtextmsgl);
		WebElement searchtxt=driver.findElement(searchtextmsgs);
		//Browser.Waitmethod(searchtxt);
		String msg=searchtxt.getText();
		System.out.println(msg);
	    Assert.assertEquals(msg,DataConfiguration.validateOfsearchtext, "Test case pass");
		Browser.TakeSelfi("image000");
	}
	public void clickonloginlink() throws Exception
	{
		String loginlinkL=PropertyReader.getLocater("Loginpage", "loginbuttonlink");
		By loginlinkl=By.xpath(loginlinkL);
		WebElement loginl=driver.findElement(loginlinkl);
		loginl.click();
	
	}
	public void clickonloginwithpassword() throws Exception
	{
		String loginwithpwd=PropertyReader.getLocater("Loginpage", "loginwithpassword");
		By loginwithpswd=By.xpath(loginwithpwd);
		WebElement loginpwd=driver.findElement(loginwithpswd);
		loginpwd.click();
		
	}
	private void SetEmail(String username) throws Exception
	{
		String emailTextl=PropertyReader.getLocater("Loginpage", "Emailtext");
		By emailtxtboxL=By.xpath(emailTextl);
		WebElement emailtxtL=driver.findElement(emailtxtboxL);
		Browser.Waitmethod(emailtxtL);
		emailtxtL.sendKeys(username);
		//emailtxtL.sendKeys("6300867226");
	}
	private void SetPassword(String pass) throws Exception
	{
		String passwordl=PropertyReader.getLocater("Loginpage", "passwordtext");
		By passwordtxtL=By.xpath(passwordl);
		WebElement passwordTextL=driver.findElement(passwordtxtL);
		Browser.Waitmethod(passwordTextL);
		passwordTextL.sendKeys(pass);
		//passwordTextL.sendKeys("abcd@123");
	}
	public  void clikonloginBtn() throws Exception
	{
		String loginbtnl=PropertyReader.getLocater("Loginpage", "loginbutton");
		By loginbtnL=By.xpath(loginbtnl);
		WebElement Loginbtnl=driver.findElement(loginbtnL);
		Browser.Waitmethod(Loginbtnl);
		Loginbtnl.click();
	}
	
	public  void isdisplayGobutton() throws Exception
	{
		String gobutton=PropertyReader.getLocater("Loginpage", "gobutton");
		By gobuttonl=By.xpath(gobutton);
		WebElement gobuttontext=driver.findElement(gobuttonl);
		Browser.Waitmethod(gobuttontext);
		String text=gobuttontext.getText();
		System.out.println(text);
		gobuttontext.click();
		//Assert.assertEquals(text,DataConfig.validateOfLoginToAudioDigestmsg, "Test case pass");
	}
	public void IsDisplayTitle() throws Exception
	{
		String dailybooking=PropertyReader.getLocater("Loginpage", "dailybooking");
		
	    By dailybookingl=By.xpath(dailybooking);
	     WebElement dailybookings=driver.findElement(dailybookingl);
	     
	     String weeklybooking=PropertyReader.getLocater("Loginpage", "weeklybooking");
		    By weeklybookingl=By.xpath(weeklybooking);
		     WebElement weeklybookings=driver.findElement(weeklybookingl);
		     
		     
			     
	    if(dailybookings.isDisplayed())
	    {
	     Browser.Waitmethod(dailybookings);
	    String msg=dailybookings.getText();
	    System.out.println(msg);
	    dailybookings.click();
	    }
	    else if(weeklybookings.isDisplayed())
	    {
	    	 Browser.Waitmethod(weeklybookings);
	    	 String msg=weeklybookings.getText();
	    	 System.out.println(msg);
	    	 weeklybookings.click();
	    }
	    else
	    {
	    	 String monthly=PropertyReader.getLocater("Loginpage", "monthlybooking");
			    By monthlyl=By.xpath(monthly);
			     WebElement monthlybooking=driver.findElement(monthlyl); 
			     Browser.Waitmethod(monthlybooking);
		    	 String msg=monthlybooking.getText();
		    	 System.out.println(msg);
		    	 monthlybooking.click();
	    }
	    //Assert.assertEquals(msg, DataConfig.validateofofErrormsgOfloginpage,"login successfully test case pass");
	}
	public void isdisplayTextMsg() throws Exception
	{
		String textmesg=PropertyReader.getLocater("Loginpage", "textmsg");
		By textmsg=By.xpath(textmesg);
		WebElement text=driver.findElement(textmsg);
		Browser.Waitmethod(text);
		String msg=text.getText();
		System.out.println("login successfullt"+msg);
		
		Assert.assertEquals(msg, DataConfiguration.validateofTextmsg,"test case pass");
	}
	public  void joeyroomlogin(String username,String pass) throws Exception
	{
		this.SetEmail(username);
		this.SetPassword(pass);
//		this.clikonloginBtn();
	}
}
