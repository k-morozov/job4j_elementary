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

    @Test
    public void whenSwap0to3() {
        int[] input = {1, 2, 3, 4};
        int[] expect = {4, 2, 3, 1};
        int[] rsl = SwitchArray.swap(input, 0, input.length - 1);
        assertThat(rsl, is(expect));
    }

    @Test
    public void whenSwapInvalidSource() {
        int[] input = {1, 2, 3, 4};
        int[] expect = {1, 2, 3, 4};
        int[] rsl = SwitchArray.swap(input, -1, input.length - 1);
        assertThat(rsl, is(expect));
    }

    @Test
    public void whenSwapInvalidSourceLength() {
        int[] input = {1, 2, 3, 4};
        int[] expect = {1, 2, 3, 4};
        int[] rsl = SwitchArray.swap(input, input.length, input.length - 1);
        assertThat(rsl, is(expect));
    }

    @Test
    public void whenSwapInvalidDist() {
        int[] input = {1, 2, 3, 4};
        int[] expect = {1, 2, 3, 4};
        int[] rsl = SwitchArray.swap(input, 0, -1);
        assertThat(rsl, is(expect));
    }

    @Test
    public void whenSwapInvalidDistLength() {
        int[] input = {1, 2, 3, 4};
        int[] expect = {1, 2, 3, 4};
        int[] rsl = SwitchArray.swap(input, 0, expect.length);
        assertThat(rsl, is(expect));
    }
}