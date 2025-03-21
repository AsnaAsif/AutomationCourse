package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ManageNewsPage {
	public WebDriver driver;
	public ManageNewsPage(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	 
//	@FindBy (xpath="//p[text()='Manage News']")
//	private WebElement manageNews;
	
	@FindBy (xpath="//a[@class='btn btn-rounded btn-danger']")
	private WebElement newNews;
	
	@FindBy (xpath="//textarea[@placeholder='Enter the news']")
	private WebElement enterTheNews;
	
	@FindBy (xpath="//button[@class='btn btn-danger']")
	private WebElement save;
	
	@FindBy (xpath="//i[@class='ace-icon fa fa-sync-alt']")
	private WebElement reset1;
	
	@FindBy (xpath="//a[@class='btn btn-rounded btn-primary']")
	private WebElement searchNews;
	
	@FindBy (xpath="//input[@class='form-control']")
	private WebElement title;
	
	@FindBy (xpath="//button[@class='btn btn-danger btn-fix']")
	private WebElement clickSearch;
	
	@FindBy (xpath="//h5[text()=' Alert!']")
	private WebElement newsAlert;
	
	@FindBy (xpath="//h4[text()='Search Manage News']")
	private WebElement newssearchdisplay;
	
	@FindBy (xpath="//h4[text()='Manage News']")
	private WebElement newsresetdisplay;
	
	//public HomePage clickOnManageNews()
//	{
	//	manageNews.click();
	//	return new  HomePage(driver);
	//}
	
	public ManageNewsPage clickOnNewNews()
	{
		newNews.click();
		return this;
	}
	
	public ManageNewsPage addDetailsOfNews(String addnews)
	{
		enterTheNews.sendKeys(addnews);
		return this;
	}
	
	public ManageNewsPage saveNews()
	{
		save.click();
		return this;
	}
	
	public ManageNewsPage clickOnSearchButton()
	{
		searchNews.click();
		return this;
	}
	
	public ManageNewsPage enterTheTitle(String news)
	{
		title.sendKeys(news);
		return this;
	}
	
	public ManageNewsPage clickOnSearch()
	{
		clickSearch.click();
		return this;
	}
	
	public ManageNewsPage refreshThePage()
	{
		reset1.click();
		return this;
	}
	
	public boolean newsAlertdispalyed()
	{
		return newsAlert.isDisplayed();
	
	}
	
	public boolean newssearchdisplay()
	{
		return newssearchdisplay.isDisplayed();
	}
	
	public boolean newsresetdisplay()
	{
		return newsresetdisplay.isDisplayed();
	}
}
