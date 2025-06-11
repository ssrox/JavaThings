package qimo.shiyan5;

import java.util.Scanner;

public class CharacterCounter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        scanner.close();

        StringBuilder upper = new StringBuilder();
        StringBuilder lower = new StringBuilder();
        StringBuilder digit = new StringBuilder();
        StringBuilder other = new StringBuilder();

        for (char c : input.toCharArray()) {
            if (Character.isUpperCase(c)) {
                upper.append(c);
            } else if (Character.isLowerCase(c)) {
                lower.append(c);
            } else if (Character.isDigit(c)) {
                digit.append(c);
            } else {
                other.append(c);
            }
        }

        System.out.println("大写字母:" + upper.length() + "个(" + upper + ")");
        System.out.println("小写字母:" + lower.length() + "个(" + lower + ")");
        System.out.println("数字:" + digit.length() + "个(" + digit + ")");
        System.out.println("其它字符:" + other.length() + "个(" + other + ")");
    }
}