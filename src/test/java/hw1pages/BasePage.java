package hw1pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

public abstract class BasePage {

	WebDriver driver;

	public BasePage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	public void click(WebElement el) {
		el.click();
	}
	
	public void clear1(WebElement el) {
		el.clear();
	}

	public void filltext(WebElement el, String text) {
		el.sendKeys(text);
	}

	public void sleep(long time) {

		try {
			Thread.sleep(time);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}
	public String getusername(WebElement el) {
		
	     String text=el.getText();
		return text;
				
				
	}
	public void clear(WebElement el) {
		el.clear();
	}
	
	

	public void refresh() {
		// TODO Auto-generated method stub
		
	}

}
