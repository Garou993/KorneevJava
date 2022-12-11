package ru.mirea.lab1;

public class class4 {
    public static void main(String[] args) {
        int[] a = new int[3];
        int s = 0, max = Integer.MIN_VALUE, min = Integer.MAX_VALUE;
        int i = 0;
        while (i < 3){
            a[i] = i+1;
            s += a[i];
            if (a[i] > max){
                max = a[i];
            }
            if (a[i] < min){
                min = a[i];
            }
            i++;
        }
        System.out.println(s+" "+min+" "+max);
    }
}
