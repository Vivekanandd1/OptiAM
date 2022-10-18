package OptiAM;

import java.io.IOException;
import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
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
	  By iForm  = By.xpath("(//form[@role='form'])[1]");
	  By NewMSI = By.xpath("(//a[normalize-space()='MSI Messaging Sub Systems'])");
	  By OpenBTN = By.id("selectFile");
	  By MSIsend = By.xpath("//input[@value='Send To Hub']");
	
	public NewMessaging(WebDriver driver) {
		this.driver = driver;
	}
	
	public void NewMSIMessaging() throws InterruptedException, IOException {
		wait = new WebDriverWait(driver,Duration.ofSeconds(300));
		wait.until(ExpectedConditions.presenceOfElementLocated(More));
		driver.findElement(More).click();
		driver.findElement(SystemAdmin).click();
		wait.until(ExpectedConditions.presenceOfElementLocated(Test));
		driver.findElement(Test).click();
		Actions act = new Actions(driver);
		act.moveToElement(driver.findElement(NewMessaging)).perform();
		driver.findElement(NewMSI).click();
		wait.until(ExpectedConditions.presenceOfElementLocated(OpenBTN));
		wait.until(ExpectedConditions.elementToBeClickable(OpenBTN));
		/*The Open Button comes under a table so we have to use Explicitly JS to click on OpenButton*/
		WebElement element = driver.findElement(OpenBTN);
	    JavascriptExecutor executor = (JavascriptExecutor)driver;
	    executor.executeScript("arguments[0].click();", element);
	    Thread.sleep(1000);
	    Runtime.getRuntime().exec("C:\\Users\\QA\\Desktop\\dump\\AutoitUploadScript.exe");
	}

}
