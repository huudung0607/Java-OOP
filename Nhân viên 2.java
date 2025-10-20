import java.io.*;
import java.util.*;

class nhanVien{
    private String ma,ten,gt,ns,diaChi,mst,ngayKi;

    public nhanVien(String ma, String ten, String gt, String ns, String diaChi, String mst, String ngayKi) {
        this.ma = ma;
        this.ten = ten;
        this.gt = gt;
        this.ns = ns;
        this.diaChi = diaChi;
        this.mst = mst;
        this.ngayKi = ngayKi;
    }

    public String getMa() {
        return ma;
    }

    public String getTen() {
        return ten;
    }

    public String getGt() {
        return gt;
    }

    public String getNs() {
        return ns;
    }

    public String getDiaChi() {
        return diaChi;
    }

    public String getMst() {
        return mst;
    }

    public String getNgayKi() {
        return ngayKi;
    }
    public void chuanHoaTen(){
        String []arr = ten.trim().toLowerCase().split("\\s+");
        String res = "";
        for(var tmp : arr){
            res += Character.toUpperCase(tmp.charAt(0));
            for(int j = 1;j < tmp.length();j++){
                res += tmp.charAt(j);
            }
            res += " ";
        }
        ten = res.trim();
    }
    public void chuanHoaNS(){
        String[]arr = ns.split("/");
        if(arr[0].length() == 1){
            arr[0] = "0" + arr[0];
        }
        if(arr[1].length() == 1){
            arr[1] = "0" + arr[1];
        }
        ns = arr[0] + "/" + arr[1] + "/" + arr[2];
    }
    public void chuanHoaNgayKi(){
        String[]arr = ngayKi.split("/");
        if(arr[0].length() == 1){
            arr[0] = "0" + arr[0];
        }
        if(arr[1].length() == 1){
            arr[1] = "0" + arr[1];
        }
        ngayKi = arr[0] + "/" + arr[1] + "/" + arr[2];
    }
    public String getNS(){
        String []arr = ns.split("/");
        return arr[2] + "/" + arr[1] + "/" + arr[0];
    }
    @Override
    public String toString() {
        return ma + " " + ten + " " + gt + " " + ns + " " + diaChi + " " + mst + " " + ngayKi + "\n";
    }
}
public class Main {
    public static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        int n = Integer.parseInt(sc.nextLine());
        Vector<nhanVien> v = new Vector<>();
        for(int i = 0;i < n ;i++){
            nhanVien nv = new nhanVien(String.format("%05d",i + 1),sc.nextLine(),sc.nextLine(),sc.nextLine(),sc.nextLine()
            ,sc.nextLine(),sc.nextLine());
            nv.chuanHoaNgayKi();nv.chuanHoaNS();
            v.add(nv);
        }
        Collections.sort(v, new Comparator<nhanVien>() {
            @Override
            public int compare(nhanVien o1, nhanVien o2) {
                if(o1.getNS().equals(o2.getNS())){
                    return o1.getMa().compareTo(o2.getMa());
                }
                return o1.getNS().compareTo(o2.getNS());
            }
        });
        for(nhanVien x : v){
            System.out.print(x);
        }
    }
}
