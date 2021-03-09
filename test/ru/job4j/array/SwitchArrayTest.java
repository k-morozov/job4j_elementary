package ru.job4j.array;

import org.junit.Test;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertThat;

public class SwitchArrayTest {

    @Test
    public void whenArrayHasFront() {
        int[] input = {5, 4, 3, 2};
        int value = 5;
        int[] result = SwitchArray.swapBorder(input);
        int[] expect = {2, 4, 3, 5};
        assertArrayEquals(result, expect);
    }

    @Test
    public void whenArrayEmpty() {
        int[] input = {};
        int value = 5;
        int[] result = SwitchArray.swapBorder(input);
        int[] expect = {};
        assertArrayEquals(result, expect);
    }
}