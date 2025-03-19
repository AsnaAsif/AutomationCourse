package seleniumBasics;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class FileUpload extends Base{
	
	public void fileUploadUsingSentKeys()
	{
		driver.navigate().to("https://demo.guru99.com/test/upload/");
		WebElement choose=driver.findElement(By.xpath("//input[@id='uploadfile_0']"));
		choose.sendKeys("C:\\Users\\Lenovo\\git\\AutomationCourse\\AutomationCourse\\src\\test\\resources\\Asna Resume.pdf");
		
		WebElement tick=driver.findElement(By.xpath("//input[@id='terms']"));
		tick.click();
		
		WebElement submitButton=driver.findElement(By.xpath("//button[@id='submitbutton']"));
		submitButton.click();
		
	}
	
	public void fileUploadUsingRobot() throws AWTException
	{
		driver.navigate().to("https://www.ilovepdf.com/pdf_to_word");
		WebElement pdfUpload=driver.findElement(By.xpath("//a[@id='pickfiles']"));
		pdfUpload.click();
		
		StringSelection s=new StringSelection("C:\\Users\\Lenovo\\git\\AutomationCourse\\AutomationCourse\\src\\test\\resources\\Asna Resume.pdf");//tp get path tp robort class
		Toolkit.getDefaultToolkit().getSystemClipboard().setContents(s, null);//share the path to clipboard
		
		Robot robot = new Robot(); 
		robot.delay(2500);//to  load the path,need time to we give path
		 robot.keyPress(KeyEvent.VK_ENTER);
	     
	      robot.keyRelease(KeyEvent.VK_ENTER);
	      
	      robot.keyPress(KeyEvent.VK_CONTROL);
	      
	      robot.keyPress(KeyEvent.VK_V);
	      
	      
	      robot.keyRelease(KeyEvent.VK_CONTROL);
	      robot.keyRelease(KeyEvent.VK_V);
	      robot.keyPress(KeyEvent.VK_ENTER);
	      
	     // robot.delay(2500);
	      robot.keyRelease(KeyEvent.VK_ENTER);

		
	}

	public static void main(String[] args) {
	FileUpload file=new FileUpload();
	file.initiatiseBrower();
	//file.fileUploadUsingSentKeys();
	try {
		file.fileUploadUsingRobot();
	} catch (AWTException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	//file.driverCloseAndQuit();

	}

}
