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
	By Group = By.xpath("(//a[@id='navbarDropdownMenuLink'][normalize-space()='Group'])[1]");
	By UserWindowMaintenance = By.xpath("(//a[normalize-space()='User Window Maintenance'])[1]");
	By UnconnctBtnWindows = By.xpath("//button[normalize-space()='Unconnected User to Windows']");
	By UnconnctBtnObject = By.xpath("//button[normalize-space()='Unconnected User to Objects']");
	By UnconnctGroupUser = By.xpath("//button[normalize-space()='Unconnected Groups to User']");
	By UnconnctUserWindowMaintenance = By.xpath("//button[normalize-space()='Unconnected User to Window.Controls']");
	By UnconnctExclusionControl = By.xpath("//button[normalize-space()='Unconnected User to Control']");
	By UnconnctUserPIIExclusion = By.xpath("//button[normalize-space()='Unconnected User to Window.PII']");
	By UnconnctUserUserPIIExclusion = By.xpath("//button[normalize-space()='Unconnected User to PII']");
	By UnconnctUserObjectBtn = By.xpath("//button[normalize-space()='Unconnected User to Object']");
	By UnconnctSubObject = By.xpath("//button[normalize-space()='Unconnected User to Sub-Object']");
	By SelectUser = By.xpath("//select[@id='Users Name ']");
	By SelectGroup = By.xpath("//select[@id='group']");
	By ObjectUserName = By.xpath("//select[@id='Users Name']");
	By ExclusionWindowUsername = By.xpath("//select[@id='UsersName']");
	By ExclusionWindowControlUserName = By.xpath("//select[@id='LoginID']");
	By WindowControlUserName = By.xpath("//select[@id='Login ID']");
	By CheckBox = By.xpath("//input[@type='checkbox']");
	By AttachedBox = By.xpath("(//div[@class='col-sm-5'])[3]//input[@type='checkbox']");
	By AttachedPIIBox = By.xpath("(//div[@class='col-sm-5'])//input[@type='checkbox']");
	By AttachedGroupBox = By.xpath("(//div[@class='col-sm-5'])[2]//input[@type='checkbox']");
	By WindowControlAttachedBox = By.xpath("(//div[@class='col-sm-5'])[2]//input[@type='checkbox']");
	By ExclusionWindowControlAttachedBox = By.xpath("(//div[@class='col-sm-5'])[2]//input[@type='checkbox']");
	By AttachBtn = By.xpath("//button[@ng-click='addbtnattach()']");
	By CloseBtn1 = By.xpath("(//button[@class='close'])[1]");
	By EditBtn = By.xpath("(//a[@ng-click='edit(user)'])[1]");
	By EditBtnGroup = By.xpath("(//a[@ng-click='edit(group)'])[1]");
	By DetachBtn = By.xpath("//button[@ng-click='btndetach()']");
	By CloseBtn2 = By.xpath("(//button[@class='close'])[2]");
	By CloseBtn3 = By.xpath("(//button[@class='close'])[3]");
	By UserObjectMaintenance = By.xpath("(//a[normalize-space()='User Object Maintenance'])[1]");
	By UserWindowControlMaintenance = By.xpath("(//a[normalize-space()='User Window Control Maintenance'])[1]");
    By ExclusionUserWindowMaintenance=  By.xpath("(//a[normalize-space()='Exclusion User Window Maintenance'])[1]");
    By ExclusionUserWindowControlMaintenance = By.xpath("(//a[normalize-space()='Exclusion User Window Control Maintenance'])[1]");
    By ExclusionUserWindowPIIMaintenance = By.xpath("//a[normalize-space()='Exclusion User Window PII Maintenance']");
    By ExclusionUserObjectMaintenance = By.xpath("(//a[normalize-space()='Exclusion User Object Maintenance'])[1]");
    By ExclusionUserSubObjectMaintenance = By.xpath("(//a[normalize-space()='Exclusion User Sub-Object Maintenance'])[1]");
    By ExclusionUserControlMaintenance = By.xpath("(//a[normalize-space()='Exclusion User Control Maintenance'])[1]");
    By ExclusionUserPIIMaintenance = By.xpath("(//a[normalize-space()='Exclusion User PII Maintenance'])[1]");
    By GroupUserMaintenance = By.xpath("(//a[normalize-space()='Group User Maintenance'])[1]");
	
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
	
	public void ExclusionUserWindowMaintenance() throws InterruptedException {
		driver.findElement(More).click();
		driver.findElement(SystemAdmin).click();
		driver.findElement(User).click();
		driver.findElement(ExclusionUserWindowMaintenance).click();
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
		 wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(ExclusionWindowUsername));
		 wait.until(ExpectedConditions.presenceOfElementLocated(ExclusionWindowUsername));
		 wait.until(ExpectedConditions.elementToBeClickable(ExclusionWindowUsername));
		WebElement UserSelection = driver.findElement(ExclusionWindowUsername);
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
		 Thread.sleep(5000);/*have to keep this wait as page getting refreshed*/
			 wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(EditBtn));
			 wait.until(ExpectedConditions.presenceOfElementLocated(EditBtn));
			 wait.until(ExpectedConditions.elementToBeClickable(EditBtn));
			 driver.findElement(EditBtn).click();
			 wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(AttachedBox));
			 wait.until(ExpectedConditions.presenceOfElementLocated(AttachedBox));
			 wait.until(ExpectedConditions.elementToBeClickable(AttachedBox));
		 List<WebElement> WindowControlAttachedBoxes = driver.findElements(AttachedBox);
			int j=0;
			for (j=0;j<WindowControlAttachedBoxes.size();) {
				WindowControlAttachedBoxes.get(j).click();
				if(j==3) {
					break;
				}
				j++;
			} 
		 driver.findElement(DetachBtn).click();
		 driver.findElement(CloseBtn2).click();
		 Thread.sleep(5000);			
	}
	   public void ExclusionUserWindowControlMaintenance() throws InterruptedException {
		   driver.findElement(More).click();
			driver.findElement(SystemAdmin).click();
			driver.findElement(User).click();
			driver.findElement(ExclusionUserWindowControlMaintenance).click();
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
			 wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(ExclusionWindowControlUserName));
			 wait.until(ExpectedConditions.presenceOfElementLocated(ExclusionWindowControlUserName));
			 wait.until(ExpectedConditions.elementToBeClickable(ExclusionWindowControlUserName));
			WebElement UserSelection = driver.findElement(ExclusionWindowControlUserName);
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
			 Thread.sleep(7000);/*have to keep this wait as page getting refreshed*/
				 wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(EditBtn));
				 wait.until(ExpectedConditions.presenceOfElementLocated(EditBtn));
				 wait.until(ExpectedConditions.elementToBeClickable(EditBtn));
				 driver.findElement(EditBtn).click();
			 List<WebElement> WindowControlAttachedBoxes = driver.findElements(ExclusionWindowControlAttachedBox);
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
			 Thread.sleep(5000);			   
	   }
	   
	   public void ExclusionUserWindowPIIMaintenance() throws InterruptedException {
		   driver.findElement(More).click();
					driver.findElement(SystemAdmin).click();
					driver.findElement(User).click();
					driver.findElement(ExclusionUserWindowPIIMaintenance).click();
					wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(UnconnctUserPIIExclusion));
					 wait.until(ExpectedConditions.presenceOfElementLocated(UnconnctUserPIIExclusion));
					 wait.until(ExpectedConditions.elementToBeClickable(UnconnctUserPIIExclusion));
					 try {
						 executor.executeScript("window.scrollBy(0,400)");
					driver.findElement(UnconnctUserPIIExclusion).click();
					}
					 catch (ElementClickInterceptedException e) {
						 executor.executeScript("window.scrollBy(0,400)");
						 WebElement element2 = driver.findElement(UnconnctUserPIIExclusion);
						 System.out.println("Excutor needed");
						    executor.executeScript("arguments[0].click();", element2);
					}
					 wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(ExclusionWindowControlUserName));
					 wait.until(ExpectedConditions.presenceOfElementLocated(ExclusionWindowControlUserName));
					 wait.until(ExpectedConditions.elementToBeClickable(ExclusionWindowControlUserName));
					WebElement UserSelection = driver.findElement(ExclusionWindowControlUserName);
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
					 Thread.sleep(7000);/*have to keep this wait as page getting refreshed*/
						 wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(EditBtn));
						 wait.until(ExpectedConditions.presenceOfElementLocated(EditBtn));
						 wait.until(ExpectedConditions.elementToBeClickable(EditBtn));
						 driver.findElement(EditBtn).click();
						 wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(ExclusionWindowControlAttachedBox));
						 wait.until(ExpectedConditions.presenceOfElementLocated(ExclusionWindowControlAttachedBox));
						 wait.until(ExpectedConditions.elementToBeClickable(ExclusionWindowControlAttachedBox));
					 List<WebElement> WindowControlAttachedBoxes = driver.findElements(ExclusionWindowControlAttachedBox);
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
					 Thread.sleep(5000);	   
	   }
	   
	   public void ExclusionUserObjectMaintenance() throws InterruptedException {
		   driver.findElement(More).click();
			driver.findElement(SystemAdmin).click();
			driver.findElement(User).click();
			driver.findElement(ExclusionUserObjectMaintenance).click();
			wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(UnconnctUserObjectBtn));
			 wait.until(ExpectedConditions.presenceOfElementLocated(UnconnctUserObjectBtn));
			 wait.until(ExpectedConditions.elementToBeClickable(UnconnctUserObjectBtn));
			 try {
				 executor.executeScript("window.scrollBy(0,400)");
			driver.findElement(UnconnctUserObjectBtn).click();
			}
			 catch (ElementClickInterceptedException e) {
				 executor.executeScript("window.scrollBy(0,400)");
				 WebElement element2 = driver.findElement(UnconnctUserObjectBtn);
				 System.out.println("Excutor needed");
				    executor.executeScript("arguments[0].click();", element2);
			}
			 wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(ExclusionWindowUsername));
			 wait.until(ExpectedConditions.presenceOfElementLocated(ExclusionWindowUsername));
			 wait.until(ExpectedConditions.elementToBeClickable(ExclusionWindowUsername));
			WebElement UserSelection = driver.findElement(ExclusionWindowUsername);
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
			 Thread.sleep(7000);/*have to keep this wait as page getting refreshed*/
				 wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(EditBtn));
				 wait.until(ExpectedConditions.presenceOfElementLocated(EditBtn));
				 wait.until(ExpectedConditions.elementToBeClickable(EditBtn));
				 driver.findElement(EditBtn).click();
				 wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(AttachedBox));
				 wait.until(ExpectedConditions.presenceOfElementLocated(AttachedBox));
				 wait.until(ExpectedConditions.elementToBeClickable(AttachedBox));
			 List<WebElement> WindowControlAttachedBoxes = driver.findElements(AttachedBox);
				int j=0;
				for (j=0;j<WindowControlAttachedBoxes.size();) {
					WindowControlAttachedBoxes.get(j).click();
					if(j==3) {
						break;
					}
					j++;
				} 
			 driver.findElement(DetachBtn).click();
			 driver.findElement(CloseBtn2).click();
			 Thread.sleep(5000);	      
	   }
	   
	   public void ExclusionUserSubObjectMaintenance() throws InterruptedException {
		   driver.findElement(More).click();
			driver.findElement(SystemAdmin).click();
			driver.findElement(User).click();
			driver.findElement(ExclusionUserSubObjectMaintenance).click();
			wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(UnconnctSubObject));
			 wait.until(ExpectedConditions.presenceOfElementLocated(UnconnctSubObject));
			 wait.until(ExpectedConditions.elementToBeClickable(UnconnctSubObject));
			 try {
				 executor.executeScript("window.scrollBy(0,400)");
			driver.findElement(UnconnctSubObject).click();
			}
			 catch (ElementClickInterceptedException e) {
				 executor.executeScript("window.scrollBy(0,400)");
				 WebElement element2 = driver.findElement(UnconnctSubObject);
				 System.out.println("Excutor needed");
				    executor.executeScript("arguments[0].click();", element2);
			}
			 wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(ExclusionWindowUsername));
			 wait.until(ExpectedConditions.presenceOfElementLocated(ExclusionWindowUsername));
			 wait.until(ExpectedConditions.elementToBeClickable(ExclusionWindowUsername));
			WebElement UserSelection = driver.findElement(ExclusionWindowUsername);
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
			 Thread.sleep(7000);/*have to keep this wait as page getting refreshed*/
				 wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(EditBtn));
				 wait.until(ExpectedConditions.presenceOfElementLocated(EditBtn));
				 wait.until(ExpectedConditions.elementToBeClickable(EditBtn));
				 driver.findElement(EditBtn).click();
				 wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(AttachedBox));
				 wait.until(ExpectedConditions.presenceOfElementLocated(AttachedBox));
				 wait.until(ExpectedConditions.elementToBeClickable(AttachedBox));
			 List<WebElement> WindowControlAttachedBoxes = driver.findElements(AttachedBox);
				int j=0;
				for (j=0;j<WindowControlAttachedBoxes.size();) {
					WindowControlAttachedBoxes.get(j).click();
					if(j==3) {
						break;
					}
					j++;
				} 
			 driver.findElement(DetachBtn).click();
			 driver.findElement(CloseBtn2).click();
			 Thread.sleep(5000);	      	   
	   }
	   
	   public void ExclusionUserControlMaintenance() throws InterruptedException {
		   driver.findElement(More).click();
			driver.findElement(SystemAdmin).click();
			driver.findElement(User).click();
			driver.findElement(ExclusionUserControlMaintenance).click();
			wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(UnconnctExclusionControl));
			 wait.until(ExpectedConditions.presenceOfElementLocated(UnconnctExclusionControl));
			 wait.until(ExpectedConditions.elementToBeClickable(UnconnctExclusionControl));
			 try {
				 executor.executeScript("window.scrollBy(0,400)");
			driver.findElement(UnconnctExclusionControl).click();
			}
			 catch (ElementClickInterceptedException e) {
				 executor.executeScript("window.scrollBy(0,400)");
				 WebElement element2 = driver.findElement(UnconnctExclusionControl);
				 System.out.println("Excutor needed");
				    executor.executeScript("arguments[0].click();", element2);
			}
			 wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(ExclusionWindowUsername));
			 wait.until(ExpectedConditions.presenceOfElementLocated(ExclusionWindowUsername));
			 wait.until(ExpectedConditions.elementToBeClickable(ExclusionWindowUsername));
			WebElement UserSelection = driver.findElement(ExclusionWindowUsername);
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
			 Thread.sleep(7000);/*have to keep this wait as page getting refreshed*/
				 wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(EditBtn));
				 wait.until(ExpectedConditions.presenceOfElementLocated(EditBtn));
				 wait.until(ExpectedConditions.elementToBeClickable(EditBtn));
				 driver.findElement(EditBtn).click();
				 wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(AttachedBox));
				 wait.until(ExpectedConditions.presenceOfElementLocated(AttachedBox));
				 wait.until(ExpectedConditions.elementToBeClickable(AttachedBox));
			 List<WebElement> WindowControlAttachedBoxes = driver.findElements(AttachedBox);
				int j=0;
				for (j=0;j<WindowControlAttachedBoxes.size();) {
					WindowControlAttachedBoxes.get(j).click();
					if(j==3) {
						break;
					}
					j++;
				} 
			 driver.findElement(DetachBtn).click();
			 driver.findElement(CloseBtn2).click();
			 Thread.sleep(5000);	      	   
	   }
      
	   public void ExclusionUserPIIMaintenance() throws InterruptedException {
		   driver.findElement(More).click();
			driver.findElement(SystemAdmin).click();
			driver.findElement(User).click();
			driver.findElement(ExclusionUserPIIMaintenance).click();
			wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(UnconnctUserUserPIIExclusion));
			 wait.until(ExpectedConditions.presenceOfElementLocated(UnconnctUserUserPIIExclusion));
			 wait.until(ExpectedConditions.elementToBeClickable(UnconnctUserUserPIIExclusion));
			 try {
				 executor.executeScript("window.scrollBy(0,400)");
			driver.findElement(UnconnctUserUserPIIExclusion).click();
			}
			 catch (ElementClickInterceptedException e) {
				 executor.executeScript("window.scrollBy(0,400)");
				 WebElement element2 = driver.findElement(UnconnctUserUserPIIExclusion);
				 System.out.println("Excutor needed");
				    executor.executeScript("arguments[0].click();", element2);
			}
			 wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(ExclusionWindowUsername));
			 wait.until(ExpectedConditions.presenceOfElementLocated(ExclusionWindowUsername));
			 wait.until(ExpectedConditions.elementToBeClickable(ExclusionWindowUsername));
			WebElement UserSelection = driver.findElement(ExclusionWindowUsername);
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
			 Thread.sleep(7000);/*have to keep this wait as page getting refreshed*/
				 wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(EditBtn));
				 wait.until(ExpectedConditions.presenceOfElementLocated(EditBtn));
				 wait.until(ExpectedConditions.elementToBeClickable(EditBtn));
				 driver.findElement(EditBtn).click();
				 wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(AttachedPIIBox));
				 wait.until(ExpectedConditions.presenceOfElementLocated(AttachedPIIBox));
				 wait.until(ExpectedConditions.elementToBeClickable(AttachedPIIBox));
			 List<WebElement> WindowControlAttachedBoxes = driver.findElements(AttachedPIIBox);
				int j=0;
				for (j=0;j<WindowControlAttachedBoxes.size();) {
					WindowControlAttachedBoxes.get(j).click();
					if(j==3) {
						break;
					}
					j++;
				} 
			 driver.findElement(DetachBtn).click();
			 driver.findElement(CloseBtn2).click();
			 Thread.sleep(5000);	      	   
	   }
	   
	   public void GroupUserMaintenance() throws InterruptedException {
		   driver.findElement(More).click();
			driver.findElement(SystemAdmin).click();
			driver.findElement(Group).click();
			driver.findElement(GroupUserMaintenance).click();
			wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(UnconnctGroupUser));
			 wait.until(ExpectedConditions.presenceOfElementLocated(UnconnctGroupUser));
			 wait.until(ExpectedConditions.elementToBeClickable(UnconnctGroupUser));
			 try {
				 executor.executeScript("window.scrollBy(0,400)");
			driver.findElement(UnconnctGroupUser).click();
			}
			 catch (ElementClickInterceptedException e) {
				 executor.executeScript("window.scrollBy(0,400)");
				 WebElement element2 = driver.findElement(UnconnctGroupUser);
				 System.out.println("Excutor needed");
				    executor.executeScript("arguments[0].click();", element2);
			}
			 wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(SelectGroup));
			 wait.until(ExpectedConditions.presenceOfElementLocated(SelectGroup));
			 wait.until(ExpectedConditions.elementToBeClickable(SelectGroup));
			WebElement UserSelection = driver.findElement(SelectGroup);
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
			 driver.findElement(CloseBtn3).click();
//			 Thread.sleep(7000);/*have to keep this wait as page getting refreshed*/
				 wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(EditBtnGroup));
				 wait.until(ExpectedConditions.presenceOfElementLocated(EditBtnGroup));
				 wait.until(ExpectedConditions.elementToBeClickable(EditBtnGroup));
				 driver.findElement(EditBtnGroup).click();
				 Thread.sleep(7000);
				 wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(AttachedGroupBox));
				 wait.until(ExpectedConditions.presenceOfElementLocated(AttachedGroupBox));
				 wait.until(ExpectedConditions.elementToBeClickable(AttachedGroupBox));
			 List<WebElement> WindowControlAttachedBoxes = driver.findElements(AttachedGroupBox);
				int j=0;
				for (j=0;j<WindowControlAttachedBoxes.size();) {
					WindowControlAttachedBoxes.get(j).click();
					if(j==3) {
						break;
					}
					j++;
				} 
			 driver.findElement(DetachBtn).click();
			 driver.findElement(CloseBtn2).click();
			 Thread.sleep(5000);	      	   
		   
	   }
}
