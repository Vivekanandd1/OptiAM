package OptiAM;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.IOException;
import java.time.Duration;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;



public class StepDefs {
	WebDriver driver;
	Login_Page login_page;
	SearchScreens searchscreens;
	NewMessaging Newmessaging;
	CaseBoarding Caseborading;
	OldMessaging oldMessaging;

	
	@BeforeTest
	public void setUp() throws Throwable{
		driver = new ChromeDriver();
		driver.manage().window().maximize();
	  	driver.manage().timeouts().implicitlyWait( Duration.ofSeconds(100));
		login_page  = new Login_Page(driver);
		searchscreens = new SearchScreens(driver);
		Newmessaging = new NewMessaging(driver);
		Caseborading = new CaseBoarding(driver);
		oldMessaging = new OldMessaging(driver);
	}
		
	
	@Test(priority = 0)
	public void User_Login() throws InterruptedException, IOException, AWTException {
		login_page.Login();
	}
	
	@Test(priority = 1)
	public void CaseBoarding() throws InterruptedException, IOException {
		Caseborading.Translation();
	}
	
	@Test(priority = 2)
	public void SearchScreens() throws IOException, InterruptedException {
		searchscreens.CaseAssigned();
		searchscreens.Forclosure();
		searchscreens.Bankruptcy();
		searchscreens.ReoScreens();	
		searchscreens.USDPPS();
		searchscreens.Mediation();
		searchscreens.Eviction();
		searchscreens.AppraisalLegal();
		searchscreens.AppraisalREO();
		searchscreens.PropertyPreservation();
		searchscreens.DisputeResolution();
		searchscreens.GeneralInquiry();
		searchscreens.Notice();
		searchscreens.DemandLetter();
		searchscreens.StatutoryNotice();
		searchscreens.PendingResearch();
		searchscreens.CaseSearch();
	}
	
	
     @Test(priority = 3)
	 public void NewMessagingSubSystem() throws InterruptedException, IOException {
		Newmessaging.PropertyPreservationPI100();
		Newmessaging.PropertyPreservationPI200();
		Newmessaging.PropertyPreservationPGM100();
		Newmessaging.PropertyPreservationPGM200();
		Newmessaging.ForeclosureUncontestedUF100();
		Newmessaging.ForeclosureUncontestedUF150();
		Newmessaging.ForeclosureUncontestedUF200();
		Newmessaging.ForeclosureUncontestedUF250();
		Newmessaging.ForeclosureUncontestedUF300();
		Newmessaging.ForeclosureUncontestedUF350();
		Newmessaging.ForeclosureUncontestedUF400();
		Newmessaging.ForeclosureUncontestedUF500();
		Newmessaging.PreReoP500();
		Newmessaging.ClassValuationRA500();
		Newmessaging.ReoR0110();
		Newmessaging.ReoR0120();
		Newmessaging.ReoR0130();
		Newmessaging.ReoR0140();
		Newmessaging.ReoR0150();
		Newmessaging.ReoR0160();
		Newmessaging.ReoR0180();
		Newmessaging.ReoR0500();	
	}
	
     
     @Test(priority = 4)
     public void OldMessaging() throws InterruptedException, IOException {
    	 oldMessaging.PropertyPreservation();
    	 oldMessaging.ForeclosureUnContested();
    	 oldMessaging.PreReo();
    	 oldMessaging.AppraisalValutionReo();
    	 oldMessaging.REO();
     }
	
	@AfterTest
	public void User_Logout() throws InterruptedException {
		login_page.LogOut();
	}
	


}

