package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LandingPage extends BasePage {
	
	public LandingPage(WebDriver driver) {
		super(driver);
	}
	
	
	
@FindBy(xpath="//div[@class='panel header']//a[normalize-space()='Create an Account']") 
public WebElement CreateAccountBtn ;

public void clickCreateAccountBtn() {
	CreateAccountBtn.click();
}




}
