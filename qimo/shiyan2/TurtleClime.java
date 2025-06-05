package qimo.shiyan2;

public class TurtleClime {
    public static void main(String[] args) {
        int distance = 0;
        int time = 0;
        while (distance<100){
            distance+=4;
                    if(distance<100){
                        distance-= 1;
                    }
            time++;
        }
        System.out.println(time);
    }
}

