import java.util.*;
import java.io.*;
class nhanvien{
    private String ma,ten,chucvu;
    private int luongCoBan, soNgayCong, thuong, phuCap, thuNhap;
    nhanvien(String ma, String ten, int luongCoBan, int soNgayCong, String chucvu){
        this.ma = "NV01";
        this.ten = ten;
        this.thuong = 0;
        this.phuCap = 0;
        this.thuNhap = 0;
        this.luongCoBan = luongCoBan;
        this.soNgayCong = soNgayCong;
        this.chucvu = chucvu;
    }
    public void tinhLuong(){
        int luongThang = luongCoBan * soNgayCong;
        if (soNgayCong >= 25) {
            thuong = (int)(luongThang * 0.2);
        }
        else if (soNgayCong >= 22) {
            thuong = (int)(luongThang * 0.1);
        }
        else {
            thuong = 0;
        }
        if (chucvu.equals("GD")) {
            phuCap = 250000;
        }
        else if (chucvu.equals("PGD")) {
            phuCap = 200000;
        }
        else if (chucvu.equals("TP")) {
            phuCap = 180000;
        }
        else if (chucvu.equals("NV")) {
            phuCap = 150000;
        }
        thuNhap = luongThang + thuong + phuCap;
    }
    public void print(){
        System.out.print(ma + " " + ten + " " + (luongCoBan * soNgayCong) + " " + thuong + " " + phuCap + " "
                + thuNhap + "\n");
    }
}
public class Main {
    public static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) throws IOException {
        String ma,ten,chucVu;
        int luongCB,soNC;
        ten = sc.nextLine();
        luongCB = sc.nextInt(); soNC = sc.nextInt();
        sc.nextLine();
        chucVu = sc.nextLine();
        nhanvien nv = new nhanvien("NV01",ten,luongCB,soNC,chucVu);
        nv.tinhLuong();
        nv.print();
    }
}
