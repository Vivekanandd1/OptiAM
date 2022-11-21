package OptiAM;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.ElementClickInterceptedException;
import org.openqa.selenium.ElementNotInteractableException;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class UsdaCoreFunctionalities {
	WebDriver driver;
	WebDriverWait wait;
	JavascriptExecutor executor;
	Actions build;
	
	public UsdaCoreFunctionalities(WebDriver driver,WebDriverWait wait) {
		this.driver=driver;
		this.wait=wait;
		executor = (JavascriptExecutor)driver;
	}
	
	By More = By.xpath("//a[normalize-space()='More']");
	By Admin = By.xpath("//a[normalize-space()='Admin']");
	By SubAdmin = By.xpath("//a[normalize-space()='Sub-Admin']");
	By SPSAdmin = By.xpath("//a[normalize-space()='SPS-Admin']");
	By SpsOnDemandRun = By.xpath("(//a[normalize-space()='On Demand Run'])[5]");
	By RunBtn = By.xpath("//button[@ng-click='CallExtractService()']");
	By FhaslAdmin = By.xpath("//a[normalize-space()='CORE-GL-Admin']");
	By FhaslOnDemand = By.xpath("(//a[normalize-space()='On Demand Run'])[4]");
	By FhaslCalender = By.xpath("//input[@id='cutoffDate']");
	By Month = By.xpath("//select[@class='ui-datepicker-month']");
	By Year = By.xpath("//select[@class='ui-datepicker-year']");
	By Date = By.xpath("//table[@class='ui-datepicker-calendar']/tbody/tr/td/a[contains(text(),'21')]");
	By LoanProgram = By.xpath("//a[@title='Loan Program']");
	By Accounting = By.xpath("//a[@data-toggle='dropdown'][normalize-space()='Accounting']");
	By Cambu = By.xpath("//a[normalize-space()='TRANS-PROCESS']");
	By CambuUpload = By.xpath("//a[@href='#/BatchExcelUpload_CAMBU']");
	By ChooseFile = By.xpath("//input[@id='selectFile']");
	By UploadFile = By.xpath("//input[@value='Upload File']");
	By HIATSINBatchUpload = By.xpath("//a[normalize-space()='HIATS_IN-Batch Upload']");
	By HiatsInUploadBtn = By.xpath("(//a[normalize-space()='Batch Upload'])[1]");
	By HiatsAdmin = By.xpath("(//a[normalize-space()='HIATS_IN-Admin'])[1]");
	By HiatsInOnDemandRun = By.xpath("(//a[normalize-space()='On Demand Run'])[1]");
	
	public void USDASPSBatchRun() throws InterruptedException {
		driver.findElement(More).click();
		driver.findElement(Admin).click();
		driver.findElement(SubAdmin).click();
		driver.findElement(SPSAdmin).click();
		wait.until(ExpectedConditions.visibilityOfElementLocated(SpsOnDemandRun));
		 wait.until(ExpectedConditions.presenceOfElementLocated(SpsOnDemandRun));
		 wait.until(ExpectedConditions.elementToBeClickable(SpsOnDemandRun));
		 driver.findElement(SpsOnDemandRun).click();
		 driver.findElement(RunBtn).click();
		 Thread.sleep(5000);
	}
	
	public void USDAFhaslBatchRun() throws InterruptedException {
		driver.findElement(More).click();
		driver.findElement(Admin).click();
		driver.findElement(SubAdmin).click();
		driver.findElement(FhaslAdmin).click();
		wait.until(ExpectedConditions.visibilityOfElementLocated(FhaslOnDemand));
		 wait.until(ExpectedConditions.presenceOfElementLocated(FhaslOnDemand));
		 wait.until(ExpectedConditions.elementToBeClickable(FhaslOnDemand));
		 driver.findElement(FhaslOnDemand).click();
		 driver.findElement(FhaslCalender).click();
		 WebElement MonthSelection = driver.findElement(Month);
			Select MonthSelect = new Select(MonthSelection);
			MonthSelect.selectByValue("10");
			WebElement YearSelection = driver.findElement(Year);
			Select YearSelect = new Select(YearSelection);
			YearSelect.selectByValue("2022");
			driver.findElement(Date).click();
		 driver.findElement(RunBtn).click();
		 Thread.sleep(5000);
	}
	
	public void CambuBatchRun() throws InterruptedException, IOException {
		Thread.sleep(2000);
		wait.until(ExpectedConditions.visibilityOfElementLocated(Accounting));
		 wait.until(ExpectedConditions.presenceOfElementLocated(Accounting));
		 wait.until(ExpectedConditions.elementToBeClickable(Accounting));
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
		Thread.sleep(6000);
	}
	
	public void HiatsIn() throws InterruptedException, IOException {
		driver.findElement(More).click();
		driver.findElement(HIATSINBatchUpload).click();
		driver.findElement(HiatsInUploadBtn).click();
		WebElement element1 = driver.findElement(ChooseFile);
		executor.executeScript("arguments[0].click();", element1);
		Thread.sleep(2000);
		 Runtime.getRuntime().exec("C:\\VivekDD\\OptiAM\\HiatsIn\\DCamCambuFile.exe");
		 Thread.sleep(1000);
		 WebElement element2 = driver.findElement(UploadFile);
			executor.executeScript("arguments[0].click();", element2);
			Thread.sleep(6000);
			driver.findElement(More).click();
			driver.findElement(Admin).click();
			driver.findElement(SubAdmin).click();
			driver.findElement(HiatsAdmin).click();
			driver.findElement(HiatsInOnDemandRun).click();
			driver.findElement(RunBtn).click();
	}
}
