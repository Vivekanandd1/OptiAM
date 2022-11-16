package OptiAM;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.ElementClickInterceptedException;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class MondayEmailTesting {
	WebDriver driver;
	WebDriverWait wait;
	JavascriptExecutor executor;
	
	public MondayEmailTesting(WebDriver driver) {
		this.driver = driver;
		executor = (JavascriptExecutor)driver;
	}
	
	String CaseNumber = "8899000371";
	By LoanProgram = By.xpath("//a[@title='Loan Program']");
	By DcamBtn = By.xpath("//label[@for='DCAMS']");
	By Servicing = By.xpath("(//li[@class='nav-item dropdown'])[1]");
	By CaseWizard = By.xpath("//a[normalize-space()='Case Wizard']");
	By CaseNumberBox = By.xpath("//input[@id='LoanNo']");
	By Program = By.xpath("//select[@id='LoanProgram21']");
	By Status = By.xpath("//select[@id='LoanStatus2']");
	By PrincipalAmt = By.xpath("//input[@id='OrigPrinAmt11']");
	By LoanBalance = By.xpath("//input[@id='TotalLoanBalance']");

	
	public void DcamCaseWizard() throws InterruptedException {
		wait = new WebDriverWait(driver, Duration.ofSeconds(10000000));
		driver.findElement(LoanProgram).click();
		driver.findElement(DcamBtn).click();
		wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(Servicing));
		wait.until(ExpectedConditions.presenceOfElementLocated(Servicing));
		wait.until(ExpectedConditions.elementToBeClickable(Servicing));
		Thread.sleep(5000);
	    driver.findElement(Servicing).click();
		driver.findElement(CaseWizard).click();
		Thread.sleep(5000);
		driver.findElement(CaseNumberBox).sendKeys(CaseNumber);
		WebElement ProgramSelection = driver.findElement(Program);
	    Select ProgramSelect = new Select(ProgramSelection);
	    ProgramSelect.selectByVisibleText("Generic Debt");
	    WebElement StatusSelection = driver.findElement(Status);
	    Select StatusSelect = new Select(StatusSelection);
	    StatusSelect.selectByVisibleText("Assigned");
	    driver.findElement(PrincipalAmt).sendKeys("2000");
	}

}
