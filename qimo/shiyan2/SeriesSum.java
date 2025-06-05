package qimo.shiyan2;

public class SeriesSum {
    public static void main(String[] args) {
        double sumFor = 0;
        for (int i = 1; i <=20 ; i++) {
            double  factorial = 1 ;
            for (int j = 1; j <= i ; j++) {
                factorial *= j;
            }
            if( i % 2 == 0){
                sumFor += 1.0/factorial;
            }else{
                sumFor -= 1.0/factorial;
            }
        }
        System.out.println(sumFor);
        double sumDoWhile = 0;
            int i = 1;
            do{
                double factorial = 1.0;
                int j = 1 ;
                do {
                    factorial *= j;
                    j++;
                }while(j<=i);

                if(i%2 == 0){
                    sumDoWhile += 1/factorial;

                }else{
                    sumDoWhile -= 1/factorial;
                }
                i++;
            }while(i<=20);
        System.out.println(sumDoWhile);
        }
    }

