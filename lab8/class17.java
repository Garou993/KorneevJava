package ru.mirea.lab8;

import java.util.Scanner;

public class class17 {
    public int recursion() {
        Scanner input = new Scanner(System.in);

        int N = input.nextInt();
        int max = N;

        if(N == 0) {
            return max;
        }

        max = Math.max(recursion(), N);

        return max;
    }

    public static void main(String[] args) {
        class17 maxSet = new class17();
        System.out.println(maxSet.recursion());
    }
}
