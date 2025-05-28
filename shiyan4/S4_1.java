package shiyan4;

public class S4_1 {
    public static void main(String[] args) {
        // 创建Animal对象
        Animal genericAnimal = new Animal("Leo", 5, "lion", "savannah");

        // 创建Monkey对象
        Monkey curiousMonkey = new Monkey("George", 3, "jungle", "swinging", 12.5);

        // 显示动物信息
        System.out.println("=== Animal Information ===");
        genericAnimal.displayInfo();
        genericAnimal.makeSound();
        genericAnimal.eat();

        System.out.println("\n=== Monkey Information ===");
        curiousMonkey.displayInfo();
        curiousMonkey.makeSound();
        curiousMonkey.eat();
        curiousMonkey.climbTree();
    }
}