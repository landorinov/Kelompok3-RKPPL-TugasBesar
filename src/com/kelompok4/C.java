package com.kelompok4;

/**
 *
 * @author Firman Kusnandi 133040297, Faerul Salamun 133040088 (javadoc)
 */
public class C extends Math {

    private double n1;
    private double n2;

    /**
     *
     */
    public C() {
        System.out.println("Ctor di kelas " + getClass().getSimpleName());
    }

    /**
     *
     * @return
     */
    public int add() {
        A a = new A();
        int n1 = (int) this.n1;
        int n2 = (int) this.n2;
        return a.add(n1, n2);
    }

    /**
     *
     * @return
     */
    public int sub() {
        A a = new A();
        int n1 = (int) this.n1;
        int n2 = (int) this.n2;
        return a.sub(n1, n2);
    }

    /**
     *
     * @return
     */
    public double mul() {
        B b = new B();
        return b.mul(n1, n2);
    }

    /**
     *
     * @return
     */
    public double div() {
        B b = new B();
        return b.div(n1, n2);
    }

    /**
     *
     * @return
     */
    public double getN1() {
        return n1;
    }

    /**
     *
     * @param n1
     */
    public void setN1(double n1) {
        this.n1 = n1;
    }

    /**
     *
     * @return
     */
    public double getN2() {
        return n2;
    }

    /**
     *
     * @param n2
     */
    public void setN2(double n2) {
        this.n2 = n2;
    }

    @Override
    public String toString() {
        return "toString di kelas C";
    }
}
