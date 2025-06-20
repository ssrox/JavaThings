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
        return Double.compare(other.score, this.score); // ��������
    }

    @Override
    public String toString() {
        return name + "," + score;
    }
}

public class StudentInfoManager {
    public static void main(String[] args) {
        String filePath = "students.txt";

        // д�������������
        try (Scanner scanner = new Scanner(System.in);
             PrintWriter writer = new PrintWriter(new FileWriter(filePath))) {
            System.out.println("����������(����exit����):");
            String input;
            while (!(input = scanner.nextLine()).equalsIgnoreCase("exit")) {
                writer.println(input);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        // ��ȡ����ʾ�ļ�����
        System.out.println("�ļ�����:");
        try (BufferedReader reader = new BufferedReader(new FileReader(filePath))) {
            String line;
            while ((line = reader.readLine()) != null) {
                System.out.println(line);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        // ¼��5��ѧ����Ϣ������洢
        List<Student> students = new ArrayList<>();
        try (Scanner scanner = new Scanner(System.in)) {
            for (int i = 0; i < 5; i++) {
                System.out.println("�������" + (i + 1) + "��ѧ������:");
                String name = scanner.nextLine();
                System.out.println("������" + name + "�ĳɼ�:");
                double score = scanner.nextDouble();
                scanner.nextLine(); // ���Ļ��з�
                students.add(new Student(name, score));
            }
        }

        Collections.sort(students);

        try (PrintWriter writer = new PrintWriter(new FileWriter(filePath, true))) {
            writer.println("\nѧ���ɼ�������:");
            for (Student student : students) {
                writer.println(student);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        System.out.println("ѧ����Ϣ�ѱ���");
    }
}