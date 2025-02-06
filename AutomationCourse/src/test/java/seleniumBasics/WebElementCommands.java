package seleniumBasics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class WebElementCommands extends Base {
	public void webElementCommands()
	{
		
		driver.navigate().to("https://selenium.qabible.in/simple-form-demo.php");
		WebElement messagefield=driver.findElement(By.xpath("//input[@type='text']"));
		messagefield.sendKeys("asna");
		WebElement showMessage=driver.findElement(By.xpath("//button[@id='button-one']"));
		showMessage.click();
	}

	public static void main(String[] args) {
		WebElementCommands element=new WebElementCommands();
		element.initiatiseBrower();
		element.webElementCommands();
		element.driverCloseAndQuit();
		
		

	}

}
