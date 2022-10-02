package OptiAM;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.time.Duration;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;


public class Login_Page  {
	
	private WebDriver driver;
	
	
	By Login_ID = By.name("user_id");
	By PasswordField = By.name("password");
	By Login_Btn = By.name("loginSubmit");
	By LoanProgramSelection = By.xpath("//a[@title='Loan Program']");
	By Usda_Btn = By.id("OptiAM USDA");
	By UserNameClick = By.xpath("//span[@class='glyphicon glyphicon-user']");
	By LogOut = By.xpath("//a[@ng-click='logout()']");
	
	
	public Login_Page(WebDriver driver) {
		this.driver = driver;
  	   
	}

//   @BeforeTest
	public void Login()  throws InterruptedException, IOException {
	
    	File src  = new File("C:\\Users\\Sony\\eclipse-workspace\\Optiam\\Info_Data.xlsx");
		FileInputStream fis = new FileInputStream(src);
		XSSFWorkbook xsf = new XSSFWorkbook(fis);
	    XSSFSheet sheet = xsf.getSheetAt(0);
	    String Url = sheet.getRow(1).getCell(1).getStringCellValue();
	    String UserName = sheet.getRow(2).getCell(1).getStringCellValue();
	    String Password = sheet.getRow(3).getCell(1).getStringCellValue();
        xsf.close();
//        driver = new ChromeDriver();
//  	    driver.manage().window().maximize();
//  	    driver.manage().timeouts().implicitlyWait( Duration.ofSeconds(20));
  	   WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(100));
        driver.get(Url);
		driver.findElement(Login_ID).sendKeys(UserName);
		driver.findElement(PasswordField).sendKeys(Password);
		driver.findElement(Login_Btn).click();
		wait.until(ExpectedConditions.elementToBeClickable(LoanProgramSelection));
		driver.findElement(LoanProgramSelection).click();
		wait.until(ExpectedConditions.elementToBeClickable(Usda_Btn));
		driver.findElement(Usda_Btn).click();
		 

	}
   
   
	
//    @AfterTest
	public void LogOut() {
		 WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(100));
		 wait.until(ExpectedConditions.elementToBeClickable(UserNameClick));
		driver.findElement(UserNameClick).click();
		wait.until(ExpectedConditions.elementToBeClickable(LogOut));
		driver.findElement(LogOut).click();
		driver.quit();
	}
}