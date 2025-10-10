import java.util.*;
import java.io.*;
class nhanvien{
    private String ma,ten,gt,ns,dc,mst,nkhd;
    nhanvien(){}
    public nhanvien(String ma, String ten, String gt, String ns, String dc, String mst, String nkhd){
        this.ma = ma;
        this.ten = ten;
        this.gt = gt;
        this.ns = ns;
        this.dc = dc;
        this.mst = mst;
        this.nkhd = nkhd;
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
    public void chuanHoaNKHD(){
        String []arr = nkhd.split("/");
        if(arr[0].length() == 1){
            arr[0] = "0" + arr[0];
        }
        if(arr[1].length() == 1){
            arr[1] = "0" + arr[1];
        }
        nkhd = arr[0] + "/" + arr[1] + "/" + arr[2];
    }
    public void chuanHoaTen(){
        String []arr = ten.trim().toLowerCase().split("\\s+");
        String res = "";
        for(var x : arr){
            res += Character.toUpperCase(x.charAt(0));
            for(int i = 1;i < x.length();i++){
                res += x.charAt(i);
            }
            res += " ";
        }
        ten = res.trim();
    }
    public void in(){
        System.out.printf("%s %s %s %s %s %s %s",ma,ten,gt,ns,dc,mst,nkhd);
    }
}
public class Main {

    public static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) throws IOException {
        nhanvien nv = new nhanvien("00001",sc.nextLine(),sc.nextLine(),sc.nextLine(),sc.nextLine(),sc.nextLine(),sc.nextLine());
        nv.chuanHoaNKHD(); nv.chuanHoaNS();
        nv.chuanHoaTen();
        nv.in();
    }
}
