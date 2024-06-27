package TestScripts;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.joeyrooms.utilies.Browser;
import com.joeyrooms.utilies.ExtentReportManager;
import com.joeyrooms.utilies.PropertyReader;
import com.joeyroomuser.pages.PayHosetlFee;
import com.joeyroomuser.pages.loginpage;

public class PayHostelFeeTestPage {
	WebDriver driver;
	loginpage login;
	PayHosetlFee payhst;

	@BeforeMethod
	public void SetUp() throws Exception {
		List<String> info = com.joeyrooms.utilies.PropertyReader.getData("browser", 1);
		String browsername = info.get(0), drivername = info.get(1), url = info.get(2);
		driver = Browser.LanchBrowser(browsername, drivername);
		driver = Browser.openUrl(url);

		ExtentReportManager.startTest("Joeyrooms", "test case description", "test case pass");
	}

	@AfterMethod
	public void close() {
		driver = Browser.closebrowser();
		ExtentReportManager.stopReport();
	}

	@Test
	public void payHostlfee() throws Exception {
		ExtentReportManager.startReport();
//		List<String> info=PropertyReader.getdata("loginpage", 1);
//		//String email="6300867226";
//		String pass=info.get(1);  
		login = new loginpage(driver);
		login.clickonloginlink();
		Thread.sleep(3000);
		login.clickonloginwithpassword();
		Thread.sleep(3000);
		// login.joeyroomlogin();
		Thread.sleep(3000);
		payhst = new PayHosetlFee(driver);
		payhst.clickonPayHosetlFee();

		List<String> inf = PropertyReader.getData("PayhostelFee", 1);
		String name = inf.get(0);
		payhst.EnterGuestName(name);
		String number = "8179592352";
		payhst.EnterMobileNumber(number);
		List<String> infer = PropertyReader.getData("PayhostelFee", 3);
		String emailid = infer.get(0);
		payhst.EnterEmailId(emailid);
		List<String> prop = PropertyReader.getData("PayhostelFee", 4);
		String propId = prop.get(0);
		payhst.EnterPropertyId(propId);
		payhst.clickonroomModel();
		payhst.SelectMotn();
		String bookingamount = "2500";
		payhst.EnterBookingamount(bookingamount);
		Thread.sleep(2000);
		payhst.Viewmorecoupons();
		payhst.clickonbooknowButton();
	}
}
