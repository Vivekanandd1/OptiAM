package OptiAM;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.ElementClickInterceptedException;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class SearchScreens {
	
	private WebDriver driver;
	JavascriptExecutor executor;
	
	By Servicing = By.xpath("(//li[@class='nav-item dropdown'])[1]");
	By CaseSearch = By.xpath("(//a[contains(text(),'Case Search')])[1]");
	By CaseNumberBox = By.xpath("//input[@title='LSO_USDA_FHACaseNo341234_title']");
	By SearchBtn = By.xpath("(//button[@class='btn btn-primary float-right'])[2]");
	By CaseAssigned = By.xpath("//li[normalize-space()='Case Assigned']");
	By CassAssignedText = By.xpath("(//div/div[@class='card-title'])[4]");
	By Forclosure = By.xpath("(//a[normalize-space()='Foreclosure'])[3]");
	By FCUncontested = By.xpath("(//a[@href='#/ForeclosureUncontested'])[2]");
	By FCContested = By.xpath("(//a[@href='#/ForeclosureContested'])[2]");
	By Bankruptcy = By.xpath("(//a[normalize-space()='Bankruptcy'])[2]");
	By BK7 = By.xpath("//a[normalize-space()='Bankruptcy/Chapter 7']");
	By BK13 = By.xpath("//a[normalize-space()='Bankruptcy/Chapter 13']");
	By REO = By.xpath("(//a[normalize-space()='REO'])[2]");
	By PreReo = By.xpath("(//a[normalize-space()='Pre-REO'])[2]");
	By USDAReo = By.xpath("(//a[normalize-space()='REO'])[3]");
	By PostReo = By.xpath("(//a[contains(@class,'dropdown-itemnew')][normalize-space()='Post-REO'])[2]");
	By USDPPS = By.xpath("(//a[normalize-space()='USDA-PPS'])[2]");
	By USDAPPS = By.xpath("(//a[normalize-space()='USDA-PPS'])[3]");
	By OtherActivities = By.xpath("//a[normalize-space()='Other Activities']");
	By Mediation = By.xpath("(//a[normalize-space()='USDA Mediation'])[2]");
	By Eviction = By.xpath("(//a[normalize-space()='USDA Eviction'])[2]");
	By AppraisalLegal = By.xpath("(//a[normalize-space()='USDA Appraisal Legal'])[2]");
	By AppraisalReo = By.xpath("(//a[normalize-space()='Appraisal Valuation REO'])[2]");
	By DisputeR = By.xpath("(//a[normalize-space()='Dispute Resolution'])[2]");
	By GInquiry = By.xpath("(//a[normalize-space()='General Inquiry'])[2]");
	By Notice = By.xpath("(//a[normalize-space()='Notice'])[2]");
	By PropertyPreservation = By.xpath("(//a[normalize-space()='Property Preservation'])[2]");
	By DemandLetter = By.xpath("(//a[normalize-space()='Demand Letters'])[2]");
	By PreSuitNotice = By.xpath("(//a[normalize-space()='Statutory Pre-Suit Notice'])[2]");
	By PendingRsrch = By.xpath("(//a[normalize-space()='Pending Research'])[2]");
	
	
	
	
	public SearchScreens(WebDriver driver) {
		this.driver = driver;
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30000));
		executor = (JavascriptExecutor)driver;
	}
	
	public void CaseSearch() throws IOException, InterruptedException {
		    File src  = new File("C:\\VivekDD\\OptiAM\\Info_Data.xlsx");
			FileInputStream fis = new FileInputStream(src);
			XSSFWorkbook xsf = new XSSFWorkbook(fis);
		    XSSFSheet sheet = xsf.getSheetAt(0);
		    String CaseNumber = sheet.getRow(4).getCell(1).getStringCellValue();
		    String CaseNumber1 = sheet.getRow(5).getCell(1).getStringCellValue();
		    xsf.close();
			WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(50000));
		    System.out.println(CaseNumber);
		    System.out.println(CaseNumber1);
		    wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(Servicing));
			wait.until(ExpectedConditions.presenceOfElementLocated(Servicing));
		    wait.until(ExpectedConditions.elementToBeClickable(Servicing));
			driver.findElement(Servicing).click();
			driver.findElement(CaseSearch).click();
			wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(CaseNumberBox));
			driver.findElement(CaseNumberBox).sendKeys(CaseNumber);
			Thread.sleep(2000);
			wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(SearchBtn));
			wait.until(ExpectedConditions.presenceOfElementLocated(SearchBtn));
			wait.until(ExpectedConditions.elementToBeClickable(SearchBtn));
			JavascriptExecutor jse = (JavascriptExecutor)driver;
			jse.executeScript("window.scrollBy(0,400)");
			WebElement element1 = driver.findElement(SearchBtn);
			Thread.sleep(2000);
			jse.executeScript("arguments[0].click();", element1);
			Thread.sleep(3000);
			jse.executeScript("window.scrollBy(0,400)");
			Thread.sleep(5000);
			jse.executeScript("window.scrollBy(0,-400)");
			/*CaseNumber 2nd search process*/
			driver.findElement(CaseNumberBox).clear();
			Thread.sleep(2000);
			wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(CaseNumberBox));
			driver.findElement(CaseNumberBox).sendKeys(CaseNumber1);
			Thread.sleep(2000);
			wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(SearchBtn));
			wait.until(ExpectedConditions.presenceOfElementLocated(SearchBtn));
			wait.until(ExpectedConditions.elementToBeClickable(SearchBtn));
			jse.executeScript("window.scrollBy(0,400)");
			Thread.sleep(2000);
			jse.executeScript("arguments[0].click();", element1);
			Thread.sleep(3000);
			jse.executeScript("window.scrollBy(0,400)");
			Thread.sleep(3000);
	   }
	
	public void CaseAssigned() throws InterruptedException {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(50000));
		 wait.until(ExpectedConditions.elementToBeClickable(CaseAssigned));
		 driver.findElement(CaseAssigned).click();
		 Thread.sleep(5000);
	}
	
	public void Forclosure() throws InterruptedException {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(50000));
		wait.until(ExpectedConditions.presenceOfElementLocated(Forclosure));
		wait.until(ExpectedConditions.visibilityOfElementLocated(Forclosure));
		wait.until(ExpectedConditions.elementToBeClickable(Forclosure));
