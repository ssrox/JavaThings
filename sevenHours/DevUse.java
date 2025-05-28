package sevenHours;

public class DevUse {
    public static void main(String[] args) {
        System.out.println(10/3);
        System.out.println(10.0/3);//一个是3 一个是3.3333 区别在于整形相除和Double型除以整形 可见赋予了精度最大的那个
        double d = 10/3;
        System.out.println(d);//10/3先变成了3 再把3转成了精度更大的double类型 就是3.0 这是不会变成3.333的
        System.out.println("-----------------------");
        //a % b = a - (a / b *b )
        System.out.println(10%3);//10对3取模
        System.out.println(-10%3);
        System.out.println(10%-3);
        System.out.println(-10%-3);
        //-10 - (-10/ -3 * -3 ) = -10 - (-9) = -1;
    }
}
