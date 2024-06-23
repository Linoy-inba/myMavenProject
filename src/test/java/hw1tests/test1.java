package hw1tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import hw1pages.login;
import hw1pages.Checkflight;

public class test1 extends BaseTest{


	
		@Test (description = "login process with user name and password")
		public void tc01_login(){
		
		login L1= new login (driver);
		L1.login("linoyinon@gmail.com","l038191581");
		String loginname= L1.getloginname();
		Assert.assertEquals(loginname, "linoyinon");
		
	
		}
	
		@Test (description = "logout process test")
		public void tc02_logoutandnopassward(){
			
			login L1= new login (driver);
			L1.logout();
			String logoutname= L1.getlogoutname();
			Assert.assertEquals(logoutname, "Sign in");
		}
		@Test (description = "login process with user name and without insert password")
		public void tc03_Forgetinsertpassward(){
		
			login L1= new login (driver);
			String nopassmsg=L1.loginpasswardfail("linoyinon@gmail.com");
			Assert.assertEquals(nopassmsg, "Sorry, we're having some issues. Try reloading the page.");
			L1.insertpass("l038191581");
			
		}

		
	/*	@AfterClass
		public void tearDown() {
			driver.quit();
		}
	*/	
	}

		
		
		
		