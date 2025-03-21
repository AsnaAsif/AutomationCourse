package testscript;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.Test;

import automationcore.Base;
import constants.Messages;
import pages.LoginPage;
import pages.HomePage;
import utilities.ExcelUtilities;

public class HomeTest extends Base {


	/*@Test(priority=1)
	public void verifyAdminClick()
	{
		WebElement userName=driver.findElement(By.xpath("//input[@placeholder='Username']"));
		userName.sendKeys("admin");
		
		WebElement passWord=driver.findElement(By.xpath("//input[@placeholder='Password']"));
		passWord.sendKeys("admin");
		
		WebElement rememberMe=driver.findElement(By.xpath("//label[@for='remember']"));
		rememberMe.click();
		
		WebElement signIn=driver.findElement(By.xpath("//button[@type='submit']"));
		signIn.click();
		
		WebElement clickAdmin=driver.findElement(By.xpath("//img[@class='img-circle']"));
		clickAdmin.click();
	
		WebElement clickLogout=driver.findElement(By.xpath("//i[@class='ace-icon fa fa-power-off']"));
		clickLogout.click();
		
	}*/
	@Test(description="Verify whether user able to logout after Login",retryAnalyzer=retry.Retry.class)
	public void verifySuccessfullyUserCanLogoutFromHomePage() throws IOException
	{
		HomePage hometest;
		
		String username=ExcelUtilities.readStringData(1, 0,"LoginPage");
		String password=ExcelUtilities.readStringData(1, 1,"LoginPage");
		LoginPage login=new LoginPage(driver);
		login.enterUsernameOnUsernameField(username).enterPasswordOnPassWordField(password).clickOnRememberMe();
		hometest=login.clickOnSignIN();
		hometest.verifyAdminClick();
		login=hometest.verifyAdminLogout();
		boolean isTitleDisplayed=login.isTitleDisplayed();
		Assert.assertTrue(isTitleDisplayed, Messages.HOMELOGOUTERROR);
		
		
		
		
		
	}
	
}
