package test_script;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import generic_script.Base_test;
import pom_script.FbPOM;

public class RunnerScript extends Base_test {
	@Test(dataProvider="testdata")
	public void test1(String d1,String d2) throws InterruptedException
	{
		FbPOM p=new FbPOM(driver);
		p.passUN(d1);
		p.passpwd(d2);
		Thread.sleep(3000);
		p.btn();
		Assert.fail();
	}
	@DataProvider(name = "testdata")
	public Object[][] createData1() {
	 return new Object[][] {
	   { "Akshay", "1234" },
	   { "Kumar", "5678"}    
	 };
	
	}
}



