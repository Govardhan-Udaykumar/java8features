package org.beginnertoexpert;

import java.util.ArrayList;
import java.util.List;

public class PrintEvenNumbers {

    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        int num = 10;
        for(int i=0;i<num;i++){
            list.add(i);
        }

        list.forEach(n-> {
            if(n%2==0 && n > 0)
                System.out.println(n);
        });
    }
}
