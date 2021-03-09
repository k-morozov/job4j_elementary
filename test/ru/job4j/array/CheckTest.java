package ru.job4j.array;

import org.junit.Test;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class CheckTest {
    @Test
    public void whenDataMonoByTrueThenTrue() {
        boolean[] input = new boolean[] {true, true, true};
        boolean result = Check.mono(input);
        assertThat(result, is(true));
    }

    @Test
    public void whenDataMonoByOneTrueThenTrue() {
        boolean[] input = new boolean[] {true};
        boolean result = Check.mono(input);
        assertThat(result, is(true));
    }

    @Test
    public void whenDataMonoByFalseThenTrue() {
        boolean[] input = new boolean[] {false, false, false};
        boolean result = Check.mono(input);
        assertThat(result, is(true));
    }

    @Test
    public void whenDataMonoByOneFalseThenTrue() {
        boolean[] input = new boolean[] {false};
        boolean result = Check.mono(input);
        assertThat(result, is(true));
    }

    @Test
    public void whenDataNotMonoByTrueThenFalse() {
        boolean[] input = new boolean[] {true, false, true};
        boolean result = Check.mono(input);
        assertThat(result, is(false));
    }

    @Test
    public void whenDataNotMonoByOneLastFalseThenFalse() {
        boolean[] input = new boolean[] {true, true, true, false};
        boolean result = Check.mono(input);
        assertThat(result, is(false));
    }

    @Test
    public void whenDataEmpty() {
        boolean[] input = {};
        boolean result = Check.mono(input);
        assertThat(result, is(true));
    }
}