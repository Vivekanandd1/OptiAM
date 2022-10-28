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

public class NewMessaging {
	  private WebDriver driver;
	  private WebDriverWait wait;
	  
	  By More = By.xpath("//a[normalize-space()='More']");
	  By SystemAdmin = By.xpath("//a[normalize-space()='System Admin']");
	  By Test = By.xpath("(//a[normalize-space()='Test'])[1]");
	  By NewMessaging = By.xpath("//a[normalize-space()='Messaging Sub System (NEW)']");
	  By iForm  = By.xpath("(//form[@role='form'])[1]");
	  By NewMSI = By.xpath("(//a[normalize-space()='MSI Messaging Sub Systems'])");
	  By NewDeval = By.xpath("//a[normalize-space()='Deval Messaging Sub Systems']");
	  By OpenBTN = By.id("selectFile");
	  By sendBtn = By.xpath("//input[@value='Send To Hub']");
	
	public NewMessaging(WebDriver driver) {
		this.driver = driver;
	}
	


	public void PropertyPreservationPI100() throws InterruptedException, IOException {
		wait = new WebDriverWait(driver,Duration.ofSeconds(500));
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
	
	public void PropertyPreservationPI200() throws IOException, InterruptedException {
		wait = new WebDriverWait(driver,Duration.ofSeconds(500));
		driver.findElement(More).click();
		driver.findElement(SystemAdmin).click();
		wait.until(ExpectedConditions.presenceOfElementLocated(Test));
		driver.findElement(Test).click();
		Actions act = new Actions(driver);
		act.moveToElement(driver.findElement(NewMessaging)).perform();
		driver.findElement(NewMSI).click();
		WebElement element1 = driver.findElement(OpenBTN);
		WebElement element2 = driver.findElement(sendBtn);
	    JavascriptExecutor executor = (JavascriptExecutor)driver;
	    executor.executeScript("arguments[0].click();", element1);
	    Thread.sleep(2000);
	    Runtime.getRuntime().exec("C:\\VivekDD\\Xml\\00200.Property Preservation Inspection\\02.PropertyPreservationPI.exe");
	    Thread.sleep(2000);
	    executor.executeScript("arguments[0].click();", element2);
	    Thread.sleep(5000);
	}
	
	public void PropertyPreservationPGM100() throws InterruptedException, IOException {
		wait = new WebDriverWait(driver,Duration.ofSeconds(500));
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
		WebElement element1 = driver.findElement(OpenBTN);
	    JavascriptExecutor executor = (JavascriptExecutor)driver;
	    executor.executeScript("arguments[0].click();", element1);
	    Thread.sleep(2000);
	    Runtime.getRuntime().exec("C:\\VivekDD\\Xml\\00250.Propety Preservation General Maintenance\\01.PropertyPreservationPGM.exe");
	    Thread.sleep(2000);
	    WebElement element2 = driver.findElement(sendBtn);
	    executor.executeScript("arguments[0].click();", element2);
	    Thread.sleep(5000);
	    }
	
	public void PropertyPreservationPGM200() throws IOException, InterruptedException {
		wait = new WebDriverWait(driver,Duration.ofSeconds(500));
		driver.findElement(More).click();
		driver.findElement(SystemAdmin).click();
		wait.until(ExpectedConditions.presenceOfElementLocated(Test));
		driver.findElement(Test).click();
		Actions act = new Actions(driver);
		act.moveToElement(driver.findElement(NewMessaging)).perform();
		driver.findElement(NewMSI).click();
		WebElement element1 = driver.findElement(OpenBTN);
		WebElement element2 = driver.findElement(sendBtn);
	    JavascriptExecutor executor = (JavascriptExecutor)driver;
	    executor.executeScript("arguments[0].click();", element1);
	    Thread.sleep(2000);
	    Runtime.getRuntime().exec("C:\\VivekDD\\Xml\\00250.Propety Preservation General Maintenance\\02.PropertyPreservationPGM.exe");
	    Thread.sleep(2000);
	    executor.executeScript("arguments[0].click();", element2);
	    Thread.sleep(5000);
	}
	public void ForeclosureUncontestedUF100() throws IOException, InterruptedException {
		wait = new WebDriverWait(driver,Duration.ofSeconds(500));
		driver.findElement(More).click();
		driver.findElement(SystemAdmin).click();
		wait.until(ExpectedConditions.presenceOfElementLocated(Test));
		driver.findElement(Test).click();
		Actions act = new Actions(driver);
		act.moveToElement(driver.findElement(NewMessaging)).perform();
		driver.findElement(NewDeval).click();
		WebElement element1 = driver.findElement(OpenBTN);
		WebElement element2 = driver.findElement(sendBtn);
	    JavascriptExecutor executor = (JavascriptExecutor)driver;
	    executor.executeScript("arguments[0].click();", element1);
	    Thread.sleep(2000);
	    Runtime.getRuntime().exec("C:\\VivekDD\\Xml\\00300.FC_UN from Deval\\01.FCUF100.exe");
	    Thread.sleep(2000);
	    executor.executeScript("arguments[0].click();", element2);
	    Thread.sleep(5000);
	}
}
