package OptiAM;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class CaseBoarding {
	
	private WebDriver driver;
	
	By Servicing = By.xpath("(//li[@class='nav-item dropdown'])[1]");
	By Translation = By.xpath("(//a[@href='#/TranslationSystemUpload'])[1]");
	By FileSelection = By.xpath("//input[@name='file_Uploader']");
	By UploadBtn = By.xpath("//input[@value='Upload Translation File']");
	
	public CaseBoarding(WebDriver driver) {
		this.driver=driver;
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(100));
	}
	
	public void Translation() throws InterruptedException, IOException {
		driver.findElement(Servicing).click();
		driver.findElement(Translation).click();
		WebElement element1 = driver.findElement(FileSelection);
	    JavascriptExecutor executor = (JavascriptExecutor)driver;
	    executor.executeScript("arguments[0].click();", element1);
	    Thread.sleep(2000);
	    Runtime.getRuntime().exec("C:\\VivekDD\\Xml\\00100.Translation File\\01.TransalationFile.exe");
	    Thread.sleep(2000);
	    WebElement element2 = driver.findElement(UploadBtn);
	    executor.executeScript("arguments[0].click();", element2);
		
	}
	

}
