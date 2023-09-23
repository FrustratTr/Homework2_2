// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        int currentBalance = 500; // Начальная сумма на счету клиента
        int topUpAmount = 1200; // Сумма пополнения

        int bonusThreshold = 1000; // Пороговая сумма пополнения для начисления бонуса
        int bonusRate = 100; // Ставка бонуса (каждые 100 рублей пополнения равны 1 рублю бонуса)

        int bonusAmount = 0; // Сумма бонусов

        if (topUpAmount > bonusThreshold) {
            bonusAmount = topUpAmount / bonusRate; // Рассчитываем сумму бонуса
        }

        int totalBalance = currentBalance + topUpAmount + bonusAmount; // Итоговый счет клиента

        System.out.println("Итоговый счет: " + totalBalance + " рублей");
        System.out.println("Бонусные рубли: " + bonusAmount + " рублей");
    }
}


