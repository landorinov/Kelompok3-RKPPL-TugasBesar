package com.kelompok4;

public class D implements PowInterface  {

	public D() {
    	System.out.println("Ctor kelas "+getClass().getSimpleName());
    }
	
    @Override
	public double pow(double n1, double n2) {
		// TODO Auto-generated method stub
    	double hasil =1;
    	for (int i = 1; i <= n2; i++) {
			hasil *=n1;
		}
    	return hasil;
	}

	

    @Override
    public String toString() {
        return "toString kelas "+getClass().getSimpleName();
    }
}
