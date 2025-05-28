package sevenHours;

public class CharVar {
    public static void main(String[] args) {
        char c1 = 'a';//只能单引号
        char c2 =97;//转义字符 ASCII码对应的是a
        char c3='轩';
        char c4 = '\t';
        System.out.println(c1);
        System.out.println(c2);//转义字符 ASCII码对应的是a
        System.out.println(c3);
        System.out.println(c4);//空格
        System.out.println("-----------");
        System.out.println((int)c3);
        char c5 = 36713;
        System.out.println(c5);
        char n1 = 36213;
        char n2 = 30460;
        char n3 = 26159;
        char n4 = 29482;
        System.out.println(n1);
        System.out.println(n2);
        System.out.println(n2);
        System.out.println(n3);
        System.out.println(n4);
    }
}
