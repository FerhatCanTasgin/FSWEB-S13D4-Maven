package org.example;

public class Point {
    private int x;
    private int y;
    public Point(int x, int y){
        this.x =x;
        this.y =y;
    }
    public int getX(){
        return x;
    }
    public int getY(){
        return y;
    }
    public void setX(int x){
        this.x = x;
    }
    public void setY(int y){
        this.y = y;
    }
    public double distance(){
        double netDistance = Math.sqrt((this.x * this.x) + (this.y * this.y));
        return netDistance;
    }
    public double distance(Point p){
        double deltaX = p.getX() - this.x;
        double deltaY = p.getY() - this.y;
        double netDistance = Math.sqrt((deltaX * deltaX) + (deltaY * deltaY));
        return netDistance;
    }
    public double distance(int a, int b) {
        double deltaX = a-this.x;
        double deltaY = b - this.y;
        double netDistance= Math.sqrt((deltaX * deltaX) + (deltaY * deltaY));
        return netDistance;
    }
}
