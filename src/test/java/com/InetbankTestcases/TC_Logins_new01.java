//package com.InetbankTestcases;
package com.InetbankTestcases; // This is the package declaration

//import org.apache.log4j.Logger;
import org.testng.Assert;
//import org.testng.Reporter;
import org.testng.annotations.Test;

import com.InetbankPageObj.LoginPage;

//import com.InetbankPageObj.LoginPage;

//Whenever added new testcases extends base class
public class TC_Logins_new01 extends BaseClass {
	//static Logger logger = Logger.getLogger(TC_Logins_001.class);
	
	@Test
	public void loginTest()

	{
		driver.manage().window().maximize();
		driver.get(baseURL);
		logger.info("URL is opened");	
		
		LoginPage lp = new LoginPage(driver);

		lp.setusername(username);
		//logger.info("Enter UN");
		lp.setpassword(password);
		logger.info("Enter PW");
		lp.clicksubmit();
	
		System.out.println(driver.getTitle()); 	
		if (driver.getTitle().equals("Guru99 Bank Manager HomePage")) 
		{
			Assert.assertTrue(true);
			logger.info("Login Test passed");
			
		}

		else {
			Assert.assertTrue(false);
			logger.info("Login Test failed");
		}

	}
}
