package OptiAM_Login;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.google.gson.annotations.Until;

public class Login_Page {
	
	public static void main(String[] args) throws InterruptedException {
		String URL = "https://asi-fsd-usda.optiam.us/Home"; 
		By Login_ID = By.name("user_id");
		String User_Name = "vivekanand";
		By PasswordField = By.name("password");
		String UserPassword = "Vivekanand@11888";
		By Login_Btn = By.name("loginSubmit");
		By LoanProgramSelection = By.xpath("//a[@title='Loan Program']");
		By Usda_Btn = By.id("OptiAM USDA");
		By UserNameClick = By.xpath("//span[@class='glyphicon glyphicon-user']");
		By LogOut = By.xpath("//a[@ng-click='logout()']");
		By Servicing = By.xpath("(//li[@class='nav-item dropdown'])[1]");
		By CaseSearch = By.xpath("(//a[contains(text(),'Case Search')])[1]");
		By CaseNumberBox = By.xpath("//input[@title='LSO_USDA_FHACaseNo341234_title']");
		String CaseNumber = "99900084444";
		By SearchBtn = By.xpath("(//button[@ng-click='Search()'])[2]");
		
		
		
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get(URL);
		driver.findElement(Login_ID).sendKeys(User_Name);
		driver.findElement(PasswordField).sendKeys(UserPassword);
		driver.findElement(Login_Btn).click();
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(15));
		wait.until(ExpectedConditions.elementToBeClickable(LoanProgramSelection));
		driver.findElement(LoanProgramSelection).click();
		wait.until(ExpectedConditions.elementToBeClickable(Usda_Btn));
		driver.findElement(Usda_Btn).click();
		wait.until(ExpectedConditions.elementToBeClickable(Servicing));
		driver.findElement(Servicing).click();
		driver.findElement(CaseSearch).click();
		wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(CaseNumberBox));
		driver.findElement(CaseNumberBox).sendKeys(CaseNumber);
		wait.until(ExpectedConditions.elementToBeClickable(SearchBtn));
		driver.findElement(SearchBtn).click();
		
		Thread.sleep(10000);
		
		driver.findElement(UserNameClick).click();
		driver.findElement(LogOut).click();
	}
}