//		driver.findElement(Forclosure).click();
		WebElement element1 = driver.findElement(Forclosure);
		executor.executeScript("arguments[0].click();", element1);
		driver.findElement(FCUncontested).click();
		Thread.sleep(5000);
		wait.until(ExpectedConditions.presenceOfElementLocated(Forclosure));
		wait.until(ExpectedConditions.visibilityOfElementLocated(Forclosure));
		wait.until(ExpectedConditions.elementToBeClickable(Forclosure));
		executor.executeScript("arguments[0].click();", element1);
//		driver.findElement(Forclosure).click();
		wait.until(ExpectedConditions.elementToBeClickable(FCContested));
		driver.findElement(FCContested).click();
		Thread.sleep(5000);
	}
	
	public void Bankruptcy() throws InterruptedException {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(50000));
		wait.until(ExpectedConditions.presenceOfElementLocated(Bankruptcy));
		wait.until(ExpectedConditions.visibilityOfElementLocated(Bankruptcy));
		wait.until(ExpectedConditions.elementToBeClickable(Bankruptcy));
		WebElement element1 = driver.findElement(Bankruptcy);
		executor.executeScript("arguments[0].click();", element1);
//		driver.findElement(Bankruptcy).click();
		driver.findElement(BK7).click();
		Thread.sleep(5000);
		wait.until(ExpectedConditions.presenceOfElementLocated(Bankruptcy));
		wait.until(ExpectedConditions.visibilityOfElementLocated(Bankruptcy));
		wait.until(ExpectedConditions.elementToBeClickable(Bankruptcy));
		executor.executeScript("arguments[0].click();", element1);
