package sevenHours;

public class For99 {
    public static void main(String[] args) {
        int j = 0 ;
        int sum = 0;
        for (int i = 1; i <= 100; i++) {
            if (i%9==0){
                System.out.println(i);
                j++;
                sum+=i;
            }
            }
        System.out.println("共有"+j+"个9的倍数");
        System.out.println("和为"+sum+"!!!!!!!");
    }
}
