package seleniumBasics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class Locators extends Base {
	public void locators()
	{
		driver.navigate().to("https://selenium.qabible.in/simple-form-demo.php");
		
		WebElement messageFieldOne=driver.findElement(By.className("btn btn-primary"));//to locate class
		
		WebElement messageField=driver.findElement(By.id("button-one")); //Webelement is interface,null use  string value,to locate id
		
		WebElement showMessage=driver.findElement(By.tagName("button"));//to locate tag
		
		WebElement nameMessage=driver.findElement(By.name("description"));// to locate name
		
		WebElement linkLocate=driver.findElement(By.linkText("Checkbox Demo"));//to Locate link
		
		WebElement linkLocatePartial=driver.findElement(By.partialLinkText("Checkbox"));//using partial linkname
		
		WebElement cssLocator=driver.findElement(By.cssSelector("button[id='button-one']"));//css selector to design page (Colour,size),we can locate only top to buttom,format :tagname[attribute=’value’]
		
		
		
		//  /html/body/section/div/div/div[2]/div[1]/div/div[2]/button//  absolute xpath(its shows 1st path to last)
		
		
		//xpath  also design page, we locate buttom to top and top to buttom,format:  //tagname[@attribute=’value’]
		
		WebElement button=driver.findElement(By.xpath("//button[@id='button-one']"));
		
		WebElement buttonClass=driver.findElement(By.xpath("//input[@class='form-control']"));
		
		//for lengthly artibute value
		
		WebElement lengthly=driver.findElement(By.xpath("//input[contains(@id,'-a')]")); //syntax:  //tagname[contains(@attribute,'partial value')]
		
		//locate using text
		WebElement text=driver.findElement(By.xpath("//button[text()='Show Message']")); //sytax: //tagname[text()='text value']
		
		//for long length sytax: //tagname[starts-with(text(),'partial value of text']
		WebElement textLength=driver.findElement(By.xpath("//button[starts-with(text(),'Show')]"));
				 
		
		WebElement button1=driver.findElement(By.xpath("//button[@type='button'and @id='button-one']")); //and
		
		WebElement button2=driver.findElement(By.xpath("//button[@id='button-one' or @id='button-one-electronics']")); //or
		
		WebElement button3=driver.findElement(By.xpath("//div[contains(text(),'Single Input Field')]//parent::div[@class='card']"));//  //tagname[@attribute=’value’]//axesMethodName::tagname
		
		WebElement button4=driver.findElement(By.xpath("//div['class=\"card']//child::input[@id='single-input-field']")); //child use find cheyan
		 
		WebElement button5=driver.findElement(By.xpath("//div[@class='card-header']//preceding::div[@class='card-body']"));
	}
	public static void main(String[] args) {
		Locators locator=new Locators();
		locator.initiatiseBrower();
		locator.locators();
		locator.driverCloseAndQuit();
	
		

	}

}
