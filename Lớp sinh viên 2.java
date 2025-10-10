import java.util.*;
import java.io.*;
class student{
    private String ma,ten, ns,lop;
    private double gpa;
    student(){}
    public student(String ma,String ten,String lop, String ns,double gpa){
        this.ma = ma;
        this.lop = lop;
        this.ten = ten;
        this.ns = ns;
        this.gpa = gpa;
    }
    public void chuanHoaNs(){
        String []arr = ns.split("/");
        if(arr[0].length() == 1){
            arr[0] = "0" + arr[0];
        }
        if(arr[1].length() == 1){
            arr[1] = "0" + arr[1];
        }
        ns = arr[0] + "/" + arr[1] + "/" + arr[2];
    }
    public void in(){
        System.out.printf("%s %s %s %s %.1f\n",ma,ten,lop,ns,gpa);
    }
}
public class Main {

    public static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) throws IOException {
        student st = new student("SV001",sc.nextLine(),sc.nextLine(),sc.nextLine(),sc.nextDouble());
        st.chuanHoaNs();
        st.in();
    }
}
