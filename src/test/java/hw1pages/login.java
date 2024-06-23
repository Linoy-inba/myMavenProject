package hw1pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class login extends BasePage {

	@FindBy(css = "[autocomplete=\"username\"]")
	private WebElement userNameField;
	@FindBy(css = "[type=\"password\"]")
	private WebElement passwordField;
	@FindBy(css = "[data-test=\"TopNav-SingInButton\"]")
	private WebElement loginBtn;
	@FindBy(css = "[data-test=\"TopNav-AccountMenuButton\"]")
	private WebElement loginBtn2;
	@FindBy(css = ".mb-md.block.space-y-md.space-x-none.w-full>button")
	private WebElement clicksignin;	
	@FindBy(css = "#react-view > div > div.TopContainerstyled__StickyContainer-sc-gf454z-0.fCllSu > div > nav > div > div > div.Stack__StyledStack-sc-53pobq-0.kHEZPQ > button.ButtonPrimitive__StyledButtonPrimitive-sc-j8pavp-0.iVQdfn > div > div.ButtonPrimitiveContentChildren__StyledButtonPrimitiveContentChildren-sc-mra4yy-0.NRXsW")
	private WebElement getusrnamelogout;
	@FindBy(css = "[data-test=\"MagicLogin-LoginViaEmail\"]")
	private WebElement EmailBtn;
	@FindBy(css = "[data-test=\"MagicLogin-Continue\"]")	
	private WebElement countinueBtn;
	@FindBy(css = "#cookies_accept")
	private WebElement AcceptBtn;
	@FindBy(css = "[type=\"submit\"]")
	private WebElement signinbtn;
	@FindBy(css = ".block.space-y-xxs.space-x-none.w-full>h2")
	private WebElement getusername;
	@FindBy(css = "[aria-controls=\"Sign out\"]")
	private WebElement logoutbtn;
	@FindBy(css = ".flex.flex-1.flex-col.items-center")
	private WebElement Failmessagepass;
	
	
	
	

	public login(WebDriver driver) {
		super(driver);
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
		//sleep (4000);
		click(signinbtn);
		sleep (4000);
		//System.out.println("success");
		
				
	}
	public String getloginname() {
		
		click(loginBtn2);
		sleep (3000);
		String name1=getusername(getusername);
		System.out.println(name1);
		return name1;
		
	}
	
	public void logout() {
		
		sleep(2000);
		click(getusername);
		sleep(2000);
		click(logoutbtn);
	
		
	}
	public String getlogoutname() {
	
		String name1=getusername(loginBtn);
		System.out.println(name1);
		return name1;
	
}
		
public String loginpasswardfail(String username) {
	
	sleep(2000);
	click(clicksignin);
	click(EmailBtn);
	filltext(userNameField, username);
	click(countinueBtn);	
	sleep(4000);
	click(signinbtn);
	sleep(2000);
	String name1=getusername(Failmessagepass);
	System.out.println(name1);
	return name1;
		
	
}

public void insertpass(String passward) {
	
	click(passwordField);
	filltext(passwordField, passward);
	//sleep (4000);
	click(signinbtn);
	sleep (4000);
	
}
}
