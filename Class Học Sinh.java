import java.util.*;
import java.io.*;
class student{
    private String ten, ns;
    private double toan,ly,hoa;
    student(){}
    public student(String ten, String ns, double toan, double ly, double hoa){
        this.ten = ten;
        this.ns = ns;
        this.toan = toan;
        this.ly = ly;
        this.hoa = hoa;
    }
    public void in(){
        System.out.printf("%s %s %.1f\n",ten,ns,toan + ly + hoa);
    }
}
public class Main {

    public static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) throws IOException {
        student st = new student(sc.nextLine(),sc.nextLine(),sc.nextDouble(),sc.nextDouble(),sc.nextDouble());
        st.in();
    }
}
