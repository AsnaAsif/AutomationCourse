package testscript;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.Test;

import automationcore.Base;
import constants.Messages;
import pages.LoginPage;
import pages.SubCategoryPage;
import utilities.ExcelUtilities;

public class SubCategoryTest extends Base {
	
	/*@Test(priority=1)
	public void verifySubcategoryToUploadNewItem()
	{
		WebElement userName=driver.findElement(By.xpath("//input[@placeholder='Username']"));
		userName.sendKeys("admin");
		
		WebElement passWord=driver.findElement(By.xpath("//input[@placeholder='Password']"));
		passWord.sendKeys("admin");
		
		WebElement rememberMe=driver.findElement(By.xpath("//label[@for='remember']"));
		rememberMe.click();
		
		WebElement signIn=driver.findElement(By.xpath("//button[@type='submit']"));
		signIn.click();
		
		WebElement subCategoryClick=driver.findElement(By.xpath("//a[@href='https://groceryapp.uniqassosiates.com/admin/list-sub-category' and @class=' nav-link']"));
		subCategoryClick.click();
		
		WebElement newClick=driver.findElement(By.xpath("//a[@onclick='click_button(1)']"));
		newClick.click();
		
		WebElement categoryClick=driver.findElement(By.xpath("//select[@id='cat_id']"));
		Select select=new Select(categoryClick);
		select.selectByValue("556");
		
		WebElement subCategoryClick1=driver.findElement(By.xpath("//input[@id='subcategory']"));
		subCategoryClick1.sendKeys("Necklace");
		
		WebElement uploadImage=driver.findElement(By.xpath("//input[@id='main_img']"));
		uploadImage.sendKeys("C:\\Users\\Lenovo\\OneDrive\\Desktop\\necklace.jpeg");
		
		WebElement saveClick=driver.findElement(By.xpath("//button[@class='btn btn-danger']"));
		saveClick.click();}*/
		
	@Test(priority=1,description="Verify user able to add new items in subcategoryusing New Button")
	public void verifyWhetherUserAbleToAddNewItemInSubcategoryUsingNewButton() throws IOException
	{
		String username=ExcelUtilities.readStringData(1, 0,"LoginPage");
		String password=ExcelUtilities.readStringData(1, 1,"LoginPage");
		LoginPage login=new LoginPage(driver);
		login.enterUsernameOnUsernameField(username);
		login.enterPasswordOnPassWordField(password);
		login.clickOnRememberMe();
		login.clickOnSignIN();
		
		String subcategory=ExcelUtilities.readStringData(1, 0,"SubCatregory");
		String uploadImagepath=ExcelUtilities.readStringData(1, 1,"SubCatregory");
		String categoryClick1=ExcelUtilities.readIntegerData(1, 2,"SubCatregory");

		SubCategoryPage subcategory1=new SubCategoryPage(driver);
		subcategory1.clickOnSubCategoryButton();
		subcategory1.ClickonNewClick();
		subcategory1.clickOnCategory(categoryClick1);
		subcategory1.clickONSubCategory(subcategory);
		subcategory1.toUploadImage(uploadImagepath);
		subcategory1.toSave();
		
		boolean isAddAlertDisplayed=subcategory1.isSubCtegoryAddAlertDisplayed();
		Assert.assertTrue(isAddAlertDisplayed, Messages.SUBCATEGORYALERTNEWADD);
		
		
		

	}
	
	@Test(priority=2,description="Verify user able to search items using search button in the subcategory")
	public void verifyWhetherUserAbleToSearchItemsusingSearchButtonInSubcategorytosearchitem() throws IOException
	{
		String username=ExcelUtilities.readStringData(1, 0,"LoginPage");
		String password=ExcelUtilities.readStringData(1, 1,"LoginPage");
		LoginPage login=new LoginPage(driver);
		login.enterUsernameOnUsernameField(username);
		login.enterPasswordOnPassWordField(password);
		login.clickOnRememberMe();
		login.clickOnSignIN();
		
		
		String searchCategory=ExcelUtilities.readStringData(1,3,"SubCatregory");


		SubCategoryPage subcategory1=new SubCategoryPage(driver);
		subcategory1.clickOnSubCategoryButton();
		subcategory1.clickOnSubCategorySearch();
		subcategory1.selectCategory();
		subcategory1.SearchCategory(searchCategory);
		subcategory1.clickOnsearchButton();
		
		boolean isSearchAlertDisplayed=subcategory1.isSubCategorySearchAlertDisplayed();
		Assert.assertTrue(isSearchAlertDisplayed, Messages.SUBCATEGORYALERTTOSEARCH);
	}
	@Test(priority=3,description="verify userable to refresh the subcategory page using reset button")
	public void verifyWhetherUserAbleToRefreshTheSubCategoryPageUsingResetButton() throws IOException
	{
		String username=ExcelUtilities.readStringData(1, 0,"LoginPage");
		String password=ExcelUtilities.readStringData(1, 1,"LoginPage");
		LoginPage login=new LoginPage(driver);
		login.enterUsernameOnUsernameField(username);
		login.enterPasswordOnPassWordField(password);
		login.clickOnRememberMe();
		login.clickOnSignIN();

		SubCategoryPage subcategory1=new SubCategoryPage(driver);
		subcategory1.clickOnSubCategoryButton();
		subcategory1.clickOnResetButton();
		
		boolean IsSubCategoryListDisplayed=subcategory1.isSubCategoryListDisplayed();
		Assert.assertTrue(IsSubCategoryListDisplayed, Messages.SUBCATEGORYALERTTORESET);

		
	
		
		
	}
			
	}


	

