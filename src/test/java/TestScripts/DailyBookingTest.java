package TestScripts;


import java.util.List;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.joeyrooms.utilies.Browser;
import com.joeyrooms.utilies.PropertyReader;
import com.joeyroomuser.pages.DailyBooking;
import com.joeyroomuser.pages.loginpage;

public class DailyBookingTest 
{
	WebDriver driver;
	loginpage lo;
	DailyBooking daily;
	@BeforeMethod
	public void Setup() throws Exception
	{
		List<String>info=PropertyReader.getData("browser", 1);
		String broswername=info.get(0), drivername=info.get(1),url=info.get(2);
		driver=Browser.LanchBrowser(broswername, drivername);
		driver=Browser.openUrl(url);
		
	}
	@AfterMethod
	public void closebroswer()
	{
		driver.close();
	}
	@Test
	public void bookingHostelroom() throws Exception
	{
		lo=new loginpage(driver);
		daily=new DailyBooking(driver);
		lo.clickonloginlink();
		lo.clickonloginwithpassword();
	List<String>info=PropertyReader.getdataa("loginpage", 1);
//	String user="6300867226";
	String user=info.get(0);
	String pass=info.get(1);
	lo.joeyroomlogin(user, pass);
	 Thread.sleep(2000);
	 lo.isdisplayGobutton();
	 Thread.sleep(2000);
	 lo.IsDisplayTitle();
	 lo.isdisplayTextMsg();
	 Thread.sleep(2000);
	 daily.isdispaly();
	 daily.clickonlocationXIcon();
	 String lname=info.get(2);
	 daily.ChangeLocation(lname);
	 daily.ChangeGender();
	 Thread.sleep(2000);
	 daily.clickonSearch();
	 Thread.sleep(3000);
	 daily.clickonproperty();
	 daily.isdisplaypropertyname();
	 daily.isdisplayroomprice();
	 daily.clickonroom();
	 daily.clickonbooknow();
	 daily.ViewmoreCoupons();
	 Thread.sleep(2000);
	 daily.clickonApplybtn();
	 Thread.sleep(2000);
	 daily.clickonpayatcheckinbtn();
	 
	}
	

}
