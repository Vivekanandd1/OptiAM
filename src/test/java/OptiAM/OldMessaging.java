package OptiAM;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class OldMessaging {
	
	private WebDriver driver;
	  private WebDriverWait wait;
	  
	  
	  By More = By.xpath("//a[normalize-space()='More']");
	  By SystemAdmin = By.xpath("//a[normalize-space()='System Admin']");
	  By Test = By.xpath("(//a[normalize-space()='Test'])[1]");
	  By OldMessaging = By.xpath("//a[normalize-space()='Messaging Tester (OLD)']");
	  By OldMSI = By.xpath("//a[normalize-space()='MSI - Property Preservation Service Provider']");
	  By OpenBTN = By.id("selectFile");
	  By sendBtn = By.xpath("//input[@value='Send To Hub']");
	  
	  public OldMessaging(WebDriver driver) {
		  this.driver=driver;
		  wait = new WebDriverWait(driver,Duration.ofSeconds(500));
	  }
	  
	  public void PropertyPreservationPI100() throws InterruptedException, IOException {
			wait.until(ExpectedConditions.presenceOfElementLocated(More));
			driver.findElement(More).click();
			driver.findElement(SystemAdmin).click();
			wait.until(ExpectedConditions.presenceOfElementLocated(Test));
			driver.findElement(Test).click();
			Actions act = new Actions(driver);
			act.moveToElement(driver.findElement(OldMessaging)).perform();
			driver.findElement(OldMSI).click();
			wait.until(ExpectedConditions.presenceOfElementLocated(OpenBTN));
			wait.until(ExpectedConditions.elementToBeClickable(OpenBTN));
			/*The Open Button comes under a table so we have to use Explicitly JS to click on OpenButton*/
			Thread.sleep(2000);
			WebElement element1 = driver.findElement(OpenBTN);
		    JavascriptExecutor executor = (JavascriptExecutor)driver;
		    executor.executeScript("arguments[0].click();", element1);
		    Thread.sleep(2000);
		    Runtime.getRuntime().exec("C:\\VivekDD\\Xml\\00200.Property Preservation Inspection\\01.PropertyPreservationPI.exe");
		    Thread.sleep(2000);
		    WebElement element2 = driver.findElement(sendBtn);
		    executor.executeScript("arguments[0].click();", element2);
		    Thread.sleep(5000);
		    }

}
