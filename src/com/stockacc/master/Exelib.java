package com.stockacc.master;

import java.io.IOException;

public class Exelib {

	public static void main(String[] args) throws IOException {
		Stocklib SL=new Stocklib();
		String Res=SL.OpenApp("http://webapp.qedgetech.com");
        System.out.println(Res);
        Res=SL.AdmLgn("admin","master");
        System.out.println(Res);
      //  Res=SL.Supplier("Mi", "hyd", "hydd","IN", "Sri", "123548785", "svuhfdvjndvhu", "122545655", "ncjjvhvfjvvfbvhbj");
      //  System.out.println(Res);
        Res=SL.stockcat("Mi");
        System.out.println(Res);
	}

}
