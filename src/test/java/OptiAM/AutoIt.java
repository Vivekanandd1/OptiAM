package OptiAM;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class AutoIt {
	public static void main(String[] args) throws IOException {	
		
		
    WebDriver driver=new ChromeDriver();	
    
    driver.manage().window().maximize();
    driver.get("https://cgi-lib.berkeley.edu/ex/fup.html");			
	
    // below line execute the AutoIT script .
     Runtime.getRuntime().exec("C:\\Users\\QA\\Desktop\\Book2.xlsx");		

//    driver.close();
     }

}
