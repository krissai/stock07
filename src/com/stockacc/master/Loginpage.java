package com.stockacc.master;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Loginpage {
@FindBy(id="username")
WebElement Uname;

@FindBy(id="password")
WebElement pwd;

@FindBy(id="btnsubmit")
WebElement Login;

//    @FindBy(id="btnreset")
  //  WebElement reset;

public void Adminlgn(String un,String pswd)
{
	//reset.click();
	Uname.click();
	pwd.click();
	Login.click();
}

}
