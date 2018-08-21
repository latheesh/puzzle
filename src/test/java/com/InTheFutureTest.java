package com;

import org.junit.Assert;
import org.junit.Test;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;

import static org.junit.Assert.*;

public class InTheFutureTest {
    int A = 0;
    int K = 0;
    int P = 0;

    @Test
    public void minNum0() {
        int seq= 0;
        populateInput(seq);
        int minNum = InTheFuture.minNum(A, K, P);
        int expected = getOutput(seq);
        Assert.assertEquals(expected, minNum);
    }

    @Test
    public void minNum1() {
        int seq= 1;
        populateInput(seq);
        int minNum = InTheFuture.minNum(A, K, P);
        int expected = getOutput(seq);
        Assert.assertEquals(expected, minNum);
    }

    @Test
    public void minNum2() {
        int seq= 2;
        populateInput(seq);
        int minNum = InTheFuture.minNum(A, K, P);
        int expected = getOutput(seq);
        Assert.assertEquals(expected, minNum);
    }

    @Test
    public void minNum3() {
        int seq= 3;
        populateInput(seq);
        int minNum = InTheFuture.minNum(A, K, P);
        int expected = getOutput(seq);
        Assert.assertEquals(expected, minNum);
    }

    @Test
    public void minNum4() {
        int seq= 4;
        populateInput(seq);
        int minNum = InTheFuture.minNum(A, K, P);
        int expected = getOutput(seq);
        Assert.assertEquals(expected, minNum);
    }

    @Test
    public void minNum5() {
        int seq= 5;
        populateInput(seq);
        int minNum = InTheFuture.minNum(A, K, P);
        int expected = getOutput(seq);
        Assert.assertEquals(expected, minNum);
    }

    @Test
    public void minNum6() {
        int seq= 6;
        populateInput(seq);
        int minNum = InTheFuture.minNum(A, K, P);
        int expected = getOutput(seq);
        Assert.assertEquals(expected, minNum);
    }

    @Test
    public void minNum7() {
        int seq= 7;
        populateInput(seq);
        int minNum = InTheFuture.minNum(A, K, P);
        int expected = getOutput(seq);
        Assert.assertEquals(expected, minNum);
    }

    @Test
    public void minNum8() {
        int seq= 8;
        populateInput(seq);
        int minNum = InTheFuture.minNum(A, K, P);
        int expected = getOutput(seq);
        Assert.assertEquals(expected, minNum);
    }

    void populateInput(int seq) {
        try {
            List<String> strings = Files.readAllLines(Paths.get("C:\\Downloads\\tests\\InTheFuture", "input00" + seq + ".txt"));
            A = Integer.parseInt(strings.get(0));
            K = Integer.parseInt(strings.get(1));
            P = Integer.parseInt(strings.get(2));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    int getOutput(int seq)  {
        try {
            return Integer.parseInt(Files.readAllLines(Paths.get("C:\\Downloads\\tests\\InTheFuture", "output00" + seq + ".txt")).get(0));
        } catch (IOException e) {
            e.printStackTrace();
        }
        return -1;
    }
}