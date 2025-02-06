package seleniumBasics;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Base { //base class created
public WebDriver driver;	//interface...web driver is selenium tool

public void initiatiseBrower() //initialise browser
{
	//driver=new ChromeDriver();//chrome driver class already have in java
	//driver=new FirefoxDriver();// firefox class
	driver=new EdgeDriver();//edge class
	driver.get("https://selenium.qabible.in/");//for url up or open url in chrome
	driver.manage().window().maximize();//to maximise the window
}
	public void driverCloseAndQuit()
	{
		//driver.close();//close current window
		//driver.quit();//close all automated windows
	}



	public static void main(String[] args) {
		Base base=new Base();
		base.initiatiseBrower();
		base.driverCloseAndQuit();

	}

}
