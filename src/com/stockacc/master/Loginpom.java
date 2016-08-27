package com.stockacc.master;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

public class Loginpom {
	@Test
	public void Exe()
	{
		WebDriver driver=new FirefoxDriver();
		driver.get("http://webapp.qedgetech.com");
		driver.manage().window().maximize();
		
		Loginpage lp=PageFactory.initElements(driver,Loginpage.class);
		lp.Adminlgn("admin", "master");
			Homepagepom hp=PageFactory.initElements(driver,Homepagepom.class);
			hp.supplier();
	}

}
