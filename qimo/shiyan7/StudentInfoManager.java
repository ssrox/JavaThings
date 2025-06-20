package qimo.shiyan7;

import java.io.*;
import java.util.*;

class Student implements Comparable<Student> {
    String name;
    double score;

    public Student(String name, double score) {
        this.name = name;
        this.score = score;
    }

    @Override
    public int compareTo(Student other) {
        return Double.compare(other.score, this.score); // 降序排序
    }

    @Override
    public String toString() {
        return name + "," + score;
    }
}

public class StudentInfoManager {
    public static void main(String[] args) {
        String filePath = "students.txt";

        // 写入键盘输入内容
        try (Scanner scanner = new Scanner(System.in);
             PrintWriter writer = new PrintWriter(new FileWriter(filePath))) {
            System.out.println("请输入内容(输入exit结束):");
            String input;
            while (!(input = scanner.nextLine()).equalsIgnoreCase("exit")) {
                writer.println(input);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        // 读取并显示文件内容
        System.out.println("文件内容:");
        try (BufferedReader reader = new BufferedReader(new FileReader(filePath))) {
            String line;
            while ((line = reader.readLine()) != null) {
                System.out.println(line);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        // 录入5个学生信息并排序存储
        List<Student> students = new ArrayList<>();
        try (Scanner scanner = new Scanner(System.in)) {
            for (int i = 0; i < 5; i++) {
                System.out.println("请输入第" + (i + 1) + "个学生姓名:");
                String name = scanner.nextLine();
                System.out.println("请输入" + name + "的成绩:");
                double score = scanner.nextDouble();
                scanner.nextLine(); // 消耗换行符
                students.add(new Student(name, score));
            }
        }

        Collections.sort(students);

        try (PrintWriter writer = new PrintWriter(new FileWriter(filePath, true))) {
            writer.println("\n学生成绩排序结果:");
            for (Student student : students) {
                writer.println(student);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        System.out.println("学生信息已保存");
    }
}