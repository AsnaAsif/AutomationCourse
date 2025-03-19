package seleniumBasics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class LoginTest extends TestNGBase{
	@Test(priority=2,description="User login verification with valid credentials")
	public void verifyUserLoginWithValidUsernameAndValidPassword()
	{
		WebElement userName=driver.findElement(By.xpath("//input[@id='user-name']"));
				userName.sendKeys("standard_user");
			WebElement passWord=driver.findElement(By.xpath("//input[@id='password']"));
			passWord.sendKeys("secret_sauce");
			WebElement login=driver.findElement(By.xpath("//input[@id='login-button']"));
			login.click();
				
	}
	@Test(priority=1)
	public void verifyUserLoginWithInValidUsernameAndValidPassword()
	{
		WebElement userName=driver.findElement(By.xpath("//input[@id='user-name']"));
				userName.sendKeys("standar");
			WebElement passWord=driver.findElement(By.xpath("//input[@id='password']"));
			passWord.sendKeys("secret_sauce");
			WebElement login=driver.findElement(By.xpath("//input[@id='login-button']"));
			login.click();
				
	}
	@Test(priority=4)
	public void verifyUserLoginWithValidUsernameAndInValidPassword()
	{
		WebElement userName=driver.findElement(By.xpath("//input[@id='user-name']"));
				userName.sendKeys("standard");
			WebElement passWord=driver.findElement(By.xpath("//input[@id='password']"));
			passWord.sendKeys("secret_sau");
			WebElement login=driver.findElement(By.xpath("//input[@id='login-button']"));
			login.click();
				
	}
	@Test(priority=3)
	public void verifyUserLoginWithInValidUsernameAndInValidPassword()
	{
		WebElement userName=driver.findElement(By.xpath("//input[@id='user-name']"));
				userName.sendKeys("standar");
			WebElement passWord=driver.findElement(By.xpath("//input[@id='password']"));
			passWord.sendKeys("secret_sau");
			WebElement login=driver.findElement(By.xpath("//input[@id='login-button']"));
			login.click();
				
	}
	


}
