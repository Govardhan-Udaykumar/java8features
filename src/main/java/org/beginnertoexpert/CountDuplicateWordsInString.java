package org.beginnertoexpert;

import java.util.Arrays;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class CountDuplicateWordsInString {

    public static void main(String[] args) {
        String string = "Super Man Bat Man Spider Man";

        Map<String, Long> map = Arrays.stream(string.split(" "))
                .collect(Collectors.groupingBy(Function.identity(),Collectors.counting())
        );

        System.out.println(map);
    }
}
