package qimo.shiyan3;

public class MonkeyAssistant {
    private String name;
    private int age;
    private double weight;
    private String hobby;
    private double  temperature;

    public MonkeyAssistant(){
        this.name = "臭臭";
        this.age = 100;
        this.weight = 100;
        this.hobby = "dogishOt";
        this.temperature = 1000;
    }

    public  MonkeyAssistant(String name,int age,double weight,String hobby,double temperature){

        this.name = name;
        this.age = age;
        this.weight = weight;
        this.hobby = hobby;
        this.temperature = temperature;

    }
    public void climbTree(){
        System.out.println("Monkey"+name+"is climbing a tree.");
    }
    public void printDetails(){
        System.out.println(name);
        System.out.println(age);
        System.out.println(weight);
        System.out.println(hobby);
    }

    public void setTemperature(double temperature) {
        this.temperature = temperature;
    }
    public double celsiusToFahrenheit(double celsius){
        return celsius * 1.8 +32;
    }
    public int celsiusToFahrenheit(int celsius){
        return celsius *9 / 5 +32;
    }
    public double fahrenheitToCelsius(double fahrenheit){
        return (fahrenheit - 32)/1.8;
    }
    public int fahrenheitToCelsius(int fahrenheit){
        return(fahrenheit - 32)/5*9;
    }
}
