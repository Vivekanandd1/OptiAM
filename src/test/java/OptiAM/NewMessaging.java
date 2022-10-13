package OptiAM;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class NewMessaging {
	  private WebDriver driver;
	  private WebDriverWait wait;
	  
	  By More = By.xpath("//a[normalize-space()='More']");
	  By SystemAdmin = By.xpath("//a[normalize-space()='System Admin']");
	  By Test = By.xpath("(//a[normalize-space()='Test'])[1]");
	  By NewMessaging = By.xpath("//a[normalize-space()='Messaging Sub System (NEW)']");
	  By NewMSI = By.xpath("(//a[normalize-space()='MSI Messaging Sub Systems'])");
	  By MsiOpen = By.xpath("//input[@id=\"selectFile\"]");
	  By MSIsend = By.xpath("//input[@value=\"Send To Hub\"]");
	
	public NewMessaging(WebDriver driver) {
		this.driver = driver;
	}
	
	public void NewMSIMessaging() {
		wait = new WebDriverWait(driver,Duration.ofSeconds(200));
		wait.until(ExpectedConditions.presenceOfElementLocated(More));
		driver.findElement(More).click();
		driver.findElement(SystemAdmin).click();
		wait.until(ExpectedConditions.presenceOfElementLocated(Test));
		driver.findElement(Test).click();
		Actions act = new Actions(driver);
		act.moveToElement(driver.findElement(NewMessaging)).perform();
		driver.findElement(NewMSI).click();
		wait.until(ExpectedConditions.presenceOfElementLocated(MsiOpen));
		wait.until(ExpectedConditions.elementToBeClickable(MsiOpen));
		
		//need to switch on frame
		driver.findElement(MsiOpen).click();
		
	}

}
