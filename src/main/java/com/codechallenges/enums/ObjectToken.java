package com.codechallenges.enums;

public enum ObjectToken {
    LEFT_BRACE('{'),
    RIGHT_BRACE('}'),
    COMMA(','),
    COLON(':');


    private final char symbol;

    ObjectToken(char symbol) {
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
