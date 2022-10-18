package OptiAM;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class SearchScreens {
	
	private WebDriver driver;
	private WebDriverWait wait;
	By Servicing = By.xpath("(//li[@class='nav-item dropdown'])[1]");
	By CaseSearch = By.xpath("(//a[contains(text(),'Case Search')])[1]");
	By CaseNumberBox = By.xpath("//input[@title='LSO_USDA_FHACaseNo341234_title']");
	By SearchBtn = By.xpath("(//button[@class='btn btn-primary float-right'])[2]");
	By CaseAssigned = By.xpath("//li[normalize-space()='Case Assigned']");
	By CassAssignedText = By.xpath("(//div/div[@class='card-title'])[4]");
	By Forclosure = By.xpath("(//a[@class='nav-link dropdown-toggle cust1'])[5]");
	By FCUncontested = By.xpath("(//a[@href='#/ForeclosureUncontested'])[2]");
	By FCContested = By.xpath("(//a[@href='#/ForeclosureContested'])[2]");
	By Bankruptcy = By.xpath("(//a[normalize-space()='Bankruptcy'])[2]");
	By BK7 = By.xpath("//a[normalize-space()='Bankruptcy/Chapter 7']");
	By BK13 = By.xpath("//a[normalize-space()='Bankruptcy/Chapter 13']");
	By REO = By.xpath("//a[@class='nav-link dropdown-toggle cust1'][normalize-space()='REO']");
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
	
		
	}
	
	public void CaseSearch() throws IOException, InterruptedException {
		    File src  = new File("C:\\VivekDD\\OptiAM\\Info_Data.xlsx");
			FileInputStream fis = new FileInputStream(src);
			XSSFWorkbook xsf = new XSSFWorkbook(fis);
		    XSSFSheet sheet = xsf.getSheetAt(0);
		    String CaseNumber = sheet.getRow(4).getCell(1).getStringCellValue();
		    xsf.close();
		    wait = new WebDriverWait(driver, Duration.ofSeconds(500));
		    wait.until(ExpectedConditions.elementToBeClickable(Servicing));
			driver.findElement(Servicing).click();
			driver.findElement(CaseSearch).click();
			wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(CaseNumberBox));
			driver.findElement(CaseNumberBox).sendKeys(CaseNumber);
			wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(SearchBtn));
			wait.until(ExpectedConditions.elementToBeClickable(SearchBtn));
			Actions act =  new Actions(driver);
			act.moveToElement(driver.findElement(SearchBtn)).click().perform();
			Thread.sleep(2000);
			JavascriptExecutor jse = (JavascriptExecutor)driver;
			jse.executeScript("window.scrollBy(0,400)");
			driver.findElement(SearchBtn).click();
			Thread.sleep(5000);
	   }
	
	public void CaseAssigned() throws InterruptedException {
		 wait = new WebDriverWait(driver, Duration.ofSeconds(100));
		 wait.until(ExpectedConditions.elementToBeClickable(CaseAssigned));
		 driver.findElement(CaseAssigned).click();
		 Thread.sleep(5000);
	}
	
	public void Forclosure() throws InterruptedException {
		wait = new WebDriverWait(driver, Duration.ofSeconds(100));
		wait.until(ExpectedConditions.elementToBeClickable(Forclosure));
		driver.findElement(Forclosure).click();
		driver.findElement(FCUncontested).click();
		Thread.sleep(5000);
		wait.until(ExpectedConditions.elementToBeClickable(Forclosure));
		driver.findElement(Forclosure).click();
		wait.until(ExpectedConditions.elementToBeClickable(FCContested));
		driver.findElement(FCContested).click();
		Thread.sleep(5000);
	}
	
	public void Bankruptcy() throws InterruptedException {
		wait = new WebDriverWait(driver, Duration.ofSeconds(100));
		wait.until(ExpectedConditions.elementToBeClickable(Bankruptcy));
		driver.findElement(Bankruptcy).click();
		driver.findElement(BK7).click();
		Thread.sleep(5000);
		wait.until(ExpectedConditions.elementToBeClickable(Bankruptcy));
		driver.findElement(Bankruptcy).click();
		wait.until(ExpectedConditions.elementToBeClickable(BK13));
		driver.findElement(BK13).click();
		Thread.sleep(5000);	
	}
	
	public void ReoScreens() throws InterruptedException {
		wait = new WebDriverWait(driver, Duration.ofSeconds(100));
		wait.until(ExpectedConditions.elementToBeClickable(REO));
		driver.findElement(REO).click();
		driver.findElement(PreReo).click();
		Thread.sleep(5000);
		wait.until(ExpectedConditions.elementToBeClickable(REO));
		driver.findElement(REO).click();
		wait.until(ExpectedConditions.elementToBeClickable(USDAReo));
		driver.findElement(USDAReo).click();
		Thread.sleep(5000);	
		wait.until(ExpectedConditions.elementToBeClickable(REO));
		driver.findElement(REO).click();
		wait.until(ExpectedConditions.elementToBeClickable(PostReo));
		driver.findElement(PostReo).click();
		Thread.sleep(5000);	
	}
    
	public void USDPPS() throws InterruptedException {
	driver.findElement(USDPPS).click();
	driver.findElement(USDAPPS).click();
	Thread.sleep(5000);
	}
	
	public void Mediation() throws InterruptedException {
		wait = new WebDriverWait(driver, Duration.ofSeconds(200));
		wait.until(ExpectedConditions.elementToBeClickable(OtherActivities));
		driver.findElement(OtherActivities).click();
		driver.findElement(Mediation).click();
		Thread.sleep(5000);
	}
	
	public void Eviction() throws InterruptedException {
		wait = new WebDriverWait(driver, Duration.ofSeconds(200));
		wait.until(ExpectedConditions.elementToBeClickable(OtherActivities));
		driver.findElement(OtherActivities).click();
		driver.findElement(Eviction).click();
		Thread.sleep(5000);
	}
	
	public void AppraisalLegal() throws InterruptedException {
		wait = new WebDriverWait(driver, Duration.ofSeconds(200));
		wait.until(ExpectedConditions.elementToBeClickable(OtherActivities));
		driver.findElement(OtherActivities).click();
		driver.findElement(AppraisalLegal).click();
		Thread.sleep(5000);
	}
	
	public void AppraisalREO() throws InterruptedException {
		wait = new WebDriverWait(driver, Duration.ofSeconds(200));
		wait.until(ExpectedConditions.elementToBeClickable(OtherActivities));
		driver.findElement(OtherActivities).click();
		driver.findElement(AppraisalReo).click();
		Thread.sleep(5000);
	}
	
	public void PropertyPreservation() throws InterruptedException {
		wait = new WebDriverWait(driver, Duration.ofSeconds(200));
		wait.until(ExpectedConditions.elementToBeClickable(OtherActivities));
		driver.findElement(OtherActivities).click();
		driver.findElement(PropertyPreservation).click();
		Thread.sleep(5000);
	}
	
	public void DisputeResolution() throws InterruptedException {
		wait = new WebDriverWait(driver, Duration.ofSeconds(200));
		wait.until(ExpectedConditions.elementToBeClickable(OtherActivities));
		driver.findElement(OtherActivities).click();
		driver.findElement(DisputeR).click();
		Thread.sleep(5000);
	}
	
	public void GeneralInquiry() throws InterruptedException {
		wait = new WebDriverWait(driver, Duration.ofSeconds(200));
		wait.until(ExpectedConditions.elementToBeClickable(OtherActivities));
		driver.findElement(OtherActivities).click();
		driver.findElement(GInquiry).click();
		Thread.sleep(5000);
	}
	
	public void Notice() throws InterruptedException {
		wait = new WebDriverWait(driver, Duration.ofSeconds(200));
		wait.until(ExpectedConditions.elementToBeClickable(OtherActivities));
		driver.findElement(OtherActivities).click();
		driver.findElement(Notice).click();
		Thread.sleep(5000);
	}
	
	public void DemandLetter() throws InterruptedException {
		wait = new WebDriverWait(driver, Duration.ofSeconds(200));
		wait.until(ExpectedConditions.elementToBeClickable(OtherActivities));
		driver.findElement(OtherActivities).click();
		driver.findElement(DemandLetter).click();
		Thread.sleep(5000);
	}
	
	public void StatutoryNotice() throws InterruptedException {
		wait = new WebDriverWait(driver, Duration.ofSeconds(200));
		wait.until(ExpectedConditions.elementToBeClickable(OtherActivities));
		driver.findElement(OtherActivities).click();
		driver.findElement(PreSuitNotice).click();
		Thread.sleep(5000);
	}
	
	public void PendingResearch() throws InterruptedException {
		wait = new WebDriverWait(driver, Duration.ofSeconds(200));
		wait.until(ExpectedConditions.elementToBeClickable(OtherActivities));
		driver.findElement(OtherActivities).click();
		driver.findElement(PendingRsrch).click();
		Thread.sleep(5000);
	}
	
}
