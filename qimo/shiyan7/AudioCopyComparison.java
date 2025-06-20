    package qimo.shiyan7;

    import java.io.*;

    public class AudioCopyComparison {
        public static void main(String[] args) {
            String sourceFile = "test.mp3"; // 替换为实际音频文件
            String destFile1 = "copy1.mp3";
            String destFile2 = "copy2.mp3";

            // 普通字节流
            long start1 = System.currentTimeMillis();
            try (InputStream is = new FileInputStream(sourceFile);
                 OutputStream os = new FileOutputStream(destFile1)) {
                byte[] buffer = new byte[1024];
                int length;
                while ((length = is.read(buffer)) > 0) {
                    os.write(buffer, 0, length);
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
            long end1 = System.currentTimeMillis();

            // 缓冲字节流
            long start2 = System.currentTimeMillis();
            try (InputStream is = new BufferedInputStream(new FileInputStream(sourceFile));
                 OutputStream os = new BufferedOutputStream(new FileOutputStream(destFile2))) {
                byte[] buffer = new byte[1024];
                int length;
                while ((length = is.read(buffer)) > 0) {
                    os.write(buffer, 0, length);
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
            long end2 = System.currentTimeMillis();

            System.out.println("普通字节流耗时: " + (end1 - start1) + "ms");
            System.out.println("缓冲字节流耗时: " + (end2 - start2) + "ms");
        }
    }