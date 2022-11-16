package OptiAM;

import java.io.IOException;
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
	
	String CaseNumber = "8899000376";
	By LoanProgram = By.xpath("//a[@title='Loan Program']");
	By DcamBtn = By.xpath("//label[@for='DCAMS']");
	By Servicing = By.xpath("(//li[@class='nav-item dropdown'])[1]");
	By CaseWizard = By.xpath("//a[normalize-space()='Case Wizard']");
	By CaseNumberBox = By.xpath("//input[@id='LoanNo']");
	By Program = By.xpath("//select[@id='LoanProgram21']");
	By Status = By.xpath("//select[@id='LoanStatus2']");
	By PrincipalAmt = By.xpath("//input[@id='OrigPrinAmt11']");
	By LoanBalance = By.xpath("//input[@id='TotalLoanBalance']");
	By TransferDate = By.xpath("//input[@id='TransferDate']");
	By Month = By.xpath("//select[@class='ui-datepicker-month']");
	By Year = By.xpath("//select[@class='ui-datepicker-year']");
	By Date = By.xpath("//table[@class='ui-datepicker-calendar']/tbody/tr/td/a[contains(text(),'5')]");
	By PriorClosingDate = By.xpath("//input[@id='PriorClosingDate']");
	By EndorsementDate = By.xpath("//input[@id='EndorsementDate']");
	By CaseRecdDate = By.xpath("//input[@id='CaseRecdDate']");
	By LoanApplicationDate = By.xpath("//input[@id='LoanApplicationDate']");
	By LoanOriginationDate = By.xpath("//input[@id='LoanOriginationDate']");
	By LoanOriginationFees = By.xpath("//input[@id='LoanOriginationFee']");
    By MortgageInterestRate = By.xpath("//input[@placeholder='Mortgage Interest Rate']");
    By InterestRateAtClosing = By.xpath("//select[@id='InterestRateAtClosing']");
    By CaseDeposition = By.xpath("//input[@id='CaseDisposition']");
    By NextPaymentDueDate = By.xpath("//input[@id='NextPaymentDueDate']");
    By ProductType = By.xpath("//select[@id='ProductType']");
    By FirstMortgageDate = By.xpath("//input[@id='FirstMortgageRecordedDate']");
	By FirstMortgageRecordedPageNumber = By.xpath("//input[@id='FirstMortgageRecordedPageNumber']");
	By FirstMortgageInstrumentNumber = By.xpath("//input[@id='FirstMortgageInstrumentNumber']");
	By FirstMortgageRecordedBookNumber = By.xpath("//input[@id='FirstMortgageRecordedBookNumber']");
	By PropertyZip = By.xpath("//input[@id='PropertyAddressZipcode4']");
	By PropertyCity = By.xpath("//input[@id='PropertyAddressCity']");
	By PropertyState = By.xpath("//select[@id='PropertyAddressState']");
	By PropertyAddressStreet = By.xpath("//input[@id='PropertyAddressStreet']");
	By Description = By.xpath("//a[@aria-label='link']//span//*[name()='svg']");
	By DescriptionBox = By.xpath("//textarea[@id='LegalDescription']");
	By DescriptionSaveBtn = By.xpath("(//button[contains(text(),'Save')])[2]");
	By LateChargeAmt = By.xpath("//input[@id='LateChargeAmt']");
	By LoanDisplayBalance = By.xpath("//input[@id='LoanDisplayBalance']");
	By TaxInsResponsibleParty = By.xpath("//input[@id='TaxInsResponsibleParty']");
	By WasPriorSaleOrTransfer = By.xpath("//input[@id='WasPriorSaleOrTransfer']");
	By Cohort = By.xpath("//input[@id='Cohort']");
	By Debt_Program = By.xpath("//input[@placeholder='Debt_Program']");
	By InitialDebtAmount = By.xpath("//input[@placeholder='Initial Debt Amount']");
	By FirstFormSaveBtn = By.xpath("//*[@id=\"Loan\"]/form/div[3]/input");
	By AddContact = By.xpath("//*[@id=\"Borrower\"]/div[1]/div/div[2]/button");
	By ContactType = By.xpath("//select[@id='ContactType']");
	By FirstName = By.id("Borrower_fname");
	By LastName = By.id("BR_Borrower_lname");
	By ContactAddress = By.id("ContactAddressStreet");
	By BorrowerCity = By.id("borrower_city");
	By DOB = By.xpath("//input[@id='ContactDOB']");
	By BorroweZip = By.xpath("//input[@id='borrower_zip']");
	By BorrowerSSN = By.xpath("//input[@id='ContactSSN']");
	By BorrowerPhone = By.xpath("//input[@id='borrower_phone1']");
	By State = By.xpath("//select[@id='borrower_state']");
	By ContactHomePhoneNumber = By.xpath("//input[@id='ContactHomePhoneNumber']");
	By EmeregencyContactNumber = By.xpath("//input[@id='borrower_phone2']");
	By Marital = By.xpath("//select[@id='ContactMaritalStatus']");
	By Gender = By.xpath("//select[@id='ContactGender']");
	By BorrowerEmail = By.xpath("//input[@id='borrower_email']");
	By SaveAS = By.xpath("//button[@ng-click='SameAsContactAddr()']");
	By BorrowerFormSaveBtn = By.xpath("//div[@class='btn printDTButtons col-sm-4 ']/input[@value='Save']");
	By NextFormBtn = By.xpath("//*[@id='Borrower']/form/input[2]");
	By NextFormBtn1 = By.xpath("//*[@id='Notes']/form/input[2]");
	By NextFormBtn2 = By.xpath("//*[@id='LoanRec16aLoanVendor']/form/input[2]");
	By NextFormBtn3 = By.xpath("//*[@id='LoanAlert']/form/input[2]");
	By AddCaseBtn = By.xpath("//*[@id=\"LoanPayPlan\"]/form/input[2]");
	By Accounting = By.xpath("//a[@data-toggle='dropdown'][normalize-space()='Accounting']");
	By Cambu = By.xpath("//a[normalize-space()='TRANS-PROCESS']");
	By CambuUpload = By.xpath("//a[@href='#/BatchExcelUpload_CAMBU']");
	By ChooseFile = By.xpath("//input[@id='selectFile']");
	By UploadFile = By.xpath("//input[@value='Upload File']");
	
	public void DcamCaseWizard() throws InterruptedException {
		wait = new WebDriverWait(driver, Duration.ofSeconds(10000000));
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(1000));
		driver.findElement(LoanProgram).click();
		driver.findElement(DcamBtn).click();
		try {
		wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(Servicing));
		wait.until(ExpectedConditions.presenceOfElementLocated(Servicing));
		wait.until(ExpectedConditions.elementToBeClickable(Servicing));
		Thread.sleep(7000);
	    driver.findElement(Servicing).click();
	    }
		catch (StaleElementReferenceException e) {
			wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(Servicing));
			wait.until(ExpectedConditions.presenceOfElementLocated(Servicing));
			wait.until(ExpectedConditions.elementToBeClickable(Servicing));
			Thread.sleep(7000);
			WebElement element1 = driver.findElement(Servicing);
			System.out.println("Excutor needed");
			executor.executeScript("arguments[0].click();", element1);
		}
		driver.findElement(CaseWizard).click();
		Thread.sleep(5000);
		driver.findElement(CaseNumberBox).sendKeys(CaseNumber);
		WebElement ProgramSelection = driver.findElement(Program);
	    Select ProgramSelect = new Select(ProgramSelection);
	    ProgramSelect.selectByVisibleText("Generic Debt");
	    Thread.sleep(2000);
	    WebElement StatusSelection = driver.findElement(Status);
	    Select StatusSelect = new Select(StatusSelection);
	    StatusSelect.selectByVisibleText("Assigned");
	    driver.findElement(PrincipalAmt).sendKeys("2000");
	    driver.findElement(LoanBalance).sendKeys("100");
	    
	    wait.until(ExpectedConditions.elementToBeClickable(TransferDate));
	    driver.findElement(TransferDate).click();
		WebElement MonthSelection = driver.findElement(Month);
		Select MonthSelect = new Select(MonthSelection);
		MonthSelect.selectByValue("4");
		WebElement YearSelection = driver.findElement(Year);
		Select YearSelect = new Select(YearSelection);
		YearSelect.selectByValue("1990");
		driver.findElement(Date).click();
		driver.findElement(PriorClosingDate).click();
		WebElement MonthSelection1 = driver.findElement(Month);
		Select MonthSelect1 = new Select(MonthSelection1);
		MonthSelect1.selectByValue("4");
		WebElement YearSelection1 = driver.findElement(Year);
		Select YearSelect1 = new Select(YearSelection1);
		YearSelect1.selectByValue("1990");
		driver.findElement(Date).click();
		driver.findElement(EndorsementDate).click();
		WebElement MonthSelection2 = driver.findElement(Month);
		Select MonthSelect2 = new Select(MonthSelection2);
		MonthSelect2.selectByValue("4");
		WebElement YearSelection2 = driver.findElement(Year);
		Select YearSelect2 = new Select(YearSelection2);
		YearSelect2.selectByValue("1990");
		driver.findElement(Date).click();
		
		driver.findElement(CaseRecdDate).click();
		WebElement MonthSelection3 = driver.findElement(Month);
		Select MonthSelect3 = new Select(MonthSelection3);
		MonthSelect3.selectByValue("4");
		WebElement YearSelection3 = driver.findElement(Year);
		Select YearSelect3 = new Select(YearSelection3);
		YearSelect3.selectByValue("1990");
		driver.findElement(Date).click();
		
		executor.executeScript("window.scrollBy(0,-350)", "");
		
		driver.findElement(LoanApplicationDate).click();
		WebElement MonthSelection4 = driver.findElement(Month);
		Select MonthSelect4 = new Select(MonthSelection4);
		MonthSelect4.selectByValue("4");
		WebElement YearSelection4 = driver.findElement(Year);
		Select YearSelect4 = new Select(YearSelection4);
		YearSelect4.selectByValue("1990");
		driver.findElement(Date).click();
		
		driver.findElement(LoanOriginationDate).click();
		WebElement MonthSelection8 = driver.findElement(Month);
		Select MonthSelect8 = new Select(MonthSelection8);
		MonthSelect8.selectByValue("8");
		WebElement YearSelection8 = driver.findElement(Year);
		Select YearSelect8 = new Select(YearSelection8);
		YearSelect8.selectByValue("1990");
		driver.findElement(Date).click();
		
		driver.findElement(LoanOriginationFees).sendKeys("1400");	
		driver.findElement(MortgageInterestRate).sendKeys("3");
		WebElement InterestRate  = driver.findElement(InterestRateAtClosing);
		Select IRate = new Select(InterestRate);
		IRate.selectByValue("0");
		driver.findElement(CaseDeposition).sendKeys("100");
		
		driver.findElement(NextPaymentDueDate).click();
		WebElement MonthSelection5 = driver.findElement(Month);
		Select MonthSelect5 = new Select(MonthSelection5);
		MonthSelect5.selectByValue("11");
		WebElement YearSelection5 = driver.findElement(Year);
		Select YearSelect5 = new Select(YearSelection5);
		YearSelect5.selectByValue("2022");
		driver.findElement(Date).click();
		
		WebElement ProductSelection = driver.findElement(ProductType);
		Select ProductSelect = new Select(ProductSelection);
		ProductSelect.selectByVisibleText("USDA Form");
		
		driver.findElement(FirstMortgageDate).click();
		WebElement MonthSelection6 = driver.findElement(Month);
		Select MonthSelect6 = new Select(MonthSelection6);
		MonthSelect6.selectByValue("11");
		WebElement YearSelection6 = driver.findElement(Year);
		Select YearSelect6 = new Select(YearSelection6);
		YearSelect6.selectByValue("2022");;
		driver.findElement(Date).click();
		
		driver.findElement(FirstMortgageRecordedPageNumber).sendKeys("2");
		driver.findElement(FirstMortgageInstrumentNumber).sendKeys("2");
		driver.findElement(FirstMortgageRecordedBookNumber).sendKeys("2");
		driver.findElement(PropertyZip).sendKeys("12345");
		driver.findElement(PropertyCity).sendKeys("Tampa");
		WebElement StateSelect = driver.findElement(PropertyState);
		Select Stateselection = new Select(StateSelect);
		Stateselection.selectByValue("1");
		driver.findElement(PropertyAddressStreet).sendKeys("1234,Kingston building");
		driver.findElement(Description).click();
		Thread.sleep(2000);
		driver.findElement(DescriptionBox).sendKeys("Test Data");
		Thread.sleep(2000);
		driver.findElement(DescriptionSaveBtn).click();
		Thread.sleep(2000);
		driver.findElement(LateChargeAmt).sendKeys("12");
		driver.findElement(LoanDisplayBalance).sendKeys("100");
		driver.findElement(TaxInsResponsibleParty).sendKeys("Vivek");
		driver.findElement(WasPriorSaleOrTransfer).sendKeys("Yes");
		
		driver.findElement(Cohort).click();
		WebElement MonthSelection7 = driver.findElement(Month);
		Select MonthSelect7 = new Select(MonthSelection7);
		MonthSelect7.selectByValue("11");
		WebElement YearSelection7 = driver.findElement(Year);
		Select YearSelect7 = new Select(YearSelection7);
		YearSelect7.selectByValue("2022");;;
		driver.findElement(Date).click();

		driver.findElement(Debt_Program).sendKeys("Test");
		driver.findElement(InitialDebtAmount).sendKeys("200");
		driver.findElement(FirstFormSaveBtn).click();
		
		Thread.sleep(5000);	
		driver.findElement(AddContact).click();
	    Thread.sleep(5000);
		
		/*Borrower Page */
		WebElement ContactSelection = driver.findElement(ContactType);
		Select ContactSelect = new Select(ContactSelection);
		 ContactSelect.selectByVisibleText("Borrower");
		 driver.findElement(FirstName).sendKeys("Ted");
			driver.findElement(LastName).sendKeys("Mosby");
			driver.findElement(ContactAddress).sendKeys("1234,Kingston building");
			driver.findElement(BorrowerCity).sendKeys("Tampa");
			driver.findElement(DOB).click();
			WebElement MonthSelection9 = driver.findElement(Month);
			Select MonthSelect9 = new Select(MonthSelection9);
			MonthSelect9.selectByValue("4");
			WebElement YearSelection9 = driver.findElement(Year);
			Select YearSelect9 = new Select(YearSelection9);
			YearSelect9.selectByValue("1990");
			driver.findElement(Date).click();
			WebElement StateSelection = driver.findElement(State);
			Select StateSelect1 = new Select(StateSelection);
			StateSelect1.selectByValue("9");
			driver.findElement(BorroweZip).sendKeys("12345");
			driver.findElement(BorrowerSSN).sendKeys("123-45-6574");
			driver.findElement(BorrowerPhone).sendKeys("123-453-6574");
			driver.findElement(ContactHomePhoneNumber).sendKeys("123-453-6574");
			driver.findElement(EmeregencyContactNumber).sendKeys("123-453-6574");
			WebElement MaritalState = driver.findElement(Marital);
		    Select MaritalStatus = new Select(MaritalState);
		    MaritalStatus.selectByVisibleText("Single");
		    WebElement GenderState = driver.findElement(Gender);
		    Select GenderStatus = new Select(GenderState);
		    GenderStatus.selectByVisibleText("--Male--");
		    
		    driver.findElement(BorrowerEmail).sendKeys("vivek.tamrakar@nenosystems.in");
		    
		    driver.findElement(SaveAS).click();
	
			executor.executeScript("window.scrollBy(0,400)");
			Thread.sleep(2000);
			driver.findElement(BorrowerFormSaveBtn).click();
			Thread.sleep(3000);
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
	
	public void CambuBatchRun() throws IOException, InterruptedException {
		driver.findElement(Accounting).click();
		driver.findElement(Cambu).click();
		driver.findElement(CambuUpload).click();
		Thread.sleep(2000);
		WebElement element1 = driver.findElement(ChooseFile);
		executor.executeScript("arguments[0].click();", element1);
		Thread.sleep(2000);
		 Runtime.getRuntime().exec("C:\\VivekDD\\OptiAM\\Accounting\\DCamCambuFile.exe");
		 Thread.sleep(1000);
		 WebElement element2 = driver.findElement(UploadFile);
			executor.executeScript("arguments[0].click();", element2);
			Thread.sleep(5000);
	}

}
