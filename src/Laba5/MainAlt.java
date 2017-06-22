package Laba5;

public class MainAlt {
    public static void main(String[] args) throws ExceptionSize {
        Screen screen = new Screen(55, 20); // x, y

        Point leftDown = new Point(20, 8);
        Point rightUp = new Point(30, 3);
        Rectangle rec1 = new Rectangle(screen, leftDown, rightUp);
        rec1.draw();

        Point left = new Point(17, 9);
        Point right = new Point(33, 9);
        Line line1 = new Line(screen, left, right);
        line1.draw();

        leftDown = new Point(18, 18);
        rightUp = new Point(32, 10);
        Rectangle rec2 = new Rectangle(screen, leftDown, rightUp);
        rec2.draw();

        Point point = new Point(25, 15);
        Dot nose = new Dot(screen, point);
        nose.draw();

        left = new Point(21, 16);
        right = new Point(29, 16);
        Line mouth = new Line(screen, left, right);
        mouth.draw();

        Point lEye = new Point(22, 12);
        Rhomb el = new Rhomb(screen, lEye);
        el.draw();

        Point rEye = new Point(28, 12);
        Rhomb er = new Rhomb(screen, rEye);
        er.draw();

        Point hat = new Point(25, 5);
        Rhomb hatR = new Rhomb(screen, hat);
        hatR.draw();
        screen.print();
    }
}
