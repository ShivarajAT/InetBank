package com.InetbankTestcases;


import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;

import com.InetbankUtilities.ReadConfig;


public class BaseClass {
	ReadConfig readconfig = new ReadConfig();
	
	
	public String baseURL = readconfig.getApplicationURL();
	public String username = readconfig.getUsername();
	public String password = readconfig.getPassword();
	public static WebDriver driver;	
	public static Logger logger;
	
	
	//This is set up method(at first)
	@Parameters("browser")
	@BeforeClass
	//public void setup(@Optional("defaultBrowser") String br)
	public void setup(String br)
	{	
		logger =Logger.getLogger("InetBanking");
		PropertyConfigurator.configure("log4j.properties");
		
		
		if(br.equals("chrome"))
		{
		System.setProperty("webdriver.chrome.driver", readconfig.getChromepath());
		driver = new ChromeDriver();
		
		}else if(br.equals("firefox"))
		{
			System.setProperty("webdriver.gecko.driver", readconfig.getFirfoxpath());
			driver = new FirefoxDriver();
			
		}
			
		else if(br.equals("ie"))
		{
			System.setProperty("webdriver.ie.driver", readconfig.getIEpath());
			driver = new InternetExplorerDriver();
			
		}
		driver.get(baseURL);
		
	}
	//This is teardown method(at last)
	
	@AfterClass
	public void teardown()
	{
		driver.quit();
		
	}
	
	
	
	
}
