package hw1pages;

import java.util.List;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.chrome.ChromeDriver;





public class Deals extends BasePage{
	
	
@FindBy(css = "[autocomplete=\"username\"]")
private WebElement userNameField;
@FindBy(css = "#cookies_accept")
private WebElement AcceptBtn;
@FindBy(css = "[data-test=\"CookiesPopup-Accept\"]")
private WebElement AcceptDealsBtn;
@FindBy(css = "[type=\"password\"]")
private WebElement passwordField;
@FindBy(css = "[data-test=\"TopNav-SingInButton\"]")
private WebElement loginBtn;
@FindBy(css = "[data-test=\"MagicLogin-LoginViaEmail\"]")
private WebElement EmailBtn;
@FindBy(css = "[data-test=\"MagicLogin-Continue\"]")	
private WebElement countinueBtn;
@FindBy(css = "[type=\"submit\"]")
private WebElement signinbtn;	
@FindBy(css = "#react-view > div.flex.min-h-screen.flex-col > div.\\[\\&\\>nav\\]\\:relative.sticky.top-0.z-\\[700\\].pointer-events-none.\\[\\&\\>\\*\\]\\:pointer-events-auto > nav > div > div > div.items-center.content-center.flex-nowrap.grow.shrink-0.justify-start.flex-row.inline-flex.gap-md.safari\\:\\[\\&\\>\\*\\:not\\(\\:last-child\\)\\]\\:space-x-md.lm\\:flex-row.lm\\:flex.lm\\:gap-lg.lm\\:safari\\:\\[\\&\\>\\*\\:not\\(\\:last-child\\)\\]\\:space-x-lg > div.inline-block.max-mm\\:hidden.mm\\:max-lm\\:hidden.lm\\:max-tb\\:hidden.tb\\:max-de\\:hidden > div > span:nth-child(12) > a\r\n")
private WebElement Dealbtn;	
@FindBy(css = "#DealsMainView>div>div:nth-child(2)>div>h1")
private WebElement Dealtitle; 
@FindBy(css = "[data-test=\"PictureCard\"]")
private List <WebElement> placeslist;
@FindBy(css = ".DealsCommonCardstyled__WhiteBoxText-sc-1pg83jg-7.ehhAmJ")
private List <WebElement> pricelist;
@FindBy(css = "[data-test=\"PlacePickerInput-origin-4\"]")
private WebElement placesfrom;
@FindBy(css = "[data-test=\"PlacePickerRow-wrapper\"]")
private List <WebElement> placesfromlist;
@FindBy(css = "[data-test=\"SearchFormFilters-button-date\"]")
private WebElement pickadate;
@FindBy(css = ".DealsDatesContentFilterstyled__StyledFilterButton-sc-1542zt5-0.dAwanJ")
private List <WebElement> Dateslist;
@FindBy(css = "[data-test=\"saveButton\"]")
private WebElement savebtn;
@FindBy(css = "[data-test=\"SearchFormFilters-button-price\"]")
private WebElement pricebtn;
@FindBy(css = "[data-test=\"SliderHandle-0\"]")
private WebElement pricestartdbtn;
@FindBy(css = ".orbit-box.font-base.box-border.mb-lg>div>p")
private WebElement pricesvalue;
@FindBy(css = "[data-test=\"saveButton\"]")
private WebElement savepricebtn;
@FindBy(css = "[data-test=\"SearchFormFilters-button-mode\"]>div>svg")
private WebElement returnfirstchoise;
@FindBy(css = ".DealsModesFilterContentstyled__RadioWrapper-sc-11pz9ub-0.lpgnrk")
private List <WebElement> dirctionlist;

@FindBy(css = "[data-test=\"saveButton\"]")
private WebElement savedirectbtn;
@FindBy(css = "[data-test=\"SearchFormFilters-button-mode\"]")
private WebElement dirctionbtn;
@FindBy(css = "[data-test=\"SearchFormFilters-button-mode\"]")
private WebElement dirctionvaluebtn;
@FindBy(css = "[data-test=\"SearchFieldItem-origin-4\"] [data-test=\"PlacePickerInputPlace\"]")
private WebElement dirctionvaluefrom1;
@FindBy(css = "[data-test=\"SearchFieldItem-origin\"] [data-test=\"PlacePickerInputPlace\"]")
private WebElement dirctionvaluefrom2;
@FindBy(css = "[data-test=\"DateValue\"]")
private WebElement dirctionvaluedatemou;
@FindBy(css = ".Inputsstyled__Content-sc-1kyvy53-2.bTwNqW")
private WebElement dirctionvaluedatelengh;
@FindBy(css = "[name=\"search-outboundDate\"]")
private WebElement dirctionvaluedatebtn;












public Deals(WebDriver driver) {
	super(driver);
	// TODO Auto-generated constructor stub
}



public void login(String username, String passward) {
	
	
	click(AcceptBtn);
	click(loginBtn);
	click(EmailBtn);
	filltext(userNameField, username);
	click(countinueBtn);
	sleep (4000);
	click(passwordField);
	filltext(passwordField, passward);
	click(signinbtn);
	sleep (4000);
				
}




public WebElement Dealslogin() {
	
	
	 click(Dealbtn);
	 click(AcceptDealsBtn);
	 WebElement title=Dealtitle;
	 return title;
}


public String getname(WebElement name3) {	
	
	sleep(3000);
	String name1=getusername(name3);
	System.out.println(name1);
	return name1;
}

public WebElement Exploredealsplacefrom(String placefrom) {
	
	 click(placesfrom);
	 sleep(2000);
	 System.out.println(placesfromlist.size());
		for (WebElement el : placesfromlist) {			
			String name=el.getText();
			if(el.getText().equalsIgnoreCase(placefrom)) {
				el.click();
				break;
			}
		}
		
	return dirctionvaluefrom1;	
	 	
}

public WebElement Exploredealsplacefrom2() {
	
	sleep(5000);
	return dirctionvaluefrom2;	
	
}



public void Exploredealsdate(String mounth ,String lengh, String direction ) {

	 click(pickadate);
	 sleep(2000);
	 System.out.println(Dateslist.size());
		for (WebElement el : Dateslist) {
			String name=el.getText();
			if(direction=="Return") {
				if(el.getText().equalsIgnoreCase(mounth)) {
					el.click();
				}	
				if(el.getText().equalsIgnoreCase(lengh)) {
					el.click();
				}
			
			}
			else {
				if(el.getText().equalsIgnoreCase(mounth)) {
					el.click();
				}
			}
			
		}	
	 
	// 
	click(savebtn);	
	 sleep(5000); 
	// click(dirctionvaluedatebtn);
	// return dirctionvaluedatemou;
			
}


public WebElement Exploredealsdate2() {
	
	return dirctionvaluedatelengh;
	
}

public WebElement Exploredealsprice() {

	
	 click(pricebtn);
	 sleep(2000);
	 

	 WebElement slider = driver.findElement(By.cssSelector("[data-test=\"PriceFilterSlider\"] [data-test=\"SliderHandle-0\"]"));
	 WebElement slider2 = driver.findElement(By.cssSelector("[data-test=\"PriceFilterSlider\"]  [data-test=\"SliderHandle-1\"]"));
	 Actions mouse= new Actions (driver);
	 mouse.clickAndHold(slider).moveByOffset(50, 0).release().build().perform();
	 sleep(3000); 
	 mouse.clickAndHold(slider2).moveByOffset(-50, 0).release().build().perform();
	 sleep(3000);
	 
	 
	 WebElement pricevalue=pricesvalue;
	 //click(savepricebtn);
	 return pricevalue;
	 
	 
}

public void saveprice() {
	
	click(savepricebtn);
}



public WebElement Exploredealsreturnoneway(String direction) {

	 //click(savepricebtn);
	 sleep(2000);
	 click(dirctionbtn);
	 System.out.println(dirctionlist.size());
		for (WebElement el : dirctionlist) {
			String name=el.getText();
			if(el.getText().equalsIgnoreCase(direction)) {
				el.click();
			}
	 }
	sleep(3000);
	click(savedirectbtn);
	sleep(5000);
	return dirctionvaluebtn;
	
		 
} 




public boolean finddetails(int price1, int price2 ) {
	
	
	String str3;
	int price;
	boolean f1=false;
/*	System.out.println(placeslist.size());
	for (WebElement el : placeslist) {			
		String name=el.getText();
		System.out.println(name);
		
		}
		*/
	
	System.out.println(pricelist.size());
	for (WebElement el : pricelist) {
		StringBuilder str1 = new StringBuilder();
		String name=el.getText();
		System.out.println(name);
		for (int i = 0; i < name.length(); i++) {
		    char ch = name.charAt(i);
		   // System.out.println(ch);
		    if(ch>='0'&&ch<='9') {
		    	 str1.append(ch);
		    }
		    
	
		
	}
		System.out.println(str1);
		str3 = str1.toString();
		price=Integer.parseInt(str3);
		if (price>=price1&&price<=price2) {
			f1= true;
		}
		else
			f1= false;
		
		
  }
	sleep(3000);
	return f1;

}    



			
	
	

}
