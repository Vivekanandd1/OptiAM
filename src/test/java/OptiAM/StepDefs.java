package OptiAM;

import java.io.IOException;
import java.time.Duration;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;



public class StepDefs {
	WebDriver driver;
	Login_Page login_page;
	SearchScreens searchscreens;
	NewMessaging Newmessaging;
	
	@BeforeTest
	public void setUp() throws Throwable{
		driver = new ChromeDriver();
		driver.manage().window().maximize();
	  	driver.manage().timeouts().implicitlyWait( Duration.ofSeconds(100));
		login_page  = new Login_Page(driver);
		searchscreens = new SearchScreens(driver);
		Newmessaging = new NewMessaging(driver);
	}
		
	
	@Test(priority = 0)
	public void User_Login() throws InterruptedException, IOException {
		login_page.Login();
	}
	
	@Test(priority = 1)
	public void SearchScreens() throws IOException, InterruptedException {
		searchscreens.CaseSearch();
//		searchscreens.CaseAssigned();
//		searchscreens.Forclosure();
//		searchscreens.Bankruptcy();
//		searchscreens.ReoScreens();	
//		searchscreens.USDPPS();
//		searchscreens.Mediation();
//		searchscreens.Eviction();
//		searchscreens.AppraisalLegal();
//		searchscreens.AppraisalREO();
//		searchscreens.PropertyPreservation();
//		searchscreens.DisputeResolution();
//		searchscreens.GeneralInquiry();
//		searchscreens.Notice();
//		searchscreens.DemandLetter();
//		searchscreens.StatutoryNotice();
//		searchscreens.PendingResearch();
	}
	
	@Test(priority = 2)
	public void NewMessagingSubSystem() throws InterruptedException, IOException {
		Newmessaging.PropertyPreservationPI100();
		Newmessaging.PropertyPreservationPI200();
		Newmessaging.PropertyPreservationPGM100();
		Newmessaging.PropertyPreservationPGM200();
	}
//	@AfterTest
//	public void User_Logout() {
//		login_page.LogOut();
//	}
	}

