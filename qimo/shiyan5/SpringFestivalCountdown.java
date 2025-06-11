package qimo.shiyan5;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class SpringFestivalCountdown {
    public static void main(String[] args) {
        LocalDate today = LocalDate.now();
        int currentYear = today.getYear();
        LocalDate springFestival = LocalDate.of(currentYear + 1, 2, 10); // 2026年2月10日是蛇年春节

        if (today.isAfter(springFestival)) {
            springFestival = springFestival.plusYears(1);
        }

        long days = ChronoUnit.DAYS.between(today, springFestival);
        System.out.println("距离蛇年春节还有" + days + "天");
    }
}