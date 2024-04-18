package org.beginnertoexpert;

public class AdditionAndMultiplicationUsingLambda {

    interface FuncInterface1{
        int operation(int x,int y);
    }
    private int operate(int x, int y, FuncInterface1 funcInterface1){
        return funcInterface1.operation(x,y);
    }

    public static void main(String[] args) {

        FuncInterface1 addition = (int x, int y)->(x + y);

        FuncInterface1 multiplication = (int x, int y)->(x * y);

        AdditionAndMultiplicationUsingLambda obj = new AdditionAndMultiplicationUsingLambda();
        System.out.println(obj.operate(6,3,addition));
        System.out.println(obj.operate(6,3,multiplication));

    }
}
