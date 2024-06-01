package com.codeChallenges;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

public class StepsTest {

    private int parseWithCustomParser(String str) {
        try {
            com.codechallenges.impl.JsonParser.parse(str);
            return 0;
        } catch (Exception e) {
            return 1;
        }
    }
    
    @Test
    public void step1Test() throws IOException {
        runTestForDirectory("step1");
    }

    @Test
    public void step2Test() throws IOException {
        runTestForDirectory("step2");
    }

    @Test
    public void step3Test() throws IOException {
        runTestForDirectory("step3");
    }

    @Test
    public void step4Test() throws IOException {
        runTestForDirectory("step4");
    }

    private void runTestForDirectory(String dirName) throws IOException {
        Path currentDir = Paths.get("src", "test", "java", "com", "codeChallenges").toAbsolutePath();
        Path dir = currentDir.resolve(dirName);
        List<Path> files = Files.list(dir)
                .filter(file -> file.toString().endsWith(".json"))
                .toList();

        for (Path file : files) {
            String input = Files.readString(file);
            Path fileName = file.getFileName();
            int exptectedExitCode = 0;
            if(fileName.toString().startsWith("invalid")){
                exptectedExitCode = 1;
            }
            int acctualExitcode = parseWithCustomParser(input);
            if(exptectedExitCode == 1 && acctualExitcode == 0){
                System.out.println("=====> fileName: "+fileName );
            }
            assertEquals(exptectedExitCode, parseWithCustomParser(input));
        }
    }
}
