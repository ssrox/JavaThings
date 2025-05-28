package shiyan4;

public class Monkey extends Animal {
    private String hobby;
    private double weight;

    public Monkey(String name, int age, String habitat, String hobby, double weight) {
        super(name, age, "monkey", habitat);
        this.hobby = hobby;
        this.weight = weight;
    }

    @Override
    public void makeSound() {
        System.out.println("The monkey says 'Ooh ooh ah ah'.");
    }

    @Override
    public void eat() {
        System.out.println("The monkey is eating bananas.");
    }

    public void climbTree() {
        System.out.println("The monkey " + getName() + " is climbing a tree.");
    }

    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Hobby: " + hobby);
        System.out.println("Weight: " + weight + " kg");
    }

    // 私有属性访问方法
    private String getName() {
        // 假设基类提供了getName()方法或name是protected的
        // 这里简化处理，实际应根据基类设计调整
        try {
            java.lang.reflect.Field field = Animal.class.getDeclaredField("name");
            field.setAccessible(true);
            return (String) field.get(this);
        } catch (Exception e) {
            return "unknown";
        }
    }
}