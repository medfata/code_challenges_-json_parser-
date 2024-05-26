package com.codechallenges.enums;

public enum NumberToken {
    ZERO('0'),
    ONE('1'),
    TWO('2'),
    THREE('3'),
    FOUR('4'),
    FIVE('5'),
    SIX('6'),
    SEVEN('7'),
    EIGHT('8'),
    NINE('9'),
    MINUS('-'),
    DOT('.'),
    SMALL_EXPONENT('e'),
    CAPITAL_EXPONENT('E'),
    PLUS('+');

    private final char symbol;

    NumberToken(char symbol) {
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
