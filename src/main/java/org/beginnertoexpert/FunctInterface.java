package org.beginnertoexpert;

public interface FunctInterface {

    void multiply(int x);
}

class Test{
    public static void main(String[] args) {
        FunctInterface fobj = (int x)->System.out.println(2*x);
        fobj.multiply(10);
    }
}
