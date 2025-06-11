package qimo.shiyan5;

import java.util.Scanner;
import java.io.IOException;

public class UserRegistration {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String username = "", password = "", phone = "";
        boolean registered = false;

        while (!registered) {
            System.out.print("请输入用户名:");
            username = scanner.nextLine().trim();
            System.out.print("请输入密码:");
            password = scanner.nextLine();
            System.out.print("请确认密码:");
            String confirmPassword = scanner.nextLine();
            System.out.print("请输入手机号码:");
            phone = scanner.nextLine().trim();

            if (password.equals(confirmPassword) && !username.isEmpty() && !phone.isEmpty()) {
                System.out.println("注册成功");
                registered = true;
            } else {
                System.out.println("密码不一致或信息不完整，请重新注册");
            }
        }

        int loginAttempts = 0;
        boolean loggedIn = false;

        while (loginAttempts < 3 && !loggedIn) {
            System.out.print("请输入用户名:");
            String loginUsername = scanner.nextLine();
            System.out.print("请输入密码:");
            String loginPassword = scanner.nextLine();

            if (loginUsername.equals(username) && loginPassword.equals(password)) {
                System.out.println("登录成功");
                loggedIn = true;
                try {
                    if (System.getProperty("os.name").toLowerCase().contains("win")) {
                        Runtime.getRuntime().exec("calc");
                    } else {
                        System.out.println("计算器功能仅支持Windows系统");
                    }
                } catch (IOException e) {
                    System.out.println("无法打开计算器: " + e.getMessage());
                }
            } else {
                loginAttempts++;
                System.out.println("密码错误，请重新输入！");
                if (loginAttempts == 3) {
                    System.out.println("登录失败，无法再继续登录");
                }
            }
        }
        scanner.close();
    }
}