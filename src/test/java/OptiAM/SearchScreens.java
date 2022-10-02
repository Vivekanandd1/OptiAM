package OptiAM;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class SearchScreens {
	
	private WebDriver driver;
	private WebDriverWait wait;
	By Servicing = By.xpath("(//li[@class='nav-item dropdown'])[1]");
	By CaseSearch = By.xpath("(//a[contains(text(),'Case Search')])[1]");
	By CaseNumberBox = By.xpath("//input[@title='LSO_USDA_FHACaseNo341234_title']");
	By SearchBtn = By.xpath("(//button[@ng-click='Search()'])[2]");
	By CaseAssigned = By.xpath("//li[normalize-space()='Case Assigned']");
	By CassAssignedText = By.xpath("(//div/div[@class='card-title'])[4]");
	By Forclosure = By.xpath("(//a[@class='nav-link dropdown-toggle cust1'])[5]");
	By FCUncontested = By.xpath("(//a[@href='#/ForeclosureUncontested'])[2]");
	By FCContested = By.xpath("(//a[@href='#/ForeclosureContested'])[2]");
	
	
	public SearchScreens(WebDriver driver) {
		this.driver = driver;
		
	}
	
	public void CaseSearch() throws IOException, InterruptedException {
		   
		    File src  = new File("C:\\Users\\Sony\\eclipse-workspace\\Optiam\\Info_Data.xlsx");
			FileInputStream fis = new FileInputStream(src);
			XSSFWorkbook xsf = new XSSFWorkbook(fis);
		    XSSFSheet sheet = xsf.getSheetAt(0);
		    String CaseNumber = sheet.getRow(4).getCell(1).getStringCellValue();
		    xsf.close();
		    wait = new WebDriverWait(driver, Duration.ofSeconds(200));
		    wait.until(ExpectedConditions.elementToBeClickable(Servicing));
			driver.findElement(Servicing).click();
			driver.findElement(CaseSearch).click();
			wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(CaseNumberBox));
			driver.findElement(CaseNumberBox).sendKeys(CaseNumber);
			wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(SearchBtn));
			wait.until(ExpectedConditions.elementToBeClickable(SearchBtn));
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
		driver.findElement(FCUncontested);
		Thread.sleep(5000);
		driver.findElement(Forclosure).click();
		driver.findElement(FCContested);
		Thread.sleep(5000);
	}

}
