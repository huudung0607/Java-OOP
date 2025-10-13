import java.util.Scanner;

class point {
    private double x, y;

    public point(double x , double y) {
        this.x = x;
        this.y = y;
    }

    public double getDistance(point p) {
        return Math.sqrt((x - p.x) * (x - p.x) + (y - p.y) * (y - p.y));
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            double x1 = sc.nextDouble(), y1 = sc.nextDouble(), x2 = sc.nextDouble(), y2 = sc.nextDouble();
            point p1 = new point(x1 , y1);
            point p2 = new point(x2 , y2);
            System.out.printf("%.4f\n" , p1.getDistance(p2));
        }
    }
}
