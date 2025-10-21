import java.util.*;
import java.io.*;

class Teacher {
    private int ma;
    private String ten, mon;

    public Teacher() {}

    public Teacher(int ma, String ten, String mon) {
        this.ma = ma;
        this.ten = ten;
        this.mon = mon;
    }

    public void chuanhoaten() {
        String[] parts = ten.split("\\s+");
        StringBuilder res = new StringBuilder();
        for (String tmp : parts) {
            if (tmp.length() > 0) {
                res.append(Character.toUpperCase(tmp.charAt(0)));
                for (int i = 1; i < tmp.length(); i++) {
                    res.append(Character.toLowerCase(tmp.charAt(i)));
                }
                res.append(" ");
            }
        }
        if (res.length() > 0) {
            res.setLength(res.length() - 1); // remove last space
        }
        ten = res.toString();
    }

    public void chuanhoaMon() {
        String[] parts = mon.split("\\s+");
        StringBuilder res = new StringBuilder();
        for (String tmp : parts) {
            if (tmp.length() > 0) {
                res.append(Character.toUpperCase(tmp.charAt(0)));
            }
        }
        mon = res.toString();
    }

    public String getTen() {
        String[] name = ten.split("\\s+");
        return name[name.length - 1];
    }

    public int getMa() {
        return ma;
    }

    public void in() {
        System.out.printf("GV%02d %s %s\n", ma, ten, mon);
    }
}

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        List<Teacher> v = new ArrayList<>();
        for (int i = 1; i <= n; i++) {
            String ten = br.readLine();
            String mon = br.readLine();
            Teacher gv = new Teacher(i, ten, mon);
            gv.chuanhoaMon();
            gv.chuanhoaten();
            v.add(gv);
        }
        Collections.sort(v, new Comparator<Teacher>() {
            public int compare(Teacher x, Teacher y) {
                int cmp = x.getTen().compareTo(y.getTen());
                if (cmp == 0) {
                    return Integer.compare(x.getMa(), y.getMa());
                }
                return cmp;
            }
        });
        for (Teacher x : v) {
            x.in();
        }
    }
}
