package lesson4;

import java.util.Scanner;

public class Main3 {
    public static void main(String[] args) {
        System.out.println("Выберете фигуру:");
        System.out.println("1-круг");
        System.out.println("2-овал");
        System.out.println("3-треугольник");
        System.out.println("4-прямоугольник");
        System.out.println("5-трапеция");

        Scanner scanner = new Scanner(System.in);
        String figura = scanner.nextLine();

        if (figura.equals("1") || figura.equalsIgnoreCase("круг")) {
            System.out.println("Введите радиус круга:");
            String radiusStr = scanner.nextLine();
            double radius = Double.parseDouble(radiusStr);
            System.out.println("Площадь или окружность?");

            String action = scanner.nextLine();
            if (action.equalsIgnoreCase("Площадь")) {
                System.out.println("Площадь круга:" + (Math.PI * (radius * radius)));
            } else {
                System.out.println("Окружность круга:" + (2 * Math.PI * (radius * radius)));

            }

        } else if (figura.equals("2") || figura.equalsIgnoreCase("овал")) {

        } else if (figura.equals("3") || figura.equalsIgnoreCase("треугольник")) {

        } else if (figura.equals("4") || figura.equalsIgnoreCase("прямоугольник")) {

        } else if (figura.equals("5") || figura.equalsIgnoreCase("трапеция")) {

        } else {

        }

    }
}
