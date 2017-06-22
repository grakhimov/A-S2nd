package Laba5;

public abstract class Shape {
    public abstract void makeLine(Point p0, Point p1) throws ExceptionSize;
    public abstract void makeLine(Point p0) throws ExceptionSize;
    public abstract void draw() throws ExceptionSize;
}
