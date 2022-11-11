package OptiAM;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
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
	WebDriverWait wait;
	
	By Login_ID = By.name("user_id");
	By PasswordField = By.name("password");
	By Login_Btn = By.name("loginSubmit");
	By LoanProgramSelection = By.xpath("//a[@title='Loan Program']");
	By Usda_Btn = By.id("OptiAM USDA");
	By UserNameClick = By.xpath("//span[@class='glyphicon glyphicon-user']");
	By LogOut = By.xpath("//a[@ng-click='logout()']");
	
	
	public Login_Page(WebDriver driver) {
		this.driver = driver;
		wait = new WebDriverWait(driver, Duration.ofSeconds(30000));
	}

//   @BeforeTest
	public void Login()  throws InterruptedException, IOException, AWTException {
	
    	File src  = new File("C:\\VivekDD\\OptiAM\\Info_Data.xlsx");
		FileInputStream fis = new FileInputStream(src);
		XSSFWorkbook xsf = new XSSFWorkbook(fis);
	    XSSFSheet sheet = xsf.getSheetAt(0);
	    String Url = sheet.getRow(1).getCell(1).getStringCellValue();
	    String UserName = sheet.getRow(2).getCell(1).getStringCellValue();
	    String Password = sheet.getRow(3).getCell(1).getStringCellValue();
        xsf.close();
        driver.get(Url);
		driver.findElement(Login_ID).sendKeys(UserName);
		driver.findElement(PasswordField).sendKeys(Password);
		driver.findElement(Login_Btn).click();
		wait.until(ExpectedConditions.elementToBeClickable(LoanProgramSelection));
		driver.findElement(LoanProgramSelection).click();
		wait.until(ExpectedConditions.elementToBeClickable(Usda_Btn));
		driver.findElement(Usda_Btn).click();
		Robot robot = new Robot();
		for (int i = 0; i < 3; i++) {
			robot.keyPress(KeyEvent.VK_CONTROL);
			robot.keyPress(KeyEvent.VK_SUBTRACT);
			robot.keyRelease(KeyEvent.VK_SUBTRACT);
			robot.keyRelease(KeyEvent.VK_CONTROL);
			}
	}
   
   
	
//    @AfterTest
	public void LogOut() throws InterruptedException {
		Thread.sleep(3000);
		 wait.until(ExpectedConditions.elementToBeClickable(UserNameClick));
		driver.findElement(UserNameClick).click();
		wait.until(ExpectedConditions.elementToBeClickable(LogOut));
		Thread.sleep(1000);
		driver.findElement(LogOut).click();
		Thread.sleep(2000);
		driver.quit();
	}
}
