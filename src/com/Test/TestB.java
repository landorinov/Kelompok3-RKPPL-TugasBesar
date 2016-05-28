package com.Test;
//Otik 133040040
import org.testng.Assert;
import org.testng.annotations.Test;

import com.kelompok4.B;

public class TestB {
	B b = new B();
	
	@Test
	//Mengecek apakah hasil dari mul yg di ekspektasikan tidak sesuai dengan yang ditetapkan
	public void test1(){
		Assert.assertNotEquals(b.mul(2,5), 5);
	}
	
	@Test
	//Mengecek apakah hasil dari mul yg di ekspektasikan sesuai dengan yang ditetapkan
	public void test2(){
		Assert.assertEquals(b.mul(2,5), 10.0);
	}
}
