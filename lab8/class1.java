package ru.mirea.lab8;

public class class1 {
    int n = 1;
    public void recursion(int N) {
        if(N == 0) {
            return ;
        }

        for(int i = 0; i < n; i++) {
            System.out.println(n);
        }

        n++;

        recursion(N - 1);
    }

    public static void main(String[] args) {
        class1 rec = new class1();
        rec.recursion(5);
    }
}
