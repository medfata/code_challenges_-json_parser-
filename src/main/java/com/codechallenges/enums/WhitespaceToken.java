package com.codechallenges.enums;

import java.util.Arrays;

public enum WhitespaceToken {
    SPACE(' '),
    TAB('\t'),
    NEWLINE('\n'),
    CARRIAGE_RETURN('\r');

    private final char symbol;

    WhitespaceToken(char symbol) {
        this.symbol = symbol;
    }

    public char getSymbol() {
        return symbol;
    }

    @Override
    public String toString() {
        return Character.toString(symbol);
    }

    public  static boolean isWhitspace(char c){
        return Arrays.stream(WhitespaceToken.values()).anyMatch(token -> token.symbol == c);
    }
}
