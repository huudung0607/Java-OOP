import jdk.jshell.Snippet;

import java.io.*;
import java.util.*;
class sinhVien{
    private String ma,ten,lop,email;

    public sinhVien(String ma, String ten, String lop, String email) {
        this.ma = ma;
        this.ten = ten;
        this.lop = lop;
        this.email = email;
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
        ten = res.trim();
    }
    public String getLop() {
        String res = "";
        for(int i = 0;i < lop.length();i++){
            if(Character.isAlphabetic(lop.charAt(i))){
                res += lop.charAt(i);
            }
        }
        return res;
    }
    public String getMa() {
        return ma;
    }
    public void print(){
        System.out.println(ma + " " + ten + " " + lop + " " + email);
    }
}
public class Main {
    public static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        int n = Integer.parseInt(sc.nextLine());
        Vector<sinhVien> v = new Vector<>();
        for(int i = 0;i < n ;i++){
            sinhVien sv = new sinhVien(sc.nextLine(),sc.nextLine(),sc.nextLine(),sc.nextLine());
            sv.chuanHoaTen();
            v.add(sv);
        }
        int q = Integer.parseInt(sc.nextLine());
        for(int i = 0;i < q;i++) {
            String lp = sc.nextLine();
            if (lp.equals("CNTT")) {
                System.out.println("DANH SACH SINH VIEN NGANH CONG NGHE THONG TIN :");
                for (var x : v){
                    if (x.getLop().equals(lp)) {
                        x.print();
                    }
                }
            }
            if (lp.equals("DTVT")) {
                System.out.println("DANH SACH SINH VIEN NGANH DIEN TU VIEN THONG :");
                for (var x : v) {
                    if (x.getLop().equals(lp)) {
                        x.print();
                    }
                }
            }
            if (lp.equals("KT")) {
                System.out.println("DANH SACH SINH VIEN NGANH KE TOAN : ");
                for (var x : v) {
                    if (x.getLop().equals(lp)) {
                        x.print();
                    }
                }
            }
            if (lp.equals("MKT")) {
                System.out.println("DANH SACH SINH VIEN NGANH MARKETING : ");
                for (var x : v) {
                    if (x.getLop().equals(lp))
                    {
                        x.print();
                    }
                }
            }
        }
    }
}
