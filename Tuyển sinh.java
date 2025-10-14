import java.util.Scanner;

class HocSinh {
    private String ma, ten;
    private double toan, ly, hoa, diemtong, uutien, khuvuc;

    public HocSinh() {}

    public HocSinh(String ma, String ten, double toan, double ly, double hoa) {
        this.ma = ma;
        this.ten = ten;
        this.toan = toan;
        this.ly = ly;
        this.hoa = hoa;
        this.khuvuc = 0;
        this.diemtong = 0;
        this.uutien = 0;
    }

    public void diemUuTien() {
        String kv = ma.substring(0, 3);
        if (kv.equals("KV1")) {
            uutien = 0.5;
        }
        if (kv.equals("KV2")) {
            uutien = 1;
        }
        if (kv.equals("KV3")) {
            uutien = 2.5;
        }
        int c = 0;
        for (int i = 0; i < kv.length(); i++) {
            if (Character.isDigit(kv.charAt(i))) {
                c = kv.charAt(i) - '0';
            }
        }
        khuvuc = c;
        diemtong = toan + ly + hoa + uutien;
    }

    public void in() {
        System.out.printf("%s %s %.0f ", ma, ten, khuvuc);
        if (diemtong == (int) diemtong)
            System.out.printf("%d ", (int) diemtong);
        else
            System.out.printf("%.1f ", diemtong);

        if (diemtong < 24)
            System.out.print("TRUOT");
        else
            System.out.print("TRUNG TUYEN");
    }

}

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String ma = sc.nextLine();
        String ten = sc.nextLine();
        double toan = sc.nextDouble();
        double ly = sc.nextDouble();
        double hoa = sc.nextDouble();
        HocSinh hs = new HocSinh(ma, ten, toan, ly, hoa);
        hs.diemUuTien();
        hs.in();
        sc.close();
    }
}
