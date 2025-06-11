package qimo.shiyan4;

// 自定义异常类
class InvalidAgeException extends Exception {
    public InvalidAgeException(String message) {
        super(message);
    }
}

// 处理异常的类
class Person {
    private int age;

    public void setAge(int age) throws InvalidAgeException {
        if (age < 0 || age > 150) {
            throw new InvalidAgeException("年龄必须在0到150之间");
        }
        this.age = age;
    }

    public int getAge() {
        return age;
    }
}

// 测试类
public class ExceptionTest {
    public static void main(String[] args) {
        Person person = new Person();

        try {
            person.setAge(25);
            System.out.println("年龄设置成功: " + person.getAge());

            person.setAge(-5);
        } catch (InvalidAgeException e) {
            System.out.println("异常: " + e.getMessage());
        }

        try {
            person.setAge(200);
        } catch (InvalidAgeException e) {
            System.out.println("异常: " + e.getMessage());
        }
    }
}