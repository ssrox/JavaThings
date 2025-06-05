package qimo.shiyan2;
import java.util.Scanner;
public class MaxOfThree {
    public static void main(String[] args) {
        int a = 10, b = 20, c = 15;
        int max = a>b?(a>c?a:c):(b>c?b:c);
        //a大于c吗？是的话第二个式子变成了a，b大于c吗？是的话第三个式子变成了b，
        System.out.println("最大值为：" + max);
    }

}
