package OptiAM;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class CaseBoarding {
	
	private WebDriver driver;
	WebDriverWait wait;
	Actions builder;
	
	By Servicing = By.xpath("(//li[@class='nav-item dropdown'])[1]");
	By Translation = By.xpath("(//a[@href='#/TranslationSystemUpload'])[1]");
	By FileSelection = By.xpath("//input[@name='file_Uploader']");
	By UploadBtn = By.xpath("//input[@value='Upload Translation File']");
	
	public CaseBoarding(WebDriver driver) {
		this.driver=driver;
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(100));
		wait = new WebDriverWait(driver,Duration.ofSeconds(5000));
		builder = new Actions(driver);
	}
	
	public void Translation() throws InterruptedException, IOException {
		 Thread.sleep(2000);
		wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(Servicing));
		wait.until(ExpectedConditions.elementToBeClickable(Servicing));
		driver.findElement(Servicing).click();
		driver.findElement(Translation).click();
		WebElement element1 = driver.findElement(FileSelection);
	    builder.moveToElement(element1).click(element1);
	    builder.perform();
	    Thread.sleep(2000);
	    Runtime.getRuntime().exec("C:\\VivekDD\\Xml\\00100.Translation File\\01.TransalationFile.exe");
	    Thread.sleep(2000);
	    WebElement element2 = driver.findElement(UploadBtn);
	    builder.moveToElement(element2).click(element2);
        builder.perform();
	    Thread.sleep(5000);
        builder.moveToElement(element1).click(element1);
        builder.perform();
	    Thread.sleep(2000);
	    Runtime.getRuntime().exec("C:\\VivekDD\\OLD XML\\00100.Translation File\\01.TransalationFile.exe");
	    Thread.sleep(2000);
	    builder.moveToElement(element2).click(element2);
        builder.perform();
	    Thread.sleep(5000);
	}
	

}
