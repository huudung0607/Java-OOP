import java.util.*;
import java.io.*;
class time{
    private int gio,phut,giay;
    public time(int gio, int phut, int giay){
        this.gio = gio;
        this.phut = phut;
        this.giay = giay;
    }
    public void print(){
        System.out.println(gio + " " + phut + " " + giay);
    }

    public int getGiay() {
        return giay;
    }
    public int getPhut() {
        return phut;
    }
    public int getGio() {
        return gio;
    }
}
public class Main {
    public static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) throws IOException {
        Vector<time> v = new Vector<>();
        int n = sc.nextInt();
        for(int i = 0;i < n ;i++){
            int gio = sc.nextInt(), phut = sc.nextInt(), giay = sc.nextInt();
            time t = new time(gio,phut,giay);
            v.add(t);
        }
        Collections.sort(v, new Comparator<time>() {
            @Override
            public int compare(time o1, time o2) {
                if(o1.getGio() == o2.getGio()){
                    if(o1.getPhut() == o2.getPhut()){
                        return o1.getGiay() - o2.getGiay();
                    }
                    else return o1.getPhut() - o2.getPhut();
                }
                return o1.getGio() - o2.getGio();
            }
        });
        for(var x : v){
            x.print();
        }
    }
}
