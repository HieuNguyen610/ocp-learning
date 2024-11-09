package com.movieflix.javachatapp.string.indent;

public class FormatValue {
    public static void main(String[] args) {
        var start = "AnimAL  ";
        var trimmed = start.strip();
        var lowercase = trimmed.toLowerCase();
        var result = lowercase.replaceAll("a", "A");
        System.out.println(result);
    }
}
