package com.codechallenges;

import java.util.List;
import java.util.Map;

public interface JsonParser {
    public Map<String, Object> map(String jsonString);
    public List<Object> list(String jsonString);
    public String string(String jsonString);
    public Number number(String jsonString);
    public boolean bool(String jsonString);
    public Object parse(String jsonString);
    public Object extractString(String jsonString, int fieldStart);
    public int indexOfSpecial(String str, int start);
}
