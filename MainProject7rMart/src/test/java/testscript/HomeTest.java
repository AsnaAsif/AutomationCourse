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

	@Test(description = "Verify whether user able to logout after Login", retryAnalyzer = retry.Retry.class)
	public void verifySuccessfullyUserCanLogoutFromHomePage() throws IOException {
		HomePage hometest;

		String username = ExcelUtilities.readStringData(1, 0, "LoginPage");
		String password = ExcelUtilities.readStringData(1, 1, "LoginPage");
		LoginPage login = new LoginPage(driver);
		login.enterUsernameOnUsernameField(username).enterPasswordOnPassWordField(password).clickOnRememberMe();
		hometest = login.clickOnSignIN();
		hometest.verifyAdminClick();
		login = hometest.verifyAdminLogout();
		boolean isTitleDisplayed = login.isTitleDisplayed();
		Assert.assertTrue(isTitleDisplayed, Messages.HOMELOGOUTERROR);

	}

}
