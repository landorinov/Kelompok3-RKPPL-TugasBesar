package com.kelompok4;

/**
 *
 * @author Otik Indriyana 133040040, Faerul Salamun 133040088 (javadoc)
 */
public class B implements MullAndDivInterface {

    /**
     *
     */
    public B() {
        System.out.println("Ctor kelas " + getClass().getSimpleName());
    }

    //mul -> perkalian
    /**
     *
     * @param n1
     * @param n2
     * @return
     */
    @Override
    public double mul(double n1, double n2) {
        // TODO Auto-generated method stub
        return n1 * n2;
    }

    //div -> pembagian
    /**
     *
     * @param n1
     * @param n2
     * @return
     */
    @Override
    public double div(double n1, double n2) {
        // TODO Auto-generated method stub
        return n1 / n2;
    }

    //toString -> menampilkan output toString di kelasnya
    @Override
    public String toString() {
        return "toString di kelas " + getClass().getSimpleName();
    }
}
