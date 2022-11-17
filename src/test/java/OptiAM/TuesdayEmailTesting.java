package OptiAM;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class TuesdayEmailTesting {
	
	WebDriver driver;
	WebDriverWait wait;
	JavascriptExecutor executor;
	
	public TuesdayEmailTesting(WebDriver driver,WebDriverWait wait){
		this.driver=driver;
		this.wait=wait;
		executor = (JavascriptExecutor)driver;
	}
	
	By More = By.xpath("//a[normalize-space()='More']");
	By SystemAdmin =  By.xpath("//a[normalize-space()='System Admin']");
	By User = By.xpath("(//a[@id='navbarDropdownMenuLink'][normalize-space()='Users'])[1]");
	By UserWindowMaintenance = By.xpath("(//a[normalize-space()='User Window Maintenance'])[1]");
	By UnconnctBtn = By.xpath("//button[normalize-space()='Unconnected User to Windows']");
	By SelectUser = By.xpath("//select[@id='Users Name ']");
	
	public void TuesdayTesting() {
		driver.findElement(More).click();
		driver.findElement(SystemAdmin).click();
		driver.findElement(User).click();
		driver.findElement(UserWindowMaintenance).click();
		driver.findElement(UnconnctBtn).click();
		WebElement UserSelection = driver.findElement(SelectUser);
		Select UserSelect = new Select(UserSelection);
		UserSelect.selectByVisibleText("vivek");
		
	}

}
