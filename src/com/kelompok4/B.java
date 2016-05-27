package com.kelompok4;
//Otik Indriyana 133040040
public class B implements MullAndDivInterface  {
	
	public B() {
    	System.out.println("Ctor kelas "+getClass().getSimpleName());
    }

	//mul -> perkalian
    @Override
	public double mul(double n1, double n2) {
		// TODO Auto-generated method stub
		return n1*n2;
	}

    //div -> pembagian
	@Override
	public double div(double n1, double n2) {
		// TODO Auto-generated method stub
		return n1/n2;
	}

	//toString -> menampilkan output toString di kelasnya
    @Override
    public String toString() {
        return "toString di kelas "+getClass().getSimpleName();
    }
}
