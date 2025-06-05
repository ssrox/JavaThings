package qimo.shiyan2;

public class EggPromblem {
    public static void main(String[] args) {
        int i = 0;
        while(true){
            i++;
            if (
                    i%1==0&&
                    i%2==1&&
                    i%3==0&&
                    i%4==1&&
                    i%5==4&&
                    i%6==3&&
                    i%7==0&&
                    i%8==1&&
                    i%9==0)
            {
                break;
            }

        }
        System.out.println(i);
    }
}
