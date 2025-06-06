package qimo.shiyan4;

public class Animal {
    private String name;
    private int age;
    private String species;
    private String habitat;

    public Animal(String name,int age,String species,String habitat){
        this.name = name;
        this.age = age;
        this.species =species;
        this.habitat = habitat;
    }
    public void displayInfo(){
        System.out.printf("Name: %s\nAge: %d\nSpecies: %s\nHabitat: %s\n",
                name, age, species, habitat);
    }
    public void makeSound(){
        System.out.printf("The %s makes a sound.\n",species);
    }
    public void eat(){
        System.out.printf("The %s is eating.",species);
    }

    public String getName(){
        return name;
    }
}
