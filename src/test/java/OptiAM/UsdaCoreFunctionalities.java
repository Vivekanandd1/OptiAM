package OptiAM;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class UsdaCoreFunctionalities {
	WebDriver driver;
	WebDriverWait wait;
	JavascriptExecutor executor;
	Actions build;
	
	public UsdaCoreFunctionalities(WebDriver driver,WebDriverWait wait) {
		this.driver=driver;
		this.wait=wait;
		executor = (JavascriptExecutor)driver;
	}
	
	By More = By.xpath("//a[normalize-space()='More']");
	By Admin = By.xpath("//a[normalize-space()='Admin']");
	By SubAdmin = By.xpath("//a[normalize-space()='Sub-Admin']");
	By SPSAdmin = By.xpath("//a[normalize-space()='SPS-Admin']");
	By SpsOnDemandRun = By.xpath("(//a[normalize-space()='On Demand Run'])[5]");
	By SPSRunBtn = By.xpath("//button[@ng-click='CallExtractService()']");
	
	public void USDASPSBatchRun() throws InterruptedException {
		driver.findElement(More).click();
		driver.findElement(Admin).click();
		driver.findElement(SubAdmin).click();
		driver.findElement(SPSAdmin).click();
		wait.until(ExpectedConditions.visibilityOfElementLocated(SpsOnDemandRun));
		 wait.until(ExpectedConditions.presenceOfElementLocated(SpsOnDemandRun));
		 wait.until(ExpectedConditions.elementToBeClickable(SpsOnDemandRun));
		 driver.findElement(SpsOnDemandRun).click();
		 driver.findElement(SPSRunBtn).click();
		 Thread.sleep(5000);
	}
}
