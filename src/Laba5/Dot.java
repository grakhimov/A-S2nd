package Laba5;

public class Dot extends Shape {
    public Screen screen;
    public Point point;

    public Dot(Screen screen, Point point) {
        this.screen = screen;
        this.point = point;
    }

    @Override
    public void makeLine(Point p0, Point p1) {}

    @Override
    public void makeLine(Point p0) throws ExceptionSize {
        screen.setPixel(p0.x, p0.y);
    }
    @Override
    public void draw() throws ExceptionSize {
        makeLine(point);
    }
}
