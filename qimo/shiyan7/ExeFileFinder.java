package qimo.shiyan7;

import java.io.File;

public class ExeFileFinder {
    public static void main(String[] args) {
        File dir = new File("D:\\ָ��Ŀ¼"); // �滻Ϊʵ��Ŀ¼·��

        if (dir.exists() && dir.isDirectory()) {
            File[] files = dir.listFiles((d, name) -> name.toLowerCase().endsWith(".exe"));

            if (files != null && files.length > 0) {
                System.out.println("�ҵ���.exe�ļ�:");
                for (File file : files) {
                    System.out.println(file.getName());
                }
            } else {
                System.out.println("û���ҵ�.exe�ļ�");
            }
        } else {
            System.out.println("Ŀ¼�����ڻ�����ЧĿ¼");
        }
    }
}