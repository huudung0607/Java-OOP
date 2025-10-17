import java.io.*;
import java.util.*;

class product{
    private String ma,ten,donvi;
    private int giaMua,giaBan;
    public product(String ma, String ten, String donvi, int giaMua, int giaBan) {
        this.ma = ma;
        this.ten = ten;
        this.donvi = donvi;
        this.giaMua = giaMua;
        this.giaBan = giaBan;
    }
    public int getGiaBan() {
        return giaBan;
    }

    public int getGiaMua() {
        return giaMua;
    }

    public String getDonvi() {
        return donvi;
    }

    public String getTen() {
        return ten;
    }

    public String getMa() {
        return ma;
    }
    public int getLoiNhuan(){
        return giaBan - giaMua;
    }
    public void print(){
        System.out.println(ma + " " + ten + " " + donvi + " " + giaMua + " " +  giaBan + " " + (giaBan - giaMua));
    }
}
public class Main {
    public static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        int n = Integer.parseInt(sc.nextLine());
        Vector<product> v = new Vector<>();
        for(int i = 0;i < n ;i++){
            String ten,donvi;
            int giaMua,giaBan;
            ten = sc.nextLine();
            donvi = sc.nextLine();
            giaMua = sc.nextInt();
            giaBan = sc.nextInt();
            sc.nextLine();
            product pd = new product("MH" + String.format("%04d",i + 1),ten,donvi,giaMua,giaBan);
            v.add(pd);
        }
        Collections.sort(v, new Comparator<product>() {
            @Override
            public int compare(product o1, product o2) {
                if(o1.getLoiNhuan() == o2.getLoiNhuan()){
                    return o1.getMa().compareTo(o2.getMa());
                }
                return o2.getLoiNhuan() - o1.getLoiNhuan();
            }
        });
        for(product x : v){
            x.print();
        }
    }
}
