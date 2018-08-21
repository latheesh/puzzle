package com;

import java.sql.Time;
import java.time.Clock;
import java.util.*;

public class BuyingShowTickets {
    static long waitingTime(int[] tickets, int p) {
        long pendingTicketOfP = tickets[p];
        long waitCount = 0;
        long queueLength = tickets.length;
        TreeMap<Integer, List<Integer>> ticketMap = new TreeMap<>();
        for (int i = 0; i < tickets.length; i++) {
            ticketMap.computeIfAbsent(tickets[i], integer -> new ArrayList<>()).add(i);
        }

        long ticketsPurchasedSoFar = 0;

        Set<Integer> integers = ticketMap.keySet();
        for (Integer ticket : integers) {

            if (ticketsPurchasedSoFar - ticket == 0) {
                queueLength -= ticketMap.get(ticket).size();
                continue;
            }
            if (tickets[p] <= ticket) {
                waitCount = waitCount + (pendingTicketOfP - 1) * queueLength + queueLengthAheadOfP(tickets, p, ticketsPurchasedSoFar);
                return waitCount;
            }

            waitCount = waitCount + (ticket - ticketsPurchasedSoFar) * queueLength;
            pendingTicketOfP = pendingTicketOfP - (ticket - ticketsPurchasedSoFar);
            ticketsPurchasedSoFar = ticketsPurchasedSoFar + (ticket - ticketsPurchasedSoFar);
            queueLength -= ticketMap.get(ticket).size();
        }
        return -1;

    }

    static long queueLengthAheadOfP(int[] tickets, long pIndex, long purchasedTicket) {
        long queueLength = 0;
        for (int i = 0; i <= pIndex; i++) {
            int ticket = tickets[i];
            if (ticket > purchasedTicket)
                ++queueLength;
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
