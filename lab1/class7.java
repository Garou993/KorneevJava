package ru.mirea.lab1;

public class class7 {
    public static int fact(int n){
        int ans = 1;
        for (int i = n; i>1; i--){
            ans*=i;
        }
        return ans;
    }

    public static void main(String[] args) {
        System.out.println(fact(3));
    }
}
