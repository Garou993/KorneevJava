package ru.mirea.lab2;

class Ball{
    private double x = 0;
    private double y = 0;

    public Ball(double x, double y){
        this.x = x;
        this.y = y;
    }
    public Ball(){};

    public double getX(){
        return x;
    }

    public void setX(double x){
        this.x = x;
    }

    public double getY(){
        return y;
    }

    public void setY(double y){
        this.y = y;
    }

    public void setXY(double x, double y){
        this.x = x;
        this.y = y;
    }

    public void move(double xDisp, double yDisp){
        x += xDisp;
        y += yDisp;
    }

    public String toString(){
        String str = x + " " + y;
        return str;
    }
}

public class class2 {
    public static void main(String[] args) {
        Ball a = new Ball(0, 0);
        a.setX(5);
        a.setY(5);
        System.out.println(a.toString());
        a.setXY(0,0);
        System.out.println(a.toString());
        a.move(3,-2);
        System.out.println(a.toString());
    }
}
