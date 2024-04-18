package org.beginnertoexpert;

import java.util.Collection;
import java.util.Map;
import java.util.stream.Collectors;

public class CountDuplicateCharactersInString {

    public static void main(String[] args) {

        String input = "JavaJavaEE";

        Map<Character,Long> map = input.chars().mapToObj(c-> (char)c)
                .collect(Collectors.groupingBy(
                        c -> c, Collectors.counting()
                ));

        System.out.println(map);
    }
}
