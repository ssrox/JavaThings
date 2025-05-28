package sevenHours;
import java.sql.SQLOutput;
import java.util.Scanner;
public class SwitchScore {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入您的成绩：");
        double v = scanner.nextDouble();

        // v>=60 v<60 60/60 = 1 ; 59/60=0;
        if(v>=0&&v<=100){


        switch((int)v/60) {
            case 0://v不能作为表达式 所以不能写 v >=60之类的 这里用int强转 用 0 1 （01才是表达式）来判断
                System.out.println("成绩不合格");
                break;
            case 1:
                System.out.println("成绩合格");
                break;
            default:
                System.out.println("输入的成绩有误");
                break;
        }
        }else{
            System.out.println("您输入的成绩有误");
        }
    }
}
