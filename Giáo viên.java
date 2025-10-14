import java.util.*;
import java.io.*;
class teacher{
    private String ma,ten;
    private int luong;
    teacher(String ma, String ten, int luong){
        this.ma = ma;
        this.ten = ten;
        this.luong = luong;
    }
    public int getHeSo(){
        String res ="";
        for(int i = 0;i < ma.length();i++){
            if(Character.isDigit(ma.charAt(i))){
                res += ma.charAt(i);
            }
        }
        int ans = Integer.parseInt(res);
        return ans;
    }

    public String getTen() {
        return ten;
    }

    public String getMa() {
        return ma;
    }
    public int getLuong() {
        return luong;
    }
}
public class Main {
    public static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) throws IOException {
        teacher tc = new teacher(sc.nextLine(),sc.nextLine(),sc.nextInt());
        sc.nextLine();
        if(tc.getMa().charAt(1) == 'T'){
            long maxSalary = 1l * tc.getHeSo() * tc.getLuong() + 2000000;
            System.out.print(tc.getMa() + " " + tc.getTen() + " " + tc.getHeSo() + " " + maxSalary);
        }
        else if(tc.getMa().charAt(1) == 'P'){
            long maxSalary = 1l * tc.getHeSo() * tc.getLuong() + 900000;
            System.out.print(tc.getMa() + " " + tc.getTen() + " " + tc.getHeSo() + " " + maxSalary);
        }
        else{
            long maxSalary = 1l * tc.getHeSo() * tc.getLuong() + 500000;
            System.out.print(tc.getMa() + " " + tc.getTen() + " " + tc.getHeSo() + " " + maxSalary);
        }
    }
}
