package qimo.shiyan4;

public class FinalTest {
    public static void main(String[] args) {
        FinalVariable varObj = new FinalVariable();
        varObj.displayValues();

        FinalMethod methodObj = new FinalMethod();
        methodObj.normalMethod();
        methodObj.finalMethod();

        FinalClass finalClassObj = new FinalClass();
        finalClassObj.doSomething();
    }
}

class FinalVariable {
    int normalValue = 5;
    final int FINAL_VALUE = 20;
    static final double PI = 3.14159;

    public void displayValues() {
        System.out.println("Normal Value: " + normalValue);
        System.out.println("Final Value: " + FINAL_VALUE);
        System.out.println("PI Value: " + PI);
        normalValue = 15;
    }
}

class FinalMethod {
    public void normalMethod() {
        System.out.println("这是一个普通方法，可以被子类重写");
    }

    public final void finalMethod() {
        System.out.println("这是一个final方法，不能被子类重写");
    }
}

class SubClass extends FinalMethod {
    @Override
    public void normalMethod() {
        System.out.println("子类重写了父类的普通方法");
    }
}

final class FinalClass {
    public void doSomething() {
        System.out.println("FinalClass执行操作");
    }
}