import jdk.jshell.Snippet;

import java.io.*;
import java.util.*;

class Student {
    private String name;
    private double[] scores = new double[10];
    private double averageScore;
    private int studentId;
    private static int count = 0;

    public static Scanner scanner = new Scanner(System.in);

    public void readStudent() {
        count++;
        this.studentId = count;
        scanner.nextLine(); // consume the newline
        this.name = scanner.nextLine();
        this.averageScore = 0;
        for (int i = 0; i < 10; i++) {
            this.scores[i] = scanner.nextDouble();
            this.averageScore += this.scores[i];
        }
        this.averageScore /= 10;
    }

    @Override
    public String toString() {
        StringBuilder result = new StringBuilder();
        result.append("HS").append(String.format("%02d", studentId)).append(" ").append(name).append(" ")
                .append(String.format("%.1f", averageScore)).append(" ");
        if (averageScore >= 9) {
            result.append("XUAT SAC");
        } else if (averageScore >= 8) {
            result.append("GIOI");
        } else if (averageScore >= 7) {
            result.append("KHA");
        } else if (averageScore >= 5) {
            result.append("TB");
        } else {
            result.append("YEU");
        }
        return result.toString();
    }

    public double getAverageScore() {
        return averageScore;
    }
}
public class Main {
    public static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        int n = Student.scanner.nextInt();
        Student[] students = new Student[n];
        for (int i = 0; i < n; i++) {
            students[i] = new Student();
            students[i].readStudent();
        }
        Arrays.sort(students, (a, b) -> Double.compare(b.getAverageScore(), a.getAverageScore()));
        for (Student student : students) {
            System.out.println(student);
        }
    }
}
