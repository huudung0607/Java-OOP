import java.io.*;
import java.util.*;

class sinhVien{
    private String ma,ten,ns,lop;
    private double gpa;

    public sinhVien(String ma, String ten, String ns, String lop, double gpa) {
        this.ma = ma;
        this.ten = ten;
        this.ns = ns;
        this.lop = lop;
        this.gpa = gpa;
    }

    public String getMa() {
        return ma;
    }

    public String getTen() {
        return ten;
    }

    public String getNs() {
        return ns;
    }

    public String getLop() {
        return lop;
    }

    public double getGpa() {
        return gpa;
    }
    public void chuanHoaNS(){
        String []arr = ns.split("/");
        if(arr[0].length() == 1){
            arr[0] = "0" + arr[0];
        }
        if(arr[1].length() == 1){
            arr[1] = "0" + arr[1];
        }
        ns = arr[0] + "/" + arr[1] + "/" + arr[2];
    }
    public void chuanHoaTen(){
        String []arr = ten.trim().toLowerCase().split("\\s+");
        String res ="";
        for(var x : arr){
            res += Character.toUpperCase(x.charAt(0));
            for(int i = 1;i < x.length();i++){
                res += x.charAt(i);
            }
            res += " ";
        }
        res = res.trim();
        ten = res;
    }
    @Override
    public String toString() {
        return ma + " " + ten + " " + lop + " " + ns + " " + String.format("%.2f",gpa);
    }
}
public class Main {
    public static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        int n = Integer.parseInt(sc.nextLine());
        Vector<sinhVien> v = new Vector<>();
        for(int i = 0;i < n ;i++){
            String ten,ns,lop;
            double gpa;
            ten = sc.nextLine();
            lop = sc.nextLine();
            ns = sc.nextLine();
            gpa = sc.nextDouble();
            sc.nextLine();
            sinhVien sv = new sinhVien("SV" + String.format("%03d",i + 1),ten,ns,lop,gpa);
            sv.chuanHoaNS();
            sv.chuanHoaTen();
            v.add(sv);
        }
        for(sinhVien x : v){
            System.out.println(x);
        }
    }
}
