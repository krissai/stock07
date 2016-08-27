package com.stockacc.master;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.server.browserlaunchers.Sleeper;

public class Stocklib 

{

	public static Properties pr;
	public static FileInputStream Fis;
	public static WebDriver driver;
	public static String Expval, Actval;

	public String OpenApp(String url) throws IOException
	{
	  pr = new Properties();
		Fis=new FileInputStream("C:\\Users\\saikrishna.n\\workspace\\Stockaccouting\\src\\com\\stockacc\\properties\\Rep.properties");
		
		pr.load(Fis);
		Expval="Login";
		driver=new FirefoxDriver();
		driver.get(url);
		driver.manage().window().maximize();
		Actval=driver.findElement(By.id("btnsubmit")).getText();
		if (Expval.equalsIgnoreCase(Actval)) 
		{
			//System.out.println("Application is launched");
			return "Pass";
		}
		else
		{
			//System.out.println("Application is not launched");
			return "fail";
		}
	}

	public String AdmLgn(String UN,String Pwd)
	{
		Expval="Administrator";
		driver.findElement(By.id("btnreset" )).click();
		driver.findElement(By.id("username")).sendKeys(UN);
		driver.findElement(By.id("password")).sendKeys(Pwd);
		driver.findElement(By.id("btnsubmit")).click();

		Actval=driver.findElement(By.xpath(".//*[@id='msUserName']/font/strong")).getText();
		if(Expval.equalsIgnoreCase(Actval))
		{
			//System.out.println("Stock accounting home page displayed");
			return "Pass";
		}
		else
		{
			//System.out.println("Stock accounting home page not displayed");
			return "Fail";
		}
	}
	public String Supplier(String supplyname,String Address,String city,String country,String contactperson,String phonenumber,String Email,String mobilenumber,String Notes )
	{
		Expval="Add succeeded";
		Sleeper.sleepTightInSeconds(2);
		driver.findElement(By.xpath("//*[@id='mi_a_suppliers']/a")).click();
		Sleeper.sleepTightInSeconds(2);
		driver.findElement(By.xpath("//*[@id='ewContentColumn']/div[3]/div[1]/div[1]/div[1]/div/a")).click();
		Sleeper.sleepTightInSeconds(2);
		driver.findElement(By.id("x_Supplier_Name")).sendKeys(supplyname);
		driver.findElement(By.id("x_Address")).sendKeys(Address);
		driver.findElement(By.id("x_City")).sendKeys(city);
		driver.findElement(By.id("x_Country")).sendKeys(country);
		driver.findElement(By.id("x_Contact_Person")).sendKeys(contactperson);
		driver.findElement(By.id("x_Phone_Number")).sendKeys(phonenumber);
		driver.findElement(By.id("x__Email")).sendKeys(Email);
		driver.findElement(By.id("x_Mobile_Number")).sendKeys(mobilenumber);
		driver.findElement(By.id("x_Notes")).sendKeys(Notes);
		driver.findElement(By.id("btnAction")).click();
		driver.findElement(By.xpath("html/body/div[17]/div[2]/div/div[4]/div[2]/button[1]")).click();
		Sleeper.sleepTightInSeconds(2);
		Actval=driver.findElement(By.xpath("html/body/div[17]/div[2]/div/div[3]/div/div")).getText();
		Sleeper.sleepTightInSeconds(2);
		driver.findElement(By.xpath("html/body/div[17]/div[2]/div/div[4]/div[2]/button")).click();
		if(Expval.equalsIgnoreCase(Actval))
		
			{
				//System.out.println("Stock accounting home page displayed");
				return "Suppliers addded succesfully";
			}
			else
		{
				//System.out.println("Stock accounting home page not displayed");
				return "suppliers not added successfully";
			}
		
	}
	public String stockcat(String Categoryname)
	{
		Expval="Add succeeded";
		Actions ac=new Actions(driver);
		Sleeper.sleepTightInSeconds(2);
		ac.moveToElement(driver.findElement(By.xpath(".//*[@id='mi_a_stock_items']/a"))).build().perform();
		driver.findElement(By.xpath("//*[@id='mi_a_stock_categories']/a")).click();
		Sleeper.sleepTightInSeconds(2);
		driver.findElement(By.xpath(".//*[@id='ewContentColumn']/div[3]/div[1]/div[1]/div[1]/div/a")).click();
		Sleeper.sleepTightInSeconds(2);
		driver.findElement(By.id("x_Category_Name")).sendKeys(Categoryname);
		driver.findElement(By.id("btnAction")).click();
		Sleeper.sleepTightInSeconds(2);
		driver.findElement(By.xpath("html/body/div[.]/div[2]/div/div[4]/div[2]/button[1]")).click();
		Sleeper.sleepTightInSeconds(2);
		
		Actval=driver.findElement(By.xpath("html/body/div[.]/div[2]/div/div[3]/div/div")).getText();
		Sleeper.sleepTightInSeconds(2);
		driver.findElement(By.xpath("html/body/div[.]/div[2]/div/div[4]/div[2]/button")).click();
		if(Expval.equalsIgnoreCase(Actval))
		
			{
				//System.out.println("Stock accounting home page displayed");
				return "Suppliers addded succesfully";
			}
			else
		{
				//System.out.println("Stock accounting home page not displayed");
				return "suppliers not added successfully";
	}
	
	}
	}

