package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class AdminUserPage {
	public WebDriver driver;

	public AdminUserPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//p[text()='Manage Users']")
	private WebElement manageUsers;

	@FindBy(xpath = "//a[@onclick='click_button(1)']")
	private WebElement newAdmin;

	@FindBy(xpath = "//input[@id='username']")
	private WebElement clickUser;

	@FindBy(xpath = "//input[@id='password']")
	private WebElement clickPassword;

	@FindBy(xpath = "//select[@id='user_type']")
	private WebElement addUserType;

	@FindBy(xpath = "//button[@class='btn btn-block-sm btn-danger' and @name='Create']")
	private WebElement save;

	@FindBy(xpath = "//a[@class='btn btn-rounded btn-primary']")
	private WebElement searchclick;

	@FindBy(xpath = "//input[@id='un']")
	private WebElement searchUser;

	@FindBy(xpath = "//select[@id='ut']")
	private WebElement searchuserType;

	@FindBy(xpath = "//button[@value='sr']")
	private WebElement searchClick1;

	@FindBy(xpath = "//a[@class='btn btn-rounded btn-warning']")
	private WebElement resetAdmin;

	@FindBy(xpath = "//h5[text()=' Alert!']")
	private WebElement adminAlertDisplay;

	@FindBy(xpath = "//h4[text()='Search Admin Users']")
	private WebElement searchadminuserdisplay;

	@FindBy(xpath = "//h4[text()='Admin Users']")
	private WebElement adminusersresetdisplay;

	// public void clickOnAdminUser() {
	// adminusers.click();

	// }

	public AdminUserPage clickOnManageUsers() {
		manageUsers.click();
		return this;
	}

	public AdminUserPage clickOnNewAdmin() {
		newAdmin.click();
		return this;
	}

	public AdminUserPage enterTheUserName(String userAdmin) {
		clickUser.sendKeys(userAdmin);
		return this;
	}

	public AdminUserPage enterThePassword(String passwordAdmin) {
		clickPassword.sendKeys(passwordAdmin);
		return this;

	}

	public AdminUserPage selectTheUserType(String userType) {
		Select select = new Select(addUserType);
		select.selectByVisibleText(userType);
		return this;
	}

	public AdminUserPage saveTheAdminUserDetails() {
		save.click();
		return this;
	}

	public AdminUserPage searchAdminUser() {
		searchclick.click();
		return this;
	}

	public AdminUserPage searchUserName(String userAdmin) {
		searchUser.sendKeys(userAdmin);
		return this;
	}

	public AdminUserPage selectUserType() {
		Select select1 = new Select(searchuserType);
		select1.selectByIndex(2);
		return this;
	}

	public AdminUserPage clickonSearchButton() {
		searchClick1.click();
		return this;
	}

	public AdminUserPage clickResearchButton() {
		resetAdmin.click();
		return this;
	}

	public boolean adminAlertdisplayed() {
		return adminAlertDisplay.isDisplayed();
	}

	public boolean adminsearchdisplay() {
		return searchadminuserdisplay.isDisplayed();
	}

	public boolean adminUserRefreshdisplay() {
		return adminusersresetdisplay.isDisplayed();
	}
}