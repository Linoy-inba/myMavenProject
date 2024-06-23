package hw1tests;


import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import hw1pages.Checkflight;

public class test2 extends BaseTest{

	
	@Test ( description = "choose which location to fly from")
	public void tc01_Checkflightfrom(){
	String exp="Amman";
	Checkflight C1= new Checkflight (driver);
	C1.login("linoyinon@gmail.com","l038191581");
	WebElement name2=C1.CheckLocationFrom("Amman, Jordan");
	String locationname= C1.getlocationname(name2);
	Assert.assertEquals(locationname,exp);

	}
	
	@Test( description = "choose which location to fly to")
	public void tc02_Checkflightto(){
	
	String exp1="Athens";
	Checkflight C1= new Checkflight (driver);
	WebElement name2=C1.CheckLocationTo("Athens, Greece");
//	WebElement name2=C1.CheckLocationTo();‎
	String locationname= C1.getlocationname(name2);
	Assert.assertEquals(locationname,exp1);

	}
	
	
	@Test ( description = "choose which time to fly to and the return time")
	public void tc03_Checkflighttimefrom(){	
	
    String exp="Sun 30 Jun";
    String exp1="Wed 31 Jul";
	Checkflight C1= new Checkflight (driver);	
	WebElement name2=C1.ChoosedateDep("June 2024","30","Return");
	String locationtime= C1.getlocationname(name2);
	System.out.println(locationtime);
	Assert.assertEquals(locationtime,exp);
	name2=C1.Choosedatereturn("July 2024","31","June 2024");
	locationtime= C1.getlocationname(name2);
	System.out.println(locationtime);
	Assert.assertEquals(locationtime,exp1);
	}
	

	@Test( description = "choose one way option, and insert the location to fly from and to, insert the time to fly to without return time")
	public void tc04_CheckEconomy(){


	Checkflight C1= new Checkflight (driver);			
	WebElement name2=C1.Economy("Business");
	String locationname= C1.getlocationname(name2);
	System.out.println(locationname);
	Assert.assertEquals(locationname, "Business");
	
	}
	
	@Test( description = "choose passenger's amount and cabin bags")
	public void tc05_Choosepassandcabinbags(){


	Checkflight C1= new Checkflight (driver);
	WebElement name2=C1.passamount("Adults","Children","Infants",2,3,1);
	WebElement name3=C1.cabinbags("Cabin baggage",2);
	WebElement name4=C1.checkedbags("Checked baggage",1);
	String passengersamount= C1.getlocationname(name2);
	System.out.println(passengersamount);
	Assert.assertEquals(passengersamount, "6");
	String cabinamount= C1.getlocationname(name3);
	System.out.println(cabinamount);
	Assert.assertEquals(cabinamount, "2");
	String Checkedamount= C1.getlocationname(name4);
	System.out.println(Checkedamount);
	Assert.assertEquals(Checkedamount, "1");
	C1.search();
	
	
	
	
	//WebElement name2=C1.passandcabinbags("Adults",1);
	//String locationname= C1.getlocationname(name2);
	//System.out.println(locationname);
	//Assert.assertEquals(locationname, "First Class");
	
	}	
	
	
	
	
	
	

}
