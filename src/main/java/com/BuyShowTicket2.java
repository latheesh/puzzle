package com;

import java.util.Scanner;

public class BuyShowTicket2 {
    static long waitingTime(int[] tickets, int p) {
        int pendingTicketOfP = tickets[p];
        long waitCount = 0L;
        int index = 0;
        int queueLength = tickets.length;

        while (true) {
            int smallestPendingTicket = getSmallestValue(tickets);
            if (pendingTicketOfP <= smallestPendingTicket) {
                waitCount = waitCount + (pendingTicketOfP -1) * queueLength + queueLengthAheadOfP(tickets, p);
                return waitCount;
            }

            pendingTicketOfP -= smallestPendingTicket;
            waitCount = waitCount + smallestPendingTicket * queueLength;
            queueLength = reduceTicketCount(tickets, smallestPendingTicket);
        }
    }

    static int reduceTicketCount(int[] tickets, int purchasedTicket) {
        int queueCount = 0;
        for (int i = 0; i < tickets.length; i++) {
            if (tickets[i] > 0) {
                int pendingTicket = tickets[i] - purchasedTicket;
                tickets[i] = pendingTicket;
                if (pendingTicket > 0)
                    ++queueCount;
            }
        }
        return queueCount;
    }

    static int getSmallestValue(int[] tickets) {
        int smallest = Integer.MAX_VALUE;
        for (int i = 0; i < tickets.length; i++) {
            int pendingTecket = tickets[i];
            if (pendingTecket > 0) {
                smallest = Math.min(smallest, tickets[i]);
            }
        }
        return smallest;
    }

    static int queueLengthAheadOfP(int[] tickets, int pIndex) {
        int queueLength = 0;
        for (int i = 0; i <= pIndex; i++) {
            if (tickets[i] > 0) {
                ++queueLength;
            }
        }
        return queueLength;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int size = Integer.parseInt(scanner.nextLine());
        int[] tickets = new int[size];
        for (int i = 0; i < size; i++) {
            tickets[i] = Integer.parseInt(scanner.nextLine());
        }
        int p = Integer.parseInt(scanner.nextLine());
        long waitingTime = waitingTime(tickets, p);
        System.out.println(waitingTime);

    }
}
