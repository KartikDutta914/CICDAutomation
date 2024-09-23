package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class RegistrationPage extends BasePage {
	
	public RegistrationPage(WebDriver driver) {
		super(driver);
		
	}
	
	@FindBy(xpath="//input[@id='firstname']") 
	public WebElement Firstname;

	@FindBy(xpath="//input[@id='lastname']") 
	public WebElement LastName;

	@FindBy(xpath="//input[@id='email_address']") 
	public WebElement Email ;

	@FindBy(xpath="//input[@id='password']") 
	public WebElement Password ;
	
	@FindBy(xpath="//input[@id='password-confirmation']") 
	public WebElement ConfirmPassword ;
	
	@FindBy(xpath="//button[@title='Create an Account']//span[contains(text(),'Create an Account')]") 
	public WebElement CreateAccountBtn ;	
	
	public WebElement getFirstname() {
		return Firstname;
	}

	public void setFirstname(String firstname) {
		Firstname.sendKeys(firstname);
	}

	public WebElement getLastName() {
		return LastName;
	}

	public void setLastName(String lastName) {
		LastName.sendKeys(lastName);
	}

	public WebElement getEmail() {
		return Email;
	}

	public void setEmail(String email) {
		Email.sendKeys(email);
	}

	public WebElement getPassword() {
		return Password;
	}

	public void setPassword(String password) {
		Password.sendKeys(password);
	}

	public WebElement getConfirmPassword() {
		return ConfirmPassword;
	}

	public void setConfirmPassword(String confirmPassword) {
		ConfirmPassword.sendKeys(confirmPassword);
	}

	public WebElement getCreateAccountBtn() {
		return CreateAccountBtn;
	}

	public void setCreateAccountBtn(String createAccountBtn) {
		CreateAccountBtn.sendKeys(createAccountBtn);
	}
	
	public void clickcreateAccountBtn() {
		CreateAccountBtn.click();
	}



}
