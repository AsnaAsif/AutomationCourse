package seleniumBasics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class DropDown extends Base {
	public void HandlingDropDown()
	{
	driver.navigate().to("https://www.webdriveruniversity.com/Dropdown-Checkboxes-RadioButtons/index.html");
	WebElement dropDown1=driver.findElement(By.xpath("//select[@id='dropdowm-menu-1']"));
	
	Select select=new Select(dropDown1); //selet class for select elements ftom drop down
	select.selectByIndex(2);
	
	WebElement dropDown2=driver.findElement(By.xpath("//select[@id='dropdowm-menu-2']"));
	Select select1=new Select(dropDown2);
	select1.selectByVisibleText("TestNG");
	
	WebElement dropDown3=driver.findElement(By.xpath("//select[@id='dropdowm-menu-3']"));
	Select select2=new Select(dropDown3);
	select2.selectByValue("css");
	}

	public static void main(String[] args) {
		DropDown drop=new DropDown();
		drop.initiatiseBrower();
		drop.HandlingDropDown();
		//drop.driverCloseAndQuit();
				

	}

}
