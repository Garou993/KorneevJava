package ru.mirea.lab1;

public class class3 {
    public static void main(String[] args) {
        int[] a = new int[3];
        int s = 0;
        for (int i = 0; i<3; i++){
            a[i] = i+1;
            s+=a[i];
        }
        System.out.println(s+" "+s/3);
    }
}
