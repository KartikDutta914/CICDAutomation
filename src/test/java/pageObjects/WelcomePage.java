package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class WelcomePage extends BasePage {
	
	public WelcomePage(WebDriver driver) {
		super(driver);
			
		}
	
	
	
	@FindBy(xpath="//a[@id='ui-id-8']") 
	public WebElement SaleBtn ;	

	
//	@FindBy(xpath="") 
//	public WebElement ;
//	
//	@FindBy(xpath="") 
//	public WebElement ;
	
	
	
	public void clickSaleBtn() {
		SaleBtn.click();
	}
}
