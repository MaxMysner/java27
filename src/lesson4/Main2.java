package lesson4;

import java.util.Scanner;

public class Main2 {
    public static void main(String[] args) {
        System.out.println("Введите ваш возраст:");
        Scanner scanner = new Scanner(System.in);
        String age = scanner.next();


        int AgeInt = Integer.parseInt(age);
        if (AgeInt > 0 && AgeInt <= 10) {
            System.out.println("Вы ребенок!!!");
        } else if (AgeInt > 11 && AgeInt <= 17) {
            System.out.println("Вы подросток!!!");
        } else if (AgeInt > 18 && AgeInt <= 35) {
            System.out.println("Вы взрослый!!!");
        } else if (AgeInt > 36 && AgeInt <= 50)
            System.out.println("Вы зрелый!!!");
        else if (AgeInt > 51 && AgeInt <= 150) {
            System.out.println("Вы старик!!!");
        } else {
            System.out.println("Вы ввели неверный возраст!!!");

        }
    }
}