//		driver.findElement(Bankruptcy).click();
		wait.until(ExpectedConditions.elementToBeClickable(BK13));
		driver.findElement(BK13).click();
		Thread.sleep(5000);	
	}
	
	public void ReoScreens() throws InterruptedException {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(50000));
		WebElement REO1 = driver.findElement(REO);
		wait.until(ExpectedConditions.visibilityOfElementLocated(REO));
		wait.until(ExpectedConditions.presenceOfElementLocated(REO));
		wait.until(ExpectedConditions.elementToBeClickable(REO));
		executor.executeScript("arguments[0].click();", REO1);
//		driver.findElement(REO).click();
		driver.findElement(PreReo).click();
		Thread.sleep(5000);
		wait.until(ExpectedConditions.visibilityOfElementLocated(REO));
		wait.until(ExpectedConditions.presenceOfElementLocated(REO));
		wait.until(ExpectedConditions.elementToBeClickable(REO));
		executor.executeScript("arguments[0].click();", REO1);
//		driver.findElement(REO).click();
		wait.until(ExpectedConditions.elementToBeClickable(USDAReo));
		driver.findElement(USDAReo).click();
		Thread.sleep(5000);
		wait.until(ExpectedConditions.visibilityOfElementLocated(REO));
		wait.until(ExpectedConditions.presenceOfElementLocated(REO));
		wait.until(ExpectedConditions.elementToBeClickable(REO));
		executor.executeScript("arguments[0].click();", REO1);
//		driver.findElement(REO).click();
		wait.until(ExpectedConditions.elementToBeClickable(PostReo));
		driver.findElement(PostReo).click();
		Thread.sleep(5000);	
	}
    
	public void USDPPS() throws InterruptedException {
	WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(50000));
	wait.until(ExpectedConditions.visibilityOfElementLocated(USDPPS));
	wait.until(ExpectedConditions.elementToBeClickable(USDPPS));
	try {
		driver.findElement(USDPPS).click();
	}
	catch (ElementClickInterceptedException e) {
		System.out.println("Excutor needed");
	}
	finally {
		WebElement Ele = driver.findElement(USDPPS);
		executor.executeScript("arguments[0].click();", Ele);
	}
	driver.findElement(USDAPPS).click();
	Thread.sleep(5000);
	}
	
	public void Mediation() throws InterruptedException {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(50000));
		WebElement OtherActivities1 = driver.findElement(OtherActivities);
		wait.until(ExpectedConditions.visibilityOfElementLocated(OtherActivities));
		wait.until(ExpectedConditions.elementToBeClickable(OtherActivities));
		executor.executeScript("arguments[0].click();", OtherActivities1);
//		driver.findElement(OtherActivities).click();
		driver.findElement(Mediation).click();
		Thread.sleep(5000);
	}
	
	public void Eviction() throws InterruptedException {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(50000));
		WebElement OtherActivities1 = driver.findElement(OtherActivities);
		wait.until(ExpectedConditions.visibilityOfElementLocated(OtherActivities));
		wait.until(ExpectedConditions.elementToBeClickable(OtherActivities));
		executor.executeScript("arguments[0].click();", OtherActivities1);
//		driver.findElement(OtherActivities).click();
		driver.findElement(Eviction).click();
		Thread.sleep(5000);
	}
	
	public void AppraisalLegal() throws InterruptedException {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(50000));
		WebElement OtherActivities1 = driver.findElement(OtherActivities);
		wait.until(ExpectedConditions.visibilityOfElementLocated(OtherActivities));
		wait.until(ExpectedConditions.elementToBeClickable(OtherActivities));
		executor.executeScript("arguments[0].click();", OtherActivities1);
