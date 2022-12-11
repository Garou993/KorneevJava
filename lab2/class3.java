package ru.mirea.lab2;

class Point{
    private double x;
    private double y;

    public Point(double x, double y){
        this.x = x;
        this.y = y;
    }
    public Point(){};

    public double getX(){
        return x;
    }

    public double getY(){
        return y;
    }
}

class Circle{
    private Point c;
    private double r;

    public Circle(Point c, double r){
        this.c = c;
        this.r = r;
    }
    public Circle(){};

    public String toString(){
        String str = "Center: " + c.getX() + " " + c.getY() + " Radius: " + r;
        return str;
    }
}

public class class3 {
    static Circle[] mas = new Circle[3];
    static int l = 3;

    public static void main(String[] args) {
        for (int i = 0; i < l; i++){
            Point p = new Point(0,0);
            mas[i] = new Circle(p, i+1);
            System.out.println(mas[i].toString());
        }
    }
}
