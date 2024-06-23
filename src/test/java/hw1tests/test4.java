package hw1tests;


import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import hw1pages.Checkflight;
import hw1pages.Deals;

public class test4 extends BaseTest{
	
	StringBuilder str1 = new StringBuilder();
	StringBuilder str2 = new StringBuilder();
	int price1,price2;
	String str3,str4; 
	String direction;
	
	
	@Test( description = "Click on deals")
	public void tc01_Clickdeals(){
		
		
		String exp="Flight deals from Tel Aviv, Israel";
		Deals D1= new Deals (driver);
		D1.login("linoyinon@gmail.com","l038191581");
		WebElement name=D1.Dealslogin();
		String title= D1.getname(name);
		Assert.assertEquals(title,exp);
				
	}
	
	@Test( description = "Explore cheap travel deals- place from")
	public void tc02_Exploreplacedealsfrom(){
		
		
		
		
		Deals D1= new Deals (driver);
		WebElement name=D1.Exploredealsplacefrom("Budapest, Hungary");
		String locationfrom=D1.getname(name);			
		Assert.assertEquals(locationfrom,"Budapest");
		
				
	}
	
	
	@Test( description = "Explore cheap travel deals- place return/One-way")
	public void tc03_Exploreplacedealsdates(){
		
		
		//String Directionexp="Return";
		String Directionexp="One-way";
		Deals D1= new Deals (driver);
	//	WebElement name1=D1.Exploredealsreturnoneway(" Return");
		WebElement name1=D1.Exploredealsreturnoneway(" One-way");
		direction=D1.getname(name1);
		Assert.assertEquals(direction,Directionexp);
		
	}	
	
	

	@Test( description = "Explore cheap travel deals- dates and price ")
	public void tc04_Exploreplacedealsdirection(){
	
		
		String exp="Thu 1 Aug – Sat 31 Aug";
		String exp1="7 – 14 nights";
		int f1=0;
		Deals D1= new Deals (driver);
	//	WebElement name2=D1.Exploredealsdate("August" ,"1-2 weeks",direction);
		D1.Exploredealsdate("August" ,"1-2 weeks",direction);
	//	String Directionmou=D1.getname(name2);
	//	Assert.assertEquals(Directionmou,exp);
	/*	if(direction==" Return") {
			WebElement name3=D1.Exploredealsdate2();
			String Directionlengh=D1.getname(name3);
			Assert.assertEquals(Directionlengh,exp1);
		}
		*/
		WebElement name=D1.Exploredealsprice();		
		String price=D1.getname(name);
		D1.saveprice();
		
		for (int i = 0; i < price.length(); i++) {
		    char ch = price.charAt(i);
		   // System.out.println(ch);
		    if(ch>='0'&&ch<='9'&&ch!='-'&&f1==0) {
		    	 str1.append(ch);
		    }
		    else
		    {
		    	if (ch=='-')
		    		f1=1;
		    	if(ch>='0'&&ch<='9') {
		    		str2.append(ch);
		    	}
		    }
		      
	}
		
		str3 = str1.toString();
		str4 = str2.toString();
		
		
		price1=Integer.parseInt(str3);
		price2=Integer.parseInt(str4);
		
		System.out.println("price1= " + price1);
		System.out.println("price2= " + price2);
		
		
}	


	@Test( description = "Cheacke the deal's price")
	public void tc05_Explorethedealfromlist(){
		
		boolean exp=true;
		Deals D1= new Deals (driver);
		boolean f1=D1.finddetails(price1,price2);
		System.out.println(f1);
		Assert.assertEquals(f1,exp);
	

	}
}
