package com;

import org.junit.Assert;
import org.junit.Test;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;

import static org.junit.Assert.*;

public class FindTheWinnerTest {
    int[] firstArray = null;
    int[] secondArray = null;
    String type = null;

    @Test
    public void testFindTheWinner() {
        int seq = 0;
        populateInput(seq);
        String winner = FindTheWinner.winner(firstArray, secondArray, type);
        String expected = getOutput(seq);
        Assert.assertEquals(expected, winner);
    }

    @Test
    public void testFindTheWinner1() {
        int seq = 1;
        populateInput(seq);
        String winner = FindTheWinner.winner(firstArray, secondArray, type);
        String expected = getOutput(seq);
        Assert.assertEquals(expected, winner);
    }

    @Test
    public void testFindTheWinner2() {
        int seq = 2;
        populateInput(seq);
        String winner = FindTheWinner.winner(firstArray, secondArray, type);
        String expected = getOutput(seq);
        Assert.assertEquals(expected, winner);
    }

    @Test
    public void testFindTheWinner3() {
        int seq = 3;
        populateInput(seq);
        String winner = FindTheWinner.winner(firstArray, secondArray, type);
        String expected = getOutput(seq);
        Assert.assertEquals(expected, winner);
    }

    @Test
    public void testFindTheWinner4() {
        int seq = 4;
        populateInput(seq);
        String winner = FindTheWinner.winner(firstArray, secondArray, type);
        String expected = getOutput(seq);
        Assert.assertEquals(expected, winner);
    }

    @Test
    public void testFindTheWinner5() {
        int seq = 5;
        populateInput(seq);
        String winner = FindTheWinner.winner(firstArray, secondArray, type);
        String expected = getOutput(seq);
        Assert.assertEquals(expected, winner);
    }

    @Test
    public void testFindTheWinner6() {
        int seq = 6;
        populateInput(seq);
        String winner = FindTheWinner.winner(firstArray, secondArray, type);
        String expected = getOutput(seq);
        Assert.assertEquals(expected, winner);
    }

    @Test
    public void testFindTheWinner7() {
        int seq = 7;
        populateInput(seq);
        String winner = FindTheWinner.winner(firstArray, secondArray, type);
        String expected = getOutput(seq);
        Assert.assertEquals(expected, winner);
    }

    @Test
    public void testFindTheWinner8() {
        int seq = 8;
        populateInput(seq);
        String winner = FindTheWinner.winner(firstArray, secondArray, type);
        String expected = getOutput(seq);
        Assert.assertEquals(expected, winner);
    }

    @Test
    public void testFindTheWinner9() {
        int seq = 9;
        populateInput(seq);
        String winner = FindTheWinner.winner(firstArray, secondArray, type);
        String expected = getOutput(seq);
        Assert.assertEquals(expected, winner);
    }

    @Test
    public void testFindTheWinner10() {
        int seq = 10;
        populateInput(seq);
        String winner = FindTheWinner.winner(firstArray, secondArray, type);
        String expected = getOutput(seq);
        Assert.assertEquals(expected, winner);
    }

    @Test
    public void testFindTheWinner11() {
        int seq = 11;
        populateInput(seq);
        String winner = FindTheWinner.winner(firstArray, secondArray, type);
        String expected = getOutput(seq);
        Assert.assertEquals(expected, winner);
    }

    @Test
    public void testFindTheWinner12() {
        int seq = 12;
        populateInput(seq);
        String winner = FindTheWinner.winner(firstArray, secondArray, type);
        String expected = getOutput(seq);
        Assert.assertEquals(expected, winner);
    }

    @Test
    public void testFindTheWinner13() {
        int seq = 13;
        populateInput(seq);
        String winner = FindTheWinner.winner(firstArray, secondArray, type);
        String expected = getOutput(seq);
        Assert.assertEquals(expected, winner);
    }

    void populateInput(int sequence) {
        List<String> strings = null;
        int index1 = 0;
        String fileName = sequence < 10 ? "input00" + sequence + ".txt" : "input0" + sequence + ".txt";
        try {
            strings = Files.readAllLines(Paths.get("C:/Downloads/tests/FindTheWinner", fileName));
            index1 = Integer.parseInt(strings.get(0));
            int[] array = new int[index1];
            for (int index = 0; index < index1; index++) {
                array[index] = Integer.parseInt(strings.get(index + 1));
            }
            firstArray = array;
        } catch (IOException e) {
            e.printStackTrace();
        }

        int index2 = Integer.parseInt(strings.get(index1 + 1));
        secondArray = new int[index2];
        for (int index = 0; index < index2; index++) {
            secondArray[index] = Integer.parseInt(strings.get(index1 + index + 2));
        }

        type = strings.get(index1 + index2 + 2);
    }

    String getOutput(int sequence) {
        String fileName = sequence < 10 ? "output00" + sequence + ".txt" : "output0" + sequence + ".txt";
        try {
            List<String> strings = Files.readAllLines(Paths.get("C:/Downloads/tests/FindTheWinner", fileName));
            return strings.get(0);
        } catch (IOException e) {
            e.printStackTrace();
        }
        return "";
    }

}