package com;

import org.junit.Assert;
import org.junit.Test;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.OptionalInt;
import java.util.function.ToIntFunction;
import java.util.stream.Stream;

import static org.junit.Assert.*;

public class ConsecutiveSumTest {

    @Test
    public void consecutive000() {
        int sequence = 0;
        int input = getInput("input00" + sequence + ".txt");
        int expected = getOutput("output00" + sequence + ".txt");
        int actual = ConsecutiveSum.consecutive(input);
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void consecutive001() {
        int sequence = 1;
        int input = getInput("input00" + sequence + ".txt");
        int expected = getOutput("output00" + sequence + ".txt");
        int actual = ConsecutiveSum.consecutive(input);
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void consecutive002() {
        int sequence = 2;
        int input = getInput("input00" + sequence + ".txt");
        int expected = getOutput("output00" + sequence + ".txt");
        int actual = ConsecutiveSum.consecutive(input);
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void consecutive003() {
        int sequence = 3;
        int input = getInput("input00" + sequence + ".txt");
        int expected = getOutput("output00" + sequence + ".txt");
        int actual = ConsecutiveSum.consecutive(input);
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void consecutive004() {
        int sequence = 4;
        int input = getInput("input00" + sequence + ".txt");
        int expected = getOutput("output00" + sequence + ".txt");
        int actual = ConsecutiveSum.consecutive(input);
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void consecutive005() {
        int sequence = 5;
        int input = getInput("input00" + sequence + ".txt");
        int expected = getOutput("output00" + sequence + ".txt");
        int actual = ConsecutiveSum.consecutive(input);
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void consecutive006() {
        int sequence = 6;
        int input = getInput("input00" + sequence + ".txt");
        int expected = getOutput("output00" + sequence + ".txt");
        int actual = ConsecutiveSum.consecutive(input);
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void consecutive007() {
        int sequence = 7;
        int input = getInput("input00" + sequence + ".txt");
        int expected = getOutput("output00" + sequence + ".txt");
        int actual = ConsecutiveSum.consecutive(input);
        Assert.assertEquals(expected, actual);
    }



    int getInput(String fileName) {
        try (Stream<String> lines = Files.lines(Paths.get("C:/Downloads/tests/ConsecutiveSum", fileName))) {
            OptionalInt any = lines.mapToInt(value -> Integer.parseInt(value)).findAny();
            return any.getAsInt();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return -1;
    }

    int getOutput(String fileName) {
        try {
            return Files.lines(Paths.get("C:/Downloads/tests/ConsecutiveSum", fileName)).mapToInt(value -> Integer.parseInt(value)).findAny().getAsInt();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return -1;
    }
}