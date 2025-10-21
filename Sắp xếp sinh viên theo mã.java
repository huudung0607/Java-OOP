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

    public String getLop() {
        return lop;
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
        Vector<sinhVien> v = new Vector<>();
        while(sc.hasNext()){
            sinhVien sv = new sinhVien(sc.nextLine(),sc.nextLine(),sc.nextLine(),sc.nextLine());
            v.add(sv);
        }
        Collections.sort(v, new Comparator<sinhVien>() {
            @Override
            public int compare(sinhVien o1, sinhVien o2) {
                return o1.getMa().compareTo(o2.getMa());
            }
        });
        for(sinhVien x : v){
            x.print();
        }
    }
}
