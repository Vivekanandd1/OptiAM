package OptiAM;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;


public class CaseWizard {
	WebDriver driver;
	Actions builder; 
	WebDriverWait wait;
	
	public CaseWizard(WebDriver driver) {
	  this.driver=driver;
	  builder = new Actions(driver);
	}
	String CaseNumber = "8899000361";
	By Servicing = By.xpath("(//li[@class='nav-item dropdown'])[1]");
	By CaseWizard = By.xpath("//a[contains(text(),'Case Wizard')]");
	By CaseProgramSelection = By.xpath("//select[@id='LoanProgram21']");
	By CaseNumberBox = By.xpath("//input[@id='LoanNo']");
	By CaseSelection = By.xpath("//select[@id='LoanStatus2']");
	By CaseAmount = By.xpath("//input[@id='OrigPrinAmt11']");
	By PropertyZip = By.xpath("//input[@id='PropertyAddressZipcode4']");
	By PropertyCity = By.xpath("//input[@id='PropertyAddressCity']");
	By PropertyState = By.xpath("//select[@id='PropertyAddressState']");
	By PropertyAddressStreet = By.xpath("//input[@id='PropertyAddressStreet']");
	By Description = By.xpath("//a[@aria-label='link']//span//*[name()='svg']");
	By DescriptionBox = By.xpath("//textarea[@id='LegalDescription']");
	By DescriptionSaveBtn = By.xpath("(//button[contains(text(),'Save')])[2]");
	By DebtAmount = By.xpath("//input[@id='USDA_TotalDebtAmount']");
	By Service = By.xpath("//select[@id='USDA_ServiceType']");
	By ActionCode = By.xpath("//select[@id='USDA_Action_Code']");
	By SubStatus = By.xpath("//select[@id='Activity_or_Sub_Status_Type']");
	By LocationCode = By.xpath("//input[@id='Text4']");
	
	public void CaseFromCaseWizard() {
		wait = new WebDriverWait(driver,Duration.ofSeconds(50000));
		wait.until(ExpectedConditions.elementToBeClickable(Servicing));
		driver.findElement(Servicing).click();
		driver.findElement(CaseWizard).click();
		wait.until(ExpectedConditions.visibilityOfElementLocated(CaseProgramSelection));
		wait.until(ExpectedConditions.elementToBeClickable(CaseProgramSelection));
		driver.findElement(CaseProgramSelection).click();
		WebElement ProgramSelect = driver.findElement(CaseProgramSelection);
		Select Progselect = new Select(ProgramSelect);
		Progselect.selectByValue("1");
		driver.findElement(CaseNumberBox).sendKeys(CaseNumber);
		WebElement StatusSelect = driver.findElement(CaseSelection);
		Select statusselect = new Select(StatusSelect);
		statusselect.selectByVisibleText("Case Assigned");
		driver.findElement(CaseAmount).sendKeys("2000");
		driver.findElement(PropertyZip).sendKeys("12345");
		driver.findElement(PropertyCity).sendKeys("Tampa");
		WebElement StateSelect = driver.findElement(PropertyState);
		Select Stateselection = new Select(StateSelect);
		Stateselection.selectByValue("1");
		driver.findElement(PropertyAddressStreet).sendKeys("1234,Kingston building");
		driver.findElement(Description).click();
		driver.findElement(DescriptionBox).sendKeys("Test Data");
		driver.findElement(DescriptionSaveBtn).click();
		driver.findElement(DebtAmount).sendKeys("70");
		WebElement ServiceSelect = driver.findElement(Service);
		Select Serviceselection = new Select(ServiceSelect);
		Serviceselection.selectByVisibleText("FCLL_LGL");
		WebElement ActionCodeSelection = driver.findElement(ActionCode);
		Select CodeSelect = new Select(ActionCodeSelection);
		CodeSelect.selectByVisibleText("CA / Case Assigned");
		WebElement SubStatusSelection = driver.findElement(SubStatus);
		Select SubStatusSelect = new Select(SubStatusSelection);
		SubStatusSelect.selectByVisibleText("Case Assigned");
		driver.findElement(LocationCode).sendKeys("123456789");
		
	}

}
