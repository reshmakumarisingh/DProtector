package testing;

import org.testng.annotations.Test;

import Generic.basetest;
import Generic.lib;
import pom.crusade;

public class validdata extends basetest{
	
	@Test
	public void valid(){
		crusade ref1=new crusade(driver);
		for(int i=1;i<=2;i++){
			String value=lib.getvalue("Sheet",i, 0);
			ref1.setusd(value);
			String value1=lib.getvalue("Sheet",i, 1);
			ref1.setpsd(value1);
		}
		
	}

}
