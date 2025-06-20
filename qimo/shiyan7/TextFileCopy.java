package qimo.shiyan7;
import java.io.*;

public class TextFileCopy {
    public static void main(String[] args) {
        String source = "source.txt";
        String dest1 = "dest1.txt";
        String dest2 = "dest2.txt";
        String dest3 = "dest3.txt";

        // 1. 使用转换流
        try (Reader isr = new InputStreamReader(new FileInputStream(source));
             Writer osw = new OutputStreamWriter(new FileOutputStream(dest1))) {
            int c;
            while ((c = isr.read()) != -1) {
                osw.write(c);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        // 2. 使用字符流 - 字符方式
        try (FileReader fr = new FileReader(source);
             FileWriter fw = new FileWriter(dest2)) {
            int c;
            while ((c = fr.read()) != -1) {
                fw.write(c);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        // 3. 使用字符流 - 字符数组方式
        try (FileReader fr = new FileReader(source);
             FileWriter fw = new FileWriter(dest3)) {
            char[] buffer = new char[1024];
            int length;
            while ((length = fr.read(buffer)) > 0) {
                fw.write(buffer, 0, length);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        // 4. 使用缓冲字符流
        String dest4 = "dest4.txt";
        try (BufferedReader br = new BufferedReader(new FileReader(source));
             BufferedWriter bw = new BufferedWriter(new FileWriter(dest4))) {
            String line;
            while ((line = br.readLine()) != null) {
                bw.write(line);
                bw.newLine();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        System.out.println("文件拷贝完成");
    }
}