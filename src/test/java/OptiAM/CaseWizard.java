package OptiAM;

import java.sql.Time;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.ElementClickInterceptedException;
import org.openqa.selenium.JavascriptExecutor;
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
	String CaseNumber = "8899000362";
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
	By NextBtn = By.xpath("(//div/input[@type='submit'][@value='Next'])[1]");
	By BorrowerAddition = By.xpath("(//button[contains(text(),'Add Contact')])[1]");
	By ContactType = By.xpath("//select[@id='ContactType']");
	By FirstName = By.id("Borrower_fname");
	By LastName = By.id("BR_Borrower_lname");
	By ContactAddress = By.id("ContactAddressStreet");
	By BorrowerCity = By.id("borrower_city");
	By DOB = By.xpath("//input[@id='ContactDOB']");
	By Month = By.xpath("//select[@class='ui-datepicker-month']");
	By Year = By.xpath("//select[@class='ui-datepicker-year']");
	By Date = By.xpath("//table[@class='ui-datepicker-calendar']/tbody/tr/td/a[contains(text(),'5')]");
	By State = By.xpath("//select[@id='borrower_state']");
	By BorroweZip = By.xpath("//input[@id='borrower_zip']");
	By BorrowerSSN = By.xpath("//input[@id='ContactSSN']");
	By BorrowerPhone = By.xpath("//input[@id='borrower_phone1']");
	By SaveAS = By.xpath("//button[@ng-click='SameAsContactAddr()']");
	By BorrowerFormSaveBtn = By.xpath("//div[@class='btn printDTButtons col-sm-4 ']/input[@value='Save']");
	By NextFormBtn = By.xpath("//*[@id='Borrower']/form/input[2]");
	By NextFormBtn1 = By.xpath("//*[@id='Notes']/form/input[2]");
	By NextFormBtn2 = By.xpath("//*[@id='LoanRec16aLoanVendor']/form/input[2]");
	By NextFormBtn3 = By.xpath("//*[@id='LoanAlert']/form/input[2]");
	By AddCaseBtn = By.xpath("//*[@id=\"LoanPayPlan\"]/form/input[2]");
	
	public void CaseFromCaseWizard() throws InterruptedException {
		wait = new WebDriverWait(driver,Duration.ofSeconds(50000));
		wait.until(ExpectedConditions.elementToBeClickable(Servicing));
		driver.findElement(Servicing).click();
		driver.findElement(CaseWizard).click();
		Thread.sleep(5000);
		wait.until(ExpectedConditions.presenceOfElementLocated(CaseProgramSelection));
		wait.until(ExpectedConditions.visibilityOfElementLocated(CaseProgramSelection));
		wait.until(ExpectedConditions.elementToBeClickable(CaseProgramSelection));
		try {
			driver.findElement(CaseProgramSelection).click();
			}
		catch (ElementClickInterceptedException e) {
			System.out.println("Excutor needed");
		}
		finally {
			JavascriptExecutor jse = (JavascriptExecutor)driver;
			WebElement ele = driver.findElement(CaseProgramSelection);
			jse.executeScript("arguments[0].click()", ele);
		}
		WebElement ProgramSelect = driver.findElement(CaseProgramSelection);
		Select Progselect = new Select(ProgramSelect);
		Progselect.selectByValue("1");
		driver.findElement(CaseNumberBox).sendKeys(CaseNumber);
		WebElement StatusSelect = driver.findElement(CaseSelection);
		Select statusselect = new Select(StatusSelect);
		statusselect.selectByVisibleText("Assigned");
		driver.findElement(CaseAmount).sendKeys("2000");
		driver.findElement(PropertyZip).sendKeys("12345");
		driver.findElement(PropertyCity).sendKeys("Tampa");
		WebElement StateSelect = driver.findElement(PropertyState);
		Select Stateselection = new Select(StateSelect);
		Stateselection.selectByValue("1");
		driver.findElement(PropertyAddressStreet).sendKeys("1234,Kingston building");
		driver.findElement(Description).click();
		Thread.sleep(2000);
		driver.findElement(DescriptionBox).sendKeys("Test Data");
		driver.findElement(DescriptionSaveBtn).click();
		Thread.sleep(5000);
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
		wait.until(ExpectedConditions.presenceOfElementLocated(NextBtn));
		wait.until(ExpectedConditions.visibilityOfElementLocated(NextBtn));
		wait.until(ExpectedConditions.elementToBeClickable(NextBtn));
		try {
			driver.findElement(NextBtn).click();
			}
		catch (ElementClickInterceptedException e) {
			System.out.println("Excutor needed for next");
		}
		finally {
			JavascriptExecutor jse = (JavascriptExecutor)driver;
			WebElement ele = driver.findElement(NextBtn);
			jse.executeScript("arguments[0].click()", ele);
		}
		/*Borrower Window Initialisation*/
		Thread.sleep(5000);
		wait.until(ExpectedConditions.presenceOfElementLocated(BorrowerAddition));
		wait.until(ExpectedConditions.elementToBeClickable(BorrowerAddition));
		driver.findElement(BorrowerAddition).click();
		Thread.sleep(2000);
		wait.until(ExpectedConditions.presenceOfElementLocated(ContactType));
		wait.until(ExpectedConditions.visibilityOfElementLocated(ContactType));
		wait.until(ExpectedConditions.elementToBeClickable(ContactType));
		WebElement ContactSelecttion = driver.findElement(ContactType);
		Select ContactSelect = new Select(ContactSelecttion);
		ContactSelect.selectByVisibleText("Borrower");
		driver.findElement(FirstName).sendKeys("Ted");
		driver.findElement(LastName).sendKeys("Mosby");
		driver.findElement(ContactAddress).sendKeys("1234,Kingston building");
		driver.findElement(BorrowerCity).sendKeys("Tampa");
		driver.findElement(DOB).click();
		WebElement MonthSelection = driver.findElement(Month);
		Select MonthSelect = new Select(MonthSelection);
		MonthSelect.selectByValue("4");
		WebElement YearSelection = driver.findElement(Year);
		Select YearSelect = new Select(YearSelection);
		YearSelect.selectByValue("1990");
		driver.findElement(Date).click();
		WebElement StateSelection = driver.findElement(State);
		Select StateSelect1 = new Select(StateSelection);
		StateSelect1.selectByValue("9");
		driver.findElement(BorroweZip).sendKeys("12345");
		driver.findElement(BorrowerSSN).sendKeys("123-45-6574");
		driver.findElement(BorrowerPhone).sendKeys("123-453-6574");
		Thread.sleep(2000);
		driver.findElement(SaveAS).click();
		JavascriptExecutor jse = (JavascriptExecutor)driver;
		jse.executeScript("window.scrollBy(0,400)");
		Thread.sleep(2000);
		driver.findElement(BorrowerFormSaveBtn).click();
		Thread.sleep(5000);
		/*Next steps initialisation*/
		driver.findElement(NextFormBtn).click();
		Thread.sleep(2000);
		driver.findElement(NextFormBtn1).click();
		Thread.sleep(2000);
		driver.findElement(NextFormBtn2).click();
		Thread.sleep(2000);
		driver.findElement(NextFormBtn3).click();
		Thread.sleep(2000);
		driver.findElement(AddCaseBtn).click();
		Thread.sleep(30000);
		
		
		
	}

}
