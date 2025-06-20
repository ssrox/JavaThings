package qimo.shiyan7;

import java.io.File;

public class ExeFileFinder {
    public static void main(String[] args) {
        File dir = new File("D:\\指定目录"); // 替换为实际目录路径

        if (dir.exists() && dir.isDirectory()) {
            File[] files = dir.listFiles((d, name) -> name.toLowerCase().endsWith(".exe"));

            if (files != null && files.length > 0) {
                System.out.println("找到的.exe文件:");
                for (File file : files) {
                    System.out.println(file.getName());
                }
            } else {
                System.out.println("没有找到.exe文件");
            }
        } else {
            System.out.println("目录不存在或不是有效目录");
        }
    }
}