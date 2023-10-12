package ru.mirea.kabo0222.task10;

import java.util.Scanner;

public class Main {
    public static int reverse(int n, int reverse) {
        if (n == 0) {
            return reverse;
        }
        return reverse(n / 10, reverse * 10 + n % 10);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите число: ");
        int n = scanner.nextInt();
        int reversedNumber = reverse(n, 0);
        System.out.println("Число, записанное в обратном порядке: " + reversedNumber);
    }
}
