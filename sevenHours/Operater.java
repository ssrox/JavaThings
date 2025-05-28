package sevenHours;

public class Operater {
    public static void main(String[] args) {
        int i = 10;
        i+=4;
        System.out.println(i);

        byte b = 10;
        b=(byte)(b+4);//b的精度低 和整数相加
        System.out.println(b);
    }
}
