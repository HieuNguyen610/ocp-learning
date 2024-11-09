package com.movieflix.javachatapp.string.indent;

public class TranslateEscape {
    public static void main(String[] args) {
        var str = "1\\s2";
        System.out.println(str);
        System.out.println(str.translateEscapes());

    }
}
