package ru.netology;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class MainTest {
@Test
public void testMerge1() {
    final int[] argument1 = {45, 31, 24, 22, 20, 17, 14, 13, 12, 10};
    final int[] argument2 = {31, 18, 15, 12, 10, 8, 6, 4, 2, 1};
    final int[] expected = {45, 31, 31, 24, 22, 20, 18, 17, 15, 14};

    final int[] result = Main.merge(argument1, argument2);

    Assert.assertArrayEquals(expected, result);
}

    @Test
    public void testMerge2() {
        final int[] argument1 = {45, 31, 31, 24};
        final int[] argument2 = {51, 30, 10};
        final int[] expected = {51, 45, 31, 31, 30, 24, 10};

        final int[] result = Main.merge(argument1, argument2);

        Assert.assertArrayEquals(expected, result);
    }

    @Test
    public void testMergeAll() {
        final int[][] argument = {
                {45, 31, 24, 22, 20, 17, 14, 13, 12, 10},
                {31, 18, 15, 12, 10, 8, 6, 4, 2, 1},
                {51, 30, 10, 9, 8, 7, 6, 5, 2, 1}
        };
        final int[] expected = {51, 45, 31, 31, 30, 24, 22, 20, 18, 17};

        final int[] result = Main.mergeAll(argument);

        Assert.assertArrayEquals(expected, result);
    }
}