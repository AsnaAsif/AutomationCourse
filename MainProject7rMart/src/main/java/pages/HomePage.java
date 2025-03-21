package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage  {
	
	public WebDriver driver;
	public HomePage(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	@FindBy  (xpath="//img[@class='img-circle']") 
	private WebElement clickAdmin;
	
	@FindBy   (xpath="//i[@class='ace-icon fa fa-power-off']")
	private WebElement clickLogout;
	
	@FindBy (xpath="//b[text()='7rmart supermarket']")
	private WebElement title;
	
	@FindBy (xpath="//p[text()='Manage News']")
	private WebElement manageNews;
	
	@FindBy(xpath = "//i[@class='nav-icon fas fa-users']")
	private WebElement adminusers;
	
	public HomePage verifyAdminClick()
	{
		clickAdmin.click();
		return this;
	}
	
	public LoginPage verifyAdminLogout()
	{
		clickLogout.click();
		return new LoginPage(driver);
	}
	
	public boolean isTitleDisplayed()
	{
		return title.isDisplayed();
	}
	
	public ManageNewsPage clickOnManageNews()
	{
		manageNews.click();
		
		return new  ManageNewsPage(driver);
	}
	
	public AdminUserPage clickOnAdminUser() {
		adminusers.click();
		return new AdminUserPage(driver);
			
	}
}
