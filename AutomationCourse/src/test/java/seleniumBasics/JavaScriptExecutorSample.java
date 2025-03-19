package seleniumBasics;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;

public class JavaScriptExecutorSample extends Base {

	public void javaScriptSample()
	{
		driver.navigate().to("https://selenium.qabible.in/simple-form-demo.php");
		WebElement showMessage=driver.findElement(By.xpath("//button[@id='button-one']"));
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("arguments[0].click();", showMessage);//click fn of java script
		
		js.executeScript("window.scrollBy(0,350)", "");//to scroll dowm , if we give positive value page scroll down
		
		js.executeScript("window.scrollBy(0,-350)", "");// to scroll up, give negative value for scroll up
		
		
	}
	
	public static void main(String[] args) {
		JavaScriptExecutorSample javaScript=new JavaScriptExecutorSample();
		javaScript.initiatiseBrower();
		javaScript.javaScriptSample();
		//javaScript.driverCloseAndQuit();

	}

}
