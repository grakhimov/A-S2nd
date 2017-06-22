package Laba5;

public class Rectangle extends Shape {

    public Point leftDown;
    public Point rightUp;
    public Screen screen;
    public Point p1;
    public Point p2;
    public Point p3;
    public Point p4;

    public Rectangle(Screen screen, Point leftDown, Point rightUp) {
        this.leftDown = leftDown;
        this.rightUp = rightUp;
        this.screen = screen;
        p1 = leftDown;
        p2 = new Point(leftDown.x, rightUp.y);
        p3 = rightUp;
        p4 = new Point(rightUp.x, leftDown.y);
    }

    @Override
    public void makeLine(Point p0, Point p1) throws ExceptionSize {
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
    public void draw() throws ExceptionSize {
        makeLine(p1, p2);
        makeLine(p2, p3);
        makeLine(p3, p4);
        makeLine(p4, p1);
    }
}
