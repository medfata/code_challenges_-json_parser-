package com.codechallenges;

import com.codechallenges.impl.JsonParser.State;
import java.util.List;
import java.util.Stack;


public class JsonParserException extends RuntimeException {

    private final String message;

    public JsonParserException(String message) {
        this.message = message;
    }

    public JsonParserException(Stack<State> stateStack, String message) {
        String jsonTrace = "";
        for (int i = 0; i < stateStack.size(); i++) {
            String name = stateStack.get(i).propertyName;
            if (name == null) {
                // Fill in array index
                @SuppressWarnings("unchecked")
                List<Object> list = (List<Object>) stateStack.get(i).container;
                name = String.format("[%d]", list.size());
            }
            jsonTrace += name + (i != stateStack.size() - 1 ? "." : "");
        }

        jsonTrace = jsonTrace.equals("") ? "<root>" : "<root>." + jsonTrace;

        this.message = jsonTrace + ": " + message;
    }

    @Override
    public String getMessage() {
        return message;
    }
}
