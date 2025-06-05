package qimo.shiyan1;
public class Hello{
    public static void main(String[] args) {
        System.out.println("Hello!");
        Student zhang = new Student();
        zhang.speak();
    }
    static class Student{
        void speak(){
            System.out.println("I am a student.");
        }
    }
}