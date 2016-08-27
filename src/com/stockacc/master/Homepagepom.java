package com.stockacc.master;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Homepagepom {
@FindBy(xpath=".//*[@id='mi_a_suppliers']/a")
WebElement Suppliers;

public void supplier()
{
	Suppliers.click();
}
}

