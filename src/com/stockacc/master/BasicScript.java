package com.stockacc.master;

import java.sql.Driver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.server.browserlaunchers.Sleeper;




public class BasicScript {

	public static void main(String[] args) throws InterruptedException {
		String expval="Login";
		WebDriver driver=new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("http://webapp.qedgetech.com");
		String actval=	driver.findElement(By.id("btnsubmit")).getText();
		if (expval.equalsIgnoreCase(actval)) {
			System.out.println("launch succesful");
		}
		else {
			System.out.println("launch not succesfull");
			
		}
		
		
		String 	expvallogin="Administrator";
		
		driver.findElement(By.id("btnreset")).click();
		driver.findElement(By.id("username")).sendKeys("admin");
		driver.findElement(By.id("password")).sendKeys("master");
		driver.findElement(By.id("btnsubmit")).click();
		actval=driver.findElement(By.xpath("//*[@id='msUserName']/font/strong")).getText();
		
		if (expvallogin.equalsIgnoreCase(actval)) {
			System.out.println("login succesfull");
		}
		else
		{
			System.out.println("login not succesfull");
		}
		
		
		Sleeper.sleepTightInSeconds(2);
		driver.findElement(By.xpath("//*[@id='mi_a_suppliers']/a")).click();
		Sleeper.sleepTightInSeconds(2);
		driver.findElement(By.xpath("//*[@id='ewContentColumn']/div[3]/div[1]/div[1]/div[1]/div/a")).click();
		Sleeper.sleepTightInSeconds(2);
		driver.findElement(By.id("x_Supplier_Name")).sendKeys("sai");
		driver.findElement(By.id("x_Address")).sendKeys("hyderabad");
		driver.findElement(By.id("x_City")).sendKeys("hyd");
		driver.findElement(By.id("x_Country")).sendKeys("I");
		driver.findElement(By.id("x_Contact_Person")).sendKeys("sandy");
		driver.findElement(By.id("x_Phone_Number")).sendKeys("123456987");
		driver.findElement(By.id("x__Email")).sendKeys("sai@gmail.com");
		driver.findElement(By.id("x_Mobile_Number")).sendKeys("9456872136");
		driver.findElement(By.id("x_Notes")).sendKeys("fghghjjkjjghjhjkkhkh");
		driver.findElement(By.id("btnAction")).click();
		driver.findElement(By.xpath("html/body/div[17]/div[2]/div/div[4]/div[2]/button[1]")).click();
	}


}
