package lesson3;

public class Homework
//вывести на консоль ячейки всего массива
{
    public static void main(String[] args) {
        int[] numbers = {4, 2, 5, 7, 9, 3, 6, 12, 17};
        for (int i = 0; i < numbers.length; i++) {
            System.out.println(numbers[i]);
        }
        //вывести на консоль ячейки всего массива с конца в начало
        for (int i = numbers.length; i <=-1; i = i++) {
            System.out.println(i);
        }
        //вывести на консоль сумму значений всех ячеек
    }
}

