package com.Test;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.kelompok4.D;

public class TestD {
	D d = new D();
	
	@Test
	public void Test1(){
		Assert.assertEquals(d.pow(4, 2), 16.0);
	}
	
	@Test
	public void Test2(){
		Assert.assertNotEquals(d.pow(4, 2), 2.0);
	}
}
