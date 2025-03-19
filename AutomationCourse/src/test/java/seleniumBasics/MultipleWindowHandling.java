package seleniumBasics;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class MultipleWindowHandling extends Base {
	
	public void handlingMultipleWindow()
	{
		driver.navigate().to("https://demo.guru99.com/popup.php");
		
		String parentWindowHandleId=driver.getWindowHandle();
		System.out.println(parentWindowHandleId);
		
		WebElement clickField=driver.findElement(By.xpath("//a[text()='Click Here']"));
		clickField.click();
		
		Set<String> handleIDs=driver.getWindowHandles();//to get multiple windowsids
		Iterator<String> values=handleIDs.iterator();
		while(values.hasNext())
		{
			String currentID=values.next();
			
			if(!currentID.equals(parentWindowHandleId))//! MEANS NOT EQUAL
			{
				driver.switchTo().window(currentID);
				WebElement email=driver.findElement(By.xpath("//input[@name='emailid']"));
				email.sendKeys("asna369@gmail.com");
				WebElement submit=driver.findElement(By.xpath("//input[@value='Submit']"));
				submit.click();
				
			}
		}
	}

	public static void main(String[] args) {
		MultipleWindowHandling multiple=new MultipleWindowHandling();
		multiple.initiatiseBrower();
		multiple.handlingMultipleWindow();
		//multiple.driverCloseAndQuit();

	}

}
