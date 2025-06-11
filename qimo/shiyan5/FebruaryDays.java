package qimo.shiyan5;

import java.util.Scanner;

public class FebruaryDays {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int year = scanner.nextInt();
        scanner.close();

        boolean isLeapYear = (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);
        int days = isLeapYear ? 29 : 28;

        System.out.println(year + "年的二月有" + days + "天");
    }
}