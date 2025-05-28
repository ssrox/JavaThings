package sevenHours;

import java.sql.SQLOutput;

public class continueBreakReturn {
    public static void main(String[] args) {
        for (int i = 0; i < 4; i++) {
            System.out.print(i);
            if (i==2){
                return;//return直接跳出main方法;
            }
            System.out.println("Going on");
        }
        System.out.println("JumpOff");
    }
}
