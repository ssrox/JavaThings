package sevenHours;

public class AutoConvert {
    public static void main(String[] args) {
        //chat int long float double
        //低精度向高精度转换 高精度不能向低精度转换
        //byte short int long float double
        double d= 100 ;//int转向double，char也可以转向整形
        int i = 100;
        float f = 10.1f;
        System.out.println( d+i+f);//取决于哪一个精度是最大的 在这里代表着是double类型//浮点型会有一些差错
        //int ii =d+i+f;//java: 不兼容的类型: 从double转换到int可能会有损失
    }
}
