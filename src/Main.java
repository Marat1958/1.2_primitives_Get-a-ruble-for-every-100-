public class Main {
    public static void main(String[] args) {
        int clientAccount = 101;
        int prepayment = 900;

        int amount = (clientAccount + prepayment);

        int bonus = (amount - 1000) / 100;

        if (amount > 1000) {
            bonus = amount / 100;
            if (amount < 1000) {
                bonus = 0;
            }
        }
        System.out.println("Итоговый счет: " + amount);
        System.out.println("Количество бонусных рублей: " + bonus);

    }

}
