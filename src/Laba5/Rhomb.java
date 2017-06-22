package Laba5;

public class Rhomb extends Shape {
    public Screen screen;
    public Point point;

    public Rhomb(Screen screen, Point point) {
        this.screen = screen;
        this.point = point;
    }

    @Override
    public void makeLine(Point p0, Point p1) {}

    @Override
    public void makeLine(Point p0) throws ExceptionSize {
        screen.setPixel(p0.x + 2, p0.y);
        screen.setPixel(p0.x - 2, p0.y);
        screen.setPixel(p0.x, p0.y + 1);
        screen.setPixel(p0.x, p0.y - 1);
    }
    @Override
    public void draw() throws ExceptionSize {
        makeLine(point);
    }
}
