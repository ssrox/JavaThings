package sevenHours;

import java.util.Scanner;

public class WaterNum {
    public static void main(String[] args) {
        /*153=1*1*1 + 5*5*5 + 3*3*3 = 153水仙花数
        System.out.println(" 请输入一个数字，以判断它是不是水仙花数:");
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();*/
        for (int n = 0; n <= 1002; n++) {


            int HunNum = n / 100;
            int TenNum = n / 10 % 10;
            int OneNum = n % 10;

            if (HunNum * HunNum * HunNum + TenNum * TenNum * TenNum + OneNum * OneNum * OneNum == n) {
                System.out.println(n+" is "+"the waterNum.");

            } else {
                continue;
            }
        }
    }
}
