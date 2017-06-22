package Laba5;

public class Screen {

    public int x;
    public int y;
    private char[][] frame;

    public Screen(int xInp, int yInp) {
        x = xInp + 2;
        y = yInp + 2;
        frame = new char[y][x];
        for (int i = 0; i < y ; i++) {
            for (int j = 0; j < x; j++) {
                if (i == 0) {
                    frame[i][j] = '_';
                } else if (i == y - 1) {
                    frame[i][j] = '¯';
                } else if (j == 0 || j == x - 1) {
                    frame[i][j] = '|';
                } else {
                    frame[i][j] = ' ';
                }
            }
        }
    }

    public void print() {
        for (int i = 0; i < y; i++) {
            System.out.println();
            for (int j = 0; j < x; j++) {
                System.out.print(frame[i][j]);
            }
        }
    }

    public void setPixel(int xInp, int yInp) throws ExceptionSize {
        if (xInp == 0 || yInp == 0 || xInp > x - 2 || yInp > y - 2) {
            throw new ExceptionSize();
        } else {
            frame[yInp][xInp] = '*';
        }
    }
}
