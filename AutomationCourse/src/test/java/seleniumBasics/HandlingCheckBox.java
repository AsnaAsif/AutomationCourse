package seleniumBasics;

import java.time.Duration;
import java.util.List;
import java.util.NoSuchElementException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;

public class HandlingCheckBox extends Base{
	
	public void handlingCheckBox()
	{
		//checkbox
		driver.navigate().to("https://selenium.qabible.in/check-box-demo.php");
		WebElement checkBox1=driver.findElement(By.xpath("//input[@id='gridCheck']"));
		checkBox1.click();
		
		//multiple checkbox
		List<WebElement>multipleCheckBox=driver.findElements(By.xpath("//input[@class='check-box-list']"));
		
		for(int i=0; i<multipleCheckBox.size(); i++)
		{
			multipleCheckBox.get(i).click();
		}
		
		//to check whether the show message button displayed or not, we use isdisplayed
		driver.navigate().to("https://selenium.qabible.in/simple-form-demo.php");
		WebElement displayed=driver.findElement(By.xpath("//button[@id='button-one']")); 
		System.out.println(displayed.isDisplayed());
		
		//radiobutton
		driver.navigate().to("https://selenium.qabible.in/radio-button-demo.php");
		WebElement radioButton=driver.findElement(By.xpath("//input[@id='inlineRadio2']"));
		radioButton.click();
		System.out.println(radioButton.isSelected());
		
		Wait<WebDriver> fluentWait = new FluentWait<WebDriver>(driver)//refrence
				.withTimeout(Duration.ofSeconds(10))//time specify
				.pollingEvery(Duration.ofSeconds(3))//checking time
				.ignoring(NoSuchElementException.class);//ignore exception
		fluentWait.until(ExpectedConditions.elementToBeSelected(radioButton));
		WebElement showValue=driver.findElement(By.xpath("//button[@id='button-one']"));
		System.out.println(showValue.isEnabled());
	
	}

	public static void main(String[] args) {
		HandlingCheckBox checkBox=new HandlingCheckBox();
		checkBox.initiatiseBrower();
		checkBox.handlingCheckBox();
		//checkBox.driverCloseAndQuit();
		

	}

}
