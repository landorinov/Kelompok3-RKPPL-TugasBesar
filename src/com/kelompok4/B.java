package com.kelompok4;

public class B implements MullAndDivInterface  {
	
	public B() {
    	System.out.println("Ctor kelas "+getClass().getSimpleName());
    }

    @Override
	public double mul(double n1, double n2) {
		// TODO Auto-generated method stub
		return n1*n2;
	}

	@Override
	public double div(double n1, double n2) {
		// TODO Auto-generated method stub
		return n1/n2;
	}

	

    @Override
    public String toString() {
        return "toString di kelas "+getClass().getSimpleName();
    }
}
