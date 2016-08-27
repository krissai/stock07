package com.stockacc.master;

import org.testng.Assert;
import org.testng.annotations.Test;

public class Exampleng {

	@Test(priority=1)
	public void xyz()
	{
		Assert.assertEquals("Gmail", "Gmail");
	}
	@Test(priority=3)
	public void abc()
	{
		Assert.assertEquals("Yahoo", "Yahoo");
	}
	@Test(priority=2)
	public void pqr()
	{
		Assert.assertEquals("Facebook", "Facebook");
	}
	
}
