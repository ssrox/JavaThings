package sevenHours;

import java.util.Scanner;

public class pyramid {
    public static void main(String[] args) {
        /*    *     1  --4
         ***    3  --3
         *****   5  --2
         *******  7  --1
         ********* 9  --0

         */
        System.out.println("输入你要的行数:");
        Scanner scanner = new Scanner(System.in);
        int n = 0;
        n = scanner.nextInt();
        for (int i = 1; i <= n; i++) {
            for (int j = n; j >= i; j--) {
                System.out.print(" ");
            }//5开始减 直到小于等于1
            for (int j = 1; j <= i * 2 - 1; j++) {
                if (j == 1||j == i * 2 - 1) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}