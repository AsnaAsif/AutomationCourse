package seleniumBasics;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class HandlingFrames extends Base {
	
	public void handlingFrames()
	{
		driver.navigate().to("https://demoqa.com/frames");
	List<WebElement> iframes=driver.findElements(By.tagName("iframe"));
	int framesCount=iframes.size();
	System.out.println(framesCount);
	
	WebElement firstFrame=driver.findElement(By.xpath("//iframe[@id='frame1']"));
	driver.switchTo().frame(firstFrame);
	
	WebElement frameText=driver.findElement(By.id("sampleHeading"));
	System.out.println(frameText.getText());
	driver.switchTo().defaultContent();//switch to main page
	}

	public static void main(String[] args) {
		HandlingFrames frames=new HandlingFrames();
		frames.initiatiseBrower();
		frames.handlingFrames();
		frames.driverCloseAndQuit();
		

	}

}
