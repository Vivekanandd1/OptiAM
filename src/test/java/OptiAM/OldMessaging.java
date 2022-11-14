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
	  Actions build;
	  JavascriptExecutor executor;
	  
	  By More = By.xpath("//a[normalize-space()='More']");
	  By SystemAdmin = By.xpath("//a[normalize-space()='System Admin']");
	  By Test = By.xpath("(//a[normalize-space()='Test'])[1]");
	  By OldMessaging = By.xpath("//a[normalize-space()='Messaging Tester (OLD)']");
	  By OldMSI = By.xpath("//a[normalize-space()='MSI - Property Preservation Service Provider']");
	  By OldDeval = By.xpath("//a[normalize-space()='DEVAL - Legal Service Provider']");
	  By OldClassValution = By.xpath("//a[normalize-space()='Class Valuation - Appraisal Service Provider']");
	  By OldRadian = By.xpath("//a[normalize-space()='RADIAN - REO Service Provider']");
	  By OpenBTN = By.id("selectFile");
	  By sendBtn = By.xpath("//input[@value='Send To Hub']");
	  
	  public OldMessaging(WebDriver driver) {
		  this.driver=driver;
		 build = new Actions(driver);
		executor = (JavascriptExecutor)driver;
	  }
	  
	  public void PropertyPreservation() throws InterruptedException, IOException {
		  WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(30000));
			wait.until(ExpectedConditions.presenceOfElementLocated(More));
			wait.until(ExpectedConditions.elementToBeClickable(More));
			driver.findElement(More).click();
			driver.findElement(SystemAdmin).click();
			wait.until(ExpectedConditions.presenceOfElementLocated(Test));
			driver.findElement(Test).click();
			build.moveToElement(driver.findElement(OldMessaging)).perform();
			driver.findElement(OldMSI).click();
			wait.until(ExpectedConditions.presenceOfElementLocated(OpenBTN));
			wait.until(ExpectedConditions.elementToBeClickable(OpenBTN));
			//1st Step of Property Preservation inspection
			WebElement element1 = driver.findElement(OpenBTN);
			executor.executeScript("arguments[0].click();", element1);
		    Thread.sleep(2000);
		    Runtime.getRuntime().exec("C:\\VivekDD\\OLD XML\\00200. Property Inspection from MSI\\01.PropertyPreservationPI.exe");
		    Thread.sleep(2000);
		    WebElement element2 = driver.findElement(sendBtn);
		    build.moveToElement(element2).click(element2);
	        build.perform();
	        Thread.sleep(2000);
	         //2nd Step of Property Preservation inspection
			executor.executeScript("arguments[0].click();", element1);
		    Thread.sleep(2000);
		    Runtime.getRuntime().exec("C:\\VivekDD\\OLD XML\\00200. Property Inspection from MSI\\02.PropertyPreservationPI.exe");
		    Thread.sleep(2000);
		    build.moveToElement(element2).click(element2);
	        build.perform();
	        Thread.sleep(5000);
	        //1st step of Property Preservation General Maintenence 
	        try{
	        executor.executeScript("arguments[0].click();", element1);
	        }
	        finally {
	        	build.moveToElement(element1).click(element1);
		        build.perform();
			}
		    Thread.sleep(2000);
		    Runtime.getRuntime().exec("C:\\VivekDD\\OLD XML\\00250.Property Preservation from MSI\\01.PropertyPreservationPGM.exe");
		    Thread.sleep(2000);
		    build.moveToElement(element2).click(element2);
	        build.perform();
	        Thread.sleep(2000);
	        //2nd step of Property Preservation General Maintenence 
	        executor.executeScript("arguments[0].click();", element1);
		    Thread.sleep(2000);
		    Runtime.getRuntime().exec("C:\\VivekDD\\OLD XML\\00250.Property Preservation from MSI\\02.PropertyPreservationPGM.exe");
		    Thread.sleep(2000);
		    build.moveToElement(element2).click(element2);
	        build.perform();
	        Thread.sleep(10000);
		    }
	  
	  public void ForeclosureUnContested() throws InterruptedException, IOException {
		  WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(30000));
		  wait.until(ExpectedConditions.presenceOfElementLocated(More));
			driver.findElement(More).click();
			driver.findElement(SystemAdmin).click();
			wait.until(ExpectedConditions.presenceOfElementLocated(Test));
			driver.findElement(Test).click();
			build.moveToElement(driver.findElement(OldMessaging)).perform();
			driver.findElement(OldDeval).click();
			wait.until(ExpectedConditions.presenceOfElementLocated(OpenBTN));
			wait.until(ExpectedConditions.elementToBeClickable(OpenBTN));
			//1st step of ForeclosureUncontested 
			   Thread.sleep(2000);
			WebElement element1 = driver.findElement(OpenBTN);
			executor.executeScript("arguments[0].click();", element1);
		    Thread.sleep(2000);
		    Runtime.getRuntime().exec("C:\\VivekDD\\OLD XML\\00300.FC_UN from Deval\\01.ForeclosureUncontested.exe");
		    Thread.sleep(2000);
		    WebElement element2 = driver.findElement(sendBtn);
		    build.moveToElement(element2).click(element2);
	        build.perform();
	        Thread.sleep(3000);
	        //2nd step of ForeclosureUncontested
			executor.executeScript("arguments[0].click();", element1);
		    Thread.sleep(2000);
		    Runtime.getRuntime().exec("C:\\VivekDD\\OLD XML\\00300.FC_UN from Deval\\02.ForeclosureUncontested.exe");
		    Thread.sleep(2000);
		    build.moveToElement(element2).click(element2);
	        build.perform();
	        Thread.sleep(3000);
	        //3rd step of ForeclosureUncontested
			executor.executeScript("arguments[0].click();", element1);
		    Thread.sleep(2000);
		    Runtime.getRuntime().exec("C:\\VivekDD\\OLD XML\\00300.FC_UN from Deval\\03.ForeclosureUncontested.exe");
		    Thread.sleep(2000);
		    build.moveToElement(element2).click(element2);
	        build.perform();
	        Thread.sleep(3000);
	        //4th step of ForeclosureUncontested
			executor.executeScript("arguments[0].click();", element1);
		    Thread.sleep(2000);
		    Runtime.getRuntime().exec("C:\\VivekDD\\OLD XML\\00300.FC_UN from Deval\\04.ForeclosureUncontested.exe");
		    Thread.sleep(2000);
		    build.moveToElement(element2).click(element2);
	        build.perform();
	        Thread.sleep(3000);
	        //5th step of ForeclosureUncontested
			executor.executeScript("arguments[0].click();", element1);
		    Thread.sleep(2000);
		    Runtime.getRuntime().exec("C:\\VivekDD\\OLD XML\\00300.FC_UN from Deval\\05.ForeclosureUncontested.exe");
		    Thread.sleep(2000);
		    build.moveToElement(element2).click(element2);
	        build.perform();
	        Thread.sleep(3000);
	        //6th step of ForeclosureUncontested
			executor.executeScript("arguments[0].click();", element1);
		    Thread.sleep(2000);
		    Runtime.getRuntime().exec("C:\\VivekDD\\OLD XML\\00300.FC_UN from Deval\\06.ForeclosureUncontested.exe");
		    Thread.sleep(2000);
		    build.moveToElement(element2).click(element2);
	        build.perform();
	        Thread.sleep(3000);
	        //7th step of ForeclosureUncontested
			executor.executeScript("arguments[0].click();", element1);
		    Thread.sleep(2000);
		    Runtime.getRuntime().exec("C:\\VivekDD\\OLD XML\\00300.FC_UN from Deval\\07.ForeclosureUncontested.exe");
		    Thread.sleep(2000);
		    build.moveToElement(element2).click(element2);
	        build.perform();
	        Thread.sleep(3000);
	        //8th step of ForeclosureUncontested
			executor.executeScript("arguments[0].click();", element1);
		    Thread.sleep(2000);
		    Runtime.getRuntime().exec("C:\\VivekDD\\OLD XML\\00300.FC_UN from Deval\\08.ForeclosureUncontested.exe");
		    Thread.sleep(2000);
		    build.moveToElement(element2).click(element2);
	        build.perform();
	        Thread.sleep(25000);	  
	  }
	  
	  public void PreReo() throws InterruptedException, IOException {
		  WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(30000));
		  wait.until(ExpectedConditions.presenceOfElementLocated(More));
		  wait.until(ExpectedConditions.elementToBeClickable(More)); 
			driver.findElement(More).click();
			driver.findElement(SystemAdmin).click();
			wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(Test));
			driver.findElement(Test).click();
			build.moveToElement(driver.findElement(OldMessaging)).perform();
			driver.findElement(OldMSI).click();
			wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(OpenBTN));
			wait.until(ExpectedConditions.elementToBeClickable(OpenBTN));
			//1st Step of USDA-PreREO
			WebElement element1 = driver.findElement(OpenBTN);
			executor.executeScript("arguments[0].click();", element1);
		    Thread.sleep(2000);
		    Runtime.getRuntime().exec("C:\\VivekDD\\OLD XML\\00400.Pre-Reo from MSI\\01.PreReo.exe");
		    Thread.sleep(2000);
		    WebElement element2 = driver.findElement(sendBtn);
		    build.moveToElement(element2).click(element2);
	        build.perform();
	        Thread.sleep(10000);
	  }
	  
	  public void AppraisalValutionReo() throws InterruptedException, IOException {
		  WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(30000));
		  wait.until(ExpectedConditions.presenceOfElementLocated(More));
			driver.findElement(More).click();
			driver.findElement(SystemAdmin).click();
			wait.until(ExpectedConditions.presenceOfElementLocated(Test));
			driver.findElement(Test).click();
			build.moveToElement(driver.findElement(OldMessaging)).perform();
			driver.findElement(OldClassValution).click();
			wait.until(ExpectedConditions.presenceOfElementLocated(OpenBTN));
			wait.until(ExpectedConditions.elementToBeClickable(OpenBTN));
			//1st Step of Appraisal Valuation Reo
			WebElement element1 = driver.findElement(OpenBTN);
			executor.executeScript("arguments[0].click();", element1);
		    Thread.sleep(2000);
		    Runtime.getRuntime().exec("C:\\VivekDD\\OLD XML\\00500.Appraisal Valuation Reo From Class Valuation\\01.AppraisalValuationReo.exe");
		    Thread.sleep(2000);
		    WebElement element2 = driver.findElement(sendBtn);
		    build.moveToElement(element2).click(element2);
	        build.perform();
	        Thread.sleep(13000);
	  }
	  
	  public void REO() throws InterruptedException, IOException {
		  WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(30000));
		  wait.until(ExpectedConditions.presenceOfElementLocated(More));
			driver.findElement(More).click();
			driver.findElement(SystemAdmin).click();
			wait.until(ExpectedConditions.presenceOfElementLocated(Test));
			driver.findElement(Test).click();
			build.moveToElement(driver.findElement(OldMessaging)).perform();
			driver.findElement(OldRadian).click();
			wait.until(ExpectedConditions.presenceOfElementLocated(OpenBTN));
			wait.until(ExpectedConditions.elementToBeClickable(OpenBTN));
			//1st Step of REO
			WebElement element1 = driver.findElement(OpenBTN);
			executor.executeScript("arguments[0].click();", element1);
		    Thread.sleep(2000);
		    Runtime.getRuntime().exec("C:\\VivekDD\\OLD XML\\00600.REO from Radian\\01.REO.exe");
		    Thread.sleep(2000);
		    WebElement element2 = driver.findElement(sendBtn);
		    build.moveToElement(element2).click(element2);
	        build.perform();
	        Thread.sleep(3000);
	    	//2nd Step of REO
			executor.executeScript("arguments[0].click();", element1);
		    Thread.sleep(2000);
		    Runtime.getRuntime().exec("C:\\VivekDD\\OLD XML\\00600.REO from Radian\\02.REO.exe");
		    Thread.sleep(2000);
		    build.moveToElement(element2).click(element2);
	        build.perform();
	        Thread.sleep(3000);
	      //2nd Step of REO
			executor.executeScript("arguments[0].click();", element1);
		    Thread.sleep(2000);
		    Runtime.getRuntime().exec("C:\\VivekDD\\OLD XML\\00600.REO from Radian\\02.REO.exe");
		    Thread.sleep(2000);
		    build.moveToElement(element2).click(element2);
	        build.perform();
	        Thread.sleep(3000);
	      //3rd Step of REO
			executor.executeScript("arguments[0].click();", element1);
		    Thread.sleep(2000);
		    Runtime.getRuntime().exec("C:\\VivekDD\\OLD XML\\00600.REO from Radian\\03.REO.exe");
		    Thread.sleep(2000);
		    build.moveToElement(element2).click(element2);
	        build.perform();
	        Thread.sleep(3000);
	      //4th Step of REO
			executor.executeScript("arguments[0].click();", element1);
		    Thread.sleep(2000);
		    Runtime.getRuntime().exec("C:\\VivekDD\\OLD XML\\00600.REO from Radian\\04.REO.exe");
		    Thread.sleep(2000);
		    build.moveToElement(element2).click(element2);
	        build.perform();
	        Thread.sleep(3000);
	        //5th Step of REO
			executor.executeScript("arguments[0].click();", element1);
		    Thread.sleep(2000);
		    Runtime.getRuntime().exec("C:\\VivekDD\\OLD XML\\00600.REO from Radian\\05.REO.exe");
		    Thread.sleep(2000);
		    build.moveToElement(element2).click(element2);
	        build.perform();
	        Thread.sleep(3000);
	        //6th Step of REO
			executor.executeScript("arguments[0].click();", element1);
		    Thread.sleep(2000);
		    Runtime.getRuntime().exec("C:\\VivekDD\\OLD XML\\00600.REO from Radian\\06.REO.exe");
		    Thread.sleep(2000);
		    build.moveToElement(element2).click(element2);
	        build.perform();
	        Thread.sleep(3000);
	        
	      //7th Step of REO
			executor.executeScript("arguments[0].click();", element1);
		    Thread.sleep(2000);
		    Runtime.getRuntime().exec("C:\\VivekDD\\OLD XML\\00600.REO from Radian\\07.REO.exe");
		    Thread.sleep(2000);
		    build.moveToElement(element2).click(element2);
	        build.perform();
	        Thread.sleep(3000);
	        
	      //8th Step of REO
			executor.executeScript("arguments[0].click();", element1);
		    Thread.sleep(2000);
		    Runtime.getRuntime().exec("C:\\VivekDD\\OLD XML\\00600.REO from Radian\\08.REO.exe");
		    Thread.sleep(2000);
		    build.moveToElement(element2).click(element2);
	        build.perform();
	        Thread.sleep(10000);
	  }

}
