package qimo.shiyan4;

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
        System.out.printf("The monkey %s is climbing a tree.\n", super.getName());
    }

    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.printf("Hobby: %s\nWeight: %.1f kg\n", hobby, weight);
    }
}