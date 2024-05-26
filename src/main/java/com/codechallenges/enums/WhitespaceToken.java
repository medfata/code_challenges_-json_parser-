package com.codechallenges.enums;

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
}
