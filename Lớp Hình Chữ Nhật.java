import java.util.Scanner;

class Hcn {
    private int rong, cao;
    private String mausac;

    public Hcn() {}

    public Hcn(int rong, int cao, String mausac) {
        this.rong = rong;
        this.cao = cao;
        this.mausac = mausac;
    }

    public void chuanhoa() {
        String[] words = mausac.split("\\s+");
        StringBuilder res = new StringBuilder();
        for (String w : words) {
            if (!w.isEmpty()) {
                res.append(Character.toUpperCase(w.charAt(0)));
                if (w.length() > 1) {
                    res.append(w.substring(1).toLowerCase());
                }
            }
        }
        mausac = res.toString();
    }

    public long dientich() {
        return (long) rong * cao;
    }

    public long chuvi() {
        return 2L * (rong + cao);
    }

    public void in() {
        if (rong > 0 && cao > 0) {
            System.out.println(chuvi() + " " + dientich() + " " + mausac);
        } else {
            System.out.println("INVALID");
        }
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int rong = sc.nextInt();
        int cao = sc.nextInt();
        String mausac = sc.nextLine();
        Hcn a = new Hcn(rong, cao, mausac);
        a.chuanhoa();
        a.in();
    }
}
