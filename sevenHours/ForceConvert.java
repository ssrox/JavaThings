package sevenHours;

public class ForceConvert {
    public static void main(String[] args) {
        //char int long float double
        //byte short int long float double
        int i = (int)1.9;//高精度转向低精度有损失 这里要用强转符号
        byte b = (byte)2000;//int 转向byte精度损失
        System.out.println(i);//int 强行取整
        System.out.println(b);//2000 越界 数据溢出

    }
}
