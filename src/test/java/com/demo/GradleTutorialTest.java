package com.demo;

import org.junit.Test;

public class GradleTutorialTest {
    @Test
    public void verifyNoExceptionThrown() {
        // checks the main method in GradleTutorial gets executed without throwing an exception
        GradleTutorial.main(new String[]{});
    }
}