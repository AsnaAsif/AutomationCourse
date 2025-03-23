package testscript;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.Test;

import automationcore.Base;
import constants.Messages;
import pages.HomePage;
import pages.LoginPage;
import pages.SubCategoryPage;
import utilities.ExcelUtilities;

public class SubCategoryTest extends Base {

	@Test(priority = 1, description = "Verify user able to add new items in subcategoryusing New Button")
	public void verifyWhetherUserAbleToAddNewItemInSubcategoryUsingNewButton() throws IOException {
		String username = ExcelUtilities.readStringData(1, 0, "LoginPage");
		String password = ExcelUtilities.readStringData(1, 1, "LoginPage");
		LoginPage login = new LoginPage(driver);
		login.enterUsernameOnUsernameField(username).enterPasswordOnPassWordField(password).clickOnRememberMe();
		HomePage hometest;
		hometest = login.clickOnSignIN();

		String subcategory = ExcelUtilities.readStringData(1, 0, "SubCatregory");
		String categoryClick1 = ExcelUtilities.readIntegerData(1, 2, "SubCatregory");

		SubCategoryPage subcategory1;
		subcategory1 = hometest.clickOnSubCategoryButton();

		subcategory1.ClickonNewClick().clickOnCategory(categoryClick1).clickONSubCategory(subcategory).toUploadImage()
				.toSave();

		boolean isAddAlertDisplayed = subcategory1.isSubCtegoryAddAlertDisplayed();
		Assert.assertTrue(isAddAlertDisplayed, Messages.SUBCATEGORYALERTNEWADD);

	}

	@Test(priority = 2, description = "Verify user able to search items using search button in the subcategory")
	public void verifyWhetherUserAbleToSearchItemsusingSearchButtonInSubcategorytosearchitem() throws IOException {
		String username = ExcelUtilities.readStringData(1, 0, "LoginPage");
		String password = ExcelUtilities.readStringData(1, 1, "LoginPage");
		LoginPage login = new LoginPage(driver);
		login.enterUsernameOnUsernameField(username).enterPasswordOnPassWordField(password).clickOnRememberMe();
		HomePage hometest;
		hometest = login.clickOnSignIN();

		String searchCategory = ExcelUtilities.readStringData(1, 3, "SubCatregory");

		SubCategoryPage subcategory1;
		subcategory1 = hometest.clickOnSubCategoryButton();
		subcategory1.clickOnSubCategorySearch().selectCategory().SearchCategory(searchCategory).clickOnsearchButton();

		boolean isSearchAlertDisplayed = subcategory1.isSubCategorySearchAlertDisplayed();
		Assert.assertTrue(isSearchAlertDisplayed, Messages.SUBCATEGORYALERTTOSEARCH);
	}

	@Test(priority = 3, description = "verify userable to refresh the subcategory page using reset button")
	public void verifyWhetherUserAbleToRefreshTheSubCategoryPageUsingResetButton() throws IOException {
		String username = ExcelUtilities.readStringData(1, 0, "LoginPage");
		String password = ExcelUtilities.readStringData(1, 1, "LoginPage");
		LoginPage login = new LoginPage(driver);
		login.enterUsernameOnUsernameField(username).enterPasswordOnPassWordField(password).clickOnRememberMe();
		HomePage hometest;
		hometest = login.clickOnSignIN();

		SubCategoryPage subcategory1;
		subcategory1 = hometest.clickOnSubCategoryButton();
		subcategory1.clickOnResetButton();

		boolean IsSubCategoryListDisplayed = subcategory1.isSubCategoryListDisplayed();
		Assert.assertTrue(IsSubCategoryListDisplayed, Messages.SUBCATEGORYALERTTORESET);

	}

}
