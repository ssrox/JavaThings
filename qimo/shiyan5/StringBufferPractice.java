package qimo.shiyan5;

import java.util.Scanner;

public class StringBufferPractice {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // 第一部分：字符串反转
        String input = scanner.nextLine();
        String reversed = new StringBuffer(input).reverse().toString();
        System.out.println(reversed);

        // 第二部分：字符串拼接
        String[] arr = {"Java", "is", "powerful"};

        // 使用 String
        String resultStr = "";
        for (String s : arr) {
            resultStr += s + " ";
        }
        System.out.println(resultStr);

        // 使用 StringBuffer
        StringBuffer resultBuf = new StringBuffer();
        for (String s : arr) {
            resultBuf.append(s).append(" ");
        }
        System.out.println(resultBuf.toString());

        scanner.close();
    }
}