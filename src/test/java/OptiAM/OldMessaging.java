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
	  Actions build;
	  JavascriptExecutor executor;
	  
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
		 build = new Actions(driver);
		executor = (JavascriptExecutor)driver;
	  }
	  
	  public void PropertyPreservationPI() throws InterruptedException, IOException {
			wait.until(ExpectedConditions.presenceOfElementLocated(More));
			driver.findElement(More).click();
			driver.findElement(SystemAdmin).click();
			wait.until(ExpectedConditions.presenceOfElementLocated(Test));
			driver.findElement(Test).click();
			build.moveToElement(driver.findElement(OldMessaging)).perform();
			driver.findElement(OldMSI).click();
			wait.until(ExpectedConditions.presenceOfElementLocated(OpenBTN));
			wait.until(ExpectedConditions.elementToBeClickable(OpenBTN));
			//1st Step of Property Preservation
			WebElement element1 = driver.findElement(OpenBTN);
			executor.executeScript("arguments[0].click();", element1);
		    Thread.sleep(2000);
		    Runtime.getRuntime().exec("C:\\VivekDD\\OLD XML\\00200. Property Inspection from MSI\\01.PropertyPreservationPI.exe");
		    Thread.sleep(2000);
		    WebElement element2 = driver.findElement(sendBtn);
		    build.moveToElement(element2).click(element2);
	        build.perform();
	        Thread.sleep(2000);
	         //1st Step of Property Preservation
			executor.executeScript("arguments[0].click();", element1);
		    Thread.sleep(2000);
		    Runtime.getRuntime().exec("C:\\VivekDD\\OLD XML\\00200. Property Inspection from MSI\\02.PropertyPreservationPI.exe");
		    Thread.sleep(2000);
		    build.moveToElement(element2).click(element2);
	        build.perform();
	        Thread.sleep(5000);
		    }

}
