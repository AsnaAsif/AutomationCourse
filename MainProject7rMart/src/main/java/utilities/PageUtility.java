package utilities;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class PageUtility {
	public WebDriver driver;
	public void javascriptClick(WebDriver driver,WebElement element)
	{
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("arguments[0].click();",element);
	}
	public void selectDropdownWithValue(WebElement element, String value) {
		Select object = new Select(element);
		object.selectByValue(value);
	}
	public void selectDropdownWithIndex(WebElement element, int index) {
		Select object = new Select(element);
		object.selectByIndex(index);
	}
	public void selectDropdownWithVisibleText(WebElement element, String text) {
		Select object = new Select(element);
		object.selectByVisibleText(text);
	}
	public void rightClickUsingMouseActions(WebElement rightClick)
	{
		Actions actions=new Actions(driver);
		actions.contextClick(rightClick).build().perform();
	}
	public void mouseHoverAction(WebElement mouseHover)
	{
		Actions actions=new Actions(driver);
		actions.moveToElement(mouseHover).build().perform();
	}
	public void keyBoardAction() throws AWTException
	{
		Robot robot=new Robot();
		 
		robot.keyPress(KeyEvent.VK_CONTROL);
		robot.keyPress(KeyEvent.VK_T);
		robot.keyRelease(KeyEvent.VK_CONTROL);
		robot.keyRelease(KeyEvent.VK_T);
	}
	
	public void handlingCheckBox(WebElement checkbox1)
	{	
		checkbox1.click();
	}

	
	
		

}
