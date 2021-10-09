package com.hackelite.examples;

import org.junit.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class TestMessageBuilder {

    @Test
    public void testNameMkyong() {

        MessageBuilder obj = new MessageBuilder();
        assertEquals("Hello HackElite", obj.getMessage("HackElite"));

    }

}