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
            double ab = A.getDistance(B);
            double bc = B.getDistance(C);
            double ac = C.getDistance(A);
            if (ab > 0 && ac > 0 && bc > 0 && ab + ac > bc && ab + bc > ac && ac + bc > ab) {
                double cv = ab + bc + ac;
                double p = cv / 2;
                double dt = Math.sqrt(p * (p - ac) * (p - bc) * (p - ab));
                double r = (ab * bc * ac) / (4 * dt);
                System.out.printf("%.3f\n",r * r * 3.14);
            }
            else {
                System.out.print("INVALID");
            }
        }
    }
}
