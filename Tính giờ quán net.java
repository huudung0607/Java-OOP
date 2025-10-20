import java.io.*;
import java.util.*;

class quanNet{
    private String username, pass, name, in, out;
    private int totalPhut;

    public quanNet(String username, String pass, String name, String in, String out) {
        this.username = username;
        this.pass = pass;
        this.name = name;
        this.in = in;
        this.out = out;
    }
    public int getGio(){
        String []vo = in.split(":");
        String []ra = out.split(":");
        int gioVo = Integer.parseInt(vo[0]);
        int phutVo = Integer.parseInt(vo[1]);
        int gioRa = Integer.parseInt(ra[0]);
        int phutRa = Integer.parseInt(ra[1]);
        return gioRa - gioVo;
    }
    public int getPhut(){
        String []vo = in.split(":");
        String []ra = out.split(":");
        int gioVo = Integer.parseInt(vo[0]);
        int phutVo = Integer.parseInt(vo[1]);
        int gioRa = Integer.parseInt(ra[0]);
        int phutRa = Integer.parseInt(ra[1]);
        return phutRa - phutVo;
    }
    public int getTotalPhut() {
        int getGio = getGio();
        int getPhut = getPhut();
        return getGio * 60 + getPhut();
    }

    public String getUsername() {
        return username;
    }
    public void print(){
        int gio = getGio();
        int phut = getPhut();
        if(phut < 0){
            phut = phut + 60;
            gio--;
        }
        System.out.print(username + " " + pass + " " + name + " " + gio + " gio " + phut + " phut " + "\n");
    }
}
public class Main {
    public static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        int n = Integer.parseInt(sc.nextLine());
        Vector<quanNet> v = new Vector<>();
        for(int i = 0;i < n;i++){
            quanNet qn = new quanNet(sc.nextLine(),sc.nextLine(),sc.nextLine(),sc.nextLine(),sc.nextLine());
            v.add(qn);
        }
        Collections.sort(v, new Comparator<quanNet>() {
            @Override
            public int compare(quanNet o1, quanNet o2) {
                if(o1.getTotalPhut() != o2.getTotalPhut()){
                    return Integer.compare(o2.getTotalPhut(),o1.getTotalPhut());
                }
                return o1.getUsername().compareTo(o2.getUsername());
            }
        });
        for(quanNet x : v){
            x.print();
        }
    }
}
