package testCases;

import org.testng.Assert;
import org.testng.annotations.Test;
import pageObjects.LandingPage;
import pageObjects.RegistrationPage;
import testBase.BaseClass;
import utilities.DataProviders;



public class TC01_AccountReg extends BaseClass {

	@Test(dataProvider="LoginData", dataProviderClass= DataProviders.class, groups= {"Sanity", "Master"})

	public void verify_account_registration(String fname, String lname, String email, String password) {
		logger.info("****** Starting TC01_AccountReg ********8");
		try {
		LandingPage lp= new LandingPage(driver);
		RegistrationPage rp = new RegistrationPage(driver);
		lp.clickCreateAccountBtn();
		logger.info("Clicked on create Account Button");
		rp.setFirstname(fname);
		logger.info("sent input to firstNme field");
		rp.setLastName(lname);
		logger.info("sent input to Lastname field");
		rp.setEmail(email+ randomNumber()+ "@mailinator.com");
		rp.setPassword(password);
		rp.setConfirmPassword(password);
		rp.clickcreateAccountBtn();
		//Assert.assertEquals(rp.CreateAccountBtn.getText(), "Null");
		}
		catch(Exception e) {
			logger.error("Test Failed");
			logger.debug("Debug logs....");
			Assert.fail();
		}
		logger.info("TC01 finished");
	}
	
}
