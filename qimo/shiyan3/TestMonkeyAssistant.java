package qimo.shiyan3;

public class TestMonkeyAssistant {
    public static void main(String[] args) {
        MonkeyAssistant assistant1 = new MonkeyAssistant();
        MonkeyAssistant assistant2 = new MonkeyAssistant("皮皮",2,48.0,"eat",66);
        System.out.println("--- assistant1 信息 ---");
        assistant1.printDetails(); // 输出默认值（name=null, age=0, weight=0.0, temperature=0.0）

        System.out.println("\n--- assistant2 信息 ---");
        assistant2.printDetails(); // 输出：皮皮，2岁，48.0kg，温度0.0

        // 4. 调用climbTree()方法
        System.out.println("\n--- 猴子爬树 ---");
        assistant1.climbTree(); // 输出：Monkey null is climbing a tree.（默认name为null）
        assistant2.climbTree(); // 输出：Monkey 皮皮 is climbing a tree.
    }
}
