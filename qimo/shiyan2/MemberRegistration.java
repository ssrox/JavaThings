package qimo.shiyan2;

import java.sql.SQLOutput;
import java.util.Scanner;



public class MemberRegistration {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while(true){
            System.out.println("\n ===会员注册===");
            System.out.print("请输入用户名(长度>3)");
            String username = scanner.nextLine();
            if (username.length()<=3){
                System.out.println("用户名过短");
                continue;
            }


            System.out.println("请输入密码(长度>6)");
            String password = scanner.nextLine();
            if (password.length()<=6){
                System.out.println("密码过短");
                continue;

            }

            System.out.println("请确认你的密码:");
            String confirmPassword = scanner.nextLine();
            //语法 !xx.equals(xxx)  ==比较的是内存地址 equals()比较的是内容
            if (!password.equals(confirmPassword)){
                System.out.println("两次密码不一致！");
                continue;
            }
            System.out.println("注册成功！");
            break;






        }
        scanner.close();
    }
}
