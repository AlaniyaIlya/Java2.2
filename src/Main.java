public class Main {
    public static void main(String[] args) {
        int balance = 100;
        int rub = 1500;
        int bonus;
        if (rub > 100) {
            bonus = rub / 100;
        } else {
            bonus = 0;
        }
        System.out.print("Баланс вместе с бонусом: ");
        System.out.println(balance += rub + bonus);
    }
}