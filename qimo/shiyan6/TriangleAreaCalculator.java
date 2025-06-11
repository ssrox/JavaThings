package qimo.shiyan6;

import java.util.InputMismatchException;
import java.util.Scanner;

public class TriangleAreaCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double a = 0, b = 0, c = 0;
        boolean validInput = false;

        while (!validInput) {
            try {
                System.out.print("请输入第一条边: ");
                a = scanner.nextDouble();
                System.out.print("请输入第二条边: ");
                b = scanner.nextDouble();
                System.out.print("请输入第三条边: ");
                c = scanner.nextDouble();

                if (a <= 0 || b <= 0 || c <= 0) {
                    throw new ArithmeticException("边长必须为正数");
                }

                if (a + b <= c || a + c <= b || b + c <= a) {
                    throw new ArithmeticException("不满足三角形不等式");
                }

                validInput = true;
            } catch (InputMismatchException e) {
                System.out.println("输入错误，请输入有效的数字");
                scanner.nextLine(); // 清除错误输入
            } catch (ArithmeticException e) {
                System.out.println("计算错误: " + e.getMessage());
            }
        }

        double s = (a + b + c) / 2;
        double area = Math.sqrt(s * (s - a) * (s - b) * (s - c));
        System.out.printf("三角形面积为: %.2f", area);
        scanner.close();
    }
}