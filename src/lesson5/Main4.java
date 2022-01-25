package lesson5;

import java.util.Scanner;

public class Main4 {
    public static void main(String[] args) {
        String[][] tours = {{"Турция", "5 дней", "Самолет", "5 звезд", "120000"},
                {"Турция", "7 дней", "автобу", "4 звезды", "100000"},
                {"Турция", "6 дней", "Самолет", "3 звезды", "90000"},
                {"Эмираты", "12 дней", "автобус", "4 звезды", "80000"},
                {"Турция", "6 дней", "Самолет", "5 звезд", "150000"}};
        Scanner scanner = new Scanner(System.in);
        System.out.println("В какую страну хотите поехать?");

        String country = scanner.nextLine();

        System.out.println("У нас есть такие туры в " + country);

        for (int i = 0; i < tours.length; i++) {
            if (country.equalsIgnoreCase(tours[i][0])) {
                System.out.println(tours[i][0] + ",на" + tours[i][1] + "," + tours[i][2] + ","
                        + tours[i][3] + ",цена - " + tours[i][4]);

            }

        }

        System.out.println("Сколько максимум дней для поездки?");
        String dayStr = scanner.nextLine();

        int day = Integer.parseInt(dayStr);
        for (int i = 0; i < tours.length; i++) {
            int dayFromTour = Integer.parseInt(tours[i][1].replaceAll("[\\D]", ""));
            if (dayFromTour <= day) {
                System.out.println(tours[i][0] + ",на" + tours[i][1] + "," + tours[i][2] + ","
                        + tours[i][3] + ",цена - " + tours[i][4]);

            }
        }
    }
}