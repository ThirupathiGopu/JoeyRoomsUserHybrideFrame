package TestScripts;

import java.util.List;

import org.apache.poi.ss.usermodel.DataFormat;
import org.apache.poi.ss.usermodel.DataFormatter;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.joeyrooms.utilies.Browser;
import com.joeyrooms.utilies.ExtentReportManager;
import com.joeyrooms.utilies.PropertyReader;
import com.joeyroomuser.pages.loginpage;

public class LoginpageTest 
{

	WebDriver driver;
	loginpage login;
	@BeforeMethod
	public void SetUp() throws Exception
	{
	   	List<String>info=PropertyReader.getData("browser", 1);
	   	String browsername=info.get(0),drivername=info.get(1),url=info.get(2);
	   	driver=Browser.LanchBrowser(browsername, drivername);
	   	driver=Browser.openUrl(url);
	   	Browser.TakeSelfi("image1");
	  Thread.sleep(3000);
	  
	   	ExtentReportManager.startTest("Joeyrooms", "test case description", "test case pass");   	
	}
	@AfterMethod
	public void close()
	{
		driver=Browser.closebrowser();
		ExtentReportManager.stopReport();
	}

	@DataProvider
	public  Object[][] logininfo() throws Exception 
	{
	    String[][]  data = PropertyReader.getdata("loginpage");
	   
	    return data;
	}
	@Test(enabled=true,dataProvider="logininfo")
	public void lognwithmultipleData(String user,String pass) throws Exception
	{
		login=new loginpage(driver);
		login.clickonloginlink();
		Browser.TakeSelfi("image2");
		login.isdisplaymsg();
		login.joeyroomlogin(user,pass);
		Thread.sleep(2000);
	    login.clikonloginBtn();
		Browser.TakeSelfi("image3");
		Browser.verifyurl();
	}
	
	@Test(enabled=false)
	public void VerifuFunctionalityJoeyRoomsLoginwithValidaData() throws Exception
	{

		ExtentReportManager.startReport();
		login=new loginpage(driver);
		 Thread.sleep(3000);
		 login.clickonloginlink();
		 Browser.TakeSelfi("image02");
		 Thread.sleep(4000);
		 login.clickonloginwithpassword();
		List<String> info=PropertyReader.getdataa("loginpage", 1);
		// String info=PropertyReader.getdata("loginpage", 1, 0);
	    String user=info.get(0);
		
		String pass=info.get(1); 
		 Browser.TakeSelfi("image01");
		 Thread.sleep(2000);
		 login.joeyroomlogin(user, pass);
		 Thread.sleep(3000);
		 login.clikonloginBtn();
//		 login.isdisplayGobutton();
//		 login.IsDisplayTitle();
//		 login.isdisplayTextMsg();
		 Browser.TakeSelfi("image3");
		 //Browser.TakeSelfi("image2");
		 ExtentReportManager.stopReport();
	}
	@Test(enabled=false)
	public void VerifuFunctionalityAudioDigestLoginwithInValidaData() throws Exception
	{
		ExtentReportManager.startReport();
		
		List<String> info=PropertyReader.getData("loginpage", 0);
		String email=info.get(0),pass=info.get(1);
		 login=new loginpage(driver);
		// login.clickonloginlink();
		 Thread.sleep(2000);
		 login.isdisplaymsg();
		 Thread.sleep(2000);
		 login.joeyroomlogin(email,pass);
		 Browser.TakeSelfi("image1");
		
		 Browser.TakeSelfi("image2");
		 ExtentReportManager.stopReport();
	}
//	@DataProvider(name="loginpage")
//	public  String[][]	GetLoginMultipleData() throws Exception
//	{
//		String data[][]=PropertyReader.getdata("loginpage");
//		return data;		
//	}
	
	
}
