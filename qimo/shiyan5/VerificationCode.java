package qimo.shiyan5;

import java.util.Random;
import java.util.Scanner;

public class VerificationCode {
    public static void main(String[] args) {
        String codeChars = "0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz";
        Random random = new Random();
        StringBuilder code = new StringBuilder();

        for (int i = 0; i < 6; i++) {
            int index = random.nextInt(codeChars.length());
            code.append(codeChars.charAt(index));
        }

        System.out.println("验证码：" + code);
        System.out.print("请输入验证码：");
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        scanner.close();

        if (input.equalsIgnoreCase(code.toString())) {
            System.out.println("恭喜验证成功！");
        } else {
            System.out.println("验证失败！");
        }
    }
}