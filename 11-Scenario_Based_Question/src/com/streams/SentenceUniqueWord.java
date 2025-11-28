package com.streams;

import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class SentenceUniqueWord {
    public static void main(String[] args) {

        List<String> sentences = List.of("java is cool", "cool code in java");
        Set<String> uniqueWords = sentences.stream()
                .flatMap(word -> Arrays.stream(word.split(" ")))
                .collect(Collectors.toSet());

        System.out.println(uniqueWords);
    }
}
