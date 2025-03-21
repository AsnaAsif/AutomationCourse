package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import utilities.PageUtility;

public class SubCategoryPage {

	public WebDriver driver;
	public SubCategoryPage(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	
	@FindBy (xpath="//a[@onclick='click_button(1)']")
	private WebElement newClick; 
	
	@FindBy (xpath="//select[@id='cat_id']")
	private WebElement categoryClick;
	
	@FindBy (xpath="//input[@id='subcategory']")
	private WebElement subCategoryClick1;
	
	@FindBy (xpath="//input[@id='main_img']")
	private WebElement uploadImage;
	
	@FindBy (xpath="//button[@class='btn btn-danger']")
	private WebElement saveClick;
	
	@FindBy  (xpath="//a[@class='btn btn-rounded btn-primary']")
	private WebElement SubcategorySearch;
	
	@FindBy (xpath="//select[@id='un']")
	private WebElement category;
	
	@FindBy (xpath="//input[@class='form-control']")
	private WebElement subcategory;
	
	@FindBy (xpath="//button[@class='btn btn-danger btn-fix']")
	private WebElement search;
	
	@FindBy (xpath="//a[@class='btn btn-rounded btn-warning']")
	private WebElement reset;
	
	@FindBy (xpath="//h5[text()=' Alert!']")
	private WebElement alertIsDisplayed;
	
	@FindBy (xpath="//h4[text()='Search List Sub Categories']")
	private WebElement searchListIsDisplayed;
	
	@FindBy (xpath="//h4[text()='List Sub Categories']")
	private WebElement listSubCategoryIsDisplayed;
	 
	
	/*public void  clickOnSubCategoryButton()
	{
		subCategoryClick.click();
	}*/
	
	public SubCategoryPage ClickonNewClick()
	{
		newClick.click();
		return this;
	}
	public SubCategoryPage clickOnCategory(String categoryClick1)
	{
		Select select=new Select(categoryClick);
		select.selectByValue(categoryClick1);
		return this;

	}
	public SubCategoryPage clickONSubCategory(String subcategory)
	{
		subCategoryClick1.sendKeys(subcategory);
		return this;

	}
	public SubCategoryPage toUploadImage(String uploadImagepath)
	{
		uploadImage.sendKeys(uploadImagepath);
		return this;

	}
	//public SubCategoryPage selectImageOfSubCategoryCreationPage() {
	//imageUploadButton.sendKeys(Constants.IMAGEFILE);
	//return this;
//}
	public SubCategoryPage toSave()
	{
		saveClick.click();
		return this;

	}
	
	public SubCategoryPage clickOnSubCategorySearch()
	{
		SubcategorySearch.click();
		return this;

	}
	
	public SubCategoryPage  selectCategory()
	{
		PageUtility page=new PageUtility();
		page.selectDropdownWithIndex(category, 3);
		return this;
	
	}
	
	public SubCategoryPage SearchCategory(String searchCategory)
	{
		subcategory.sendKeys(searchCategory);
		return this;

	}
	
	public SubCategoryPage clickOnsearchButton()
	{
		search.click();
		return this;

	}
	
	public SubCategoryPage clickOnResetButton()
	{
		reset.click();
		return this;

	}
	
	public boolean isSubCtegoryAddAlertDisplayed()
	{
		return alertIsDisplayed.isDisplayed(); 
	}
	
	public boolean isSubCategorySearchAlertDisplayed()
	{
		return searchListIsDisplayed.isDisplayed();
	}
	
	public boolean isSubCategoryListDisplayed()
	{
		return listSubCategoryIsDisplayed.isDisplayed();
	}
}
