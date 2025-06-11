package qimo.shiyan5;

import java.util.*;

class Student implements Comparable<Student> {
    private String name;
    private double score;

    public Student(String name, double score) {
        this.name = name;
        this.score = score;
    }

    public double getScore() {
        return score;
    }

    @Override
    public int compareTo(Student other) {
        return Double.compare(other.score, this.score);
    }

    @Override
    public String toString() {
        return name + ": " + score;
    }
}

public class TreeSetStudentSort {
    public static void main(String[] args) {
        TreeSet<Student> students = new TreeSet<>();
        students.add(new Student("张三", 85.5));
        students.add(new Student("李四", 92.0));
        students.add(new Student("王五", 78.3));
        students.add(new Student("赵六", 92.0));

        for (Student student : students) {
            System.out.println(student);
        }
    }
}
