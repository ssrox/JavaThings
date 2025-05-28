package sevenHours;

public class StringConvert {
    public static void main(String[] args) {
        //int double float char 如何转换呢
        int i = 10 ;
        double d = 10.0;
        float f = 10.0f;
        String s1 = i + "";
        String s2 = d + "";
        String s3 = f + "";//分别String 然后和空字符拼到一起
        System.out.println(s1);
        System.out.println(s2);
        System.out.println(s3);
        String S1 = "875";
        int i1 =Integer.parseInt(S1);
        double v1 = Double.parseDouble(S1);
        float v =Float.parseFloat(S1);
        System.out.println(i1);
        System.out.println(v1);
        System.out.println(v);
        System.out.println(S1.charAt(0));//格式比较特殊 System.out.println(S1.charAt(0));类似于数组下标吧！012分别对应123
        System.out.println(S1.charAt(1));
        System.out.println(S1.charAt(2));
    }
}
