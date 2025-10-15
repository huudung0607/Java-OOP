import java.util.*;
import java.io.*;
class IntSet{
    private TreeSet<String> se = new TreeSet<>();
    public IntSet(Vector<String> v){
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
    public IntSet union(IntSet other){
        IntSet tmp = new IntSet(new Vector<>());
        for(var x : se){
            tmp.se.add(x);
        }
        for(var x : other.se){
            tmp.se.add(x);
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
        Vector<String> a = new Vector<>();
        Vector<String> b = new Vector<>();
        String line = sc.nextLine();
        String line2 = sc.nextLine();
        for(var tmp : line.trim().split("\\s+")){
            a.add(tmp);
        }
        for(var tmp : line2.trim().split("\\s+")){
            b.add(tmp);
        }
        IntSet s1 = new IntSet(a);
        IntSet s2 = new IntSet(b);
        IntSet s3 = s1.union(s2);
        s3.in();
        System.out.println();
        s3 = s1.intersection(s2);
        s3.in();
    }
}
