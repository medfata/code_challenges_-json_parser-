package com.codechallenges;

import java.util.List;

public interface JsonLexerInterface {
    List<JsonToken> toknize(String input);
}
