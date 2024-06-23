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

public class Checkflight extends BasePage{
	

	@FindBy(css = "[autocomplete=\"username\"]")
	private WebElement userNameField;
	@FindBy(css = "[type=\"password\"]")
	private WebElement passwordField;
	@FindBy(css = "[data-test=\"TopNav-SingInButton\"]")
	private WebElement loginBtn;
	@FindBy(css = "[data-test=\"MagicLogin-LoginViaEmail\"]")
	private WebElement EmailBtn;
	@FindBy(css = "[data-test=\"MagicLogin-Continue\"]")	
	private WebElement countinueBtn;
	@FindBy(css = "#cookies_accept")
	private WebElement AcceptBtn;
	@FindBy(css = "[type=\"submit\"]")
	private WebElement signinbtn;		
	@FindBy(css = "#react-view > div > div.TopContainerstyled__StickyContainer-sc-gf454z-0.fCllSu > div > nav > div > div > div.items-center.content-center.flex-nowrap.grow.shrink-0.justify-start.flex-row.inline-flex.gap-md.safari\\:\\[\\&\\>\\*\\:not\\(\\:last-child\\)\\]\\:space-x-md.lm\\:flex-row.lm\\:flex.lm\\:gap-lg.lm\\:safari\\:\\[\\&\\>\\*\\:not\\(\\:last-child\\)\\]\\:space-x-lg > div.inline-block.max-mm\\:hidden.mm\\:max-lm\\:hidden.lm\\:max-tb\\:hidden.tb\\:max-de\\:hidden > div > span:nth-child(2) > a > div")
	private WebElement travelbtn;
	@FindBy(css = "[data-test=\"PlacePickerInput-origin\"]")
	private WebElement choosefrombtn;	
	@FindBy(css = "#react-view > div.flex.min-h-screen.flex-col > div:nth-child(3) > div.relative.bg-ink-normal.pt-\\[58px\\].min-h-\\[435px\\].lm\\:min-h-\\[391px\\].lm\\:pt-xxl.tb\\:pb-\\[36px\\].tb\\:pt-\\[58px\\].de\\:pt-\\[90px\\].ld\\:pt-\\[60px\\] > div.relative > div:nth-child(2) > div.relative.z-10.-mt-xl.mb-xl.rounded-large.bg-white-normal.px-sm.pb-sm.pt-md.shadow-raised.translate-y-sm.min-h-\\[326px\\].lm\\:min-h-\\[252px\\].lm\\:translate-y-xl.lm\\:p-md.tb\\:mb-0.tb\\:mt-0.tb\\:min-h-\\[264px\\].tb\\:transform-none.de\\:rounded-largest.de\\:p-lg.de\\:pt-sm.de\\:min-h-\\[268px\\].ld\\:min-h-\\[160px\\].ld\\:pb-md > div.flex.flex-col.gap-xs.ld\\:flex-row > div > div:nth-child(1) > div > div > div > div > div.my-0.me-xxs.ms-sm.cursor-pointer.leading-form-box-normal.text-secondary-foreground")
	private WebElement choosefrombtn2;
	@FindBy(css = ".flex-1.overflow-hidden.text-ellipsis.whitespace-nowrap.font-medium")
	private List <WebElement> LocationList;
	@FindBy(css = "#react-view > div > div:nth-child(2) > div.relative.bg-ink-normal.pt-\\[58px\\].min-h-\\[429px\\].lm\\:min-h-\\[351px\\].lm\\:pt-xxl.tb\\:min-h-\\[388px\\].tb\\:\\!pb-\\[36px\\].tb\\:pt-\\[58px\\].de\\:pb-\\[120px\\].de\\:pt-\\[90px\\].ld\\:min-h-\\[248px\\].ld\\:pt-\\[60px\\] > div.relative > div:nth-child(2) > div.relative.z-10.-mt-xl.mb-xl.rounded-large.bg-white-normal.px-sm.pb-sm.pt-md.shadow-raised.min-h-\\[350px\\].translate-y-xl.lm\\:min-h-\\[220px\\].lm\\:translate-y-xl.lm\\:p-md.tb\\:mb-0.tb\\:mt-0.tb\\:min-h-\\[220px\\].tb\\:transform-none.de\\:min-h-\\[228px\\].de\\:rounded-largest.de\\:p-lg.de\\:pt-sm.ld\\:min-h-\\[132px\\].ld\\:pb-md > div.flex.flex-col.gap-xs.ld\\:flex-row > div > div:nth-child(1) > div > div > div.absolute.z-\\[101\\].rounded-normal.bg-white-normal.shadow-raised.w-auto.-left-sm.-right-sm.-top-sm.ld\\:w-\\[374px\\] > div > div > div > div:nth-child(6) > div > div > div > div.max-w-\\[calc\\(100\\%-40px\\)\\].flex-1.not-last\\:\\[\\&\\>\\*\\]\\:mb-xxxs > div")
	private WebElement destenationlocation;
	@FindBy(css = "[data-test=\"PlacePickerInputPlace\"]")
	private WebElement Locationname;
	@FindBy(css = ".flex-1.overflow-hidden.text-ellipsis.whitespace-nowrap.font-medium")
	private List <WebElement> CityList;
	@FindBy(css = "[data-test=\"PlacePickerInput-destination\"]")
	private WebElement choosetobtn;
	@FindBy(css = "[data-test=\"PlacePickerInput-destination\"]>div")
	private WebElement Locationtoname;
	@FindBy(css = "[name=\"search-outboundDate\"]")
	private WebElement TimeFrom;
	@FindBy(css = "[data-test=\"SearchDateInput\"]>div>div:nth-child(1)")
	private WebElement TimeFrom2;	
	@FindBy(css = "[data-test=\"DatepickerMonthButton\"]>div")
	private WebElement ChooseMouFrom;
	@FindBy(css = "#react-view > div.flex.min-h-screen.flex-col > div:nth-child(2) > div.relative.bg-ink-normal.pt-\\[58px\\].min-h-\\[429px\\].lm\\:min-h-\\[351px\\].lm\\:pt-xxl.tb\\:min-h-\\[388px\\].tb\\:\\!pb-\\[36px\\].tb\\:pt-\\[58px\\].de\\:pb-\\[120px\\].de\\:pt-\\[90px\\].ld\\:min-h-\\[248px\\].ld\\:pt-\\[60px\\] > div.relative > div:nth-child(2) > div.relative.z-10.-mt-xl.mb-xl.rounded-large.bg-white-normal.px-sm.pb-sm.pt-md.shadow-raised.min-h-\\[350px\\].translate-y-xl.lm\\:min-h-\\[220px\\].lm\\:translate-y-xl.lm\\:p-md.tb\\:mb-0.tb\\:mt-0.tb\\:min-h-\\[220px\\].tb\\:transform-none.de\\:min-h-\\[228px\\].de\\:rounded-largest.de\\:p-lg.de\\:pt-sm.ld\\:min-h-\\[132px\\].ld\\:pb-md > div.flex.flex-col.gap-xs.ld\\:flex-row > div > div:nth-child(3) > div > div:nth-child(2) > div > div > div.h-full.min-w-\\[350px\\].tb\\:relative.tb\\:px-md.tb\\:py-0 > div.flex.h-full.select-none.justify-between > div:nth-child(2) > div > div.mb-sm.mt-xxs.flex.flex-1.items-center.justify-center > button > div")
	private WebElement ChooseMouret;
	@FindBy(css = "[data-test=\"CalendarMoveNextButton\"]")
	private WebElement Nextmou;
	@FindBy(css = "[data-test=\"DayDateTypography\"]")
	private List <WebElement> DaydepList;
	@FindBy(css = "[data-test=\"DatePickerInput\"]")	
	WebElement Depvalue;	
	@FindBy(css = "[data-test=\"DateValue\"]")
	private WebElement Depvalueoneway;
	
