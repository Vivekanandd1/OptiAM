package OptiAM;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class AutoIt {
	public static void main(String[] args) throws IOException, InterruptedException {	
		
		
    WebDriver driver=new ChromeDriver();	
    
    driver.manage().window().maximize();
    driver.get("https://formstone.it/components/upload/demo/");			
	
    JavascriptExecutor js = (JavascriptExecutor) driver;
    js.executeScript("window.scrollBy(0,600)", "");
    
    Thread.sleep(3000);

    driver.findElement(By.xpath("//*[@id=\"example-2\"]/form/div[1]/div")).click();
    // below line execute the AutoIT script .
    Thread.sleep(3000);

    Runtime.getRuntime().exec("C:\\Users\\QA\\Desktop\\dump\\AutoitUploadScript.exe");
    
    Thread.sleep(3000);
    
    driver.findElement(By.xpath("//span[@class='start_all']")).click();

//    driver.close();
     }

}