//		driver.findElement(OtherActivities).click();
		driver.findElement(AppraisalLegal).click();
		Thread.sleep(5000);
	}
	
	public void AppraisalREO() throws InterruptedException {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(50000));
		WebElement OtherActivities1 = driver.findElement(OtherActivities);
		wait.until(ExpectedConditions.visibilityOfElementLocated(OtherActivities));
		wait.until(ExpectedConditions.elementToBeClickable(OtherActivities));
		executor.executeScript("arguments[0].click();", OtherActivities1);
//		driver.findElement(OtherActivities).click();
		driver.findElement(AppraisalReo).click();
		Thread.sleep(5000);
	}
	
	public void PropertyPreservation() throws InterruptedException {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(50000));
		WebElement OtherActivities1 = driver.findElement(OtherActivities);
		wait.until(ExpectedConditions.visibilityOfElementLocated(OtherActivities));
		wait.until(ExpectedConditions.elementToBeClickable(OtherActivities));
		executor.executeScript("arguments[0].click();", OtherActivities1);
		driver.findElement(PropertyPreservation).click();
		Thread.sleep(5000);
	}
	
	public void DisputeResolution() throws InterruptedException {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(50000));
		WebElement OtherActivities1 = driver.findElement(OtherActivities);
		wait.until(ExpectedConditions.visibilityOfElementLocated(OtherActivities));
		wait.until(ExpectedConditions.elementToBeClickable(OtherActivities));
		executor.executeScript("arguments[0].click();", OtherActivities1);
//		driver.findElement(OtherActivities).click();
		driver.findElement(DisputeR).click();
		Thread.sleep(5000);
	}
	
	public void GeneralInquiry() throws InterruptedException {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(50000));
		WebElement OtherActivities1 = driver.findElement(OtherActivities);
		wait.until(ExpectedConditions.visibilityOfElementLocated(OtherActivities));
		wait.until(ExpectedConditions.elementToBeClickable(OtherActivities));
		executor.executeScript("arguments[0].click();", OtherActivities1);
//		driver.findElement(OtherActivities).click();
		driver.findElement(GInquiry).click();
		Thread.sleep(5000);
	}
	
	public void Notice() throws InterruptedException {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(50000));
		WebElement OtherActivities1 = driver.findElement(OtherActivities);
		wait.until(ExpectedConditions.visibilityOfElementLocated(OtherActivities));
		wait.until(ExpectedConditions.elementToBeClickable(OtherActivities));
		executor.executeScript("arguments[0].click();", OtherActivities1);
//		driver.findElement(OtherActivities).click();
		driver.findElement(Notice).click();
		Thread.sleep(5000);
	}
	
	public void DemandLetter() throws InterruptedException {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(50000));
		WebElement OtherActivities1 = driver.findElement(OtherActivities);
		wait.until(ExpectedConditions.visibilityOfElementLocated(OtherActivities));
		wait.until(ExpectedConditions.elementToBeClickable(OtherActivities));
		executor.executeScript("arguments[0].click();", OtherActivities1);
//		driver.findElement(OtherActivities).click();
		driver.findElement(DemandLetter).click();
		Thread.sleep(5000);
	}
	
	public void StatutoryNotice() throws InterruptedException {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(50000));
		WebElement OtherActivities1 = driver.findElement(OtherActivities);
		wait.until(ExpectedConditions.visibilityOfElementLocated(OtherActivities));
		wait.until(ExpectedConditions.elementToBeClickable(OtherActivities));
		executor.executeScript("arguments[0].click();", OtherActivities1);
//		driver.findElement(OtherActivities).click();
		driver.findElement(PreSuitNotice).click();
		Thread.sleep(5000);
	}
	
	public void PendingResearch() throws InterruptedException {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(50000));
		WebElement OtherActivities1 = driver.findElement(OtherActivities);
		wait.until(ExpectedConditions.visibilityOfElementLocated(OtherActivities));
		wait.until(ExpectedConditions.elementToBeClickable(OtherActivities));
		executor.executeScript("arguments[0].click();", OtherActivities1);
//		driver.findElement(OtherActivities).click();
		driver.findElement(PendingRsrch).click();
		Thread.sleep(5000);
	}
	
}
