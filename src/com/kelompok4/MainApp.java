package com.kelompok4;
//Otik Indriyana 133040040
import java.util.ArrayList;
import java.util.List;

public class MainApp {

    public static void main(String[] args) {
    	/*D d = new D();
    	
    	System.out.println(d.pow(5, 2));*/
    	int n1 = 2;
    	int n2 = 4;
    	
    	//instansiasi kelas C
    	C c = new C();
    	c.setN1(n1);
    	c.setN2(n2);
    		
    	//memanggil method add di kls C
    	System.out.println(c.add());
    	
    	//memanggil method sub di kls C
    	System.out.println(c.sub());
    	
    	//memanggil method mull di kls C
    	System.out.println(c.mul());
    	
    	//memanggil method div di kls C
    	System.out.println(c.div());
    	
    	//Memanggil method toString di kls C
    	System.out.println(c.toString());
    	
    	System.out.println("\n");
    	
    	//instansiasi kelas D
    	D d = new D();
    	//memanggil method pow
    	System.out.println(d.pow(n1, n2));
    	System.out.println(d.toString());
    	System.out.println("\n");
    	
    	//instansiasi kelas E
    	E e = new E();
    	List datalist = new ArrayList<>();
    	
    	datalist.add(c);
    	datalist.add(d);
    	datalist.add(e);
    	
    	e.setDataList(datalist);
    	System.out.println(e.getDataList());
    	System.out.println(e.contains("C"));
    	System.out.println(e.contains("D"));
    	System.out.println(e.contains("E"));
    	System.out.println(e.toString());
    	
    	 
    }
}
