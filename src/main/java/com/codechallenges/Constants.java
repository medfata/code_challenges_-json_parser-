package com.codechallenges;

public class Constants {
    public static boolean isWhitespace(char c) {
        return c == ' '
                || c == '\n'
                || c == '\t';
    }

    public static boolean isLetter(char c) {
        return c >= 'a' && c <= 'z';
    }

    public static boolean isNumberStart(char c) {
        return (c >= '0' && c <= '9') || c == '-';
    }
}