	@FindBy(css = "[data-test=\"SearchFormDoneButton\"]")
	private WebElement Setdatebutt;
	@FindBy(css = "[data-test=\"SearchFormModesPicker-active-return\"]")
	private WebElement onewaybutton;
	@FindBy(css = ".ms-xs.flex.flex-1.flex-col.font-medium.opacity-100")
	private List <WebElement> Retuoroneway;
	@FindBy(css = "[data-test=\"PlacePickerInput-origin\"]>div>div>svg")
	private WebElement Xtobtn;
	@FindBy(css = "[data-test=\"PlacePickerInput-destination\"]>div>div>svg")
	private WebElement Xfrombtn;
	@FindBy(css = "[data-test=\"TopNav-SideNav\"]>aside>div>div>button>div>svg")
	private WebElement Xsinginbtn;
	@FindBy(css = "[data-test=\"ResetTooltip\"]")
	private WebElement Xdate;	
	@FindBy(css = ".grow.select-none.whitespace-nowrap.text-form-element-filled-foreground:nth-child(1)")
	private WebElement Retvalue;		
	@FindBy(css = "[data-test=\"CabinClassField-active-economy\"]")
	private WebElement Economybtn;
	@FindBy(css = "[data-test=\"CabinClassField-active-business\"]")
	private WebElement businessname;
	@FindBy(css = "data-test=\"CabinClassField-active-premium\"")
	private WebElement premiumname;
	@FindBy(css = "[data-test=\"CabinClassField-active-first\"]")
	private WebElement firstclassname;	
	@FindBy(css = ".ms-xs.flex.flex-1.flex-col.font-medium.opacity-100")
	private List <WebElement> Economylist;	
	@FindBy(css = "[data-test=\"PassengersButton\"]")
	private WebElement Passbtn; 
	@FindBy(css = "[data-test=\"CabinClassFooter-done\"]")
	private WebElement DoneEconomybtn;			
	@FindBy(css = ".flex.safe-space-x-xs")
	private List <WebElement> passandbagslist; 
	@FindBy(css = "[data-test=\"PassengersAndBagsFieldFooter-done\"]")
	private WebElement Donepassebtn; 
	@FindBy(css = ".flex.w-full.flex-auto>button:nth-child(3)")
	private WebElement increasebtn; 
	@FindBy(css = "[fdprocessedid=\"7epbuq\"]")
	private WebElement increasebtnchild;
	@FindBy(css = "[data-test=\"TopNav-AccountMenuButton\"]")
	private WebElement getusername1;
	@FindBy(css = "[type=\"checkbox\"]")
	private WebElement checkboxbtn;
	@FindBy(css = "[data-test=\"PassengersButton\"] .me-xxs")
	private WebElement passengersamount;
	@FindBy(css = "[data-test=\"BaggageButton\"] [data-test=\"BaggageField-note-cabin\"]")
	private WebElement cabinbagamount1;
	@FindBy(css = "[data-test=\"BaggageButton\"] [data-test=\"BaggageField-note-checked\"]")
	private WebElement checkedbagamount1;
	@FindBy(css = "[data-test=\"BaggageButton\"]")
	private WebElement cabinbagsbtn;
	@FindBy(css = "[data-test=\"SearchFormCancelButton\"]")
	private WebElement Canceltimefrom;
	@FindBy(css = "[data-test=\"LandingSearchButton\"]")
	private WebElement searchbtn;
	
	
	
	
	
	
	public Checkflight(WebDriver driver) {
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

	public WebElement CheckLocationFrom(String locationfrom) {
		
//		click(travelbtn);
		sleep(3000);
		click(choosefrombtn);
		sleep(3000);
		//List <WebElement>list=driver.findElements(By.cssSelector(".flex-1.overflow-hidden.text-ellipsis.whitespace-nowrap.text-normal.font-medium"));
	//	System.out.println(list.size());
		System.out.println(LocationList.size());
		for (WebElement el : LocationList) {			
			String name=el.getText();
			if(el.getText().equalsIgnoreCase(locationfrom)) {
				el.click();
				break;
			}
		}
		WebElement name2= Locationname;
	    return name2;
	}
	
	public String getlocationname(WebElement name3) {	
		
		sleep(3000);
		String name1=getusername(name3);
		System.out.println(name1);
		return name1;
	}

	public WebElement CheckLocationTo(String locationTo) {
	
	//click(travelbtn);
	click(choosetobtn);
	sleep(3000);
	//List <WebElement>list=driver.findElements(By.cssSelector(".flex-1.overflow-hidden.text-ellipsis.whitespace-nowrap.text-normal.font-medium"));
//	System.out.println(list.size());
	System.out.println(CityList.size());
	for (WebElement el : CityList) {			
		String name=el.getText();
		if(el.getText().equalsIgnoreCase(locationTo)) {
			el.click();
			break;
		}
	}
	WebElement name= Locationtoname;
    return name;
}
	

	public WebElement ChoosedateDep(String mouyear, String day, String tickettype ) {
	
		click(TimeFrom);
		sleep(4000);
		String mouyear1= getusername(ChooseMouFrom);
		while (!(mouyear1.equals(mouyear))) {			
			click(Nextmou);
			sleep(3000);
			mouyear1= getusername(ChooseMouFrom);
			
		}
				
	
		System.out.println(DaydepList.size());
		for (WebElement el : DaydepList) {			
			String name=el.getText();
			if(el.getText().equalsIgnoreCase(day)) {	
				el.click();			
				break;
			}
		
			
		}
		if (tickettype=="One-way") {
						
			WebElement name= Depvalueoneway;
			//click(Setdatebutt);
		    return name;
			
			
		}
		else {
		WebElement name= Depvalue;
	    return name;
		}
}
	
	
	
	public WebElement Choosedatereturn(String currentmou,String day, String privioustmou ) {
		
		int cou;
		if (currentmou==privioustmou)
			cou=1;
		else
			cou=0;
	//	click(Retvalue);
		sleep(2000);
		System.out.println(DaydepList.size());
		for (WebElement el : DaydepList) {			
			String name=el.getText();
			if(el.getText().equalsIgnoreCase(day)){
					cou++;
				if (cou==2||el.getText().equalsIgnoreCase("31")) {
					el.click();			
					break;
			}
		}
		
			
		}
		WebElement name= Retvalue;
	    return name;
		
	}
	
	public void onewayoption(String choise) {
		
	//	click(Setdatebutt);
	//	sleep(4000);
		click(onewaybutton);
		System.out.println(Retuoroneway.size());
		for (WebElement el : Retuoroneway) {			
			String name=el.getText();
			if(el.getText().equalsIgnoreCase(choise)){
				el.click();
			}
		}
		
//		click(Xtobtn);
//		click(Xfrombtn);
//		click(TimeFrom2);
//		click(Xdate);
		
	}
	
	
	
public WebElement Economy(String choise) {
		
	WebElement name=Economybtn;	
	/*sleep(2000);
		click(getusername1);
		sleep(2000);
		click(Xsinginbtn);*/
	
	
		//sleep(4000);
	    click(Setdatebutt);
		click(Economybtn);
		sleep(4000);
		System.out.println(Economylist.size());
		for (WebElement el : Economylist) {			
			String name1=el.getText();
			if(el.getText().equalsIgnoreCase(choise)){
				el.click();
			}
		}	
		
		click(TimeFrom);
		sleep(2000);
		click(Canceltimefrom);
				
		sleep(2000);   
	    switch (choise) {
       
	    case "Economy":
	    	name= Economybtn;
            break;
        case "Premium Economy":
        	
        	name= premiumname;
            break;
            
        case "Business":
        	
        	name= businessname;
            break;
            
        case "First Class":
            
        	name= firstclassname;
            break;
	    }
            
            return name;
	    
	}

public WebElement passamount(String passorbagsadult,String passorbagschild,String passorbagsInfans , int adultamoun, int childamount,int Infantsamount) {
	
	
	//sleep(4000);
	click(Passbtn);
	sleep(4000);
	
	if (passorbagsadult=="Adults")
	{	
		
		
		for(int i=1;i<adultamoun;i++) {
				WebElement Adults = driver.findElement(By.cssSelector("[data-test='PassengersRow-adults'] [aria-label='increment']"));

				Actions mouse= new Actions (driver);
				mouse.moveToElement(Adults).build().perform();
				click(Adults);	
		}

	}		
	
	 
	 
	 
	
	if (passorbagschild=="Children")
	{	
		
		for(int i=0;i<childamount;i++) {
			WebElement children = driver.findElement(By.cssSelector("[data-test='PassengersRow-children'] [aria-label='increment']"));
			Actions mouse= new Actions (driver);
			mouse.moveToElement(children).build().perform();
			click(children);
		}

	}
	
	if (passorbagsInfans=="Infants")
	{	
				
		for(int i=0;i<Infantsamount;i++) {
				WebElement Infants = driver.findElement(By.cssSelector("[data-test='PassengersRow-infants'] [aria-label='increment']"));
				Actions mouse= new Actions (driver);
				mouse.moveToElement(Infants).build().perform();
				click(Infants);	
			}

		}	
	
	
	click(TimeFrom);
	sleep(2000);
	click(Canceltimefrom);
	
	//click(choosefrombtn2);
	
	WebElement name= passengersamount;
    return name;		
	
}



public WebElement cabinbags(String passCabinbag ,int cabinbagamount) {
	
	click(cabinbagsbtn);
	sleep(4000);
	
	
		for(int i=0;i<cabinbagamount;i++) {
				WebElement Cabinbag = driver.findElement(By.cssSelector("[data-test='BagsPopup-cabin'] [aria-label='increment']"));
				Actions mouse= new Actions (driver);
				mouse.moveToElement(Cabinbag).build().perform();
				click(Cabinbag);	
			}
		
		click(TimeFrom);
		sleep(2000);
		click(Canceltimefrom);
		//click(choosefrombtn2);
		
		WebElement name= cabinbagamount1;
	    return name;	

	
		
	
		
}

public WebElement checkedbags(String passcheckedbag, int checkedbagamount) {
	
	
	click(cabinbagsbtn);
	sleep(4000);
			
		for(int i=0;i<checkedbagamount;i++) {
				WebElement checkedbag = driver.findElement(By.cssSelector("[data-test='BagsPopup-checked'] [aria-label='increment']"));
				Actions mouse= new Actions (driver);
				mouse.moveToElement(checkedbag).build().perform();
				click(checkedbag);
			}
		
		click(TimeFrom);
		sleep(2000);
		click(Canceltimefrom);
		//click(choosefrombtn2);
		
		WebElement name= checkedbagamount1;
	    return name;	
	
}


public void search() {
	
	click(searchbtn);
}



}		
		
		

	
	

	
			
		
  
		
	
	
	
		
		
			

	
/*	public void addproduct(int f1) {
		
		
		if(f1==0) {
			click(item1);
			sleep(2000);
			click(addtocart1);
			sleep(2000);
			driver.navigate().back();
			sleep(2000);
		}
		else {
		click(item2);
		sleep(2000);
		click(addtocart2);
		sleep(2000);
		driver.navigate().back();
		}
		
	}
*/	
