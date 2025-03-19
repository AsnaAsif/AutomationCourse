package seleniumBasics;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class WebElementCommands extends Base {
	public void webElementCommands()
	{
		
		driver.navigate().to("https://selenium.qabible.in/simple-form-demo.php");
		WebElement messagefield=driver.findElement(By.xpath("//input[@type='text']"));
		
		//to enter the value
		messagefield.sendKeys("asna");
		
		WebElement showMessage=driver.findElement(By.xpath("//button[@id='button-one']"));
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(10));//explixt wait
		wait.until(ExpectedConditions.elementToBeClickable(showMessage));//condition for wait
		showMessage.click();
		
		//to clear the entering value
		//messagefield.clear(); 
		
		WebElement yourMessage=driver.findElement(By.xpath("//div[@id='message-one']"));
		String message=yourMessage.getText();
		System.out.println(message);
		
		
		//for getting css property
		WebElement showMessageButton=driver.findElement(By.xpath("//button[@id='button-one']"));
		System.out.println(showMessageButton.getCssValue("background-color"));
		
		//to get css size
		System.out.println(showMessageButton.getSize());
		
		//to get tag name
		System.out.println(showMessageButton.getTagName());
	}

	public static void main(String[] args) {
		WebElementCommands element=new WebElementCommands();
		element.initiatiseBrower();
		element.webElementCommands();
		element.driverCloseAndQuit();
		
		

	}

}
