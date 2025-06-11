package qimo.shiyan5;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class ArrayListIterator {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 1; i <= 10; i++) {
            list.add(i);
        }

        // 使用Iterator遍历并打印元素
        System.out.println("集合中的元素：");
        Iterator<Integer> iterator = list.iterator();
        while (iterator.hasNext()) {
            System.out.print(iterator.next() + " ");
        }
        System.out.println();

        // 查找键盘输入的元素
        Scanner scanner = new Scanner(System.in);
        System.out.print("请输入要查找的元素：");
        int target = scanner.nextInt();
        scanner.close();

        // 使用Iterator查找并删除重复元素
        boolean found = false;
        iterator = list.iterator();
        while (iterator.hasNext()) {
            int element = iterator.next();
            if (element == target) {
                if (found) {
                    iterator.remove(); // 删除重复元素
                } else {
                    found = true;
                }
            }
        }

        // 输出查找结果
        if (found) {
            System.out.println("找到了元素：" + target);
            System.out.println("删除重复元素后的集合：" + list);
        } else {
            System.out.println("未找到元素：" + target);
        }
    }
}