package com.movieflix.javachatapp.string.indent;

public class IndentMethod {
    public static void main(String[] args) {

        var block = """
                a
                 b
                c""";
        var concat = " a\n" + "  b\n" + " c";
        System.out.println(block);
        System.out.println(block.length());
        System.out.println(block.indent(1));
        System.out.println(block.indent(-1));

        System.out.println("-------------------");
        System.out.println(concat);
        System.out.println(concat.length());
        System.out.println(concat.indent(1));
        System.out.println(concat.indent(-1));
        System.out.println(concat.indent(-2));


    }
}
