package qimo.shiyan2;

import java.util.Scanner;

public class SumOfTenNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double sum = 0;

        System.out.println("请输入10个数，每输入一个数按回车确认：");
        for (int i = 1; i <= 10; i++) {
            System.out.print("第" + i + "个数：");
            double num = scanner.nextDouble();
            sum += num;
        }

        System.out.println("总和为：" + sum);
        scanner.close();
    }
}
