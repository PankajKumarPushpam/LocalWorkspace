package com.DataProvider;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class dataProvider {
    
	public class DataProviderDemo{
		@Test(dataProvider="data-provider")
		public void test(String st) {
			System.out.println(st);
		}
		@DataProvider(name="data-provider")
		public Object[][] datapro(){
			return new Object[][] {
				{"First Set od Data"},{"Second Set od Data"}
			};
		}
	}
	
}
