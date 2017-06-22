package Laba4;

public class Main {
    public static void main(String[] args) {
        Screen screen = new Screen(55, 20); // x, y

        Point leftDown = new Point(20, 8);
        Point rightUp = new Point(30, 3);
        Rectangle rec1 = new Rectangle(screen, leftDown, rightUp);
        rec1.draw();

        Point left = new Point(17, 9);
        Point right = new Point(33, 9);
        Line line1 = new Line(screen, left, right);
        line1.draw();

        leftDown = new Point(19, 18);
        rightUp = new Point(31, 10);
        Rectangle rec2 = new Rectangle(screen, leftDown, rightUp);
        rec2.draw();

        left = new Point(21, 12);
        right = new Point(22, 12);
        Line leftEye = new Line(screen, left, right);
        leftEye.draw();

        left = new Point(28, 12);
        right = new Point(29, 12);
        Line rightEye = new Line(screen, left, right);
        rightEye.draw();

        Point point = new Point(25, 15);
        Dot nose = new Dot(screen, point);
        nose.draw();

        left = new Point(21, 16);
        right = new Point(29, 16);
        Line mouth = new Line(screen, left, right);
        mouth.draw();

        Point lEye = new Point(22, 13);
        Dot el = new Dot(screen, lEye);
        el.draw();

        Point rEye = new Point(28, 13);
        Dot er = new Dot(screen, rEye);
        er.draw();

        Point hat = new Point(25, 5);
        Dot hatR = new Dot(screen, hat);
        hatR.draw();

        screen.print();
    }
}
