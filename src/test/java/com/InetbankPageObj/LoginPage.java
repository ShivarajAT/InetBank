package com.InetbankPageObj;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


//If we use Pagefactory class then only @find by will work or else it throws Null pointer exception
//Setup(Pre-requisites) executes before class

public class LoginPage {
	
	
     WebDriver ldriver;
     public LoginPage(WebDriver rdriver)
     
     //Local driver = remote driver
     {
    	 ldriver = rdriver;
    	 PageFactory.initElements(rdriver, this);
    	 
   }
     @FindBy(name="uid")
     @CacheLookup
      WebElement txtUSername;

     @FindBy(name="password")
     @CacheLookup
     WebElement txtPassword;
     
     @FindBy(name="btnLogin")
     @CacheLookup
     WebElement btnlogin;
     
     
     //Action methods
      public void setusername(String Uname)
      {
    	  txtUSername.sendKeys(Uname);
      }

      public void setpassword(String pwd)
      {
    	  txtPassword.sendKeys(pwd);
      }
      public void clicksubmit()
      
      {
    	 btnlogin.click();
      }
   
      

      
      
      
      
      
      
      
      
}




