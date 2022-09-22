package OptiAM_Login;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.google.gson.annotations.Until;

public class Login_Page  {
	
	
	public String Url;
	public String UserName;
	public String Password;
	 public String CaseNumber;
	 
	
	  
	public  Login_Page() throws IOException {
		File src  = new File("C:\\Users\\Sony\\eclipse-workspace\\Optiam\\OptiAM\\Info_Data.xlsx");
		FileInputStream fis = new FileInputStream(src);
		XSSFWorkbook xsf = new XSSFWorkbook(fis);
	   XSSFSheet sheet = xsf.getSheetAt(0);
	  this.Url = sheet.getRow(1).getCell(1).getStringCellValue();
	  this.UserName = sheet.getRow(2).getCell(1).getStringCellValue();
	   this.Password = sheet.getRow(3).getCell(1).getStringCellValue();
	   this.CaseNumber = sheet.getRow(4).getCell(1).getStringCellValue();
       xsf.close();

	}
	

	public static void main(String[] args)  throws InterruptedException, IOException {
		Login_Page Lp = new Login_Page();
		By Login_ID = By.name("user_id");
		By PasswordField = By.name("password");
		By Login_Btn = By.name("loginSubmit");
		By LoanProgramSelection = By.xpath("//a[@title='Loan Program']");
		By Usda_Btn = By.id("OptiAM USDA");
		By UserNameClick = By.xpath("//span[@class='glyphicon glyphicon-user']");
		By LogOut = By.xpath("//a[@ng-click='logout()']");
		By Servicing = By.xpath("(//li[@class='nav-item dropdown'])[1]");
		By CaseSearch = By.xpath("(//a[contains(text(),'Case Search')])[1]");
		By CaseNumberBox = By.xpath("//input[@title='LSO_USDA_FHACaseNo341234_title']");
		By SearchBtn = By.xpath("(//button[@ng-click='Search()'])[2]");
		
		
		
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get(Lp.Url);
		driver.findElement(Login_ID).sendKeys(Lp.UserName);
		driver.findElement(PasswordField).sendKeys(Lp.Password);
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
		driver.findElement(CaseNumberBox).sendKeys(Lp.CaseNumber);
		driver.findElement(SearchBtn).click();
		
		Thread.sleep(10000);
		
		driver.findElement(UserNameClick).click();
		driver.findElement(LogOut).click();
	}
}
