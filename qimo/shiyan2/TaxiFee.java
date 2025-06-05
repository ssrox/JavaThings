package qimo.shiyan2;

import java.util.Scanner;

public class TaxiFee {
    public static void main(String[] args) {
        double taxiFee = 0.0;
        Scanner scanner = new Scanner(System.in);
        int distance = scanner.nextInt();
        taxiFee = (distance<=2.0)?5:(distance>=9?(5+1.3*7)+(distance-9)*2:5+(distance-2)*1.3);
        System.out.println(taxiFee+1);
    }
}
