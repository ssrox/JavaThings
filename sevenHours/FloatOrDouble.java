package sevenHours;

public class FloatOrDouble {
    public static void main(String[] args) {
        double n1 = 3.1415926535;//八个字节
        float n2 = 3.1415926535f;//四个字节
        System.out.println(n1);
        System.out.println(n2);
        double num1=2.7;
        double num2 = 8.1/3;//8.10000000000000001
        System.out.println(num1==num2);//不相等
        System.out.println(num1+"\n"+num2);//num2是2.699999999997
        if (Math.abs(num1-num2)<0.0001){//解决办法，误差够小的时候
            System.out.println("这两个数字是相等的");
        }else{
            System.out.println("这两个不相等");
        }
    }
}
