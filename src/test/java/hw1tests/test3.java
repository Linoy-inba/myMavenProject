package hw1tests;

import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import hw1pages.Checkflight;

public class test3 extends BaseTest{
	
	
	@Test( description = "choose one way option, and insert the location to fly from and to, insert the time to fly to without return time")
	public void tc01_Checkflightoneway(){	
			
	String exp="Larnaca", exp2="Amman";
	Checkflight C1= new Checkflight (driver);
	C1.login("linoyinon@gmail.com","l038191581");
	C1.onewayoption("One-way");
	WebElement name2=C1.CheckLocationFrom("Amman, Jordan");
	String locationname= C1.getlocationname(name2);
	System.out.println(locationname);
	Assert.assertEquals(locationname,exp2);
	name2=C1.CheckLocationTo("Larnaca, Cyprus");
//	WebElement name2=C1.CheckLocationTo();‎
	locationname= C1.getlocationname(name2);
	Assert.assertEquals(locationname,exp);
	name2=C1.ChoosedateDep("June 2024","29","One-way");
	String locationtime= C1.getlocationname(name2);
	System.out.println(locationtime);
	Assert.assertEquals(locationtime, "Sat 29 Jun");
	
	}	
	
	@Test( description = "choose one way option, and insert the location to fly from and to, insert the time to fly to without return time")
	public void tc02_CheckEconomy(){


	Checkflight C1= new Checkflight (driver);			
	WebElement name2=C1.Economy("First Class");
	String locationname= C1.getlocationname(name2);
	System.out.println(locationname);
	Assert.assertEquals(locationname, "First Class");
	
	}
	
	@Test( description = "choose passenger's amount and cabin bags")
	public void tc03_Choosepassandcabinbags(){


	Checkflight C1= new Checkflight (driver);
	WebElement name2=C1.passamount("Adults","Children","Infants",1,2,1);
	WebElement name3=C1.cabinbags("Cabin baggage",1);
	WebElement name4=C1.checkedbags("Checked baggage",2);
	String passengersamount= C1.getlocationname(name2);
	System.out.println(passengersamount);
	Assert.assertEquals(passengersamount, "4");
	String cabinamount= C1.getlocationname(name3);
	System.out.println(cabinamount);
	Assert.assertEquals(cabinamount, "1");
	String Checkedamount= C1.getlocationname(name4);
	System.out.println(Checkedamount);
	Assert.assertEquals(Checkedamount, "2");
	C1.search();
	
	}	
	
	

	
	
	
	
	
	
	
}
