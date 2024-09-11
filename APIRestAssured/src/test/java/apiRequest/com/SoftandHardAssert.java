package apiRequest.com;

import org.testng.Assert;
import org.testng.annotations.Test;

public class SoftandHardAssert {
	
	@Test
	public void test1() {
		System.out.println("123");
		Assert.assertEquals("123", "789");
		System.out.println("123");
		
	}
	@Test
	public void test2() {
		System.out.println("Goor Night");
		Assert.assertEquals("123", "789");
		System.out.println("123");	}

}
