import java.util.*;
import java.io.*;
class matrix{
    private int [][]v;
    private int hang,cot;
    public matrix(int hang,int cot, Scanner sc){
        this.hang = hang;
        this.cot = cot;
        v = new int[hang][cot];
        for(int i = 0;i < hang;i++){
            for(int j = 0;j < cot;j++){
                v[i][j] = sc.nextInt();
            }
        }
    }
    public matrix(int hang,int cot){
        this.hang = hang;
        this.cot = cot;
        v = new int[hang][cot];
    }
    public matrix mul(matrix other){
        int n = hang, m = cot, p = other.cot;
        matrix tmp = new matrix(n,p);
        for(int i = 0;i < n;i++){
            for(int j = 0;j < p;j++){
                for(int k = 0;k < m;k++){
                    tmp.v[i][j] += v[i][k] * other.v[k][j];
                }
            }
        }
        return tmp;
    }
    public void print(){
        for(int i = 0;i < hang;i++){
            for(int j = 0;j < cot;j++){
                System.out.print(v[i][j] + " ");
            }
            System.out.println();
        }
    }
}
public class Main {
    public static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) throws IOException {
        int n = sc.nextInt(), m = sc.nextInt(), p = sc.nextInt();
        matrix a = new matrix(n,m,sc);
        matrix b = new matrix(m,p,sc);
        matrix c = a.mul(b);
        c.print();
    }
}
