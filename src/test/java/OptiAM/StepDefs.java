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
	
	@BeforeTest
	public void setUp() throws Throwable{
		driver = new ChromeDriver();
		driver.manage().window().maximize();
	  	driver.manage().timeouts().implicitlyWait( Duration.ofSeconds(100));
		login_page  = new Login_Page(driver);
		searchscreens = new SearchScreens(driver);
	}
		
	
	@Test(priority = 0)
	public void User_Login() throws InterruptedException, IOException {
		login_page.Login();
	}
	
	@Test(priority = 1)
	public void SearchScreens() throws IOException, InterruptedException {
		searchscreens.CaseSearch();
		searchscreens.CaseAssigned();
		searchscreens.Forclosure();
	}
	
	@AfterTest
	public void User_Logout() {
		login_page.LogOut();
	}
	}

