import java.util.*;
import java.io.*;

class phanso{
    private long tu,mau;
    phanso(long tu,long mau){
        this.tu = tu;
        this.mau = mau;
    }
    public long gcd(long a,long b){
        if(b == 0) return a;
        return gcd(b, a % b);
    }
    public void rutGon(){
        long kq = gcd(tu,mau);
        tu /= kq;
        mau /= kq;
    }
    public phanso congPS(phanso a ,phanso b){
        long tuSo = a.tu * b.mau + a.mau * b.tu;
        long mauSo = a.mau * b.mau;
        phanso ps = new phanso(tuSo,mauSo);
        ps.rutGon();
        return ps;
    }
    public phanso nhanPS(phanso a, phanso b){
        long tuSo = a.tu * b.tu;
        long mauSo = a.mau * b.mau;
        phanso ps = new phanso(tuSo,mauSo);
        ps.rutGon();
        return ps;
    }
    public phanso powPS(){
        phanso ps = new phanso(tu*tu,mau*mau);
        return ps;
    }
    public void in(){
        System.out.print(tu + "/" + mau);
    }
}
public class Main {
    public static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) throws IOException {
        int t = sc.nextInt();
        while(t-- > 0){
            long x1 = sc.nextLong();
            long y1 = sc.nextLong();
            long x2 = sc.nextLong();
            long y2 = sc.nextLong();
            phanso a = new phanso(x1,y1);
            phanso b = new phanso(x2,y2);
            phanso c = new phanso(0,1);
            c = c.congPS(a,b).powPS();
            c.in();
            System.out.print(" ");
            phanso d = new phanso(0,1);
            d = d.nhanPS(a,b);
            phanso e = new phanso(0,1);
            e = e.nhanPS(d,c);
            e.in();
            System.out.println();
        }
    }
}
