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
    public double getDienTich(point a, point b){
        return 0.5 * Math.abs((a.x - x)*(b.y - y) - (b.x - x)*(a.y - y));
    }

}

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            double x1 = sc.nextDouble(), y1 = sc.nextDouble(), x2 = sc.nextDouble(), y2 = sc.nextDouble(),x3 = sc.nextDouble(),y3 = sc.nextDouble();
            point A = new point(x1,y1);
            point B = new point(x2,y2);
            point C = new point(x3,y3);
            if (A.getDistance(B) + B.getDistance(C) > C.getDistance(A) || B.getDistance(C) + C.getDistance(A) > A.getDistance(B) ||
                    A.getDistance(B) + C.getDistance(A) > B.getDistance(C)) {
                System.out.printf("%.3f\s",A.getDistance(B) + B.getDistance(C) + C.getDistance(A));
                System.out.printf("%.3f\n",A.getDienTich(B,C));
            }
            else{
                System.out.println("INVALID");
            }
        }
    }
}
