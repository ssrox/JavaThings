package sevenHours;

public class ForUse {
    public static void main(String[] args) {
        for (int i = 0; i < 10 ; i++) {
            System.out.println("i="+i);

        }
        //System.out.println(i);找不到i，作用域不在于全局，可以这样写：
        //int i = 0 ;
        //for (; i <10 ; i++){
        //System.out.println("..");如果放在里面 只能在循环体系里用
        /*for (;;){
            i++;
            System.out.println();*/
        }
    }

