package sevenHours;

public class LogicOperater {
    public static void main(String[] args) {
        // & && | || ! ^
        boolean b1 = true;
        boolean b2 = true;
        boolean b3 = false;
        boolean b4 = false;
        int i = 20 ;
        if (i<10 && i ++> 20){
            System.out.println("dui");
        }
        System.out.println(i);//&&会消除不必要的计算 比如这里会消除i++的影响导致最后i的值是20；
    }
}
