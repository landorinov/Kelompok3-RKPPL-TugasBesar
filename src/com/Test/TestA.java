package com.Test;
//Otik Indriyana 133040040
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.kelompok4.A;



public class TestA {
	A a = new A();
	
  @Test
  public void test1(){
	  //Mengecek apakah toString tersebut tidak kosong?
	  Assert.assertNotNull("seharusnya tidak null",a.toString());
  }
 
 @Test
 public void test2(){
	 //Mengecek apakah to String tersebut kosong?
	 Assert.assertNull("Seharusnya null",a.toString());
 }
}
