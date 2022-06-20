import java.util.*;

class Point {
    int x;
    int y;

    Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public Point mid(Point p) {
        int x1 = ((x + p.x) / 2);
        // int y1 = y;
        int y1 = ((p.y + y) / 2);
        return (new Point(x1, y1));
    }

    public String toString() {
        return "(" + this.x + "," + this.y + ")";
    }
}

public class Test {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            int x1, y1;
            int x2, y2;
            x1 = sc.nextInt();

            y1 = sc.nextInt();
            x2 = sc.nextInt();
            y2 = sc.nextInt();
            Point p1 = new Point(x1, y1);
            Point p2 = new Point(x2, y2);
            Point p3 = p1.mid(p2);
            System.out.println(p3);
        }
    }
}