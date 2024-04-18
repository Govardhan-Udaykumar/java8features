package org.beginnertoexpert;

import java.util.Collections;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class RemoveDuplicateCharacters {

    public static void main(String[] args) {
        String string = "goovardhann";

        String distinctCharacters = string.chars().distinct().collect(
                StringBuilder::new,
                StringBuilder::appendCodePoint,
                StringBuilder::append
        ).toString();

        System.out.println("Actual string is : "+string);
        System.out.println("String having distinct characters is : "+distinctCharacters);

    }
}
