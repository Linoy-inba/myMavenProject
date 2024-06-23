package hw1tests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

import hw1pages.Checkflight;
import hw1pages.login;

public class BaseTest {
	
	WebDriver driver;
	
	@BeforeClass		
	public void   setup() {		
	driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://shichor.kiwi.com/en/");
	
	}	

	/*@BeforeClass
	public void setupForPages() {
		login L1= new login (driver);
		Checkflight C1= new Checkflight (driver);
		*/
		
	
	
	

}
