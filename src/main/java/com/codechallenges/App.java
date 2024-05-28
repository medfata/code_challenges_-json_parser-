package com.codechallenges;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

public class App {
    public static void main(String[] args) throws IOException {
       Path currentDir = Paths.get("src", "test", "java", "com", "codeChallenges").toAbsolutePath();
        Path dir = currentDir.resolve("step1");
        List<Path> files = Files.list(dir)
                .filter(file -> file.toString().endsWith(".json"))
                .toList();
        for (Path file : files) {
            String input = Files.readString(file);
            System.out.print("file: "+file.toString()+" / "+input);
        }
    }
}
