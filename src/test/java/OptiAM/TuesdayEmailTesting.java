package OptiAM;

import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.ElementClickInterceptedException;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
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
	By UnconnctBtnWindows = By.xpath("//button[normalize-space()='Unconnected User to Windows']");
	By UnconnctBtnObject = By.xpath("//button[normalize-space()='Unconnected User to Objects']");
	By UnconnctUserWindowMaintenance = By.xpath("//button[normalize-space()='Unconnected User to Window.Controls']");
	By SelectUser = By.xpath("//select[@id='Users Name ']");
	By ObjectUserName = By.xpath("//select[@id='Users Name']");
	By WindowControlUserName = By.xpath("//select[@id='Login ID']");
	By CheckBox = By.xpath("//input[@type='checkbox']");
	By AttachedBox = By.xpath("(//div[@class='col-sm-5'])[3]//input[@type='checkbox']");
	By WindowControlAttachedBox = By.xpath("(//div[@class='col-sm-5'])[2]//input[@type='checkbox']");
	By AttachBtn = By.xpath("//button[@ng-click='addbtnattach()']");
	By CloseBtn1 = By.xpath("(//button[@class='close'])[1]");
	By EditBtn = By.xpath("(//a[@ng-click='edit(user)'])[1]");
	By DetachBtn = By.xpath("//button[@ng-click='btndetach()']");
	By CloseBtn2 = By.xpath("(//button[@class='close'])[2]");
	By UserObjectMaintenance = By.xpath("(//a[normalize-space()='User Object Maintenance'])[1]");
	By UserWindowControlMaintenance = By.xpath("(//a[normalize-space()='User Window Control Maintenance'])[1]");
	
	public void UserWindowsMaintenance() throws InterruptedException {
		driver.findElement(More).click();
		driver.findElement(SystemAdmin).click();
		driver.findElement(User).click();
		driver.findElement(UserWindowMaintenance).click();
		wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(UnconnctBtnWindows));
		 wait.until(ExpectedConditions.presenceOfElementLocated(UnconnctBtnWindows));
		 wait.until(ExpectedConditions.elementToBeClickable(UnconnctBtnWindows));
		 try {
			 executor.executeScript("window.scrollBy(0,400)");
		driver.findElement(UnconnctBtnWindows).click();
		}
		 catch (ElementClickInterceptedException e) {
			 executor.executeScript("window.scrollBy(0,400)");
			 WebElement element2 = driver.findElement(UnconnctBtnWindows);
			 System.out.println("Excutor needed");
			    executor.executeScript("arguments[0].click();", element2);
		}
		 wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(SelectUser));
		 wait.until(ExpectedConditions.presenceOfElementLocated(SelectUser));
		 wait.until(ExpectedConditions.elementToBeClickable(SelectUser));
		WebElement UserSelection = driver.findElement(SelectUser);
		Select UserSelect = new Select(UserSelection);
		UserSelect.selectByValue("0");
		List<WebElement> Checkboxes = driver.findElements(CheckBox);
		int i=0;
		for (i=0;i<Checkboxes.size();) {
			 Checkboxes.get(i).click();
			if(i==3) {
				break;
			}
			i++;
				}
		 driver.findElement(AttachBtn).click();
		 driver.findElement(CloseBtn1).click();
		 driver.findElement(EditBtn).click();
		 List<WebElement> Attachedboxes = driver.findElements(AttachedBox);
			int j=0;
			for (j=0;j<Attachedboxes.size();) {
				Attachedboxes.get(j).click();
				if(j==3) {
					break;
				}
				j++;
					}
		 driver.findElement(DetachBtn).click();
		 driver.findElement(CloseBtn2).click();
		 Thread.sleep(3000);
	      }
	public void UserObjectMaintenance() throws InterruptedException {
		driver.findElement(More).click();
		driver.findElement(SystemAdmin).click();
		driver.findElement(User).click();
		driver.findElement(UserObjectMaintenance).click();
		wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(UnconnctBtnObject));
		 wait.until(ExpectedConditions.presenceOfElementLocated(UnconnctBtnObject));
		 wait.until(ExpectedConditions.elementToBeClickable(UnconnctBtnObject));
		 try {
			 executor.executeScript("window.scrollBy(0,400)");
		driver.findElement(UnconnctBtnObject).click();
		}
		 catch (ElementClickInterceptedException e) {
			 executor.executeScript("window.scrollBy(0,400)");
			 WebElement element2 = driver.findElement(UnconnctBtnObject);
			 System.out.println("Excutor needed");
			    executor.executeScript("arguments[0].click();", element2);
		}
		 wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(ObjectUserName));
		 wait.until(ExpectedConditions.presenceOfElementLocated(ObjectUserName));
		 wait.until(ExpectedConditions.elementToBeClickable(ObjectUserName));
		WebElement UserSelection = driver.findElement(ObjectUserName);
		Select UserSelect = new Select(UserSelection);
		UserSelect.selectByValue("0");
		List<WebElement> Checkboxes = driver.findElements(CheckBox);
		int i=0;
		for (i=0;i<Checkboxes.size();) {
			 Checkboxes.get(i).click();
			if(i==3) {
				break;
			}
			i++;
				}
		 driver.findElement(AttachBtn).click();
		 driver.findElement(CloseBtn1).click();
		 driver.findElement(EditBtn).click();
		 List<WebElement> Attachedboxes = driver.findElements(AttachedBox);
			int j=0;
			for (j=0;j<Attachedboxes.size();) {
				Attachedboxes.get(j).click();
				if(j==3) {
					break;
				}
				j++;
					}
		 driver.findElement(DetachBtn).click();
		 driver.findElement(CloseBtn2).click();
		 Thread.sleep(3000);		
	}
	
	public void UserWindowControlMaintenance() throws InterruptedException {
		driver.findElement(More).click();
		driver.findElement(SystemAdmin).click();
		driver.findElement(User).click();
		driver.findElement(UserWindowControlMaintenance).click();
		wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(UnconnctUserWindowMaintenance));
		 wait.until(ExpectedConditions.presenceOfElementLocated(UnconnctUserWindowMaintenance));
		 wait.until(ExpectedConditions.elementToBeClickable(UnconnctUserWindowMaintenance));
		 try {
			 executor.executeScript("window.scrollBy(0,400)");
		driver.findElement(UnconnctUserWindowMaintenance).click();
		}
		 catch (ElementClickInterceptedException e) {
			 executor.executeScript("window.scrollBy(0,400)");
			 WebElement element2 = driver.findElement(UnconnctUserWindowMaintenance);
			 System.out.println("Excutor needed");
			    executor.executeScript("arguments[0].click();", element2);
		}
		 wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(WindowControlUserName));
		 wait.until(ExpectedConditions.presenceOfElementLocated(WindowControlUserName));
		 wait.until(ExpectedConditions.elementToBeClickable(WindowControlUserName));
		WebElement UserSelection = driver.findElement(WindowControlUserName);
		Select UserSelect = new Select(UserSelection);
		UserSelect.selectByValue("0");
		List<WebElement> Checkboxes = driver.findElements(CheckBox);
		int i=0;
		for (i=0;i<Checkboxes.size();) {
			 Checkboxes.get(i).click();
			if(i==3) {
				break;
			}
			i++;
				}
		 driver.findElement(AttachBtn).click();
		 driver.findElement(CloseBtn2).click();
//		 executor.executeScript("window.scrollBy(0,-450)");
//		 wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(EditBtn));
//		 wait.until(ExpectedConditions.presenceOfElementLocated(EditBtn));
//		 wait.until(ExpectedConditions.elementToBeClickable(EditBtn));
		 try{driver.findElement(EditBtn).click();}
		 catch (ElementClickInterceptedException e) {
			 WebElement Ele = driver.findElement(EditBtn);
				executor.executeScript("arguments[0].click();", Ele);
		}
		 List<WebElement> WindowControlAttachedBoxes = driver.findElements(WindowControlAttachedBox);
			int j=0;
			for (j=0;j<WindowControlAttachedBoxes.size();) {
				WindowControlAttachedBoxes.get(j).click();
				if(j==3) {
					break;
				}
				j++;
					}
		 driver.findElement(DetachBtn).click();
		 driver.findElement(CloseBtn1).click();
		 Thread.sleep(3000);
		
	}
	   

}
