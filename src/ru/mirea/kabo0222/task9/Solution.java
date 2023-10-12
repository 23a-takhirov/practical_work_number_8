package ru.mirea.kabo0222.task9;
public class Solution {
    public static int solve(int a, int b) {
    if (a > b + 1) {
        return 0;
    }
    if (a == 0 || b == 0) {
        return 1;
    }
    return solve(a, b - 1) + solve(a - 1, b - 1);
}
    public static void main(String[] args) {
        System.out.println(solve(0, 0));
}
}
