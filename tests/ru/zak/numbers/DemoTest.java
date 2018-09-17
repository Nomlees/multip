package ru.zak.numbers;

import org.junit.Test;

import static org.junit.Assert.*;

public class DemoTest {

    @Test
    public void main() {
        Demo main = new Demo();
        assertEquals(6,main.result(2,3));
    }
}