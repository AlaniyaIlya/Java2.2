public class Main {
    public static void main(String[] args) {
        boolean sum2 = true;
        int sum1 = 1100;
        int bonus;
        if(sum1 > 1000) {
            bonus = sum1 / 100;
        } else {
            bonus = 0;
        }
        System.out.print("Баланс вместе с бонусом: ");
        System.out.println(sum1 + bonus);
    }
}