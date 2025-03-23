package testscript;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.Test;

import automationcore.Base;
import constants.Messages;
import pages.HomePage;
import pages.LoginPage;
import pages.ManageNewsPage;
import utilities.ExcelUtilities;

public class ManageNewsTest extends Base {
	@Test(description = "Verify user able to add news in manage news by using manage button")
	public void VerifyWhetherUserCanAbleToAddNewsInMnageNewsByUsingAddNewsButton() throws IOException {
		ManageNewsPage manageNews;
		String username = ExcelUtilities.readStringData(1, 0, "LoginPage");
		String password = ExcelUtilities.readStringData(1, 1, "LoginPage");
		LoginPage login = new LoginPage(driver);
		login.enterUsernameOnUsernameField(username).enterPasswordOnPassWordField(password).clickOnRememberMe();
		HomePage hometest;
		hometest = login.clickOnSignIN();
		String addnews = ExcelUtilities.readStringData(1, 0, "ManageNews");
		manageNews = hometest.clickOnManageNews();
		manageNews.clickOnNewNews().addDetailsOfNews(addnews).saveNews();

		boolean newsAlertisdisplayed = manageNews.newsAlertdispalyed();
		Assert.assertTrue(newsAlertisdisplayed, Messages.MANAGENEWSADDALERT);
	}

	@Test(description = "Verify Whether user able to search news in manage news by using seach button")
	public void VerifyWhetherUserAbleToAddNewsinManageNewsByUsingSearchButton() throws IOException {
		String username = ExcelUtilities.readStringData(1, 0, "LoginPage");
		String password = ExcelUtilities.readStringData(1, 1, "LoginPage");
		LoginPage login = new LoginPage(driver);
		login.enterUsernameOnUsernameField(username).enterPasswordOnPassWordField(password).clickOnRememberMe();
		HomePage hometest;
		hometest = login.clickOnSignIN();
		String news = ExcelUtilities.readStringData(1, 1, "ManageNews");
		ManageNewsPage manageNews;
		manageNews = hometest.clickOnManageNews();
		manageNews.clickOnSearchButton().enterTheTitle(news).clickOnSearch();

		boolean searchnewsdisplayed = manageNews.newssearchdisplay();
		Assert.assertTrue(searchnewsdisplayed, Messages.MANAGENEWSSREACHALERT);

	}

	@Test(description = "Verify whether user able to refresh page of manage News using reset button")
	public void VerifyWhetherUserAbleToRefreshPageOfManageNewsUsingResetBuutton() throws IOException {
		String username = ExcelUtilities.readStringData(1, 0, "LoginPage");
		String password = ExcelUtilities.readStringData(1, 1, "LoginPage");
		LoginPage login = new LoginPage(driver);
		login.enterUsernameOnUsernameField(username).enterPasswordOnPassWordField(password).clickOnRememberMe();
		HomePage hometest;
		hometest = login.clickOnSignIN();

		ManageNewsPage manageNews;
		manageNews = hometest.clickOnManageNews();
		manageNews.refreshThePage();

		boolean newsResetdisplay = manageNews.newsresetdisplay();
		Assert.assertTrue(newsResetdisplay, Messages.MANAGENEWSRESETALERT);
	}
}
