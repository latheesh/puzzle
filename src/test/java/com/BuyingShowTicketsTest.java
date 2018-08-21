package com;

import org.junit.Test;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.concurrent.atomic.AtomicInteger;

import static org.junit.Assert.*;

public class BuyingShowTicketsTest {

    @org.junit.Test
    public void waitingTime() {
        int[] tickets = {2, 6, 3, 4, 5};
        int p = 2;
        long waitingTime = BuyingShowTickets.waitingTime(tickets, p);
        assertEquals(12, waitingTime);
    }

    @Test
    public void waitingTime2() {
        int[] tickets = {5, 5, 2, 3};
        long waitingTime = BuyingShowTickets.waitingTime(tickets, 3);
        assertEquals(11, waitingTime);
    }

    @Test
    public void waitingTime3() throws IOException {
        int[] tickets = getTickets(607, "input003.txt");
        long waitingTime = BuyingShowTickets.waitingTime(tickets, 334);
        assertEquals(132409, waitingTime);
    }

    @Test
    public void waitingTime4() throws IOException {
        int[] tickets = getTickets(489, "input004.txt");
        long waitingTime = BuyingShowTickets.waitingTime(tickets, 44);
        assertEquals(229702, waitingTime);
    }

    @Test
    public void waitingTime5() throws IOException {
        int[] tickets = getTickets(645, "input005.txt");
        long waitingTime = BuyingShowTickets.waitingTime(tickets, 611);
        assertEquals(224604, waitingTime);
    }

    @Test
    public void waitiingTime6() throws IOException {
        int[] tickets = getTickets(6124,"input006.txt");
        long waitingTime = BuyingShowTickets.waitingTime(tickets, 2573);
        assertEquals(627787, waitingTime);
    }

    @Test
    public void waitingTime7() throws IOException {
        int[] tickets = getTickets(32343, "input007.txt");
        long waitingTime = BuyingShowTickets.waitingTime(tickets, 8979);
        assertEquals(11018494, waitingTime);
    }

    @Test
    public void waitingTime8() throws IOException {
        int[] tickets = getTickets(100000, "input008.txt");
        long waitingTime = BuyingShowTickets.waitingTime(tickets, 59838);
        assertEquals(42695856151944L, waitingTime);

    }

    @Test
    public void waitingTime9() throws IOException {
        int[] tickets = getTickets(100000, "input009.txt");
        long waitingTime = BuyingShowTickets.waitingTime(tickets, 59049);
        assertEquals(45870833533794L, waitingTime);
    }

    @Test
    public void waitingTime10() throws IOException {
        int[] tickets = getTickets(100000, "input010.txt");
        long waitingTime = BuyingShowTickets.waitingTime(tickets, 86710);
        assertEquals(48371158344327L, waitingTime);
    }

    @Test
    public void waitingTime11() throws IOException {
        int[] tickets = getTickets(100000, "input011.txt");
        long waitingTime = BuyingShowTickets.waitingTime(tickets, 99999);
        assertEquals(43039822290870L, waitingTime);
    }

    private int[] getTickets(int arraySize, String fileName) throws IOException {
        int[] tickets = new int[arraySize];
        AtomicInteger atomicInteger = new AtomicInteger();
        Files.lines(Paths.get("C:\\Downloads\\tests\\BuyingShowTickets",fileName)).forEach(s -> {
            if(atomicInteger.get() > 0 && atomicInteger.get() <= arraySize)
                tickets[atomicInteger.get() -1] = Integer.parseInt(s);

            atomicInteger.incrementAndGet();
        });
        return tickets;
    }
}