package testscript;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.Test;

import automationcore.Base;
import constants.Messages;
import pages.AdminUserPage;
import pages.HomePage;
import pages.LoginPage;
import utilities.ExcelUtilities;
import utilities.FakerUtility;

public class AdminUsersTest extends Base {
	@Test(description = "Verify user able add new user in user list using add button in the admin user page")
	public void verifywhetherUserAbleToAddNewUserToTheUserListByUsingAddButtonInAdminPage() throws IOException {
		String username = ExcelUtilities.readStringData(1, 0, "LoginPage");
		String password = ExcelUtilities.readStringData(1, 1, "LoginPage");
		LoginPage login = new LoginPage(driver);
		login.enterUsernameOnUsernameField(username).enterPasswordOnPassWordField(password).clickOnRememberMe();
		HomePage hometest;
		hometest = login.clickOnSignIN();
		FakerUtility faker = new FakerUtility();
		String userAdmin = faker.createRandomNmae();
		String passwordAdmin = faker.createRandomPassword();
		// String userAdmin = ExcelUtilities.readStringData(1, 0, "AdminUser");
		// String passwordAdmin = ExcelUtilities.readStringData(1, 1, "AdminUser");
		String addUserType = ExcelUtilities.readStringData(1, 2, "AdminUser");

		// AdminUserPage admin = new AdminUserPage(driver);
		AdminUserPage admin;
		admin = hometest.clickOnAdminUser();
		admin.clickOnManageUsers().clickOnNewAdmin().enterTheUserName(userAdmin).enterThePassword(passwordAdmin)
				.selectTheUserType(addUserType).saveTheAdminUserDetails();

		boolean adminAlertdisplay = admin.adminAlertdisplayed();
		Assert.assertTrue(adminAlertdisplay, Messages.ADMINADDALERT);

	}

	@Test(description = "verify user able to search Admin user deatils using search button in admin user page")
	public void VerifyWhetherUserAbleToSearchAdminUserListUsingsearchButtonInTheAdminUserPage() throws IOException {
		String username = ExcelUtilities.readStringData(1, 0, "LoginPage");
		String password = ExcelUtilities.readStringData(1, 1, "LoginPage");
		LoginPage login = new LoginPage(driver);
		login.enterUsernameOnUsernameField(username).enterPasswordOnPassWordField(password).clickOnRememberMe();
		HomePage hometest;
		hometest = login.clickOnSignIN();

		String userAdmin = ExcelUtilities.readStringData(1, 0, "AdminUser");

		// AdminUserPage admin = new AdminUserPage(driver);
		AdminUserPage admin;
		admin = hometest.clickOnAdminUser();
		admin.clickOnManageUsers().searchAdminUser().searchUserName(userAdmin).selectUserType().clickonSearchButton();

		boolean adminsearchdisplay = admin.adminsearchdisplay();
		Assert.assertTrue(adminsearchdisplay, Messages.ADMINSREACHALERT);

	}

	@Test(description = "Verify user able to refresh the adminuser page using reset button")
	public void verifyWhetherUserAbleToRefreshTheAdminUserListUsingResetButton() throws IOException {
		String username = ExcelUtilities.readStringData(1, 0, "LoginPage");
		String password = ExcelUtilities.readStringData(1, 1, "LoginPage");
		LoginPage login = new LoginPage(driver);
		login.enterUsernameOnUsernameField(username).enterPasswordOnPassWordField(password).clickOnRememberMe();
		HomePage hometest;
		hometest = login.clickOnSignIN();

		// AdminUserPage admin = new AdminUserPage(driver);
		AdminUserPage admin;
		admin = hometest.clickOnAdminUser();
		admin.clickOnManageUsers().clickResearchButton();
		boolean adminUserRefrshDisplay = admin.adminUserRefreshdisplay();
		Assert.assertTrue(adminUserRefrshDisplay, Messages.ADMINRESETALERT);
	}

}
