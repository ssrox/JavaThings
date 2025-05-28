package sevenHours;

public class ChangeChar {
    public static void main(String[] args) {
        System.out.println("北\t上\t广");
        System.out.println("---------");
        System.out.println("北\n上\n广");
        System.out.println("---------");
        System.out.println("北\\上\\广");
        System.out.println("---------");
        System.out.println("北\"上\'广");
        System.out.println("---------");
        System.out.println("北\r上\r广");
        System.out.println("---------");
    }
}
/*\t间隔 \n换行 \\输出\  \" \'分别输出引号 \r表示后一个代替前一个
 */