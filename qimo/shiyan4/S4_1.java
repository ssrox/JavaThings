package qimo.shiyan4;

public class S4_1 {
    public static void main(String[] args) {
        // 创建Animal对象
        Animal animal = new Animal("狮子", 5, "狮子", "草原");

        // 创建Monkey对象
        Monkey monkey = new Monkey("乔治", 3, "丛林", "荡秋千", 10.5);

        // 测试Animal对象
        System.out.println("=== 动物信息 ===");
        animal.displayInfo();
        animal.makeSound();
        animal.eat();

        // 测试Monkey对象
        System.out.println("\n=== 猴子信息 ===");
        monkey.displayInfo();
        monkey.makeSound();
        monkey.eat();
        monkey.climbTree();
    }
}