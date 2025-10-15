import java.util.*;
import java.io.*;
class IntSet{
    private TreeSet<Integer> se = new TreeSet<>();
    public IntSet(Vector<Integer> v){
        se.addAll(v);
    }
    public IntSet intersection(IntSet other){
        IntSet tmp = new IntSet(new Vector<>());
        for(var x : other.se){
            if(se.contains(x)){
                tmp.se.add(x);
            }
        }
        return tmp;
    }
    public void in(){
        for(var x : se){
            System.out.print(x + " ");
        }
    }
}
public class Main {
    public static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) throws IOException {
        int n = sc.nextInt(), m = sc.nextInt();
        Vector<Integer> a = new Vector<>(n);
        Vector<Integer> b = new Vector<>(m);
        for(int i = 0;i < n;i++) a.add(sc.nextInt());
        for(int i = 0;i < m;i++) b.add(sc.nextInt());
        IntSet s1 = new IntSet(a);
        IntSet s2 = new IntSet(b);
        IntSet s3 = s1.intersection(s2);
        s3.in();
    }
}
