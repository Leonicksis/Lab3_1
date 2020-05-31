package com.company;

public class Main {

    public static void main(String[] args) {
        Mtrx M = new Mtrx(3, 3, 10);
        M.Show();
        M.Swap(1);
        M.Show();
        M.sqr(5);
        M.Show();
    }
}
