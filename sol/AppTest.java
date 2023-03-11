package com.example;

import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class AppTest {
    App test = new App(4);

    @Test
    public void moreThanThreshold() {
        int threshold = 4;
        assertTrue(
                String.format("\nInput number more than %d (%d)\nOutput : String : \n" + test.getOutput(), threshold,
                        test.getUserInput()),
                test.getUserInput() <= threshold);
    }
}