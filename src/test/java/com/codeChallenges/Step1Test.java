package com.codeChallenges;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.io.TempDir;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

public class Step1Test {

    @TempDir
    Path tempDir;

    @AfterEach
    void tearDown() {
        // Clear any state if needed (no mocks to reset in this case)
    }

    @Test
    public void testJsonFiles() throws IOException {
        Path currentDir = Paths.get("src", "test", "java", "com", "codeChallenges").toAbsolutePath();
        Path dir = currentDir.resolve("step1");
        List<Path> files = Files.list(dir)
                .filter(file -> file.toString().endsWith(".json"))
                .toList();

        for (Path file : files) {
            String input = Files.readString(file);

            int expectedExitCode = 0;
            try {
                com.google.gson.JsonParser.parseString(input);
            } catch (Exception e) {
                expectedExitCode = 1;
            }
            //assertEquals(JsonParser.parse(input), expectedExitCode);
        }
    }
}
