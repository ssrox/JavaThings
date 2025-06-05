package qimo.shiyan1;

import java.util.Scanner;

public class FactorialCalculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("请输入一个整数:");
        int n = input.nextInt();
        input.close();

        if (n<0){
            System.out.println("错误");
            return ;
        }
        long result = 1;
        for (int i = 1; i <= n; i++) {
            result *= i;


        }
        System.out.println("这个整数的阶乘是"+result);
    }
}
