package qimo.shiyan5;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Random;
import java.util.Set;

public class RandomNumberGenerator {
    public static void main(String[] args) {
        // 使用ArrayList生成
        ArrayList<Integer> arrayList = new ArrayList<>();
        Random random = new Random();
        while (arrayList.size() < 10) {
            int num = random.nextInt(101) + 350;
            if (!arrayList.contains(num)) {
                arrayList.add(num);
            }
        }
        System.out.println("ArrayList生成的随机数：");
        for (int num : arrayList) {
            System.out.print(num + " ");
        }
        System.out.println();

        // 使用Set生成
        Set<Integer> set = new HashSet<>();
        while (set.size() < 10) {
            set.add(random.nextInt(101) + 350);
        }
        System.out.println("Set生成的随机数：");
        for (int num : set) {
            System.out.print(num + " ");
        }
    }
}