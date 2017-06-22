package Laba4;


public class Line extends Shape {

    public Screen screen;
    public Point p1;
    public Point p2;

    public Line(Screen screen, Point left, Point right) {
        this.screen = screen;
        p1 = left;
        p2 = right;
    }

    @Override
    public void makeLine(Point p0, Point p1) {
        if (p0.x == p1.x && p0.y <= p1.y) {
            for (int y = p0.y; y <= p1.y; y++) {
                screen.setPixel(p0.x, y);
            }
        } else if (p0.x == p1.x && p0.y >= p1.y) {
            for (int y = p0.y; y >= p1.y; y--) {
                screen.setPixel(p0.x, y);
            }

        } else if (p0.y == p1.y && p0.x <= p1.x) {
            for (int x = p0.x; x <= p1.x; x++) {
                screen.setPixel(x, p0.y);
            }
        } else if (p0.y == p1.y && p0.x >= p1.x) {
            for (int x = p0.x; x >= p1.x; x--) {
                screen.setPixel(x, p0.y);
            }
        }
    }

    @Override
    public void makeLine(Point p0) {}

    @Override
    public void draw() {
        makeLine(p1, p2);
    }
}
