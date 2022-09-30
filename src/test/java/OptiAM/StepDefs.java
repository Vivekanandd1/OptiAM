package OptiAM;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;



public class StepDefs {
	WebDriver driver;
	Login_Page login_page;
	
	@BeforeTest
	public void setUp() throws Throwable{
		login_page  = new Login_Page(driver);
	}
		
	
	@Test(priority = 0)
	public void User_Login() throws InterruptedException, IOException {
		login_page.Login();
	}
	
	@Test(priority = 1)
	public void SearchScreens() throws IOException, InterruptedException {
		login_page.CaseSearch();
	}
	
	@AfterTest
	public void User_Logout() {
		login_page.LogOut();
	}
	}

