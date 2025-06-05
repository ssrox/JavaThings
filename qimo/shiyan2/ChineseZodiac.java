package qimo.shiyan2;

import java.util.Scanner;

public class ChineseZodiac {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int year = scanner.nextInt();
        String zodiac = "0";
        //不知道为什么 豆包给的代码不用初始化zodiac 我的必须要初始化才行
        switch(year%12){
            case 0 : zodiac = "猴";break;
            case 1 : zodiac = "鸡";break;
            case 2 : zodiac = "狗";break;
            case 3 : zodiac = "猪";break;
            case 4 : zodiac = "鼠";break;
            case 5 : zodiac = "牛";break;
            case 6 : zodiac = "虎";break;
            case 7 : zodiac = "兔";break;
            case 8 : zodiac = "龙";break;
            case 9 : zodiac = "蛇";break;
            case 10 : zodiac = "马";break;
            case 11 : zodiac = "羊";break;
            default:
                System.out.println("您的输入可能有误");

        }
        System.out.println("您的生肖是"+zodiac);

    }
}
