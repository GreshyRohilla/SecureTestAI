package ai;

import java.util.Arrays;
import java.util.List;

public class TestPriorityAI {

    public void prioritize() {
        List<String> criticalTests = Arrays.asList("Login Test", "Cart Test", "API Test");
        System.out.println("AI Prioritizing Critical Test Cases...");
        for (String test : criticalTests) {
            System.out.println("High Priority: " + test);
        }
    }
}