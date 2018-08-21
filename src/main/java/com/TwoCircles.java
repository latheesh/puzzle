package com;

import java.util.Arrays;
import java.util.Scanner;

public class TwoCircles {
    static String[] circles(String[] info) {
        int c1X, c1Y, c1R, c2X, c2Y, c2R;
        int X1, X2, R1, R2;
        String[] result = new String[info.length];
        for (int i = 0; i < info.length; i++) {
            String s = info[i];
            String[] split = s.split(" ");
            c1X = Integer.parseInt(split[0]);
            c1Y = Integer.parseInt(split[1]);
            c1R = Integer.parseInt(split[2]);
            c2X = Integer.parseInt(split[3]);
            c2Y = Integer.parseInt(split[4]);
            c2R = Integer.parseInt(split[5]);
            if (c1X > 0) {
                if (c1X > c2X) {
                    X1 = c2X;
                    R1 = c2R;
                    X2 = c1X;
                    R2 = c1R;
                } else {
                    X1 = c1X;
                    R1 = c1R;
                    X2 = c2X;
                    R2 = c2R;
                }
            } else {
                if (c1Y > c2Y) {
                    X1 = c2Y;
                    R1 = c2R;
                    X2 = c1Y;
                    R2 = c1R;
                } else {
                    X1 = c1Y;
                    R1 = c1R;
                    X2 = c2Y;
                    R2 = c2R;
                }
            }
            if (X1 == X2) {
                result[i] = "Concentric";
            } else if ((X1 + R1 == X2 + R2) || (X1 - R1 == X2 - R2) || (X1 + R1 == X2 - R2)) {
                result[i] = "Touching";
            } else if ( (X1 + R1 < X2 +R2 ) && (X1 - R1 < X2 - R2) &&(X1+R1 > X2 || X1 +R1 > X2-R2)) {
                result[i] = "Intersecting";
            } else if (X1 + R1 < X2 - R2) {
                result[i] = "Disjoint-Outside";
            } else if ((X1 + R1 < X2 + R2) || (X1 + R1 > X2 + R2)) {
                result[i] = "Disjoint-Inside";
            }

        }
        return result;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int size = Integer.parseInt(scanner.nextLine());
        String[] circles = new String[size];
        for (int i = 0; i < size; i++) {
            circles[i] = scanner.nextLine();
        }
        String[] circles1 = circles(circles);
        for (int i = 0; i < circles1.length; i++) {
            String s = circles1[i];
            System.out.println(s);
        }
    }
}
