package lesson2;

public class DZ1 {
    public static void main(String[] args) {
        int money = 1000;
        int pizzaCost = 230;
        int bobleCost = 28;
        double candyCost = 2.5;

        int canByPizza = money / pizzaCost;
        money = money - (pizzaCost * canByPizza);

        int canByBoble = money / bobleCost;
        money = money - (bobleCost * canByBoble);

        int canByCandy = (int) (money / candyCost);
        double zdacha = money - (candyCost * canByCandy);

        System.out.println("Пицца" + canByPizza);
        System.out.println("Жевачка" + canByBoble);
        System.out.println("Конфеты" + canByCandy);
        System.out.println("Сдача" + zdacha);
    }
}