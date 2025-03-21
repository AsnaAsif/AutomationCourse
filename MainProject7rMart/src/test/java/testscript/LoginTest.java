package testscript;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import automationcore.Base;
import constants.Messages;
import pages.LoginPage;
import utilities.ExcelUtilities;

public class LoginTest extends Base {
	@Test(priority = 1, description = "User login verification with valid credentials", groups = {
			"smoke" }, retryAnalyzer = retry.Retry.class)
	public void verifyWhetherUserAbleTOILoginWithValidUsernameAndValidPassword() throws IOException {
		String username = ExcelUtilities.readStringData(1, 0, "LoginPage");
		String password = ExcelUtilities.readStringData(1, 1, "LoginPage");
		LoginPage login = new LoginPage(driver);
		login.enterUsernameOnUsernameField(username).enterPasswordOnPassWordField(password).clickOnRememberMe()
				.clickOnSignIN();
		boolean isDashBoardDispalyed = login.isDashBoardDispalyed();
		Assert.assertTrue(isDashBoardDispalyed, Messages.VALIDCREDENTIALERROR);
	}

	@Test(priority = 2, description = "User login verification with invalid user name and valid password", groups = {
			"smoke" })
	public void verifyWhetherUserAbleToLoginWithInValidUsernameAndValidPassword() throws IOException

	{

		String username = ExcelUtilities.readStringData(2, 0, "LoginPage");
		String password = ExcelUtilities.readStringData(2, 1, "LoginPage");
		LoginPage login = new LoginPage(driver);
		login.enterUsernameOnUsernameField(username).enterPasswordOnPassWordField(password).clickOnRememberMe()
				.clickOnSignIN();
		boolean isTitleDisplayed = login.isTitleDisplayed();
		Assert.assertTrue(isTitleDisplayed, Messages.INVALIDUSERNAMEERROR);
	}

	@Test(priority = 3, description = "User login verification with valid username and invalid password")
	public void verifyWhetherUserAbleTOUserLoginWithValidUsernameAndinValidPassword() throws IOException {
		String username = ExcelUtilities.readStringData(3, 0, "LoginPage");
		String password = ExcelUtilities.readStringData(3, 1, "LoginPage");
		LoginPage login = new LoginPage(driver);
		login.enterUsernameOnUsernameField(username).enterPasswordOnPassWordField(password).clickOnRememberMe()
				.clickOnSignIN();
		boolean isTitleDisplayed = login.isTitleDisplayed();
		Assert.assertTrue(isTitleDisplayed, Messages.INVALIDPASSWORDERROR);
	}

	@Test(priority = 4, description = "User login verification with invalid username and invalid password", dataProvider = "loginProvider")
	public void verifyWhetherUserAbleToLoginWithinValidUsernameAndinValidPassword(String username, String password)
			throws IOException {
		// String username=ExcelUtilities.readStringData(2, 0,"LoginPage");
		// String password=ExcelUtilities.readStringData(2, 1,"LoginPage");
		LoginPage login = new LoginPage(driver);
		login.enterUsernameOnUsernameField(username).enterPasswordOnPassWordField(password).clickOnRememberMe()
				.clickOnSignIN();
		boolean isTitleDisplayed = login.isTitleDisplayed();
		Assert.assertTrue(isTitleDisplayed, Messages.INVALIDCREDENTIALSERROR);
	}

	@DataProvider(name = "loginProvider")
	public Object[][] getDataFromDataProvider() throws IOException {
		return new Object[][] { new Object[] { "admi", "admi" }, new Object[] { "admin", "ad" },
				new Object[] { "admi", "admin" }, new Object[] { "adm", "adm" }, };
	}

}
