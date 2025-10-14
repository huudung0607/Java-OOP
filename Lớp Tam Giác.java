import java.util.*;
import java.io.*;
class point{
    private double x,y;
    point(double x, double y){
        this.x = x;
        this.y = y;
    }
    public double getDistance(point a){
        double xx = x - a.x;
        double yy = y - a.y;
        return Math.sqrt(xx * xx + yy * yy);
    }
    public double getArea(point a,point b){
        return 0.5 * Math.abs((a.x - x) * (b.y - y) - (b.x - x)*(a.y - y));
    }
}
public class Main {
    public static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) throws IOException {
        int t = sc.nextInt();
        while(t-- > 0){
            double x1 = sc.nextDouble();
            double y1 = sc.nextDouble();
            double x2 = sc.nextDouble();
            double y2 = sc.nextDouble();
            double x3 = sc.nextDouble();
            double y3 = sc.nextDouble();
            point A = new point(x1,y1);
            point B = new point(x2,y2);
            point C = new point(x3,y3);
            if (A.getDistance(B) + B.getDistance(C) > C.getDistance(A) || B.getDistance(C) + C.getDistance(A) > A.getDistance(B) ||
                    A.getDistance(B) + C.getDistance(A) > B.getDistance(C)) {
                System.out.printf("%.3f\s",A.getDistance(B) + B.getDistance(C) + C.getDistance(A));
                System.out.printf("%.3f\n",A.getArea(B,C));
            }
            else {
               System.out.println("INVALID");
            }
        }
    }
}
