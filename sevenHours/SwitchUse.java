package sevenHours;

import java.util.Scanner;


public class SwitchUse {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        char c = scanner.next().charAt(0);
        switch (c){
            case 'a':
                System.out.println("我是a");
                break;
            case 'b':
                System.out.println("b");
                break;
            case 'c':
                System.out.println("c");
                break;
            case 'd':
                System.out.println("d");
                break;
            case 'e':
                System.out.println("e");
                break;
            default:
                System.out.println("default");
        }
    }
}
