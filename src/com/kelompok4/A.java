package com.kelompok4;

/**
 *
 * @author Otik Indriyana 133040040, Faerul Salamun 133040088 (javadoc)
 */
public class A implements AddAndSubInterface {

    /**
     *
     */
    public A() {
        System.out.println("Ctor Kelas " + getClass().getSimpleName());
    }

    //add -> penjumlahan
    /**
     *
     * @param n1
     * @param n2
     * @return
     */
    @Override
    public int add(int n1, int n2) {
        // TODO Auto-generated method stub
        return n1 + n2;
    }

    //sub -> pengurangan
    /**
     *
     * @param n1
     * @param n2
     * @return
     */
    @Override
    public int sub(int n1, int n2) {
        // TODO Auto-generated method stub
        return n1 - n2;
    }

    // method toString untuk mengembalikan nilai string
    @Override
    public String toString() {
        return "toString di kelas " + getClass().getSimpleName();
    }

}
