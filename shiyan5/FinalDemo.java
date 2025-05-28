package shiyan5;

final class FinalClass {
    final int FINAL_VARIABLE = 100;
    final String blankFinal;

    public final void finalMethod() {
        System.out.println("This is a final method.");
    }

    public FinalClass(String value) {
        this.blankFinal = value;
    }
}

class NonFinalClass {
    public final void cannotOverride() {
        System.out.println("Cannot be overridden.");
    }

    public void canOverride() {
        System.out.println("Can be overridden.");
    }
}

class SubClass extends NonFinalClass {
    @Override
    public void canOverride() {
        System.out.println("Overridden method.");
    }
}

public class FinalDemo {
    public static void main(String[] args) {
        FinalClass fc = new FinalClass("Initialized value");
        System.out.println("Final Variable: " + fc.FINAL_VARIABLE);
        System.out.println("Blank Final: " + fc.blankFinal);
        fc.finalMethod();

        SubClass sub = new SubClass();
        sub.canOverride();
    }
}