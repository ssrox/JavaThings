package qimo.shiyan5;

import java.util.*;

public class MostFrequentNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Map<Integer, Integer> countMap = new HashMap<>();

        int num;
        while ((num = scanner.nextInt()) != 0) {
            countMap.put(num, countMap.getOrDefault(num, 0) + 1);
        }
        scanner.close();

        if (countMap.isEmpty()) {
            System.out.println("没有输入有效数字");
            return;
        }

        int maxCount = Collections.max(countMap.values());
        List<Integer> mostFrequent = new ArrayList<>();

        for (Map.Entry<Integer, Integer> entry : countMap.entrySet()) {
            if (entry.getValue() == maxCount) {
                mostFrequent.add(entry.getKey());
            }
        }

        for (int number : mostFrequent) {
            System.out.print(number + " ");
        }
    }
}