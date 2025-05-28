package sevenHours;
import java.sql.SQLOutput;
import java.util.Scanner;
public class Input {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("输入您的年龄");
        int age = scanner.nextInt();
        System.out.println("您的年龄是"+age);
        System.out.println("输入您的薪水");
        double wage = scanner.nextDouble();
        System.out.println("您的薪水是"+wage);

    }
}
