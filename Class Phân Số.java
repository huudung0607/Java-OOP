import java.util.*;
import java.io.*;
class phanSo{
    private long tu,mau;
    public phanSo(){}
    public phanSo(long tu, long mau){
        this.tu = tu;
        this.mau = mau;
    }
    public long gcd(long a, long b){
        if(b == 0) return a;
        return gcd(b, a % b);
    }
    public void toiGian(){
        long kq = gcd(Math.abs(tu),Math.abs(mau));
        tu /= kq;
        mau /= kq;
    }
    public void in(){
        System.out.print(tu + "/" + mau);
    }
}
public class Main {

    public static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) throws IOException {
        long tu = sc.nextLong(), mau = sc.nextLong();
        phanSo ps = new phanSo(tu,mau);
        ps.toiGian();
        ps.in();
    }
}
