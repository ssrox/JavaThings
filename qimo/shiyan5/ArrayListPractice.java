package qimo.shiyan5;

import java.util.ArrayList;

public class ArrayListPractice {
    public static void main(String[] args) {
        ArrayList<Object> list = new ArrayList<>();
        list.add("hello");
        list.add(123);
        list.add(6.9);
        list.add("hello");
        list.add("");
        list.add("Hello");
        StringBuffer s = new StringBuffer("hello");
        list.add(s);

        // 打印所有元素
        System.out.println("初始ArrayList：");
        for (Object element : list) {
            System.out.println(element);
        }

        // 查找元素"hello"
        System.out.println("\n元素\"hello\"的索引位置：");
        for (int i = 0; i < list.size(); i++) {
            if ("hello".equals(list.get(i))) {
                System.out.println("索引 " + i);
            }
        }

        // 删除所有"hello"元素
        list.removeIf(element -> "hello".equals(element));
        System.out.println("\n删除所有\"hello\"后的ArrayList：");
        for (Object element : list) {
            System.out.println(element);
        }

        // 替换元素123为1000
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).equals(123)) {
                list.set(i, 1000);
            }
        }
        System.out.println("\n替换123为1000后的ArrayList：");
        for (Object element : list) {
            System.out.println(element);
        }
    }
}
