package com.codechallenges.impl;
import java.util.ArrayList;
import java.util.List;

import com.codechallenges.JsonLexerInterface;
import com.codechallenges.JsonToken;
import com.codechallenges.enums.JsonTokenType;
import com.codechallenges.enums.WhitespaceToken;

public class JsonLexer implements JsonLexerInterface {
    @Override
    public List<JsonToken> toknize(String input) {
        List<JsonToken> res = new ArrayList<>();
        for(int i=0; i<input.length(); i++){
            char c  = input.charAt(i);
            if(WhitespaceToken.isWhitspace(c))
                continue;
            switch (c) {
                case '{':
                    res.add(new JsonToken(JsonTokenType.LEFT_BRACE, "{"));
                    break;
                case '}':
                    res.add(new JsonToken(JsonTokenType.LEFT_BRACE, "{"));
                    break;
            }
        }
        return res;
    }
}
