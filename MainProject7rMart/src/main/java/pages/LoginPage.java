package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {

	public WebDriver driver;

	public LoginPage(WebDriver driver) {
		this.driver = driver;
		// To inlilize the Element we use iniElements method, it is in pagefactory class
		PageFactory.initElements(driver, this);

	}

	@FindBy(xpath = "//input[@placeholder='Username']")
	private WebElement userNameField;
	
	@FindBy(xpath = "//input[@placeholder='Password']")
	private WebElement passWordField;
	
	@FindBy(xpath = "//label[@for='remember']")
	private WebElement rememberMe; 
	
	@FindBy(xpath = "//button[@type='submit']")
	private WebElement signIn;
	
	@FindBy (xpath="//b[text()='7rmart supermarket']")
	private WebElement title;
	
	@FindBy (xpath="//p[text()='Dashboard']")
	private WebElement dashBoard;

	public LoginPage enterUsernameOnUsernameField(String username) {
		userNameField.sendKeys(username);
		return this;
	}

	public LoginPage enterPasswordOnPassWordField(String password) {
		passWordField.sendKeys(password);
		return this;
	}

	public LoginPage clickOnRememberMe() {
		rememberMe.click();
		return this;
	}

	public HomePage clickOnSignIN() {
		signIn.click();
		return new HomePage(driver);
	}
	
	public boolean isDashBoardDispalyed()
	{
		return dashBoard.isDisplayed();
	}
	
	public boolean isTitleDisplayed() {
		return title.isDisplayed();
	}
}
